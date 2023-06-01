/**
 */
package bpmnforcpsextension.MyModel;

import org.eclipse.bpmn2.Activity;
import org.eclipse.bpmn2.EventDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MFI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmnforcpsextension.MyModel.MFI#getName <em>Name</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.MFI#getType <em>Type</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.MFI#getTarget <em>Target</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.MFI#getMin_Value <em>Min Value</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.MFI#getMax_Value <em>Max Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmnforcpsextension.MyModel.MyModelPackage#getMFI()
 * @model
 * @generated
 */
public interface MFI extends EventDefinition {
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
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getMFI_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.MFI#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"MFI"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getMFI_Type()
	 * @model default="MFI"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.MFI#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

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
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getMFI_Target()
	 * @model
	 * @generated
	 */
	Activity getTarget();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.MFI#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Activity value);

	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #setMin_Value(String)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getMFI_Min_Value()
	 * @model
	 * @generated
	 */
	String getMin_Value();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.MFI#getMin_Value <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #getMin_Value()
	 * @generated
	 */
	void setMin_Value(String value);

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #setMax_Value(String)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getMFI_Max_Value()
	 * @model
	 * @generated
	 */
	String getMax_Value();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.MFI#getMax_Value <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #getMax_Value()
	 * @generated
	 */
	void setMax_Value(String value);

} // MFI
