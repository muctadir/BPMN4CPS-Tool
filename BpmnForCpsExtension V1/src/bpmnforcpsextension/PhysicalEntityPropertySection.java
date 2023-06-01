package bpmnforcpsextension;

import java.util.List;

import org.eclipse.bpmn2.Task;
import org.eclipse.bpmn2.di.BPMNDiagram;
import org.eclipse.bpmn2.modeler.core.adapters.ExtendedPropertiesAdapter;
import org.eclipse.bpmn2.modeler.core.adapters.ObjectDescriptor;
import org.eclipse.bpmn2.modeler.core.features.ShowPropertiesFeature;
import org.eclipse.bpmn2.modeler.core.merrimac.clad.AbstractBpmn2PropertySection;
import org.eclipse.bpmn2.modeler.core.merrimac.clad.AbstractDetailComposite;
import org.eclipse.bpmn2.modeler.core.model.ModelDecorator;
import org.eclipse.bpmn2.modeler.core.runtime.CustomTaskDescriptor;
import org.eclipse.bpmn2.modeler.core.runtime.TargetRuntime;
import org.eclipse.bpmn2.modeler.core.utils.BusinessObjectUtil;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Composite;

import bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity;
import bpmnforcpsextension.MyModel.MyModelFactory;
import bpmnforcpsextension.MyModel.MyModelPackage;
import bpmnforcpsextension.MyModel.Parameter;
import bpmnforcpsextension.MyModel.PhysicalEntityTask;
import bpmnforcpsextension.MyModel.TaskConfig;

public class PhysicalEntityPropertySection extends ExtendedPropertiesAdapter<PhysicalEntityTask> {

	public PhysicalEntityPropertySection (AdapterFactory adapterFactory, PhysicalEntityTask object) {
		super(adapterFactory, object);
		
		setObjectDescriptor(new ObjectDescriptor<PhysicalEntityTask> (this, object) {

			public String getName() {
				return object.getName();
			}
			/*public String getCPSPerformerRef() {
				return object.getCPSPerformerRef();
			}*/
		});
	}
}
