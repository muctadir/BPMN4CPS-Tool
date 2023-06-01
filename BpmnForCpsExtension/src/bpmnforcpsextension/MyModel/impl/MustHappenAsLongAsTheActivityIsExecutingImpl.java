/**
 */
package bpmnforcpsextension.MyModel.impl;

import bpmnforcpsextension.MyModel.MustHappenAsLongAsTheActivityIsExecuting;
import bpmnforcpsextension.MyModel.MyModelPackage;

import org.eclipse.bpmn2.Activity;

import org.eclipse.bpmn2.impl.EventDefinitionImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Must Happen As Long As The Activity Is Executing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.MustHappenAsLongAsTheActivityIsExecutingImpl#getName <em>Name</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.MustHappenAsLongAsTheActivityIsExecutingImpl#getType <em>Type</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.MustHappenAsLongAsTheActivityIsExecutingImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.MustHappenAsLongAsTheActivityIsExecutingImpl#getDo_Happen <em>Do Happen</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.MustHappenAsLongAsTheActivityIsExecutingImpl#getFirst_physical_property <em>First physical property</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.MustHappenAsLongAsTheActivityIsExecutingImpl#getMin_value_of_the_first_physical_property <em>Min value of the first physical property</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.MustHappenAsLongAsTheActivityIsExecutingImpl#getMax_value_of_the_first_physical_property <em>Max value of the first physical property</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.MustHappenAsLongAsTheActivityIsExecutingImpl#getSecond_physical_property <em>Second physical property</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.MustHappenAsLongAsTheActivityIsExecutingImpl#getMin_value_of_the_second_physical_property <em>Min value of the second physical property</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.MustHappenAsLongAsTheActivityIsExecutingImpl#getMax_value_of_the_second_physical_property <em>Max value of the second physical property</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.MustHappenAsLongAsTheActivityIsExecutingImpl#getThird_physical_property <em>Third physical property</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.MustHappenAsLongAsTheActivityIsExecutingImpl#getMin_value_of_the_third_physical_property <em>Min value of the third physical property</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.MustHappenAsLongAsTheActivityIsExecutingImpl#getMax_value_of_the_third_physical_property <em>Max value of the third physical property</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.MustHappenAsLongAsTheActivityIsExecutingImpl#getPhysical_dependency_function <em>Physical dependency function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MustHappenAsLongAsTheActivityIsExecutingImpl extends EventDefinitionImpl implements MustHappenAsLongAsTheActivityIsExecuting {
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
	protected static final String TYPE_EDEFAULT = "MHDA";

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
	 * The default value of the '{@link #getDo_Happen() <em>Do Happen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDo_Happen()
	 * @generated
	 * @ordered
	 */
	protected static final String DO_HAPPEN_EDEFAULT = "True";

	/**
	 * The cached value of the '{@link #getDo_Happen() <em>Do Happen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDo_Happen()
	 * @generated
	 * @ordered
	 */
	protected String do_Happen = DO_HAPPEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirst_physical_property() <em>First physical property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst_physical_property()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_PHYSICAL_PROPERTY_EDEFAULT = "Please do not insert a  gap ";

	/**
	 * The cached value of the '{@link #getFirst_physical_property() <em>First physical property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst_physical_property()
	 * @generated
	 * @ordered
	 */
	protected String first_physical_property = FIRST_PHYSICAL_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin_value_of_the_first_physical_property() <em>Min value of the first physical property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_value_of_the_first_physical_property()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY_EDEFAULT = "0";

	/**
	 * The cached value of the '{@link #getMin_value_of_the_first_physical_property() <em>Min value of the first physical property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_value_of_the_first_physical_property()
	 * @generated
	 * @ordered
	 */
	protected String min_value_of_the_first_physical_property = MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax_value_of_the_first_physical_property() <em>Max value of the first physical property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_value_of_the_first_physical_property()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY_EDEFAULT = "0";

	/**
	 * The cached value of the '{@link #getMax_value_of_the_first_physical_property() <em>Max value of the first physical property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_value_of_the_first_physical_property()
	 * @generated
	 * @ordered
	 */
	protected String max_value_of_the_first_physical_property = MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecond_physical_property() <em>Second physical property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond_physical_property()
	 * @generated
	 * @ordered
	 */
	protected static final String SECOND_PHYSICAL_PROPERTY_EDEFAULT = "Please do not insert a  gap ";

	/**
	 * The cached value of the '{@link #getSecond_physical_property() <em>Second physical property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond_physical_property()
	 * @generated
	 * @ordered
	 */
	protected String second_physical_property = SECOND_PHYSICAL_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin_value_of_the_second_physical_property() <em>Min value of the second physical property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_value_of_the_second_physical_property()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY_EDEFAULT = "0";

	/**
	 * The cached value of the '{@link #getMin_value_of_the_second_physical_property() <em>Min value of the second physical property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_value_of_the_second_physical_property()
	 * @generated
	 * @ordered
	 */
	protected String min_value_of_the_second_physical_property = MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax_value_of_the_second_physical_property() <em>Max value of the second physical property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_value_of_the_second_physical_property()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY_EDEFAULT = "0";

	/**
	 * The cached value of the '{@link #getMax_value_of_the_second_physical_property() <em>Max value of the second physical property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_value_of_the_second_physical_property()
	 * @generated
	 * @ordered
	 */
	protected String max_value_of_the_second_physical_property = MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getThird_physical_property() <em>Third physical property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThird_physical_property()
	 * @generated
	 * @ordered
	 */
	protected static final String THIRD_PHYSICAL_PROPERTY_EDEFAULT = "Please do not insert a  gap ";

	/**
	 * The cached value of the '{@link #getThird_physical_property() <em>Third physical property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThird_physical_property()
	 * @generated
	 * @ordered
	 */
	protected String third_physical_property = THIRD_PHYSICAL_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin_value_of_the_third_physical_property() <em>Min value of the third physical property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_value_of_the_third_physical_property()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY_EDEFAULT = "0";

	/**
	 * The cached value of the '{@link #getMin_value_of_the_third_physical_property() <em>Min value of the third physical property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_value_of_the_third_physical_property()
	 * @generated
	 * @ordered
	 */
	protected String min_value_of_the_third_physical_property = MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax_value_of_the_third_physical_property() <em>Max value of the third physical property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_value_of_the_third_physical_property()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY_EDEFAULT = "0";

	/**
	 * The cached value of the '{@link #getMax_value_of_the_third_physical_property() <em>Max value of the third physical property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_value_of_the_third_physical_property()
	 * @generated
	 * @ordered
	 */
	protected String max_value_of_the_third_physical_property = MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhysical_dependency_function() <em>Physical dependency function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysical_dependency_function()
	 * @generated
	 * @ordered
	 */
	protected static final String PHYSICAL_DEPENDENCY_FUNCTION_EDEFAULT = "Other variables that can be used : Duration, StartTime, FinishTime. Please enter a C function!";

	/**
	 * The cached value of the '{@link #getPhysical_dependency_function() <em>Physical dependency function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysical_dependency_function()
	 * @generated
	 * @ordered
	 */
	protected String physical_dependency_function = PHYSICAL_DEPENDENCY_FUNCTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MustHappenAsLongAsTheActivityIsExecutingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyModelPackage.Literals.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__TYPE, oldType, type));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__TARGET, oldTarget, target));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDo_Happen() {
		return do_Happen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDo_Happen(String newDo_Happen) {
		String oldDo_Happen = do_Happen;
		do_Happen = newDo_Happen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__DO_HAPPEN, oldDo_Happen, do_Happen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirst_physical_property() {
		return first_physical_property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirst_physical_property(String newFirst_physical_property) {
		String oldFirst_physical_property = first_physical_property;
		first_physical_property = newFirst_physical_property;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__FIRST_PHYSICAL_PROPERTY, oldFirst_physical_property, first_physical_property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMin_value_of_the_first_physical_property() {
		return min_value_of_the_first_physical_property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin_value_of_the_first_physical_property(String newMin_value_of_the_first_physical_property) {
		String oldMin_value_of_the_first_physical_property = min_value_of_the_first_physical_property;
		min_value_of_the_first_physical_property = newMin_value_of_the_first_physical_property;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY, oldMin_value_of_the_first_physical_property, min_value_of_the_first_physical_property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMax_value_of_the_first_physical_property() {
		return max_value_of_the_first_physical_property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax_value_of_the_first_physical_property(String newMax_value_of_the_first_physical_property) {
		String oldMax_value_of_the_first_physical_property = max_value_of_the_first_physical_property;
		max_value_of_the_first_physical_property = newMax_value_of_the_first_physical_property;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY, oldMax_value_of_the_first_physical_property, max_value_of_the_first_physical_property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecond_physical_property() {
		return second_physical_property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecond_physical_property(String newSecond_physical_property) {
		String oldSecond_physical_property = second_physical_property;
		second_physical_property = newSecond_physical_property;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__SECOND_PHYSICAL_PROPERTY, oldSecond_physical_property, second_physical_property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMin_value_of_the_second_physical_property() {
		return min_value_of_the_second_physical_property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin_value_of_the_second_physical_property(String newMin_value_of_the_second_physical_property) {
		String oldMin_value_of_the_second_physical_property = min_value_of_the_second_physical_property;
		min_value_of_the_second_physical_property = newMin_value_of_the_second_physical_property;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY, oldMin_value_of_the_second_physical_property, min_value_of_the_second_physical_property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMax_value_of_the_second_physical_property() {
		return max_value_of_the_second_physical_property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax_value_of_the_second_physical_property(String newMax_value_of_the_second_physical_property) {
		String oldMax_value_of_the_second_physical_property = max_value_of_the_second_physical_property;
		max_value_of_the_second_physical_property = newMax_value_of_the_second_physical_property;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY, oldMax_value_of_the_second_physical_property, max_value_of_the_second_physical_property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThird_physical_property() {
		return third_physical_property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThird_physical_property(String newThird_physical_property) {
		String oldThird_physical_property = third_physical_property;
		third_physical_property = newThird_physical_property;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__THIRD_PHYSICAL_PROPERTY, oldThird_physical_property, third_physical_property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMin_value_of_the_third_physical_property() {
		return min_value_of_the_third_physical_property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin_value_of_the_third_physical_property(String newMin_value_of_the_third_physical_property) {
		String oldMin_value_of_the_third_physical_property = min_value_of_the_third_physical_property;
		min_value_of_the_third_physical_property = newMin_value_of_the_third_physical_property;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY, oldMin_value_of_the_third_physical_property, min_value_of_the_third_physical_property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMax_value_of_the_third_physical_property() {
		return max_value_of_the_third_physical_property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax_value_of_the_third_physical_property(String newMax_value_of_the_third_physical_property) {
		String oldMax_value_of_the_third_physical_property = max_value_of_the_third_physical_property;
		max_value_of_the_third_physical_property = newMax_value_of_the_third_physical_property;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY, oldMax_value_of_the_third_physical_property, max_value_of_the_third_physical_property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhysical_dependency_function() {
		return physical_dependency_function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysical_dependency_function(String newPhysical_dependency_function) {
		String oldPhysical_dependency_function = physical_dependency_function;
		physical_dependency_function = newPhysical_dependency_function;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__PHYSICAL_DEPENDENCY_FUNCTION, oldPhysical_dependency_function, physical_dependency_function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__NAME:
				return getName();
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__TYPE:
				return getType();
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__DO_HAPPEN:
				return getDo_Happen();
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__FIRST_PHYSICAL_PROPERTY:
				return getFirst_physical_property();
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY:
				return getMin_value_of_the_first_physical_property();
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY:
				return getMax_value_of_the_first_physical_property();
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__SECOND_PHYSICAL_PROPERTY:
				return getSecond_physical_property();
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY:
				return getMin_value_of_the_second_physical_property();
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY:
				return getMax_value_of_the_second_physical_property();
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__THIRD_PHYSICAL_PROPERTY:
				return getThird_physical_property();
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY:
				return getMin_value_of_the_third_physical_property();
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY:
				return getMax_value_of_the_third_physical_property();
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__PHYSICAL_DEPENDENCY_FUNCTION:
				return getPhysical_dependency_function();
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
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__NAME:
				setName((String)newValue);
				return;
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__TYPE:
				setType((String)newValue);
				return;
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__TARGET:
				setTarget((Activity)newValue);
				return;
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__DO_HAPPEN:
				setDo_Happen((String)newValue);
				return;
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__FIRST_PHYSICAL_PROPERTY:
				setFirst_physical_property((String)newValue);
				return;
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY:
				setMin_value_of_the_first_physical_property((String)newValue);
				return;
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY:
				setMax_value_of_the_first_physical_property((String)newValue);
				return;
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__SECOND_PHYSICAL_PROPERTY:
				setSecond_physical_property((String)newValue);
				return;
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY:
				setMin_value_of_the_second_physical_property((String)newValue);
				return;
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY:
				setMax_value_of_the_second_physical_property((String)newValue);
				return;
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__THIRD_PHYSICAL_PROPERTY:
				setThird_physical_property((String)newValue);
				return;
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY:
				setMin_value_of_the_third_physical_property((String)newValue);
				return;
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY:
				setMax_value_of_the_third_physical_property((String)newValue);
				return;
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__PHYSICAL_DEPENDENCY_FUNCTION:
				setPhysical_dependency_function((String)newValue);
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
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__TARGET:
				setTarget((Activity)null);
				return;
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__DO_HAPPEN:
				setDo_Happen(DO_HAPPEN_EDEFAULT);
				return;
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__FIRST_PHYSICAL_PROPERTY:
				setFirst_physical_property(FIRST_PHYSICAL_PROPERTY_EDEFAULT);
				return;
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY:
				setMin_value_of_the_first_physical_property(MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY_EDEFAULT);
				return;
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY:
				setMax_value_of_the_first_physical_property(MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY_EDEFAULT);
				return;
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__SECOND_PHYSICAL_PROPERTY:
				setSecond_physical_property(SECOND_PHYSICAL_PROPERTY_EDEFAULT);
				return;
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY:
				setMin_value_of_the_second_physical_property(MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY_EDEFAULT);
				return;
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY:
				setMax_value_of_the_second_physical_property(MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY_EDEFAULT);
				return;
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__THIRD_PHYSICAL_PROPERTY:
				setThird_physical_property(THIRD_PHYSICAL_PROPERTY_EDEFAULT);
				return;
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY:
				setMin_value_of_the_third_physical_property(MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY_EDEFAULT);
				return;
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY:
				setMax_value_of_the_third_physical_property(MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY_EDEFAULT);
				return;
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__PHYSICAL_DEPENDENCY_FUNCTION:
				setPhysical_dependency_function(PHYSICAL_DEPENDENCY_FUNCTION_EDEFAULT);
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
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__TARGET:
				return target != null;
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__DO_HAPPEN:
				return DO_HAPPEN_EDEFAULT == null ? do_Happen != null : !DO_HAPPEN_EDEFAULT.equals(do_Happen);
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__FIRST_PHYSICAL_PROPERTY:
				return FIRST_PHYSICAL_PROPERTY_EDEFAULT == null ? first_physical_property != null : !FIRST_PHYSICAL_PROPERTY_EDEFAULT.equals(first_physical_property);
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY:
				return MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY_EDEFAULT == null ? min_value_of_the_first_physical_property != null : !MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY_EDEFAULT.equals(min_value_of_the_first_physical_property);
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY:
				return MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY_EDEFAULT == null ? max_value_of_the_first_physical_property != null : !MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY_EDEFAULT.equals(max_value_of_the_first_physical_property);
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__SECOND_PHYSICAL_PROPERTY:
				return SECOND_PHYSICAL_PROPERTY_EDEFAULT == null ? second_physical_property != null : !SECOND_PHYSICAL_PROPERTY_EDEFAULT.equals(second_physical_property);
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY:
				return MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY_EDEFAULT == null ? min_value_of_the_second_physical_property != null : !MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY_EDEFAULT.equals(min_value_of_the_second_physical_property);
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY:
				return MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY_EDEFAULT == null ? max_value_of_the_second_physical_property != null : !MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY_EDEFAULT.equals(max_value_of_the_second_physical_property);
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__THIRD_PHYSICAL_PROPERTY:
				return THIRD_PHYSICAL_PROPERTY_EDEFAULT == null ? third_physical_property != null : !THIRD_PHYSICAL_PROPERTY_EDEFAULT.equals(third_physical_property);
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY:
				return MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY_EDEFAULT == null ? min_value_of_the_third_physical_property != null : !MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY_EDEFAULT.equals(min_value_of_the_third_physical_property);
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY:
				return MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY_EDEFAULT == null ? max_value_of_the_third_physical_property != null : !MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY_EDEFAULT.equals(max_value_of_the_third_physical_property);
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__PHYSICAL_DEPENDENCY_FUNCTION:
				return PHYSICAL_DEPENDENCY_FUNCTION_EDEFAULT == null ? physical_dependency_function != null : !PHYSICAL_DEPENDENCY_FUNCTION_EDEFAULT.equals(physical_dependency_function);
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
		result.append(", Do_Happen: ");
		result.append(do_Happen);
		result.append(", First_physical_property: ");
		result.append(first_physical_property);
		result.append(", Min_value_of_the_first_physical_property: ");
		result.append(min_value_of_the_first_physical_property);
		result.append(", Max_value_of_the_first_physical_property: ");
		result.append(max_value_of_the_first_physical_property);
		result.append(", Second_physical_property: ");
		result.append(second_physical_property);
		result.append(", Min_value_of_the_second_physical_property: ");
		result.append(min_value_of_the_second_physical_property);
		result.append(", Max_value_of_the_second_physical_property: ");
		result.append(max_value_of_the_second_physical_property);
		result.append(", Third_physical_property: ");
		result.append(third_physical_property);
		result.append(", Min_value_of_the_third_physical_property: ");
		result.append(min_value_of_the_third_physical_property);
		result.append(", Max_value_of_the_third_physical_property: ");
		result.append(max_value_of_the_third_physical_property);
		result.append(", Physical_dependency_function: ");
		result.append(physical_dependency_function);
		result.append(')');
		return result.toString();
	}

} //MustHappenAsLongAsTheActivityIsExecutingImpl
