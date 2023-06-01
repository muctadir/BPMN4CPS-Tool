/**
 */
package bpmnforcpsextension.MyModel;

import org.eclipse.bpmn2.EventDefinition;
import org.eclipse.bpmn2.StandardLoopCharacteristics;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sporadic Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmnforcpsextension.MyModel.SporadicActivity#getName <em>Name</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.SporadicActivity#getTarget <em>Target</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.SporadicActivity#getMax_time <em>Max time</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.SporadicActivity#getMin_time <em>Min time</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.SporadicActivity#getTimer_Type <em>Timer Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmnforcpsextension.MyModel.MyModelPackage#getSporadicActivity()
 * @model
 * @generated
 */
public interface SporadicActivity extends EventDefinition {
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
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getSporadicActivity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.SporadicActivity#getName <em>Name</em>}' attribute.
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
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getSporadicActivity_Target()
	 * @model
	 * @generated
	 */
	StandardLoopCharacteristics getTarget();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.SporadicActivity#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(StandardLoopCharacteristics value);

	/**
	 * Returns the value of the '<em><b>Max time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max time</em>' attribute.
	 * @see #setMax_time(int)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getSporadicActivity_Max_time()
	 * @model
	 * @generated
	 */
	int getMax_time();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.SporadicActivity#getMax_time <em>Max time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max time</em>' attribute.
	 * @see #getMax_time()
	 * @generated
	 */
	void setMax_time(int value);

	/**
	 * Returns the value of the '<em><b>Min time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min time</em>' attribute.
	 * @see #setMin_time(int)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getSporadicActivity_Min_time()
	 * @model
	 * @generated
	 */
	int getMin_time();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.SporadicActivity#getMin_time <em>Min time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min time</em>' attribute.
	 * @see #getMin_time()
	 * @generated
	 */
	void setMin_time(int value);

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
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getSporadicActivity_Timer_Type()
	 * @model
	 * @generated
	 */
	Timer_Type getTimer_Type();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.SporadicActivity#getTimer_Type <em>Timer Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timer Type</em>' attribute.
	 * @see bpmnforcpsextension.MyModel.Timer_Type
	 * @see #getTimer_Type()
	 * @generated
	 */
	void setTimer_Type(Timer_Type value);

} // SporadicActivity
