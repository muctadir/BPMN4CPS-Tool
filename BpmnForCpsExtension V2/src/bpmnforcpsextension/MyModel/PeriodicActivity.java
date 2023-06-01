/**
 */
package bpmnforcpsextension.MyModel;

import org.eclipse.bpmn2.EventDefinition;
import org.eclipse.bpmn2.StandardLoopCharacteristics;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Periodic Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmnforcpsextension.MyModel.PeriodicActivity#getName <em>Name</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.PeriodicActivity#getTarget <em>Target</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.PeriodicActivity#getTime_value <em>Time value</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.PeriodicActivity#getTimer_Type <em>Timer Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmnforcpsextension.MyModel.MyModelPackage#getPeriodicActivity()
 * @model
 * @generated
 */
public interface PeriodicActivity extends EventDefinition {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getPeriodicActivity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.PeriodicActivity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(StandardLoopCharacteristics)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getPeriodicActivity_Target()
	 * @model
	 * @generated
	 */
	StandardLoopCharacteristics getTarget();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.PeriodicActivity#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(StandardLoopCharacteristics value);

	/**
	 * Returns the value of the '<em><b>Time value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time value</em>' attribute.
	 * @see #setTime_value(int)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getPeriodicActivity_Time_value()
	 * @model
	 * @generated
	 */
	int getTime_value();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.PeriodicActivity#getTime_value <em>Time value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time value</em>' attribute.
	 * @see #getTime_value()
	 * @generated
	 */
	void setTime_value(int value);

	/**
	 * Returns the value of the '<em><b>Timer Type</b></em>' attribute.
	 * The literals are from the enumeration {@link bpmnforcpsextension.MyModel.Timer_Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timer Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timer Type</em>' attribute.
	 * @see bpmnforcpsextension.MyModel.Timer_Type
	 * @see #setTimer_Type(Timer_Type)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getPeriodicActivity_Timer_Type()
	 * @model
	 * @generated
	 */
	Timer_Type getTimer_Type();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.PeriodicActivity#getTimer_Type <em>Timer Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timer Type</em>' attribute.
	 * @see bpmnforcpsextension.MyModel.Timer_Type
	 * @see #getTimer_Type()
	 * @generated
	 */
	void setTimer_Type(Timer_Type value);

} // PeriodicActivity
