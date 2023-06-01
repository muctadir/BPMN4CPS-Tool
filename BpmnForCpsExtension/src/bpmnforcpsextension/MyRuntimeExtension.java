package bpmnforcpsextension;
import org.eclipse.bpmn2.Activity;
import org.eclipse.bpmn2.Assignment;
import org.eclipse.bpmn2.BoundaryEvent;
import org.eclipse.bpmn2.CallActivity;
import org.eclipse.bpmn2.CallChoreography;
import org.eclipse.bpmn2.CatchEvent;
import org.eclipse.bpmn2.Category;
import org.eclipse.bpmn2.CompensateEventDefinition;
import org.eclipse.bpmn2.ConditionalEventDefinition;
import org.eclipse.bpmn2.CorrelationPropertyRetrievalExpression;
import org.eclipse.bpmn2.DataInput;
import org.eclipse.bpmn2.DataObject;
import org.eclipse.bpmn2.DataObjectReference;
import org.eclipse.bpmn2.DataOutput;
import org.eclipse.bpmn2.DataStore;
import org.eclipse.bpmn2.DataStoreReference;
import org.eclipse.bpmn2.EndEvent;
import org.eclipse.bpmn2.ErrorEventDefinition;
import org.eclipse.bpmn2.EscalationEventDefinition;
import org.eclipse.bpmn2.Event;
import org.eclipse.bpmn2.Expression;
import org.eclipse.bpmn2.FormalExpression;
import org.eclipse.bpmn2.Gateway;
import org.eclipse.bpmn2.GlobalBusinessRuleTask;
import org.eclipse.bpmn2.GlobalManualTask;
import org.eclipse.bpmn2.GlobalScriptTask;
import org.eclipse.bpmn2.GlobalTask;
import org.eclipse.bpmn2.GlobalUserTask;
import org.eclipse.bpmn2.HumanPerformer;
import org.eclipse.bpmn2.Import;
import org.eclipse.bpmn2.InputOutputSpecification;
import org.eclipse.bpmn2.Interface;
import org.eclipse.bpmn2.ItemDefinition;
import org.eclipse.bpmn2.LinkEventDefinition;
import org.eclipse.bpmn2.ManualTask;
import org.eclipse.bpmn2.Message;
import org.eclipse.bpmn2.MessageEventDefinition;
import org.eclipse.bpmn2.MessageFlow;
import org.eclipse.bpmn2.MultiInstanceLoopCharacteristics;
import org.eclipse.bpmn2.Operation;
import org.eclipse.bpmn2.Performer;
import org.eclipse.bpmn2.PotentialOwner;
import org.eclipse.bpmn2.Process;
import org.eclipse.bpmn2.Property;
import org.eclipse.bpmn2.ResourceAssignmentExpression;
import org.eclipse.bpmn2.ResourceParameterBinding;
import org.eclipse.bpmn2.ResourceRole;
import org.eclipse.bpmn2.ScriptTask;
import org.eclipse.bpmn2.SequenceFlow;
import org.eclipse.bpmn2.SignalEventDefinition;
import org.eclipse.bpmn2.StandardLoopCharacteristics;
import org.eclipse.bpmn2.StartEvent;
import org.eclipse.bpmn2.SubProcess;
import org.eclipse.bpmn2.Task;
import org.eclipse.bpmn2.TextAnnotation;
import org.eclipse.bpmn2.ThrowEvent;
import org.eclipse.bpmn2.TimerEventDefinition;
import org.eclipse.bpmn2.modeler.core.IBpmn2RuntimeExtension;
import org.eclipse.bpmn2.modeler.core.LifecycleEvent;
import org.eclipse.bpmn2.modeler.core.LifecycleEvent.EventType;
import org.eclipse.bpmn2.modeler.core.merrimac.clad.DefaultDetailComposite;
import org.eclipse.bpmn2.modeler.core.merrimac.clad.DefaultDialogComposite;
import org.eclipse.bpmn2.modeler.core.merrimac.clad.DefaultListComposite;
import org.eclipse.bpmn2.modeler.core.merrimac.clad.PropertiesCompositeFactory;
import org.eclipse.bpmn2.modeler.core.preferences.ModelEnablements;
import org.eclipse.bpmn2.modeler.core.utils.ModelUtil.Bpmn2DiagramType;
import org.eclipse.bpmn2.modeler.ui.DefaultBpmn2RuntimeExtension.RootElementParser;
import org.eclipse.bpmn2.modeler.ui.property.artifact.CategoryDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.artifact.TextAnnotationDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.connectors.MessageFlowDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.connectors.SequenceFlowDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.data.DataAssignmentDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.data.DataObjectPropertySection.DataObjectDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.data.DataObjectReferencePropertySection.DataObjectReferenceDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.data.DataStorePropertySection.DataStoreDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.data.DataStoreReferencePropertySection.DataStoreReferenceDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.data.ExpressionDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.data.InterfaceDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.data.ItemAwareElementDetailComposite;
//import org.eclipse.bpmn2.modeler.ui.AbstractBpmn2RuntimeExtension.RootElementParser;
import org.eclipse.bpmn2.modeler.ui.property.data.MessageDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.data.MessageListComposite;
import org.eclipse.bpmn2.modeler.ui.property.data.OperationDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.data.ResourceAssignmentExpressionDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.data.ResourceParameterBindingDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.data.ResourceRoleDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.diagrams.CorrelationPropertyREListComposite;
import org.eclipse.bpmn2.modeler.ui.property.diagrams.DefinitionsPropertyComposite.ImportDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.diagrams.ItemDefinitionDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.diagrams.ItemDefinitionListComposite;
import org.eclipse.bpmn2.modeler.ui.property.diagrams.ProcessDiagramDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.diagrams.PropertyListComposite;
import org.eclipse.bpmn2.modeler.ui.property.diagrams.ResourceRoleListComposite;
import org.eclipse.bpmn2.modeler.ui.property.events.BoundaryEventDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.events.CatchEventDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.events.CommonEventDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.events.CommonEventPropertySection.EventDefinitionDialogComposite;
import org.eclipse.bpmn2.modeler.ui.property.events.ConditionalEventDefinitionDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.events.EndEventDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.events.LinkEventDefinitionDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.events.StartEventDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.events.ThrowEventDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.events.TimerEventDefinitionDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.gateways.GatewayDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.tasks.ActivityDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.tasks.ActivityInputDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.tasks.ActivityOutputDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.tasks.DataAssociationDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.tasks.IoParametersDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.tasks.ManualTaskDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.tasks.MultiInstanceLoopCharacteristicsDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.tasks.ScriptTaskDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.tasks.StandardLoopCharacteristicsDetailComposite;
import org.eclipse.bpmn2.modeler.ui.property.tasks.TaskDetailComposite;
//import org.eclipse.core.internal.events.LifecycleEvent;
import org.eclipse.bpmn2.modeler.ui.wizards.FileService;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.ui.editor.DiagramEditor;
import org.eclipse.ui.IEditorInput;
import org.xml.sax.InputSource;

public class MyRuntimeExtension implements IBpmn2RuntimeExtension {
	public static final String RUNTIME_ID = "BpmnForCps.runtime1";
	 
	public String[] getExpressionLanguages() {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] getTypeLanguages() {
		// TODO Auto-generated method stub
		return null;
	}

	public void initialize(DiagramEditor arg0) {
		// TODO Auto-generated method stub
		
	}

	public String getTargetNamespace(Bpmn2DiagramType arg0) {
		// TODO Auto-generated method stub
		return "http://org.eclipse.BpmnForCpsExtension";
	}

	
	public boolean isContentForRuntime(IEditorInput input) {
		InputSource source= new InputSource(FileService.getInputContents(input));
	//	RootElementParser parser = new  RootElementParser ("http://org.eclipse.bpmn2.modeler.examples.customtask.runtime");
		RootElementParser parser = new  RootElementParser ("http://bpmnforcpsextension");
		parser.parse(source);
		return parser.getResult();
	}

	
	
	@Override
	public void notify(LifecycleEvent event) {
		//System.out.println(event.eventType+ ": " + event.target);
		if (event.eventType.equals(EventType.EDITOR_INITIALIZED)) {
			if (event.target instanceof IAdaptable) {
				ModelEnablements me = (ModelEnablements) ((IAdaptable)event.target).getAdapter(ModelEnablements.class);
				me.setEnabled("BaseElement", "style", true); //$NON-NLS-1$ //$NON-NLS-2$
				me.setEnabled("ShapeStyle", true); //$NON-NLS-1$
			}
			PropertiesCompositeFactory.register(EObject.class, DefaultDetailComposite.class);
			PropertiesCompositeFactory.register(EObject.class, DefaultListComposite.class);
			PropertiesCompositeFactory.register(EObject.class, DefaultDialogComposite.class);
			PropertiesCompositeFactory.register(Message.class, MessageDetailComposite.class);
			PropertiesCompositeFactory.register(Message.class, MessageListComposite.class);
			PropertiesCompositeFactory.register(MessageFlow.class, MessageFlowDetailComposite.class);
			PropertiesCompositeFactory.register(Property.class, ItemAwareElementDetailComposite.class);
			PropertiesCompositeFactory.register(CallActivity.class, ActivityDetailComposite.class);
			PropertiesCompositeFactory.register(GlobalTask.class, ActivityDetailComposite.class);
			PropertiesCompositeFactory.register(GlobalBusinessRuleTask.class, ActivityDetailComposite.class);
			PropertiesCompositeFactory.register(GlobalManualTask.class, ActivityDetailComposite.class);
			PropertiesCompositeFactory.register(GlobalScriptTask.class, ActivityDetailComposite.class);
			PropertiesCompositeFactory.register(GlobalUserTask.class, ActivityDetailComposite.class);
			PropertiesCompositeFactory.register(Import.class, ImportDetailComposite.class);
			PropertiesCompositeFactory.register(Category.class, CategoryDetailComposite.class);
			PropertiesCompositeFactory.register(TextAnnotation.class, TextAnnotationDetailComposite.class);
			PropertiesCompositeFactory.register(SequenceFlow.class, SequenceFlowDetailComposite.class);
			PropertiesCompositeFactory.register(DataObject.class, DataObjectDetailComposite.class);
			PropertiesCompositeFactory.register(DataObjectReference.class, DataObjectDetailComposite.class);
			PropertiesCompositeFactory.register(Assignment.class, DataAssignmentDetailComposite.class);
			PropertiesCompositeFactory.register(Expression.class, ExpressionDetailComposite.class);
			PropertiesCompositeFactory.register(FormalExpression.class, ExpressionDetailComposite.class);
			PropertiesCompositeFactory.register(ResourceAssignmentExpression.class, ResourceAssignmentExpressionDetailComposite.class);
			PropertiesCompositeFactory.register(ResourceParameterBinding.class, ResourceParameterBindingDetailComposite.class);
			PropertiesCompositeFactory.register(PotentialOwner.class, ResourceRoleDetailComposite.class);
			PropertiesCompositeFactory.register(HumanPerformer.class, ResourceRoleDetailComposite.class);
			PropertiesCompositeFactory.register(Performer.class, ResourceRoleDetailComposite.class);
			PropertiesCompositeFactory.register(DataObjectReference.class, DataObjectReferenceDetailComposite.class);
			PropertiesCompositeFactory.register(DataStore.class, DataStoreDetailComposite.class);
			PropertiesCompositeFactory.register(DataStoreReference.class, DataStoreReferenceDetailComposite.class);
			PropertiesCompositeFactory.register(Interface.class, InterfaceDetailComposite.class);
			PropertiesCompositeFactory.register(Operation.class, OperationDetailComposite.class);
			PropertiesCompositeFactory.register(ItemDefinition.class, ItemDefinitionDetailComposite.class);
			PropertiesCompositeFactory.register(ItemDefinition.class, ItemDefinitionListComposite.class);
			PropertiesCompositeFactory.register(CorrelationPropertyRetrievalExpression.class, CorrelationPropertyREListComposite.class);
			PropertiesCompositeFactory.register(Property.class, PropertyListComposite.class);
			PropertiesCompositeFactory.register(ResourceRole.class, ResourceRoleListComposite.class);
			PropertiesCompositeFactory.register(Event.class, CommonEventDetailComposite.class);
			PropertiesCompositeFactory.register(StartEvent.class, StartEventDetailComposite.class);
			PropertiesCompositeFactory.register(EndEvent.class, EndEventDetailComposite.class);
			PropertiesCompositeFactory.register(CatchEvent.class, CatchEventDetailComposite.class);
			PropertiesCompositeFactory.register(ThrowEvent.class, ThrowEventDetailComposite.class);
			PropertiesCompositeFactory.register(BoundaryEvent.class, BoundaryEventDetailComposite.class);
			PropertiesCompositeFactory.register(TimerEventDefinition.class, TimerEventDefinitionDetailComposite.class);
			PropertiesCompositeFactory.register(LinkEventDefinition.class, LinkEventDefinitionDetailComposite.class);
			PropertiesCompositeFactory.register(ConditionalEventDefinition.class, ConditionalEventDefinitionDetailComposite.class);
			PropertiesCompositeFactory.register(CompensateEventDefinition.class, EventDefinitionDialogComposite.class);
			PropertiesCompositeFactory.register(ConditionalEventDefinition.class, EventDefinitionDialogComposite.class);
			PropertiesCompositeFactory.register(ErrorEventDefinition.class, EventDefinitionDialogComposite.class);
			PropertiesCompositeFactory.register(EscalationEventDefinition.class, EventDefinitionDialogComposite.class);
			PropertiesCompositeFactory.register(LinkEventDefinition.class, EventDefinitionDialogComposite.class);
			PropertiesCompositeFactory.register(MessageEventDefinition.class, EventDefinitionDialogComposite.class);
			PropertiesCompositeFactory.register(SignalEventDefinition.class, EventDefinitionDialogComposite.class);
			PropertiesCompositeFactory.register(TimerEventDefinition.class, EventDefinitionDialogComposite.class);
			PropertiesCompositeFactory.register(Process.class, ProcessDiagramDetailComposite.class);
			PropertiesCompositeFactory.register(EndEvent.class, EndEventDetailComposite.class);
			PropertiesCompositeFactory.register(StartEvent.class, StartEventDetailComposite.class);
			PropertiesCompositeFactory.register(ThrowEvent.class, ThrowEventDetailComposite.class);
			PropertiesCompositeFactory.register(StandardLoopCharacteristics.class, StandardLoopCharacteristicsDetailComposite.class);
			PropertiesCompositeFactory.register(MultiInstanceLoopCharacteristics.class, MultiInstanceLoopCharacteristicsDetailComposite.class);
			PropertiesCompositeFactory.register(Gateway.class, GatewayDetailComposite.class);
			PropertiesCompositeFactory.register(Activity.class, ActivityInputDetailComposite.class);
			PropertiesCompositeFactory.register(InputOutputSpecification.class, ActivityInputDetailComposite.class);
			PropertiesCompositeFactory.register(Activity.class, ActivityOutputDetailComposite.class);
			PropertiesCompositeFactory.register(CallChoreography.class, ActivityDetailComposite.class);
			PropertiesCompositeFactory.register(InputOutputSpecification.class, IoParametersDetailComposite.class);
			PropertiesCompositeFactory.register(DataInput.class, DataAssociationDetailComposite.class);
			PropertiesCompositeFactory.register(DataOutput.class, DataAssociationDetailComposite.class);
			PropertiesCompositeFactory.register(ManualTask.class, ManualTaskDetailComposite.class);
			PropertiesCompositeFactory.register(ScriptTask.class, ScriptTaskDetailComposite.class);
			PropertiesCompositeFactory.register(SubProcess.class, ActivityDetailComposite.class);
			PropertiesCompositeFactory.register(Task.class, TaskDetailComposite.class);
		}
		
	}

}
