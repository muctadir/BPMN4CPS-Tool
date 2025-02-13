package bpmnforcpsextension;

import java.util.List;

import org.eclipse.bpmn2.Task;
import org.eclipse.bpmn2.modeler.core.merrimac.clad.AbstractBpmn2PropertySection;
import org.eclipse.bpmn2.modeler.core.merrimac.clad.AbstractDetailComposite;
import org.eclipse.bpmn2.modeler.core.model.ModelDecorator;
import org.eclipse.bpmn2.modeler.core.runtime.CustomTaskDescriptor;
import org.eclipse.bpmn2.modeler.core.runtime.TargetRuntime;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.widgets.Composite;

import bpmnforcpsextension.MyModel.MyModelFactory;
import bpmnforcpsextension.MyModel.MyModelPackage;
import bpmnforcpsextension.MyModel.TaskConfig;

public class PhysicalEntityPropertySectionDetailComposite extends AbstractDetailComposite {

	    	public PhysicalEntityPropertySectionDetailComposite (AbstractBpmn2PropertySection section) {
	    		super(section);
	    	}

	    	public PhysicalEntityPropertySectionDetailComposite (Composite parent, int style) {
	    		super(parent, style);
	    	}

	    	@Override
	    	public void createBindings(EObject be) {
	    		// This must be a Task because this Property Tab is only active for Tasks.
	    		// The Property Tab will only display the Parameter list in our TaskConfig
	    		// model element (see the definition of this element in MyModel.ecore). 
	    		bindAttribute(be, "type");
	    		bindAttribute(be,"CPSPerformerRef");
	    		bindAttribute(be,"CPSDeviceRoleParameters");
	    		bindAttribute(be,"TypeDevice");
	    		//bindAttribute(be,"isMovable");
	    		Task myTask = (Task)be;
	    		TaskConfig taskConfig = null;
	    		// Fetch all TaskConfig extension objects from the Task
	    		List<TaskConfig> allTaskConfigs = ModelDecorator.getAllExtensionAttributeValues(myTask, TaskConfig.class);
	    		if (allTaskConfigs.size()==0) {
	    			// There are none, so we need to construct a new TaskConfig
	    			// which is required by the Property Sheet UI.
	    			taskConfig = MyModelFactory.eINSTANCE.createTaskConfig();
	    			TargetRuntime rt = getTargetRuntime();
	    			// We need our CustomTaskDescriptor for this Task. The ID must match
	    			// the one defined in the <customTask> extension point in plugin.xml
	    			CustomTaskDescriptor ctd = rt.getCustomTask("bpmnforcpsextension.physicalentitytaskfeaturecontainer");
	    			// Get the model feature for the "taskConfig" element name.
	    			// Again, this must match the <property> element in <customTask>
	    			EStructuralFeature feature = ctd.getModelDecorator().getEStructuralFeature(be, "taskConfig");
	    			// Add the newly constructed TaskConfig object to the Task's Extension Values list.
	    			// Note that we will delay the actual insertion of the new object until some feature
	    			// of the object changes (e.g. the Parameter.name)
	    			ModelDecorator.addExtensionAttributeValue(myTask, feature, taskConfig, true);
	    		}
	    		else {
	    			// Else reuse the existing TaskConfig object.
	    			taskConfig = allTaskConfigs.get(0);
	    		}
	    		// Display the Parameters list in TaskConfig 
	    		bindList(taskConfig, MyModelPackage.eINSTANCE.getTaskConfig_Parameters());
	    	}
	    }

	