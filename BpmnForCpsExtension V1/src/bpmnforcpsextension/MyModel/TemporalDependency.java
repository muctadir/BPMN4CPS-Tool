/**
 */
package bpmnforcpsextension.MyModel;

import org.eclipse.bpmn2.BoundaryEvent;
import org.eclipse.bpmn2.FlowElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmnforcpsextension.MyModel.TemporalDependency#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.TemporalDependency#getTargetRef <em>Target Ref</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.TemporalDependency#getMax_value <em>Max value</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.TemporalDependency#getMin_value <em>Min value</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmnforcpsextension.MyModel.MyModelPackage#getTemporalDependency()
 * @model
 * @generated
 */
public interface TemporalDependency extends FlowElement {
	/**
	 * Returns the value of the '<em><b>Source Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Ref</em>' reference.
	 * @see #setSourceRef(BoundaryEvent)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getTemporalDependency_SourceRef()
	 * @model
	 * @generated
	 */
	BoundaryEvent getSourceRef();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.TemporalDependency#getSourceRef <em>Source Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Ref</em>' reference.
	 * @see #getSourceRef()
	 * @generated
	 */
	void setSourceRef(BoundaryEvent value);

	/**
	 * Returns the value of the '<em><b>Target Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Ref</em>' reference.
	 * @see #setTargetRef(BoundaryEvent)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getTemporalDependency_TargetRef()
	 * @model
	 * @generated
	 */
	BoundaryEvent getTargetRef();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.TemporalDependency#getTargetRef <em>Target Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Ref</em>' reference.
	 * @see #getTargetRef()
	 * @generated
	 */
	void setTargetRef(BoundaryEvent value);

	/**
	 * Returns the value of the '<em><b>Max value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max value</em>' attribute.
	 * @see #setMax_value(String)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getTemporalDependency_Max_value()
	 * @model
	 * @generated
	 */
	String getMax_value();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.TemporalDependency#getMax_value <em>Max value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max value</em>' attribute.
	 * @see #getMax_value()
	 * @generated
	 */
	void setMax_value(String value);

	/**
	 * Returns the value of the '<em><b>Min value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min value</em>' attribute.
	 * @see #setMin_value(String)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getTemporalDependency_Min_value()
	 * @model
	 * @generated
	 */
	String getMin_value();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.TemporalDependency#getMin_value <em>Min value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min value</em>' attribute.
	 * @see #getMin_value()
	 * @generated
	 */
	void setMin_value(String value);

} // TemporalDependency
