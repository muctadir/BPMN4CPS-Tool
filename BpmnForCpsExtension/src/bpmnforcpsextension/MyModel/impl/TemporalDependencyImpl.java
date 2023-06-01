/**
 */
package bpmnforcpsextension.MyModel.impl;

import bpmnforcpsextension.MyModel.MyModelPackage;
import bpmnforcpsextension.MyModel.TemporalDependency;

import org.eclipse.bpmn2.BoundaryEvent;

import org.eclipse.bpmn2.impl.FlowElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temporal Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.TemporalDependencyImpl#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.TemporalDependencyImpl#getTargetRef <em>Target Ref</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.TemporalDependencyImpl#getMax_value <em>Max value</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.TemporalDependencyImpl#getMin_value <em>Min value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemporalDependencyImpl extends FlowElementImpl implements TemporalDependency {
	/**
	 * The cached value of the '{@link #getSourceRef() <em>Source Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRef()
	 * @generated
	 * @ordered
	 */
	protected BoundaryEvent sourceRef;

	/**
	 * The cached value of the '{@link #getTargetRef() <em>Target Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRef()
	 * @generated
	 * @ordered
	 */
	protected BoundaryEvent targetRef;

	/**
	 * The default value of the '{@link #getMax_value() <em>Max value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_value()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMax_value() <em>Max value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_value()
	 * @generated
	 * @ordered
	 */
	protected String max_value = MAX_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin_value() <em>Min value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_value()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMin_value() <em>Min value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_value()
	 * @generated
	 * @ordered
	 */
	protected String min_value = MIN_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporalDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyModelPackage.Literals.TEMPORAL_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundaryEvent getSourceRef() {
		if (sourceRef != null && sourceRef.eIsProxy()) {
			InternalEObject oldSourceRef = (InternalEObject)sourceRef;
			sourceRef = (BoundaryEvent)eResolveProxy(oldSourceRef);
			if (sourceRef != oldSourceRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyModelPackage.TEMPORAL_DEPENDENCY__SOURCE_REF, oldSourceRef, sourceRef));
			}
		}
		return sourceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundaryEvent basicGetSourceRef() {
		return sourceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRef(BoundaryEvent newSourceRef) {
		BoundaryEvent oldSourceRef = sourceRef;
		sourceRef = newSourceRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.TEMPORAL_DEPENDENCY__SOURCE_REF, oldSourceRef, sourceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundaryEvent getTargetRef() {
		if (targetRef != null && targetRef.eIsProxy()) {
			InternalEObject oldTargetRef = (InternalEObject)targetRef;
			targetRef = (BoundaryEvent)eResolveProxy(oldTargetRef);
			if (targetRef != oldTargetRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyModelPackage.TEMPORAL_DEPENDENCY__TARGET_REF, oldTargetRef, targetRef));
			}
		}
		return targetRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundaryEvent basicGetTargetRef() {
		return targetRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetRef(BoundaryEvent newTargetRef) {
		BoundaryEvent oldTargetRef = targetRef;
		targetRef = newTargetRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.TEMPORAL_DEPENDENCY__TARGET_REF, oldTargetRef, targetRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMax_value() {
		return max_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax_value(String newMax_value) {
		String oldMax_value = max_value;
		max_value = newMax_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.TEMPORAL_DEPENDENCY__MAX_VALUE, oldMax_value, max_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMin_value() {
		return min_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin_value(String newMin_value) {
		String oldMin_value = min_value;
		min_value = newMin_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.TEMPORAL_DEPENDENCY__MIN_VALUE, oldMin_value, min_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyModelPackage.TEMPORAL_DEPENDENCY__SOURCE_REF:
				if (resolve) return getSourceRef();
				return basicGetSourceRef();
			case MyModelPackage.TEMPORAL_DEPENDENCY__TARGET_REF:
				if (resolve) return getTargetRef();
				return basicGetTargetRef();
			case MyModelPackage.TEMPORAL_DEPENDENCY__MAX_VALUE:
				return getMax_value();
			case MyModelPackage.TEMPORAL_DEPENDENCY__MIN_VALUE:
				return getMin_value();
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
			case MyModelPackage.TEMPORAL_DEPENDENCY__SOURCE_REF:
				setSourceRef((BoundaryEvent)newValue);
				return;
			case MyModelPackage.TEMPORAL_DEPENDENCY__TARGET_REF:
				setTargetRef((BoundaryEvent)newValue);
				return;
			case MyModelPackage.TEMPORAL_DEPENDENCY__MAX_VALUE:
				setMax_value((String)newValue);
				return;
			case MyModelPackage.TEMPORAL_DEPENDENCY__MIN_VALUE:
				setMin_value((String)newValue);
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
			case MyModelPackage.TEMPORAL_DEPENDENCY__SOURCE_REF:
				setSourceRef((BoundaryEvent)null);
				return;
			case MyModelPackage.TEMPORAL_DEPENDENCY__TARGET_REF:
				setTargetRef((BoundaryEvent)null);
				return;
			case MyModelPackage.TEMPORAL_DEPENDENCY__MAX_VALUE:
				setMax_value(MAX_VALUE_EDEFAULT);
				return;
			case MyModelPackage.TEMPORAL_DEPENDENCY__MIN_VALUE:
				setMin_value(MIN_VALUE_EDEFAULT);
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
			case MyModelPackage.TEMPORAL_DEPENDENCY__SOURCE_REF:
				return sourceRef != null;
			case MyModelPackage.TEMPORAL_DEPENDENCY__TARGET_REF:
				return targetRef != null;
			case MyModelPackage.TEMPORAL_DEPENDENCY__MAX_VALUE:
				return MAX_VALUE_EDEFAULT == null ? max_value != null : !MAX_VALUE_EDEFAULT.equals(max_value);
			case MyModelPackage.TEMPORAL_DEPENDENCY__MIN_VALUE:
				return MIN_VALUE_EDEFAULT == null ? min_value != null : !MIN_VALUE_EDEFAULT.equals(min_value);
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
		result.append(" (Max_value: ");
		result.append(max_value);
		result.append(", Min_value: ");
		result.append(min_value);
		result.append(')');
		return result.toString();
	}

} //TemporalDependencyImpl
