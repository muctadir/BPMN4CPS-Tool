/**
 */
package bpmnforcpsextension.MyModel;

import org.eclipse.bpmn2.Task;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Entity Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmnforcpsextension.MyModel.PhysicalEntityTask#getCPSPerformerRef <em>CPS Performer Ref</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.PhysicalEntityTask#getCPSDeviceRoleParameters <em>CPS Device Role Parameters</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.PhysicalEntityTask#getType <em>Type</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.PhysicalEntityTask#isIsMovable <em>Is Movable</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmnforcpsextension.MyModel.MyModelPackage#getPhysicalEntityTask()
 * @model
 * @generated
 */
public interface PhysicalEntityTask extends Task {
	/**
	 * Returns the value of the '<em><b>CPS Performer Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CPS Performer Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CPS Performer Ref</em>' attribute.
	 * @see #setCPSPerformerRef(String)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getPhysicalEntityTask_CPSPerformerRef()
	 * @model
	 * @generated
	 */
	String getCPSPerformerRef();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.PhysicalEntityTask#getCPSPerformerRef <em>CPS Performer Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CPS Performer Ref</em>' attribute.
	 * @see #getCPSPerformerRef()
	 * @generated
	 */
	void setCPSPerformerRef(String value);

	/**
	 * Returns the value of the '<em><b>CPS Device Role Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CPS Device Role Parameters</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CPS Device Role Parameters</em>' attribute.
	 * @see #setCPSDeviceRoleParameters(String)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getPhysicalEntityTask_CPSDeviceRoleParameters()
	 * @model
	 * @generated
	 */
	String getCPSDeviceRoleParameters();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.PhysicalEntityTask#getCPSDeviceRoleParameters <em>CPS Device Role Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CPS Device Role Parameters</em>' attribute.
	 * @see #getCPSDeviceRoleParameters()
	 * @generated
	 */
	void setCPSDeviceRoleParameters(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link bpmnforcpsextension.MyModel.TypeDevice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see bpmnforcpsextension.MyModel.TypeDevice
	 * @see #setType(TypeDevice)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getPhysicalEntityTask_Type()
	 * @model
	 * @generated
	 */
	TypeDevice getType();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.PhysicalEntityTask#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see bpmnforcpsextension.MyModel.TypeDevice
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDevice value);

	/**
	 * Returns the value of the '<em><b>Is Movable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Movable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Movable</em>' attribute.
	 * @see #setIsMovable(boolean)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getPhysicalEntityTask_IsMovable()
	 * @model
	 * @generated
	 */
	boolean isIsMovable();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.PhysicalEntityTask#isIsMovable <em>Is Movable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Movable</em>' attribute.
	 * @see #isIsMovable()
	 * @generated
	 */
	void setIsMovable(boolean value);

} // PhysicalEntityTask
