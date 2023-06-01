/*package bpmnforcpsextension;

import org.eclipse.bpmn2.modeler.core.merrimac.clad.AbstractDetailComposite;
import org.eclipse.bpmn2.modeler.core.merrimac.clad.DefaultPropertySection;
import org.eclipse.swt.widgets.Composite;

public class CyberTaskPropertyTab extends DefaultPropertySection {
	public CyberTaskPropertyTab(){
		super();
	}
	@Override
	protected AbstractDetailComposite createSectionRoot() {
		// This constructor is used to create the detail composite for use in the Property Viewer.
		return new CyberTaskDetailComposite(this);
	}

	@Override
	public AbstractDetailComposite createSectionRoot(Composite parent, int style) {
		// This constructor is used to create the detail composite for use in the popup Property Dialog.
		return new CyberTaskDetailComposite(parent, style);
	}
}*/
//------------------------------------------method 2 --------------------------------------------------------



/*package bpmnforcpsextension;

import java.util.List;

import org.eclipse.bpmn2.Task;
import org.eclipse.bpmn2.di.BPMNDiagram;
import org.eclipse.bpmn2.modeler.core.merrimac.clad.AbstractBpmn2PropertySection;
import org.eclipse.bpmn2.modeler.core.merrimac.clad.AbstractDetailComposite;
import org.eclipse.bpmn2.modeler.core.model.ModelDecorator;
import org.eclipse.bpmn2.modeler.core.runtime.CustomTaskDescriptor;
import org.eclipse.bpmn2.modeler.core.runtime.TargetRuntime;
import org.eclipse.bpmn2.modeler.core.utils.BusinessObjectUtil;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Composite;

import bpmnforcpsextension.MyModel.MyModelFactory;
import bpmnforcpsextension.MyModel.Parameter;
import bpmnforcpsextension.MyModel.TaskConfig;

public class CyberTaskPropertyTab extends AbstractBpmn2PropertySection {

    public CyberTaskPropertyTab() {
        super();
    }

    @Override
    protected AbstractDetailComposite createSectionRoot() {
        // This constructor is used to create the detail composite for use in
        // the Property Viewer.
        return new CyberTaskDetailComposite(this);
    }

    @Override
    public AbstractDetailComposite createSectionRoot(Composite parent, int style) {
        // This constructor is used to create the detail composite for use in
        // the popup Property Dialog.
        return new CyberTaskDetailComposite(parent, style);
    }

    /**
     * Here we extract the bpmn task element from the current ISelection
     */
   /* @Override
    public EObject getBusinessObjectForSelection(ISelection selection) {

        EObject bo = BusinessObjectUtil.getBusinessObjectForSelection(selection);
        if (bo instanceof BPMNDiagram) {
            if (((BPMNDiagram) bo).getPlane() != null && ((BPMNDiagram) bo).getPlane().getBpmnElement() != null)
                return ((BPMNDiagram) bo).getPlane().getBpmnElement();
        }
        return bo;
    }

    public class CyberTaskDetailComposite extends AbstractDetailComposite {

        public CyberTaskDetailComposite(AbstractBpmn2PropertySection section) {
            super(section);
        }

        public CyberTaskDetailComposite(Composite parent, int style) {
            super(parent, style);
        }

        @Override
        public void createBindings(EObject be) {
            TaskConfig taskConfig = null;

            if (!(be instanceof Task)) {
                System.out.println("WARNING: this proeprty tab in only working with Tasks Please check por plugin.xml!");
            }

            TargetRuntime rt = getTargetRuntime();
            // Get the CustomTaskDescriptor for this Task.
            CustomTaskDescriptor ctd = rt.getCustomTask("org.eclipse.bpmn2.modeler.examples.customtask.customTask1");

            Task myTask = (Task) be;

            // Fetch all TaskConfig extension objects from the Task
            List<TaskConfig> allTaskConfigs = ModelDecorator.getAllExtensionAttributeValues(myTask,TaskConfig.class);
            if (allTaskConfigs.size() == 0) {
                // There are none, so we need to construct a new TaskConfig
                // which is required by the Property Sheet UI.
                taskConfig = MyModelFactory.eINSTANCE.createTaskConfig();

                // initalize values
                initializeProperty(taskConfig, "type", "");
                initializeProperty(taskConfig, "Implementation", "");
                initializeProperty(taskConfig, "OperationRef", "");
                initializeProperty(taskConfig, "CPSDeviceRoleRef", "");
                initializeProperty(taskConfig, "ioSpecification", "");
                initializeProperty(taskConfig, "MinStartTime", "");
                initializeProperty(taskConfig, "MaxStartTime", "");
                initializeProperty(taskConfig, "MinFinishTime", "");
                initializeProperty(taskConfig, "MaxFinishTime", "");
    		
                // Get the model feature for the "taskConfig" element name.
                // Again, this must match the <property> element in <customTask>
                EStructuralFeature feature = ctd.getModelDecorator().getEStructuralFeature(be, "taskConfig");

                // Add the newly constructed TaskConfig object to the Task's
                // Extension Values list.
                // Note that we will delay the actual insertion of the new
                // object until some feature
                // of the object changes (e.g. the Parameter.name)
                ModelDecorator.addExtensionAttributeValue(myTask, feature, taskConfig, true);

            } else {
                // Else reuse the existing TaskConfig object.
                taskConfig = allTaskConfigs.get(0);
            }

            setTitle("Cyber task");
            bindAttribute(this.getAttributesParent(), getProperty(taskConfig, "type"), "", "");
            bindAttribute(this.getAttributesParent(), getProperty(taskConfig, "Implementation"), "", "");
            bindAttribute(this.getAttributesParent(), getProperty(taskConfig, "OperationRef"),  "", "");
            bindAttribute(this.getAttributesParent(), getProperty(taskConfig, "CPSDeviceRoleRef"),  "", "");
            bindAttribute(this.getAttributesParent(), getProperty(taskConfig, "ioSpecification"),  "", "");
            bindAttribute(this.getAttributesParent(), getProperty(taskConfig, "MinStartTime"),  "", "");
            bindAttribute(this.getAttributesParent(), getProperty(taskConfig, "MaxStartTime"),  "", "");
            bindAttribute(this.getAttributesParent(), getProperty(taskConfig, "MinFinishTime"), "", "");
            bindAttribute(this.getAttributesParent(), getProperty(taskConfig, "MaxFinishTime"), "", "");
        }

    }
    
    

    /**
     * This method verifies if a specific property still exists. If not the
     * method initializes the value
     * 
     * @param taskConfig
     * @param propertyName
     */
   /* protected Parameter initializeProperty(TaskConfig taskConfig, String propertyName, String defaultVaue) {

        // test all parameters if we have the propertyName
        EList<Parameter> parameters = taskConfig.getParameters();
        for (Parameter param : parameters) {
            if (param.getName().equals(propertyName)) {
                // param allready exists
                return param;
            }
        }

        // the property was not found so we initialize it...
        Parameter param = MyModelFactory.eINSTANCE.createParameter();
        param.setName(propertyName);
        param.setValue(defaultVaue);
        taskConfig.getParameters().add(param);
        return param;
    }

    /**
     * THis method returns the Parameter object for a specific object. If the
     * object did not exist the method creates an empty new parameter
     * 
     * @param taskConfig
     * @param propertyName
     * @return
     */
  /*  protected Parameter getProperty(TaskConfig taskConfig, String propertyName) {

        // test all parameters if we have the propertyName
        EList<Parameter> parameters = taskConfig.getParameters();
        for (Parameter param : parameters) {
            if (param.getName().equals(propertyName)) {
                // param allready exists
                return param;
            }
        }

        // we have not found this param - so we add a new one....
        return initializeProperty(taskConfig, propertyName, "");
    }
}*/