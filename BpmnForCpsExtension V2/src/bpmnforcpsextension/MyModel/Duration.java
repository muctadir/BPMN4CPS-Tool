/**
 */
package bpmnforcpsextension.MyModel;

import org.eclipse.bpmn2.Activity;
import org.eclipse.bpmn2.EventDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmnforcpsextension.MyModel.Duration#getName <em>Name</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.Duration#getTarget <em>Target</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.Duration#getMin_time_duration <em>Min time duration</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.Duration#getMax_time_duration <em>Max time duration</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.Duration#getTime_Type <em>Time Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmnforcpsextension.MyModel.MyModelPackage#getDuration()
 * @model
 * @generated
 */
public interface Duration extends EventDefinition {
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
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getDuration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.Duration#getName <em>Name</em>}' attribute.
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
	 * @see #setTarget(Activity)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getDuration_Target()
	 * @model
	 * @generated
	 */
	Activity getTarget();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.Duration#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Activity value);

	/**
	 * Returns the value of the '<em><b>Min time duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min time duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min time duration</em>' attribute.
	 * @see #setMin_time_duration(String)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getDuration_Min_time_duration()
	 * @model
	 * @generated
	 */
	String getMin_time_duration();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.Duration#getMin_time_duration <em>Min time duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min time duration</em>' attribute.
	 * @see #getMin_time_duration()
	 * @generated
	 */
	void setMin_time_duration(String value);

	/**
	 * Returns the value of the '<em><b>Max time duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max time duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max time duration</em>' attribute.
	 * @see #setMax_time_duration(String)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getDuration_Max_time_duration()
	 * @model
	 * @generated
	 */
	String getMax_time_duration();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.Duration#getMax_time_duration <em>Max time duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max time duration</em>' attribute.
	 * @see #getMax_time_duration()
	 * @generated
	 */
	void setMax_time_duration(String value);

	/**
	 * Returns the value of the '<em><b>Time Type</b></em>' attribute.
	 * The literals are from the enumeration {@link bpmnforcpsextension.MyModel.Timer_Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Type</em>' attribute.
	 * @see bpmnforcpsextension.MyModel.Timer_Type
	 * @see #setTime_Type(Timer_Type)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getDuration_Time_Type()
	 * @model
	 * @generated
	 */
	Timer_Type getTime_Type();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.Duration#getTime_Type <em>Time Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Type</em>' attribute.
	 * @see bpmnforcpsextension.MyModel.Timer_Type
	 * @see #getTime_Type()
	 * @generated
	 */
	void setTime_Type(Timer_Type value);

} // Duration
