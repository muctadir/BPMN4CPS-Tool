/**
 */
package bpmnforcpsextension.MyModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Device</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see bpmnforcpsextension.MyModel.MyModelPackage#getTypeDevice()
 * @model
 * @generated
 */
public enum TypeDevice implements Enumerator {
	/**
	 * The '<em><b>Sensor Role</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENSOR_ROLE_VALUE
	 * @generated
	 * @ordered
	 */
	SENSOR_ROLE(0, "Sensor_Role", "Sensor_Role"),

	/**
	 * The '<em><b>Actuator Role</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTUATOR_ROLE_VALUE
	 * @generated
	 * @ordered
	 */
	ACTUATOR_ROLE(0, "Actuator_Role", "Actuator_Role");

	/**
	 * The '<em><b>Sensor Role</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sensor Role</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SENSOR_ROLE
	 * @model name="Sensor_Role"
	 * @generated
	 * @ordered
	 */
	public static final int SENSOR_ROLE_VALUE = 0;

	/**
	 * The '<em><b>Actuator Role</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Actuator Role</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACTUATOR_ROLE
	 * @model name="Actuator_Role"
	 * @generated
	 * @ordered
	 */
	public static final int ACTUATOR_ROLE_VALUE = 0;

	/**
	 * An array of all the '<em><b>Type Device</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDevice[] VALUES_ARRAY =
		new TypeDevice[] {
			SENSOR_ROLE,
			ACTUATOR_ROLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Device</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDevice> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Device</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDevice get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDevice result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Device</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDevice getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDevice result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Device</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDevice get(int value) {
		switch (value) {
			case SENSOR_ROLE_VALUE: return SENSOR_ROLE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TypeDevice(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TypeDevice
