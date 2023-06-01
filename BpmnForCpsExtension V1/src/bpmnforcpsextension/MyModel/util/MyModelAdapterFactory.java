/**
 */
package bpmnforcpsextension.MyModel.util;

import bpmnforcpsextension.MyModel.*;

import org.eclipse.bpmn2.Activity;
import org.eclipse.bpmn2.Artifact;
import org.eclipse.bpmn2.BaseElement;
import org.eclipse.bpmn2.EventDefinition;
import org.eclipse.bpmn2.FlowElement;
import org.eclipse.bpmn2.FlowNode;
import org.eclipse.bpmn2.InteractionNode;
import org.eclipse.bpmn2.RootElement;
import org.eclipse.bpmn2.Task;
import org.eclipse.bpmn2.TextAnnotation;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see bpmnforcpsextension.MyModel.MyModelPackage
 * @generated
 */
public class MyModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MyModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MyModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MyModelSwitch<Adapter> modelSwitch =
		new MyModelSwitch<Adapter>() {
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseMetaData(MetaData object) {
				return createMetaDataAdapter();
			}
			@Override
			public Adapter caseTaskConfig(TaskConfig object) {
				return createTaskConfigAdapter();
			}
			@Override
			public Adapter caseTemporalDependency(TemporalDependency object) {
				return createTemporalDependencyAdapter();
			}
			@Override
			public Adapter caseMSA(MSA object) {
				return createMSAAdapter();
			}
			@Override
			public Adapter caseMOA(MOA object) {
				return createMOAAdapter();
			}
			@Override
			public Adapter caseMFA(MFA object) {
				return createMFAAdapter();
			}
			@Override
			public Adapter caseMSI(MSI object) {
				return createMSIAdapter();
			}
			@Override
			public Adapter caseMOI(MOI object) {
				return createMOIAdapter();
			}
			@Override
			public Adapter caseMFI(MFI object) {
				return createMFIAdapter();
			}
			@Override
			public Adapter caseMustHappenAtAnInfiniteTime(MustHappenAtAnInfiniteTime object) {
				return createMustHappenAtAnInfiniteTimeAdapter();
			}
			@Override
			public Adapter caseMustHappenAsLongAsTheActivityIsExecuting(MustHappenAsLongAsTheActivityIsExecuting object) {
				return createMustHappenAsLongAsTheActivityIsExecutingAdapter();
			}
			@Override
			public Adapter caseMustHappenAtTheStartOfTheActivity(MustHappenAtTheStartOfTheActivity object) {
				return createMustHappenAtTheStartOfTheActivityAdapter();
			}
			@Override
			public Adapter caseMustHappenAtTheEndOfTheActivity(MustHappenAtTheEndOfTheActivity object) {
				return createMustHappenAtTheEndOfTheActivityAdapter();
			}
			@Override
			public Adapter caseMustHappenAtABoundTime(MustHappenAtABoundTime object) {
				return createMustHappenAtABoundTimeAdapter();
			}
			@Override
			public Adapter caseMustNeverHappenAtAnInfiniteTime(MustNeverHappenAtAnInfiniteTime object) {
				return createMustNeverHappenAtAnInfiniteTimeAdapter();
			}
			@Override
			public Adapter caseMustNeverHappenAsLongAsTheActivityIsExecuting(MustNeverHappenAsLongAsTheActivityIsExecuting object) {
				return createMustNeverHappenAsLongAsTheActivityIsExecutingAdapter();
			}
			@Override
			public Adapter caseMustNeverHappenAtTheStartOfTheActivity(MustNeverHappenAtTheStartOfTheActivity object) {
				return createMustNeverHappenAtTheStartOfTheActivityAdapter();
			}
			@Override
			public Adapter caseMustNeverHappenAtTheEndOfTheActivity(MustNeverHappenAtTheEndOfTheActivity object) {
				return createMustNeverHappenAtTheEndOfTheActivityAdapter();
			}
			@Override
			public Adapter caseMustNeverHappenAtABoundTime(MustNeverHappenAtABoundTime object) {
				return createMustNeverHappenAtABoundTimeAdapter();
			}
			@Override
			public Adapter casePeriodicEvent(PeriodicEvent object) {
				return createPeriodicEventAdapter();
			}
			@Override
			public Adapter caseSporadicEvent(SporadicEvent object) {
				return createSporadicEventAdapter();
			}
			@Override
			public Adapter casePeriodicActivity(PeriodicActivity object) {
				return createPeriodicActivityAdapter();
			}
			@Override
			public Adapter caseSporadicActivity(SporadicActivity object) {
				return createSporadicActivityAdapter();
			}
			@Override
			public Adapter caseDuration(Duration object) {
				return createDurationAdapter();
			}
			@Override
			public Adapter casePhysicalEntityTask(PhysicalEntityTask object) {
				return createPhysicalEntityTaskAdapter();
			}
			@Override
			public Adapter caseMyEventDefinition(MyEventDefinition object) {
				return createMyEventDefinitionAdapter();
			}
			@Override
			public Adapter caseRealWorldProperties(RealWorldProperties object) {
				return createRealWorldPropertiesAdapter();
			}
			@Override
			public Adapter caseBaseElement(BaseElement object) {
				return createBaseElementAdapter();
			}
			@Override
			public Adapter caseFlowElement(FlowElement object) {
				return createFlowElementAdapter();
			}
			@Override
			public Adapter caseRootElement(RootElement object) {
				return createRootElementAdapter();
			}
			@Override
			public Adapter caseEventDefinition(EventDefinition object) {
				return createEventDefinitionAdapter();
			}
			@Override
			public Adapter caseFlowNode(FlowNode object) {
				return createFlowNodeAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseInteractionNode(InteractionNode object) {
				return createInteractionNodeAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseArtifact(Artifact object) {
				return createArtifactAdapter();
			}
			@Override
			public Adapter caseTextAnnotation(TextAnnotation object) {
				return createTextAnnotationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link bpmnforcpsextension.MyModel.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmnforcpsextension.MyModel.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmnforcpsextension.MyModel.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmnforcpsextension.MyModel.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmnforcpsextension.MyModel.MetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmnforcpsextension.MyModel.MetaData
	 * @generated
	 */
	public Adapter createMetaDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmnforcpsextension.MyModel.TaskConfig <em>Task Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmnforcpsextension.MyModel.TaskConfig
	 * @generated
	 */
	public Adapter createTaskConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmnforcpsextension.MyModel.TemporalDependency <em>Temporal Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmnforcpsextension.MyModel.TemporalDependency
	 * @generated
	 */
	public Adapter createTemporalDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmnforcpsextension.MyModel.MSA <em>MSA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmnforcpsextension.MyModel.MSA
	 * @generated
	 */
	public Adapter createMSAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmnforcpsextension.MyModel.MOA <em>MOA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmnforcpsextension.MyModel.MOA
	 * @generated
	 */
	public Adapter createMOAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmnforcpsextension.MyModel.MFA <em>MFA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmnforcpsextension.MyModel.MFA
	 * @generated
	 */
	public Adapter createMFAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmnforcpsextension.MyModel.MSI <em>MSI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmnforcpsextension.MyModel.MSI
	 * @generated
	 */
	public Adapter createMSIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmnforcpsextension.MyModel.MOI <em>MOI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmnforcpsextension.MyModel.MOI
	 * @generated
	 */
	public Adapter createMOIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmnforcpsextension.MyModel.MFI <em>MFI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmnforcpsextension.MyModel.MFI
	 * @generated
	 */
	public Adapter createMFIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmnforcpsextension.MyModel.MustHappenAtAnInfiniteTime <em>Must Happen At An Infinite Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtAnInfiniteTime
	 * @generated
	 */
	public Adapter createMustHappenAtAnInfiniteTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmnforcpsextension.MyModel.MustHappenAsLongAsTheActivityIsExecuting <em>Must Happen As Long As The Activity Is Executing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmnforcpsextension.MyModel.MustHappenAsLongAsTheActivityIsExecuting
	 * @generated
	 */
	public Adapter createMustHappenAsLongAsTheActivityIsExecutingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmnforcpsextension.MyModel.MustHappenAtTheStartOfTheActivity <em>Must Happen At The Start Of The Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtTheStartOfTheActivity
	 * @generated
	 */
	public Adapter createMustHappenAtTheStartOfTheActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmnforcpsextension.MyModel.MustHappenAtTheEndOfTheActivity <em>Must Happen At The End Of The Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtTheEndOfTheActivity
	 * @generated
	 */
	public Adapter createMustHappenAtTheEndOfTheActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmnforcpsextension.MyModel.MustHappenAtABoundTime <em>Must Happen At ABound Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtABoundTime
	 * @generated
	 */
	public Adapter createMustHappenAtABoundTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtAnInfiniteTime <em>Must Never Happen At An Infinite Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtAnInfiniteTime
	 * @generated
	 */
	public Adapter createMustNeverHappenAtAnInfiniteTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmnforcpsextension.MyModel.MustNeverHappenAsLongAsTheActivityIsExecuting <em>Must Never Happen As Long As The Activity Is Executing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAsLongAsTheActivityIsExecuting
	 * @generated
	 */
	public Adapter createMustNeverHappenAsLongAsTheActivityIsExecutingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheStartOfTheActivity <em>Must Never Happen At The Start Of The Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtTheStartOfTheActivity
	 * @generated
	 */
	public Adapter createMustNeverHappenAtTheStartOfTheActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity <em>Must Never Happen At The End Of The Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity
	 * @generated
	 */
	public Adapter createMustNeverHappenAtTheEndOfTheActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime <em>Must Never Happen At ABound Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime
	 * @generated
	 */
	public Adapter createMustNeverHappenAtABoundTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmnforcpsextension.MyModel.PeriodicEvent <em>Periodic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmnforcpsextension.MyModel.PeriodicEvent
	 * @generated
	 */
	public Adapter createPeriodicEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmnforcpsextension.MyModel.SporadicEvent <em>Sporadic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmnforcpsextension.MyModel.SporadicEvent
	 * @generated
	 */
	public Adapter createSporadicEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmnforcpsextension.MyModel.PeriodicActivity <em>Periodic Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmnforcpsextension.MyModel.PeriodicActivity
	 * @generated
	 */
	public Adapter createPeriodicActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmnforcpsextension.MyModel.SporadicActivity <em>Sporadic Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmnforcpsextension.MyModel.SporadicActivity
	 * @generated
	 */
	public Adapter createSporadicActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmnforcpsextension.MyModel.Duration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmnforcpsextension.MyModel.Duration
	 * @generated
	 */
	public Adapter createDurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmnforcpsextension.MyModel.PhysicalEntityTask <em>Physical Entity Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmnforcpsextension.MyModel.PhysicalEntityTask
	 * @generated
	 */
	public Adapter createPhysicalEntityTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmnforcpsextension.MyModel.MyEventDefinition <em>My Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmnforcpsextension.MyModel.MyEventDefinition
	 * @generated
	 */
	public Adapter createMyEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmnforcpsextension.MyModel.RealWorldProperties <em>Real World Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmnforcpsextension.MyModel.RealWorldProperties
	 * @generated
	 */
	public Adapter createRealWorldPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.BaseElement <em>Base Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.bpmn2.BaseElement
	 * @generated
	 */
	public Adapter createBaseElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.FlowElement <em>Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.bpmn2.FlowElement
	 * @generated
	 */
	public Adapter createFlowElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.RootElement <em>Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.bpmn2.RootElement
	 * @generated
	 */
	public Adapter createRootElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.EventDefinition <em>Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.bpmn2.EventDefinition
	 * @generated
	 */
	public Adapter createEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.FlowNode <em>Flow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.bpmn2.FlowNode
	 * @generated
	 */
	public Adapter createFlowNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.bpmn2.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.InteractionNode <em>Interaction Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.bpmn2.InteractionNode
	 * @generated
	 */
	public Adapter createInteractionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.bpmn2.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.bpmn2.Artifact
	 * @generated
	 */
	public Adapter createArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.TextAnnotation <em>Text Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.bpmn2.TextAnnotation
	 * @generated
	 */
	public Adapter createTextAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MyModelAdapterFactory
