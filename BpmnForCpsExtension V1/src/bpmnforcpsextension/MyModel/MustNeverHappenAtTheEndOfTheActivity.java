/**
 */
package bpmnforcpsextension.MyModel;

import org.eclipse.bpmn2.Activity;
import org.eclipse.bpmn2.EventDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Must Never Happen At The End Of The Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getName <em>Name</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getType <em>Type</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getTarget <em>Target</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getDo_Happen <em>Do Happen</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getFirst_physical_property <em>First physical property</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getMin_value_of_the_first_physical_property <em>Min value of the first physical property</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getMax_value_of_the_first_physical_property <em>Max value of the first physical property</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getSecond_physical_property <em>Second physical property</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getMin_value_of_the_second_physical_property <em>Min value of the second physical property</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getMax_value_of_the_second_physical_property <em>Max value of the second physical property</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getThird_physical_property <em>Third physical property</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getMin_value_of_the_third_physical_property <em>Min value of the third physical property</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getMax_value_of_the_third_physical_property <em>Max value of the third physical property</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getPhysical_dependency_function <em>Physical dependency function</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmnforcpsextension.MyModel.MyModelPackage#getMustNeverHappenAtTheEndOfTheActivity()
 * @model
 * @generated
 */
public interface MustNeverHappenAtTheEndOfTheActivity extends EventDefinition {
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
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getMustNeverHappenAtTheEndOfTheActivity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"MNHFT"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getMustNeverHappenAtTheEndOfTheActivity_Type()
	 * @model default="MNHFT"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getType <em>Type</em>}' attribute.
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
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getMustNeverHappenAtTheEndOfTheActivity_Target()
	 * @model
	 * @generated
	 */
	Activity getTarget();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Activity value);

	/**
	 * Returns the value of the '<em><b>Do Happen</b></em>' attribute.
	 * The default value is <code>"False"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Happen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do Happen</em>' attribute.
	 * @see #setDo_Happen(String)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getMustNeverHappenAtTheEndOfTheActivity_Do_Happen()
	 * @model default="False"
	 * @generated
	 */
	String getDo_Happen();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getDo_Happen <em>Do Happen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Happen</em>' attribute.
	 * @see #getDo_Happen()
	 * @generated
	 */
	void setDo_Happen(String value);

	/**
	 * Returns the value of the '<em><b>First physical property</b></em>' attribute.
	 * The default value is <code>"Please do not insert a  gap "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First physical property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First physical property</em>' attribute.
	 * @see #setFirst_physical_property(String)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getMustNeverHappenAtTheEndOfTheActivity_First_physical_property()
	 * @model default="Please do not insert a  gap "
	 * @generated
	 */
	String getFirst_physical_property();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getFirst_physical_property <em>First physical property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First physical property</em>' attribute.
	 * @see #getFirst_physical_property()
	 * @generated
	 */
	void setFirst_physical_property(String value);

	/**
	 * Returns the value of the '<em><b>Min value of the first physical property</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min value of the first physical property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min value of the first physical property</em>' attribute.
	 * @see #setMin_value_of_the_first_physical_property(String)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getMustNeverHappenAtTheEndOfTheActivity_Min_value_of_the_first_physical_property()
	 * @model default="0"
	 * @generated
	 */
	String getMin_value_of_the_first_physical_property();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getMin_value_of_the_first_physical_property <em>Min value of the first physical property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min value of the first physical property</em>' attribute.
	 * @see #getMin_value_of_the_first_physical_property()
	 * @generated
	 */
	void setMin_value_of_the_first_physical_property(String value);

	/**
	 * Returns the value of the '<em><b>Max value of the first physical property</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max value of the first physical property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max value of the first physical property</em>' attribute.
	 * @see #setMax_value_of_the_first_physical_property(String)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getMustNeverHappenAtTheEndOfTheActivity_Max_value_of_the_first_physical_property()
	 * @model default="0"
	 * @generated
	 */
	String getMax_value_of_the_first_physical_property();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getMax_value_of_the_first_physical_property <em>Max value of the first physical property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max value of the first physical property</em>' attribute.
	 * @see #getMax_value_of_the_first_physical_property()
	 * @generated
	 */
	void setMax_value_of_the_first_physical_property(String value);

	/**
	 * Returns the value of the '<em><b>Second physical property</b></em>' attribute.
	 * The default value is <code>"Please do not insert a  gap "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second physical property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second physical property</em>' attribute.
	 * @see #setSecond_physical_property(String)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getMustNeverHappenAtTheEndOfTheActivity_Second_physical_property()
	 * @model default="Please do not insert a  gap "
	 * @generated
	 */
	String getSecond_physical_property();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getSecond_physical_property <em>Second physical property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second physical property</em>' attribute.
	 * @see #getSecond_physical_property()
	 * @generated
	 */
	void setSecond_physical_property(String value);

	/**
	 * Returns the value of the '<em><b>Min value of the second physical property</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min value of the second physical property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min value of the second physical property</em>' attribute.
	 * @see #setMin_value_of_the_second_physical_property(String)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getMustNeverHappenAtTheEndOfTheActivity_Min_value_of_the_second_physical_property()
	 * @model default="0"
	 * @generated
	 */
	String getMin_value_of_the_second_physical_property();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getMin_value_of_the_second_physical_property <em>Min value of the second physical property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min value of the second physical property</em>' attribute.
	 * @see #getMin_value_of_the_second_physical_property()
	 * @generated
	 */
	void setMin_value_of_the_second_physical_property(String value);

	/**
	 * Returns the value of the '<em><b>Max value of the second physical property</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max value of the second physical property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max value of the second physical property</em>' attribute.
	 * @see #setMax_value_of_the_second_physical_property(String)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getMustNeverHappenAtTheEndOfTheActivity_Max_value_of_the_second_physical_property()
	 * @model default="0"
	 * @generated
	 */
	String getMax_value_of_the_second_physical_property();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getMax_value_of_the_second_physical_property <em>Max value of the second physical property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max value of the second physical property</em>' attribute.
	 * @see #getMax_value_of_the_second_physical_property()
	 * @generated
	 */
	void setMax_value_of_the_second_physical_property(String value);

	/**
	 * Returns the value of the '<em><b>Third physical property</b></em>' attribute.
	 * The default value is <code>"Please do not insert a  gap "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Third physical property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Third physical property</em>' attribute.
	 * @see #setThird_physical_property(String)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getMustNeverHappenAtTheEndOfTheActivity_Third_physical_property()
	 * @model default="Please do not insert a  gap "
	 * @generated
	 */
	String getThird_physical_property();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getThird_physical_property <em>Third physical property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Third physical property</em>' attribute.
	 * @see #getThird_physical_property()
	 * @generated
	 */
	void setThird_physical_property(String value);

	/**
	 * Returns the value of the '<em><b>Min value of the third physical property</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min value of the third physical property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min value of the third physical property</em>' attribute.
	 * @see #setMin_value_of_the_third_physical_property(String)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getMustNeverHappenAtTheEndOfTheActivity_Min_value_of_the_third_physical_property()
	 * @model default="0"
	 * @generated
	 */
	String getMin_value_of_the_third_physical_property();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getMin_value_of_the_third_physical_property <em>Min value of the third physical property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min value of the third physical property</em>' attribute.
	 * @see #getMin_value_of_the_third_physical_property()
	 * @generated
	 */
	void setMin_value_of_the_third_physical_property(String value);

	/**
	 * Returns the value of the '<em><b>Max value of the third physical property</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max value of the third physical property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max value of the third physical property</em>' attribute.
	 * @see #setMax_value_of_the_third_physical_property(String)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getMustNeverHappenAtTheEndOfTheActivity_Max_value_of_the_third_physical_property()
	 * @model default="0"
	 * @generated
	 */
	String getMax_value_of_the_third_physical_property();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getMax_value_of_the_third_physical_property <em>Max value of the third physical property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max value of the third physical property</em>' attribute.
	 * @see #getMax_value_of_the_third_physical_property()
	 * @generated
	 */
	void setMax_value_of_the_third_physical_property(String value);

	/**
	 * Returns the value of the '<em><b>Physical dependency function</b></em>' attribute.
	 * The default value is <code>"Other variables that can be used : Duration, StartTime, FinishTime. Please enter a C function!"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical dependency function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical dependency function</em>' attribute.
	 * @see #setPhysical_dependency_function(String)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getMustNeverHappenAtTheEndOfTheActivity_Physical_dependency_function()
	 * @model default="Other variables that can be used : Duration, StartTime, FinishTime. Please enter a C function!"
	 * @generated
	 */
	String getPhysical_dependency_function();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getPhysical_dependency_function <em>Physical dependency function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical dependency function</em>' attribute.
	 * @see #getPhysical_dependency_function()
	 * @generated
	 */
	void setPhysical_dependency_function(String value);

} // MustNeverHappenAtTheEndOfTheActivity
