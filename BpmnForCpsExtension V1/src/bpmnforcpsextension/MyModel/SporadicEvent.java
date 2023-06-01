/**
 */
package bpmnforcpsextension.MyModel;

import org.eclipse.bpmn2.EventDefinition;
import org.eclipse.bpmn2.Task;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sporadic Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmnforcpsextension.MyModel.SporadicEvent#getName <em>Name</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.SporadicEvent#getTarget <em>Target</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.SporadicEvent#getMin_time <em>Min time</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.SporadicEvent#getMax_time <em>Max time</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.SporadicEvent#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmnforcpsextension.MyModel.MyModelPackage#getSporadicEvent()
 * @model
 * @generated
 */
public interface SporadicEvent extends EventDefinition {
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
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getSporadicEvent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.SporadicEvent#getName <em>Name</em>}' attribute.
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
	 * @see #setTarget(Task)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getSporadicEvent_Target()
	 * @model
	 * @generated
	 */
	Task getTarget();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.SporadicEvent#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Task value);

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
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getSporadicEvent_Max_time()
	 * @model
	 * @generated
	 */
	int getMax_time();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.SporadicEvent#getMax_time <em>Max time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max time</em>' attribute.
	 * @see #getMax_time()
	 * @generated
	 */
	void setMax_time(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"EventSporadic"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getSporadicEvent_Type()
	 * @model default="EventSporadic"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.SporadicEvent#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

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
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getSporadicEvent_Min_time()
	 * @model
	 * @generated
	 */
	int getMin_time();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.SporadicEvent#getMin_time <em>Min time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min time</em>' attribute.
	 * @see #getMin_time()
	 * @generated
	 */
	void setMin_time(int value);

} // SporadicEvent
