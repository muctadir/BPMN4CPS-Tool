/**
 */
package bpmnforcpsextension.MyModel.impl;

import bpmnforcpsextension.MyModel.Duration;
import bpmnforcpsextension.MyModel.MyModelPackage;
import bpmnforcpsextension.MyModel.Timer_Type;

import org.eclipse.bpmn2.Activity;

import org.eclipse.bpmn2.impl.EventDefinitionImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Duration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.DurationImpl#getName <em>Name</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.DurationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.DurationImpl#getMin_time_duration <em>Min time duration</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.DurationImpl#getMax_time_duration <em>Max time duration</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.DurationImpl#getTime_Type <em>Time Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DurationImpl extends EventDefinitionImpl implements Duration {
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
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Activity target;

	/**
	 * The default value of the '{@link #getMin_time_duration() <em>Min time duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_time_duration()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_TIME_DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMin_time_duration() <em>Min time duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_time_duration()
	 * @generated
	 * @ordered
	 */
	protected String min_time_duration = MIN_TIME_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax_time_duration() <em>Max time duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_time_duration()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_TIME_DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMax_time_duration() <em>Max time duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_time_duration()
	 * @generated
	 * @ordered
	 */
	protected String max_time_duration = MAX_TIME_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime_Type() <em>Time Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime_Type()
	 * @generated
	 * @ordered
	 */
	protected static final Timer_Type TIME_TYPE_EDEFAULT = Timer_Type.TIME_DATA;

	/**
	 * The cached value of the '{@link #getTime_Type() <em>Time Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime_Type()
	 * @generated
	 * @ordered
	 */
	protected Timer_Type time_Type = TIME_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyModelPackage.Literals.DURATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.DURATION__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyModelPackage.DURATION__TARGET, oldTarget, target));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.DURATION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMin_time_duration() {
		return min_time_duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin_time_duration(String newMin_time_duration) {
		String oldMin_time_duration = min_time_duration;
		min_time_duration = newMin_time_duration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.DURATION__MIN_TIME_DURATION, oldMin_time_duration, min_time_duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMax_time_duration() {
		return max_time_duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax_time_duration(String newMax_time_duration) {
		String oldMax_time_duration = max_time_duration;
		max_time_duration = newMax_time_duration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.DURATION__MAX_TIME_DURATION, oldMax_time_duration, max_time_duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timer_Type getTime_Type() {
		return time_Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime_Type(Timer_Type newTime_Type) {
		Timer_Type oldTime_Type = time_Type;
		time_Type = newTime_Type == null ? TIME_TYPE_EDEFAULT : newTime_Type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.DURATION__TIME_TYPE, oldTime_Type, time_Type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyModelPackage.DURATION__NAME:
				return getName();
			case MyModelPackage.DURATION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case MyModelPackage.DURATION__MIN_TIME_DURATION:
				return getMin_time_duration();
			case MyModelPackage.DURATION__MAX_TIME_DURATION:
				return getMax_time_duration();
			case MyModelPackage.DURATION__TIME_TYPE:
				return getTime_Type();
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
			case MyModelPackage.DURATION__NAME:
				setName((String)newValue);
				return;
			case MyModelPackage.DURATION__TARGET:
				setTarget((Activity)newValue);
				return;
			case MyModelPackage.DURATION__MIN_TIME_DURATION:
				setMin_time_duration((String)newValue);
				return;
			case MyModelPackage.DURATION__MAX_TIME_DURATION:
				setMax_time_duration((String)newValue);
				return;
			case MyModelPackage.DURATION__TIME_TYPE:
				setTime_Type((Timer_Type)newValue);
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
			case MyModelPackage.DURATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MyModelPackage.DURATION__TARGET:
				setTarget((Activity)null);
				return;
			case MyModelPackage.DURATION__MIN_TIME_DURATION:
				setMin_time_duration(MIN_TIME_DURATION_EDEFAULT);
				return;
			case MyModelPackage.DURATION__MAX_TIME_DURATION:
				setMax_time_duration(MAX_TIME_DURATION_EDEFAULT);
				return;
			case MyModelPackage.DURATION__TIME_TYPE:
				setTime_Type(TIME_TYPE_EDEFAULT);
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
			case MyModelPackage.DURATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MyModelPackage.DURATION__TARGET:
				return target != null;
			case MyModelPackage.DURATION__MIN_TIME_DURATION:
				return MIN_TIME_DURATION_EDEFAULT == null ? min_time_duration != null : !MIN_TIME_DURATION_EDEFAULT.equals(min_time_duration);
			case MyModelPackage.DURATION__MAX_TIME_DURATION:
				return MAX_TIME_DURATION_EDEFAULT == null ? max_time_duration != null : !MAX_TIME_DURATION_EDEFAULT.equals(max_time_duration);
			case MyModelPackage.DURATION__TIME_TYPE:
				return time_Type != TIME_TYPE_EDEFAULT;
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
		result.append(", Min_time_duration: ");
		result.append(min_time_duration);
		result.append(", Max_time_duration: ");
		result.append(max_time_duration);
		result.append(", Time_Type: ");
		result.append(time_Type);
		result.append(')');
		return result.toString();
	}

} //DurationImpl
