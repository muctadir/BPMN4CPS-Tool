/**
 */
package bpmnforcpsextension.MyModel.impl;

import bpmnforcpsextension.MyModel.MyModelPackage;
import bpmnforcpsextension.MyModel.SporadicActivity;
import bpmnforcpsextension.MyModel.Timer_Type;

import org.eclipse.bpmn2.StandardLoopCharacteristics;

import org.eclipse.bpmn2.impl.EventDefinitionImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sporadic Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.SporadicActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.SporadicActivityImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.SporadicActivityImpl#getMax_time <em>Max time</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.SporadicActivityImpl#getMin_time <em>Min time</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.SporadicActivityImpl#getTimer_Type <em>Timer Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SporadicActivityImpl extends EventDefinitionImpl implements SporadicActivity {
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
	protected StandardLoopCharacteristics target;

	/**
	 * The default value of the '{@link #getMax_time() <em>Max time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_time()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMax_time() <em>Max time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_time()
	 * @generated
	 * @ordered
	 */
	protected int max_time = MAX_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin_time() <em>Min time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_time()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMin_time() <em>Min time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_time()
	 * @generated
	 * @ordered
	 */
	protected int min_time = MIN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimer_Type() <em>Timer Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer_Type()
	 * @generated
	 * @ordered
	 */
	protected static final Timer_Type TIMER_TYPE_EDEFAULT = Timer_Type.TIME_DATA;

	/**
	 * The cached value of the '{@link #getTimer_Type() <em>Timer Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer_Type()
	 * @generated
	 * @ordered
	 */
	protected Timer_Type timer_Type = TIMER_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SporadicActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyModelPackage.Literals.SPORADIC_ACTIVITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.SPORADIC_ACTIVITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardLoopCharacteristics getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (StandardLoopCharacteristics)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyModelPackage.SPORADIC_ACTIVITY__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardLoopCharacteristics basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(StandardLoopCharacteristics newTarget) {
		StandardLoopCharacteristics oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.SPORADIC_ACTIVITY__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMax_time() {
		return max_time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax_time(int newMax_time) {
		int oldMax_time = max_time;
		max_time = newMax_time;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.SPORADIC_ACTIVITY__MAX_TIME, oldMax_time, max_time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMin_time() {
		return min_time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin_time(int newMin_time) {
		int oldMin_time = min_time;
		min_time = newMin_time;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.SPORADIC_ACTIVITY__MIN_TIME, oldMin_time, min_time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timer_Type getTimer_Type() {
		return timer_Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer_Type(Timer_Type newTimer_Type) {
		Timer_Type oldTimer_Type = timer_Type;
		timer_Type = newTimer_Type == null ? TIMER_TYPE_EDEFAULT : newTimer_Type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.SPORADIC_ACTIVITY__TIMER_TYPE, oldTimer_Type, timer_Type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyModelPackage.SPORADIC_ACTIVITY__NAME:
				return getName();
			case MyModelPackage.SPORADIC_ACTIVITY__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case MyModelPackage.SPORADIC_ACTIVITY__MAX_TIME:
				return getMax_time();
			case MyModelPackage.SPORADIC_ACTIVITY__MIN_TIME:
				return getMin_time();
			case MyModelPackage.SPORADIC_ACTIVITY__TIMER_TYPE:
				return getTimer_Type();
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
			case MyModelPackage.SPORADIC_ACTIVITY__NAME:
				setName((String)newValue);
				return;
			case MyModelPackage.SPORADIC_ACTIVITY__TARGET:
				setTarget((StandardLoopCharacteristics)newValue);
				return;
			case MyModelPackage.SPORADIC_ACTIVITY__MAX_TIME:
				setMax_time((Integer)newValue);
				return;
			case MyModelPackage.SPORADIC_ACTIVITY__MIN_TIME:
				setMin_time((Integer)newValue);
				return;
			case MyModelPackage.SPORADIC_ACTIVITY__TIMER_TYPE:
				setTimer_Type((Timer_Type)newValue);
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
			case MyModelPackage.SPORADIC_ACTIVITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MyModelPackage.SPORADIC_ACTIVITY__TARGET:
				setTarget((StandardLoopCharacteristics)null);
				return;
			case MyModelPackage.SPORADIC_ACTIVITY__MAX_TIME:
				setMax_time(MAX_TIME_EDEFAULT);
				return;
			case MyModelPackage.SPORADIC_ACTIVITY__MIN_TIME:
				setMin_time(MIN_TIME_EDEFAULT);
				return;
			case MyModelPackage.SPORADIC_ACTIVITY__TIMER_TYPE:
				setTimer_Type(TIMER_TYPE_EDEFAULT);
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
			case MyModelPackage.SPORADIC_ACTIVITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MyModelPackage.SPORADIC_ACTIVITY__TARGET:
				return target != null;
			case MyModelPackage.SPORADIC_ACTIVITY__MAX_TIME:
				return max_time != MAX_TIME_EDEFAULT;
			case MyModelPackage.SPORADIC_ACTIVITY__MIN_TIME:
				return min_time != MIN_TIME_EDEFAULT;
			case MyModelPackage.SPORADIC_ACTIVITY__TIMER_TYPE:
				return timer_Type != TIMER_TYPE_EDEFAULT;
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
		result.append(", Max_time: ");
		result.append(max_time);
		result.append(", Min_time: ");
		result.append(min_time);
		result.append(", Timer_Type: ");
		result.append(timer_Type);
		result.append(')');
		return result.toString();
	}

} //SporadicActivityImpl
