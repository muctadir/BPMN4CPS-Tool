/**
 */
package bpmnforcpsextension.MyModel.impl;

import bpmnforcpsextension.MyModel.MyModelPackage;
import bpmnforcpsextension.MyModel.PhysicalEntityTask;
import bpmnforcpsextension.MyModel.TypeDevice;

import org.eclipse.bpmn2.impl.TaskImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Entity Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.PhysicalEntityTaskImpl#getCPSPerformerRef <em>CPS Performer Ref</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.PhysicalEntityTaskImpl#getCPSDeviceRoleParameters <em>CPS Device Role Parameters</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.PhysicalEntityTaskImpl#getType <em>Type</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.PhysicalEntityTaskImpl#isIsMovable <em>Is Movable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalEntityTaskImpl extends TaskImpl implements PhysicalEntityTask {
	/**
	 * The default value of the '{@link #getCPSPerformerRef() <em>CPS Performer Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPSPerformerRef()
	 * @generated
	 * @ordered
	 */
	protected static final String CPS_PERFORMER_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCPSPerformerRef() <em>CPS Performer Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPSPerformerRef()
	 * @generated
	 * @ordered
	 */
	protected String cpsPerformerRef = CPS_PERFORMER_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getCPSDeviceRoleParameters() <em>CPS Device Role Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPSDeviceRoleParameters()
	 * @generated
	 * @ordered
	 */
	protected static final String CPS_DEVICE_ROLE_PARAMETERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCPSDeviceRoleParameters() <em>CPS Device Role Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPSDeviceRoleParameters()
	 * @generated
	 * @ordered
	 */
	protected String cpsDeviceRoleParameters = CPS_DEVICE_ROLE_PARAMETERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDevice TYPE_EDEFAULT = TypeDevice.SENSOR_ROLE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeDevice type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMovable() <em>Is Movable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMovable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MOVABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMovable() <em>Is Movable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMovable()
	 * @generated
	 * @ordered
	 */
	protected boolean isMovable = IS_MOVABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalEntityTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyModelPackage.Literals.PHYSICAL_ENTITY_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCPSPerformerRef() {
		return cpsPerformerRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCPSPerformerRef(String newCPSPerformerRef) {
		String oldCPSPerformerRef = cpsPerformerRef;
		cpsPerformerRef = newCPSPerformerRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.PHYSICAL_ENTITY_TASK__CPS_PERFORMER_REF, oldCPSPerformerRef, cpsPerformerRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCPSDeviceRoleParameters() {
		return cpsDeviceRoleParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCPSDeviceRoleParameters(String newCPSDeviceRoleParameters) {
		String oldCPSDeviceRoleParameters = cpsDeviceRoleParameters;
		cpsDeviceRoleParameters = newCPSDeviceRoleParameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.PHYSICAL_ENTITY_TASK__CPS_DEVICE_ROLE_PARAMETERS, oldCPSDeviceRoleParameters, cpsDeviceRoleParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDevice getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeDevice newType) {
		TypeDevice oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.PHYSICAL_ENTITY_TASK__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMovable() {
		return isMovable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMovable(boolean newIsMovable) {
		boolean oldIsMovable = isMovable;
		isMovable = newIsMovable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.PHYSICAL_ENTITY_TASK__IS_MOVABLE, oldIsMovable, isMovable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyModelPackage.PHYSICAL_ENTITY_TASK__CPS_PERFORMER_REF:
				return getCPSPerformerRef();
			case MyModelPackage.PHYSICAL_ENTITY_TASK__CPS_DEVICE_ROLE_PARAMETERS:
				return getCPSDeviceRoleParameters();
			case MyModelPackage.PHYSICAL_ENTITY_TASK__TYPE:
				return getType();
			case MyModelPackage.PHYSICAL_ENTITY_TASK__IS_MOVABLE:
				return isIsMovable();
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
			case MyModelPackage.PHYSICAL_ENTITY_TASK__CPS_PERFORMER_REF:
				setCPSPerformerRef((String)newValue);
				return;
			case MyModelPackage.PHYSICAL_ENTITY_TASK__CPS_DEVICE_ROLE_PARAMETERS:
				setCPSDeviceRoleParameters((String)newValue);
				return;
			case MyModelPackage.PHYSICAL_ENTITY_TASK__TYPE:
				setType((TypeDevice)newValue);
				return;
			case MyModelPackage.PHYSICAL_ENTITY_TASK__IS_MOVABLE:
				setIsMovable((Boolean)newValue);
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
			case MyModelPackage.PHYSICAL_ENTITY_TASK__CPS_PERFORMER_REF:
				setCPSPerformerRef(CPS_PERFORMER_REF_EDEFAULT);
				return;
			case MyModelPackage.PHYSICAL_ENTITY_TASK__CPS_DEVICE_ROLE_PARAMETERS:
				setCPSDeviceRoleParameters(CPS_DEVICE_ROLE_PARAMETERS_EDEFAULT);
				return;
			case MyModelPackage.PHYSICAL_ENTITY_TASK__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case MyModelPackage.PHYSICAL_ENTITY_TASK__IS_MOVABLE:
				setIsMovable(IS_MOVABLE_EDEFAULT);
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
			case MyModelPackage.PHYSICAL_ENTITY_TASK__CPS_PERFORMER_REF:
				return CPS_PERFORMER_REF_EDEFAULT == null ? cpsPerformerRef != null : !CPS_PERFORMER_REF_EDEFAULT.equals(cpsPerformerRef);
			case MyModelPackage.PHYSICAL_ENTITY_TASK__CPS_DEVICE_ROLE_PARAMETERS:
				return CPS_DEVICE_ROLE_PARAMETERS_EDEFAULT == null ? cpsDeviceRoleParameters != null : !CPS_DEVICE_ROLE_PARAMETERS_EDEFAULT.equals(cpsDeviceRoleParameters);
			case MyModelPackage.PHYSICAL_ENTITY_TASK__TYPE:
				return type != TYPE_EDEFAULT;
			case MyModelPackage.PHYSICAL_ENTITY_TASK__IS_MOVABLE:
				return isMovable != IS_MOVABLE_EDEFAULT;
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
		result.append(" (CPSPerformerRef: ");
		result.append(cpsPerformerRef);
		result.append(", CPSDeviceRoleParameters: ");
		result.append(cpsDeviceRoleParameters);
		result.append(", Type: ");
		result.append(type);
		result.append(", isMovable: ");
		result.append(isMovable);
		result.append(')');
		return result.toString();
	}

} //PhysicalEntityTaskImpl
