/**
 */
package bpmnforcpsextension.MyModel.impl;

import bpmnforcpsextension.MyModel.MFI;
import bpmnforcpsextension.MyModel.MyModelPackage;

import org.eclipse.bpmn2.Activity;

import org.eclipse.bpmn2.impl.EventDefinitionImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MFI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.MFIImpl#getName <em>Name</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.MFIImpl#getType <em>Type</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.MFIImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.MFIImpl#getMin_Value <em>Min Value</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.MFIImpl#getMax_Value <em>Max Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MFIImpl extends EventDefinitionImpl implements MFI {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = "MFI";

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Activity target;

	/**
	 * The default value of the '{@link #getMin_Value() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_Value()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMin_Value() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_Value()
	 * @generated
	 * @ordered
	 */
	protected String min_Value = MIN_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax_Value() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_Value()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMax_Value() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_Value()
	 * @generated
	 * @ordered
	 */
	protected String max_Value = MAX_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MFIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyModelPackage.Literals.MFI;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.MFI__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.MFI__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Activity)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyModelPackage.MFI__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Activity newTarget) {
		Activity oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.MFI__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMin_Value() {
		return min_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin_Value(String newMin_Value) {
		String oldMin_Value = min_Value;
		min_Value = newMin_Value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.MFI__MIN_VALUE, oldMin_Value, min_Value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMax_Value() {
		return max_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax_Value(String newMax_Value) {
		String oldMax_Value = max_Value;
		max_Value = newMax_Value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.MFI__MAX_VALUE, oldMax_Value, max_Value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyModelPackage.MFI__NAME:
				return getName();
			case MyModelPackage.MFI__TYPE:
				return getType();
			case MyModelPackage.MFI__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case MyModelPackage.MFI__MIN_VALUE:
				return getMin_Value();
			case MyModelPackage.MFI__MAX_VALUE:
				return getMax_Value();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MyModelPackage.MFI__NAME:
				setName((String)newValue);
				return;
			case MyModelPackage.MFI__TYPE:
				setType((String)newValue);
				return;
			case MyModelPackage.MFI__TARGET:
				setTarget((Activity)newValue);
				return;
			case MyModelPackage.MFI__MIN_VALUE:
				setMin_Value((String)newValue);
				return;
			case MyModelPackage.MFI__MAX_VALUE:
				setMax_Value((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MyModelPackage.MFI__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MyModelPackage.MFI__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case MyModelPackage.MFI__TARGET:
				setTarget((Activity)null);
				return;
			case MyModelPackage.MFI__MIN_VALUE:
				setMin_Value(MIN_VALUE_EDEFAULT);
				return;
			case MyModelPackage.MFI__MAX_VALUE:
				setMax_Value(MAX_VALUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MyModelPackage.MFI__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MyModelPackage.MFI__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case MyModelPackage.MFI__TARGET:
				return target != null;
			case MyModelPackage.MFI__MIN_VALUE:
				return MIN_VALUE_EDEFAULT == null ? min_Value != null : !MIN_VALUE_EDEFAULT.equals(min_Value);
			case MyModelPackage.MFI__MAX_VALUE:
				return MAX_VALUE_EDEFAULT == null ? max_Value != null : !MAX_VALUE_EDEFAULT.equals(max_Value);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", Type: ");
		result.append(type);
		result.append(", Min_Value: ");
		result.append(min_Value);
		result.append(", Max_Value: ");
		result.append(max_Value);
		result.append(')');
		return result.toString();
	}

} //MFIImpl
