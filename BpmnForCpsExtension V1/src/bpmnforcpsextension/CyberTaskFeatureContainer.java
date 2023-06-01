package bpmnforcpsextension;

import org.eclipse.bpmn2.modeler.core.features.CustomShapeFeatureContainer;
import org.eclipse.bpmn2.modeler.core.model.ModelDecorator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class CyberTaskFeatureContainer  extends CustomShapeFeatureContainer{

	 private final static String TYPE_VALUE = "CyberTask";
	 private final static String CUSTOM_TASK_ID = "org.eclipse.bpmn2.modeler.examples.customtask.customTask1";
	public CyberTaskFeatureContainer ()
	{	
		super();
	}
	@Override
	public String getId(EObject object) {
				
		EStructuralFeature f = ModelDecorator.getAnyAttribute(object, "type");
		if (f!=null) {
			Object id = object.eGet(f);
			if (TYPE_VALUE.equals(id))
				return CUSTOM_TASK_ID;
			
		}
		return null;
	}
	/*@Override
	public ICustomFeature[] getCustomFeatures(IFeatureProvider fp) {
		return new ICustomFeature[] {new ShowPropertiesFeature(fp)};
	}*/
	/*	protected IShapeFeatureContainer createFeatureContainer(IFeatureProvider fp) {
	
	return new ParticipantFeatureContainer(){
		@Override
		public IAddFeature getAddFeature(IFeatureProvider fp) {
			
			return new AddParticipantFeature(fp){

				@Override
				protected void decorateShape(IAddContext context,
						ContainerShape containerShape, Participant businessObject) {
					Shape iconShape = Graphiti.getPeService().createShape(containerShape, false);
					Image img = CustomTaskImageProvider.createImage(customTaskDescriptor, iconShape, customTaskDescriptor.getIcon(), 50, 40);
					Graphiti.getGaService().setLocationAndSize(img, 2, 2, 50, 50);
				
				}
			};}

		
		};}	*/
	
/*	@Override
	protected IShapeFeatureContainer createFeatureContainer(IFeatureProvider fp) {

		return new TaskFeatureContainer() {
			@Override
			public ICreateFeature getCreateFeature(IFeatureProvider fp) {
				return new JbpmCreateCustomTaskFeature(fp);
			}
			
			@Override
			public IAddFeature getAddFeature(IFeatureProvider fp) {
				return new JbpmAddCustomTaskFeature(fp);
			}
		};
	}
	protected class JbpmCreateCustomTaskFeature extends CreateTaskFeature {

		public JbpmCreateCustomTaskFeature(IFeatureProvider fp) {
			super(fp);
		}

		@Override
		public String getCreateImageId() {
			final String iconPath = (String) customTaskDescriptor.getPropertyValue("icon");  //$NON-NLS-1$
			if (iconPath != null && iconPath.trim().length() > 0) {
				return iconPath.trim();
			}
			return null;
		}

		@Override
		public String getCreateLargeImageId() {
			return getCreateImageId();
		}
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		public Task createBusinessObject(ICreateContext context) {
			Task task = super.createBusinessObject(context);
			final String name = customTaskDescriptor.getName();
			if (name!=null && !name.isEmpty()) {
				task.setName(name.trim());
			}
			
			// make sure the ioSpecification has both a default InputSet and OutputSet
			InputOutputSpecification ioSpecification = task.getIoSpecification();
			if (ioSpecification!=null) {
				Resource resource = getResource(context);
				if (ioSpecification.getInputSets().size()==0) {
					InputSet is = Bpmn2ModelerFactory.createObject(resource, InputSet.class);
					ioSpecification.getInputSets().add(is);
				}
				if (ioSpecification.getOutputSets().size()==0) {
					OutputSet os = Bpmn2ModelerFactory.createObject(resource, OutputSet.class);
					ioSpecification.getOutputSets().add(os);
				}
			}
			
			// Create the ItemDefinitions for each I/O parameter if needed
			MyRuntimeExtension rx = (MyRuntimeExtension)customTaskDescriptor.getRuntime().getRuntimeExtension();
			String id = customTaskDescriptor.getId();
			WorkItemDefinition wid = rx.getWorkItemDefinition(id);
			
			return task;
		}
	}
	
	protected class JbpmAddCustomTaskFeature extends JbpmAddTaskFeature {

		public JbpmAddCustomTaskFeature(IFeatureProvider fp) {
			super(fp);
		}
		
		@Override
		protected void decorateShape(IAddContext context, ContainerShape containerShape, Task businessObject) {
			super.decorateShape(context, containerShape, businessObject);
			final String iconPath = (String) customTaskDescriptor.getPropertyValue("icon");  //$NON-NLS-1$
			ShapeDecoratorUtil.createActivityImage(containerShape, iconPath);
		}
	}
}*/
	
}