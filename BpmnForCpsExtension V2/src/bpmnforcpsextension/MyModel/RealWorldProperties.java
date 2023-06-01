/**
 */
package bpmnforcpsextension.MyModel;

import org.eclipse.bpmn2.TextAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real World Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmnforcpsextension.MyModel.RealWorldProperties#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmnforcpsextension.MyModel.MyModelPackage#getRealWorldProperties()
 * @model
 * @generated
 */
public interface RealWorldProperties extends TextAnnotation {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute.
	 * @see #setParameters(String)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getRealWorldProperties_Parameters()
	 * @model
	 * @generated
	 */
	String getParameters();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.RealWorldProperties#getParameters <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' attribute.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(String value);

} // RealWorldProperties
