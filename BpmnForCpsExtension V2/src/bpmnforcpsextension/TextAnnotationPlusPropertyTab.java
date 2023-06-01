package bpmnforcpsextension;

import java.util.List;

import org.eclipse.bpmn2.Task;
import org.eclipse.bpmn2.TextAnnotation;
import org.eclipse.bpmn2.modeler.core.adapters.ExtendedPropertiesAdapter;
import org.eclipse.bpmn2.modeler.core.adapters.ObjectDescriptor;
import org.eclipse.bpmn2.modeler.core.merrimac.clad.AbstractBpmn2PropertySection;
import org.eclipse.bpmn2.modeler.core.merrimac.clad.AbstractDetailComposite;
import org.eclipse.bpmn2.modeler.core.merrimac.clad.DefaultDetailComposite;
import org.eclipse.bpmn2.modeler.core.merrimac.clad.DefaultPropertySection;
import org.eclipse.bpmn2.modeler.core.model.ModelDecorator;
import org.eclipse.bpmn2.modeler.core.runtime.CustomTaskDescriptor;
import org.eclipse.bpmn2.modeler.core.runtime.TargetRuntime;
import org.eclipse.bpmn2.modeler.core.utils.ModelUtil;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPart;

public class TextAnnotationPlusPropertyTab  extends DefaultPropertySection {

	@Override
	protected AbstractDetailComposite createSectionRoot() {
		DefaultDetailComposite composite = new SampleMitigationTaskDetailComposite(this);
		setProperties(composite,new String[] {"RWEproperties"});
		return composite;
	}

	@Override
	public AbstractDetailComposite createSectionRoot(Composite parent, int style) {
		// here we only want to render specific attributes - override the default behavior
		// which is to display everything, including the TextAnnotation "text" attribute.
		DefaultDetailComposite composite = new SampleMitigationTaskDetailComposite(parent,style);
		setProperties(composite,new String[] {"RWEproperties"});
		return composite;
	}
	
	@Override
	public boolean appliesTo(IWorkbenchPart part, ISelection selection) {
		if (super.appliesTo(part, selection)) {
			EObject eObj = getBusinessObjectForSelection(selection);
			if (eObj instanceof TextAnnotation) {
				EStructuralFeature f = ModelDecorator.getAnyAttribute(eObj, "RWEproperties");
				return f!=null;
			}
		}
		return false;
	}

	/**
	 * This is the details composite for the "Mitigation Task" property tab. Note that
	 * we could have combined this class with the "Risk Task" property composite, but
	 * this allows for more experimentation...
	 */
	public class SampleMitigationTaskDetailComposite extends DefaultDetailComposite {

		/**
		 * @param section
		 */
		public SampleMitigationTaskDetailComposite(AbstractBpmn2PropertySection section) {
			super(section);
		}

		public SampleMitigationTaskDetailComposite(Composite parent, int style) {
			super(parent, style);
		}
		
		@Override
		public void resourceSetChanged(ResourceSetChangeEvent event) {
			super.resourceSetChanged(event);

			// update the TextAnnotation "text" attribute to reflect some changes in
			// our extension attributes; "name" and "benefit" in this case.
			final TextAnnotation ta = (TextAnnotation)getBusinessObject();
			//final EStructuralFeature nameAttribute = ModelDecorator.getAnyAttribute(ta, "name");
			final EStructuralFeature benefitAttribute = ModelDecorator.getAnyAttribute(ta, "RWEproperties");
			final TransactionalEditingDomain editingDomain = getDiagramEditor().getEditingDomain();			
			for (Notification n : event.getNotifications()) {
				int et = n.getEventType();
				if (et==Notification.SET) {
					if (n.getFeature()==benefitAttribute) {
						// run this in the UI thread
						Display.getDefault().asyncExec( new Runnable() {
							public void run() {
								editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain) {
									@Override
									protected void doExecute() {
										String text = (String)ta.eGet(benefitAttribute);
										ta.setText(text);
									}
								});
							}
						});
					}
				}
			}
		}
	}
}
