/**
 */
package bpmnforcpsextension.MyModel;

import org.eclipse.bpmn2.EventDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>My Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmnforcpsextension.MyModel.MyEventDefinition#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmnforcpsextension.MyModel.MyModelPackage#getMyEventDefinition()
 * @model
 * @generated
 */
public interface MyEventDefinition extends EventDefinition {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getMyEventDefinition_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.MyEventDefinition#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // MyEventDefinition
