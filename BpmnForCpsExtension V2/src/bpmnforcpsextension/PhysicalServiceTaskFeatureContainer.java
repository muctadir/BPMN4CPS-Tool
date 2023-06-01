package bpmnforcpsextension;


import org.eclipse.bpmn2.modeler.core.features.CustomShapeFeatureContainer;
import org.eclipse.bpmn2.modeler.core.model.ModelDecorator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class PhysicalServiceTaskFeatureContainer extends CustomShapeFeatureContainer {
	 private final static String TYPE_VALUE = "PhysicalTask";
	 private final static String CUSTOM_TASK_ID = "org.eclipse.bpmn2.modeler.examples.customtask.customTask5";
	public PhysicalServiceTaskFeatureContainer ()
	{	
		super();
	}
		public String getId(EObject object){
			EStructuralFeature f = ModelDecorator.getAnyAttribute(object, "type");
			 if (f!=null) {
			 Object id = object.eGet(f);
			 if (TYPE_VALUE.equals(id))
			 return CUSTOM_TASK_ID ;
			 }
			 
			 return null;
	}

}
