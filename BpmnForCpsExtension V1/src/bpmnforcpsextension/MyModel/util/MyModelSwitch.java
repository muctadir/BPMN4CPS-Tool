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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see bpmnforcpsextension.MyModel.MyModelPackage
 * @generated
 */
public class MyModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MyModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyModelSwitch() {
		if (modelPackage == null) {
			modelPackage = MyModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MyModelPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyModelPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyModelPackage.META_DATA: {
				MetaData metaData = (MetaData)theEObject;
				T result = caseMetaData(metaData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyModelPackage.TASK_CONFIG: {
				TaskConfig taskConfig = (TaskConfig)theEObject;
				T result = caseTaskConfig(taskConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyModelPackage.TEMPORAL_DEPENDENCY: {
				TemporalDependency temporalDependency = (TemporalDependency)theEObject;
				T result = caseTemporalDependency(temporalDependency);
				if (result == null) result = caseFlowElement(temporalDependency);
				if (result == null) result = caseBaseElement(temporalDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyModelPackage.MSA: {
				MSA msa = (MSA)theEObject;
				T result = caseMSA(msa);
				if (result == null) result = caseEventDefinition(msa);
				if (result == null) result = caseRootElement(msa);
				if (result == null) result = caseBaseElement(msa);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyModelPackage.MOA: {
				MOA moa = (MOA)theEObject;
				T result = caseMOA(moa);
				if (result == null) result = caseEventDefinition(moa);
				if (result == null) result = caseRootElement(moa);
				if (result == null) result = caseBaseElement(moa);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyModelPackage.MFA: {
				MFA mfa = (MFA)theEObject;
				T result = caseMFA(mfa);
				if (result == null) result = caseEventDefinition(mfa);
				if (result == null) result = caseRootElement(mfa);
				if (result == null) result = caseBaseElement(mfa);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyModelPackage.MSI: {
				MSI msi = (MSI)theEObject;
				T result = caseMSI(msi);
				if (result == null) result = caseEventDefinition(msi);
				if (result == null) result = caseRootElement(msi);
				if (result == null) result = caseBaseElement(msi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyModelPackage.MOI: {
				MOI moi = (MOI)theEObject;
				T result = caseMOI(moi);
				if (result == null) result = caseEventDefinition(moi);
				if (result == null) result = caseRootElement(moi);
				if (result == null) result = caseBaseElement(moi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyModelPackage.MFI: {
				MFI mfi = (MFI)theEObject;
				T result = caseMFI(mfi);
				if (result == null) result = caseEventDefinition(mfi);
				if (result == null) result = caseRootElement(mfi);
				if (result == null) result = caseBaseElement(mfi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyModelPackage.MUST_HAPPEN_AT_AN_INFINITE_TIME: {
				MustHappenAtAnInfiniteTime mustHappenAtAnInfiniteTime = (MustHappenAtAnInfiniteTime)theEObject;
				T result = caseMustHappenAtAnInfiniteTime(mustHappenAtAnInfiniteTime);
				if (result == null) result = caseEventDefinition(mustHappenAtAnInfiniteTime);
				if (result == null) result = caseRootElement(mustHappenAtAnInfiniteTime);
				if (result == null) result = caseBaseElement(mustHappenAtAnInfiniteTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING: {
				MustHappenAsLongAsTheActivityIsExecuting mustHappenAsLongAsTheActivityIsExecuting = (MustHappenAsLongAsTheActivityIsExecuting)theEObject;
				T result = caseMustHappenAsLongAsTheActivityIsExecuting(mustHappenAsLongAsTheActivityIsExecuting);
				if (result == null) result = caseEventDefinition(mustHappenAsLongAsTheActivityIsExecuting);
				if (result == null) result = caseRootElement(mustHappenAsLongAsTheActivityIsExecuting);
				if (result == null) result = caseBaseElement(mustHappenAsLongAsTheActivityIsExecuting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyModelPackage.MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY: {
				MustHappenAtTheStartOfTheActivity mustHappenAtTheStartOfTheActivity = (MustHappenAtTheStartOfTheActivity)theEObject;
				T result = caseMustHappenAtTheStartOfTheActivity(mustHappenAtTheStartOfTheActivity);
				if (result == null) result = caseEventDefinition(mustHappenAtTheStartOfTheActivity);
				if (result == null) result = caseRootElement(mustHappenAtTheStartOfTheActivity);
				if (result == null) result = caseBaseElement(mustHappenAtTheStartOfTheActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyModelPackage.MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY: {
				MustHappenAtTheEndOfTheActivity mustHappenAtTheEndOfTheActivity = (MustHappenAtTheEndOfTheActivity)theEObject;
				T result = caseMustHappenAtTheEndOfTheActivity(mustHappenAtTheEndOfTheActivity);
				if (result == null) result = caseEventDefinition(mustHappenAtTheEndOfTheActivity);
				if (result == null) result = caseRootElement(mustHappenAtTheEndOfTheActivity);
				if (result == null) result = caseBaseElement(mustHappenAtTheEndOfTheActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyModelPackage.MUST_HAPPEN_AT_ABOUND_TIME: {
				MustHappenAtABoundTime mustHappenAtABoundTime = (MustHappenAtABoundTime)theEObject;
				T result = caseMustHappenAtABoundTime(mustHappenAtABoundTime);
				if (result == null) result = caseEventDefinition(mustHappenAtABoundTime);
				if (result == null) result = caseRootElement(mustHappenAtABoundTime);
				if (result == null) result = caseBaseElement(mustHappenAtABoundTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyModelPackage.MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME: {
				MustNeverHappenAtAnInfiniteTime mustNeverHappenAtAnInfiniteTime = (MustNeverHappenAtAnInfiniteTime)theEObject;
				T result = caseMustNeverHappenAtAnInfiniteTime(mustNeverHappenAtAnInfiniteTime);
				if (result == null) result = caseEventDefinition(mustNeverHappenAtAnInfiniteTime);
				if (result == null) result = caseRootElement(mustNeverHappenAtAnInfiniteTime);
				if (result == null) result = caseBaseElement(mustNeverHappenAtAnInfiniteTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyModelPackage.MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING: {
				MustNeverHappenAsLongAsTheActivityIsExecuting mustNeverHappenAsLongAsTheActivityIsExecuting = (MustNeverHappenAsLongAsTheActivityIsExecuting)theEObject;
				T result = caseMustNeverHappenAsLongAsTheActivityIsExecuting(mustNeverHappenAsLongAsTheActivityIsExecuting);
				if (result == null) result = caseEventDefinition(mustNeverHappenAsLongAsTheActivityIsExecuting);
				if (result == null) result = caseRootElement(mustNeverHappenAsLongAsTheActivityIsExecuting);
				if (result == null) result = caseBaseElement(mustNeverHappenAsLongAsTheActivityIsExecuting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyModelPackage.MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY: {
				MustNeverHappenAtTheStartOfTheActivity mustNeverHappenAtTheStartOfTheActivity = (MustNeverHappenAtTheStartOfTheActivity)theEObject;
				T result = caseMustNeverHappenAtTheStartOfTheActivity(mustNeverHappenAtTheStartOfTheActivity);
				if (result == null) result = caseEventDefinition(mustNeverHappenAtTheStartOfTheActivity);
				if (result == null) result = caseRootElement(mustNeverHappenAtTheStartOfTheActivity);
				if (result == null) result = caseBaseElement(mustNeverHappenAtTheStartOfTheActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyModelPackage.MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY: {
				MustNeverHappenAtTheEndOfTheActivity mustNeverHappenAtTheEndOfTheActivity = (MustNeverHappenAtTheEndOfTheActivity)theEObject;
				T result = caseMustNeverHappenAtTheEndOfTheActivity(mustNeverHappenAtTheEndOfTheActivity);
				if (result == null) result = caseEventDefinition(mustNeverHappenAtTheEndOfTheActivity);
				if (result == null) result = caseRootElement(mustNeverHappenAtTheEndOfTheActivity);
				if (result == null) result = caseBaseElement(mustNeverHappenAtTheEndOfTheActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyModelPackage.MUST_NEVER_HAPPEN_AT_ABOUND_TIME: {
				MustNeverHappenAtABoundTime mustNeverHappenAtABoundTime = (MustNeverHappenAtABoundTime)theEObject;
				T result = caseMustNeverHappenAtABoundTime(mustNeverHappenAtABoundTime);
				if (result == null) result = caseEventDefinition(mustNeverHappenAtABoundTime);
				if (result == null) result = caseRootElement(mustNeverHappenAtABoundTime);
				if (result == null) result = caseBaseElement(mustNeverHappenAtABoundTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyModelPackage.PERIODIC_EVENT: {
				PeriodicEvent periodicEvent = (PeriodicEvent)theEObject;
				T result = casePeriodicEvent(periodicEvent);
				if (result == null) result = caseEventDefinition(periodicEvent);
				if (result == null) result = caseRootElement(periodicEvent);
				if (result == null) result = caseBaseElement(periodicEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyModelPackage.SPORADIC_EVENT: {
				SporadicEvent sporadicEvent = (SporadicEvent)theEObject;
				T result = caseSporadicEvent(sporadicEvent);
				if (result == null) result = caseEventDefinition(sporadicEvent);
				if (result == null) result = caseRootElement(sporadicEvent);
				if (result == null) result = caseBaseElement(sporadicEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyModelPackage.PERIODIC_ACTIVITY: {
				PeriodicActivity periodicActivity = (PeriodicActivity)theEObject;
				T result = casePeriodicActivity(periodicActivity);
				if (result == null) result = caseEventDefinition(periodicActivity);
				if (result == null) result = caseRootElement(periodicActivity);
				if (result == null) result = caseBaseElement(periodicActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyModelPackage.SPORADIC_ACTIVITY: {
				SporadicActivity sporadicActivity = (SporadicActivity)theEObject;
				T result = caseSporadicActivity(sporadicActivity);
				if (result == null) result = caseEventDefinition(sporadicActivity);
				if (result == null) result = caseRootElement(sporadicActivity);
				if (result == null) result = caseBaseElement(sporadicActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyModelPackage.DURATION: {
				Duration duration = (Duration)theEObject;
				T result = caseDuration(duration);
				if (result == null) result = caseEventDefinition(duration);
				if (result == null) result = caseRootElement(duration);
				if (result == null) result = caseBaseElement(duration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyModelPackage.PHYSICAL_ENTITY_TASK: {
				PhysicalEntityTask physicalEntityTask = (PhysicalEntityTask)theEObject;
				T result = casePhysicalEntityTask(physicalEntityTask);
				if (result == null) result = caseTask(physicalEntityTask);
				if (result == null) result = caseActivity(physicalEntityTask);
				if (result == null) result = caseInteractionNode(physicalEntityTask);
				if (result == null) result = caseFlowNode(physicalEntityTask);
				if (result == null) result = caseFlowElement(physicalEntityTask);
				if (result == null) result = caseBaseElement(physicalEntityTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyModelPackage.MY_EVENT_DEFINITION: {
				MyEventDefinition myEventDefinition = (MyEventDefinition)theEObject;
				T result = caseMyEventDefinition(myEventDefinition);
				if (result == null) result = caseEventDefinition(myEventDefinition);
				if (result == null) result = caseRootElement(myEventDefinition);
				if (result == null) result = caseBaseElement(myEventDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyModelPackage.REAL_WORLD_PROPERTIES: {
				RealWorldProperties realWorldProperties = (RealWorldProperties)theEObject;
				T result = caseRealWorldProperties(realWorldProperties);
				if (result == null) result = caseTextAnnotation(realWorldProperties);
				if (result == null) result = caseArtifact(realWorldProperties);
				if (result == null) result = caseBaseElement(realWorldProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaData(MetaData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskConfig(TaskConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalDependency(TemporalDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSA(MSA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MOA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MOA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMOA(MOA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MFA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MFA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFA(MFA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSI(MSI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MOI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MOI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMOI(MOI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MFI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MFI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFI(MFI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Must Happen At An Infinite Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Must Happen At An Infinite Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMustHappenAtAnInfiniteTime(MustHappenAtAnInfiniteTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Must Happen As Long As The Activity Is Executing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Must Happen As Long As The Activity Is Executing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMustHappenAsLongAsTheActivityIsExecuting(MustHappenAsLongAsTheActivityIsExecuting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Must Happen At The Start Of The Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Must Happen At The Start Of The Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMustHappenAtTheStartOfTheActivity(MustHappenAtTheStartOfTheActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Must Happen At The End Of The Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Must Happen At The End Of The Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMustHappenAtTheEndOfTheActivity(MustHappenAtTheEndOfTheActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Must Happen At ABound Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Must Happen At ABound Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMustHappenAtABoundTime(MustHappenAtABoundTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Must Never Happen At An Infinite Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Must Never Happen At An Infinite Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMustNeverHappenAtAnInfiniteTime(MustNeverHappenAtAnInfiniteTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Must Never Happen As Long As The Activity Is Executing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Must Never Happen As Long As The Activity Is Executing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMustNeverHappenAsLongAsTheActivityIsExecuting(MustNeverHappenAsLongAsTheActivityIsExecuting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Must Never Happen At The Start Of The Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Must Never Happen At The Start Of The Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMustNeverHappenAtTheStartOfTheActivity(MustNeverHappenAtTheStartOfTheActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Must Never Happen At The End Of The Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Must Never Happen At The End Of The Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMustNeverHappenAtTheEndOfTheActivity(MustNeverHappenAtTheEndOfTheActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Must Never Happen At ABound Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Must Never Happen At ABound Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMustNeverHappenAtABoundTime(MustNeverHappenAtABoundTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Periodic Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Periodic Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeriodicEvent(PeriodicEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sporadic Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sporadic Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSporadicEvent(SporadicEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Periodic Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Periodic Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeriodicActivity(PeriodicActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sporadic Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sporadic Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSporadicActivity(SporadicActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDuration(Duration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Entity Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Entity Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalEntityTask(PhysicalEntityTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>My Event Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>My Event Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMyEventDefinition(MyEventDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real World Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real World Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealWorldProperties(RealWorldProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseElement(BaseElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowElement(FlowElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootElement(RootElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventDefinition(EventDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowNode(FlowNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionNode(InteractionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifact(Artifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextAnnotation(TextAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MyModelSwitch
