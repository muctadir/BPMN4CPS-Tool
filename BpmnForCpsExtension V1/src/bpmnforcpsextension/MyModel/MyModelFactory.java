/**
 */
package bpmnforcpsextension.MyModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see bpmnforcpsextension.MyModel.MyModelPackage
 * @generated
 */
public interface MyModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MyModelFactory eINSTANCE = bpmnforcpsextension.MyModel.impl.MyModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Meta Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meta Data</em>'.
	 * @generated
	 */
	MetaData createMetaData();

	/**
	 * Returns a new object of class '<em>Task Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Config</em>'.
	 * @generated
	 */
	TaskConfig createTaskConfig();

	/**
	 * Returns a new object of class '<em>Temporal Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temporal Dependency</em>'.
	 * @generated
	 */
	TemporalDependency createTemporalDependency();

	/**
	 * Returns a new object of class '<em>MSA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MSA</em>'.
	 * @generated
	 */
	MSA createMSA();

	/**
	 * Returns a new object of class '<em>MOA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MOA</em>'.
	 * @generated
	 */
	MOA createMOA();

	/**
	 * Returns a new object of class '<em>MFA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MFA</em>'.
	 * @generated
	 */
	MFA createMFA();

	/**
	 * Returns a new object of class '<em>MSI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MSI</em>'.
	 * @generated
	 */
	MSI createMSI();

	/**
	 * Returns a new object of class '<em>MOI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MOI</em>'.
	 * @generated
	 */
	MOI createMOI();

	/**
	 * Returns a new object of class '<em>MFI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MFI</em>'.
	 * @generated
	 */
	MFI createMFI();

	/**
	 * Returns a new object of class '<em>Must Happen At An Infinite Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Must Happen At An Infinite Time</em>'.
	 * @generated
	 */
	MustHappenAtAnInfiniteTime createMustHappenAtAnInfiniteTime();

	/**
	 * Returns a new object of class '<em>Must Happen As Long As The Activity Is Executing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Must Happen As Long As The Activity Is Executing</em>'.
	 * @generated
	 */
	MustHappenAsLongAsTheActivityIsExecuting createMustHappenAsLongAsTheActivityIsExecuting();

	/**
	 * Returns a new object of class '<em>Must Happen At The Start Of The Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Must Happen At The Start Of The Activity</em>'.
	 * @generated
	 */
	MustHappenAtTheStartOfTheActivity createMustHappenAtTheStartOfTheActivity();

	/**
	 * Returns a new object of class '<em>Must Happen At The End Of The Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Must Happen At The End Of The Activity</em>'.
	 * @generated
	 */
	MustHappenAtTheEndOfTheActivity createMustHappenAtTheEndOfTheActivity();

	/**
	 * Returns a new object of class '<em>Must Happen At ABound Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Must Happen At ABound Time</em>'.
	 * @generated
	 */
	MustHappenAtABoundTime createMustHappenAtABoundTime();

	/**
	 * Returns a new object of class '<em>Must Never Happen At An Infinite Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Must Never Happen At An Infinite Time</em>'.
	 * @generated
	 */
	MustNeverHappenAtAnInfiniteTime createMustNeverHappenAtAnInfiniteTime();

	/**
	 * Returns a new object of class '<em>Must Never Happen As Long As The Activity Is Executing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Must Never Happen As Long As The Activity Is Executing</em>'.
	 * @generated
	 */
	MustNeverHappenAsLongAsTheActivityIsExecuting createMustNeverHappenAsLongAsTheActivityIsExecuting();

	/**
	 * Returns a new object of class '<em>Must Never Happen At The Start Of The Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Must Never Happen At The Start Of The Activity</em>'.
	 * @generated
	 */
	MustNeverHappenAtTheStartOfTheActivity createMustNeverHappenAtTheStartOfTheActivity();

	/**
	 * Returns a new object of class '<em>Must Never Happen At The End Of The Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Must Never Happen At The End Of The Activity</em>'.
	 * @generated
	 */
	MustNeverHappenAtTheEndOfTheActivity createMustNeverHappenAtTheEndOfTheActivity();

	/**
	 * Returns a new object of class '<em>Must Never Happen At ABound Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Must Never Happen At ABound Time</em>'.
	 * @generated
	 */
	MustNeverHappenAtABoundTime createMustNeverHappenAtABoundTime();

	/**
	 * Returns a new object of class '<em>Periodic Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Periodic Event</em>'.
	 * @generated
	 */
	PeriodicEvent createPeriodicEvent();

	/**
	 * Returns a new object of class '<em>Sporadic Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sporadic Event</em>'.
	 * @generated
	 */
	SporadicEvent createSporadicEvent();

	/**
	 * Returns a new object of class '<em>Periodic Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Periodic Activity</em>'.
	 * @generated
	 */
	PeriodicActivity createPeriodicActivity();

	/**
	 * Returns a new object of class '<em>Sporadic Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sporadic Activity</em>'.
	 * @generated
	 */
	SporadicActivity createSporadicActivity();

	/**
	 * Returns a new object of class '<em>Duration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Duration</em>'.
	 * @generated
	 */
	Duration createDuration();

	/**
	 * Returns a new object of class '<em>Physical Entity Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Entity Task</em>'.
	 * @generated
	 */
	PhysicalEntityTask createPhysicalEntityTask();

	/**
	 * Returns a new object of class '<em>My Event Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>My Event Definition</em>'.
	 * @generated
	 */
	MyEventDefinition createMyEventDefinition();

	/**
	 * Returns a new object of class '<em>Real World Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Real World Properties</em>'.
	 * @generated
	 */
	RealWorldProperties createRealWorldProperties();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MyModelPackage getMyModelPackage();

} //MyModelFactory
