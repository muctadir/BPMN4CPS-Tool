/**
 */
package bpmnforcpsextension.MyModel.impl;

import bpmnforcpsextension.MyModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyModelFactoryImpl extends EFactoryImpl implements MyModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MyModelFactory init() {
		try {
			MyModelFactory theMyModelFactory = (MyModelFactory)EPackage.Registry.INSTANCE.getEFactory(MyModelPackage.eNS_URI);
			if (theMyModelFactory != null) {
				return theMyModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MyModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MyModelPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case MyModelPackage.PARAMETER: return createParameter();
			case MyModelPackage.META_DATA: return createMetaData();
			case MyModelPackage.TASK_CONFIG: return createTaskConfig();
			case MyModelPackage.TEMPORAL_DEPENDENCY: return createTemporalDependency();
			case MyModelPackage.MSA: return createMSA();
			case MyModelPackage.MOA: return createMOA();
			case MyModelPackage.MFA: return createMFA();
			case MyModelPackage.MSI: return createMSI();
			case MyModelPackage.MOI: return createMOI();
			case MyModelPackage.MFI: return createMFI();
			case MyModelPackage.MUST_HAPPEN_AT_AN_INFINITE_TIME: return createMustHappenAtAnInfiniteTime();
			case MyModelPackage.MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING: return createMustHappenAsLongAsTheActivityIsExecuting();
			case MyModelPackage.MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY: return createMustHappenAtTheStartOfTheActivity();
			case MyModelPackage.MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY: return createMustHappenAtTheEndOfTheActivity();
			case MyModelPackage.MUST_HAPPEN_AT_ABOUND_TIME: return createMustHappenAtABoundTime();
			case MyModelPackage.MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME: return createMustNeverHappenAtAnInfiniteTime();
			case MyModelPackage.MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING: return createMustNeverHappenAsLongAsTheActivityIsExecuting();
			case MyModelPackage.MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY: return createMustNeverHappenAtTheStartOfTheActivity();
			case MyModelPackage.MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY: return createMustNeverHappenAtTheEndOfTheActivity();
			case MyModelPackage.MUST_NEVER_HAPPEN_AT_ABOUND_TIME: return createMustNeverHappenAtABoundTime();
			case MyModelPackage.PERIODIC_EVENT: return createPeriodicEvent();
			case MyModelPackage.SPORADIC_EVENT: return createSporadicEvent();
			case MyModelPackage.PERIODIC_ACTIVITY: return createPeriodicActivity();
			case MyModelPackage.SPORADIC_ACTIVITY: return createSporadicActivity();
			case MyModelPackage.DURATION: return createDuration();
			case MyModelPackage.PHYSICAL_ENTITY_TASK: return createPhysicalEntityTask();
			case MyModelPackage.MY_EVENT_DEFINITION: return createMyEventDefinition();
			case MyModelPackage.REAL_WORLD_PROPERTIES: return createRealWorldProperties();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MyModelPackage.PHYSICAL_PROPERTIES:
				return createPhysical_PropertiesFromString(eDataType, initialValue);
			case MyModelPackage.TYPE_DEVICE:
				return createTypeDeviceFromString(eDataType, initialValue);
			case MyModelPackage.TIMER_TYPE:
				return createTimer_TypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MyModelPackage.PHYSICAL_PROPERTIES:
				return convertPhysical_PropertiesToString(eDataType, instanceValue);
			case MyModelPackage.TYPE_DEVICE:
				return convertTypeDeviceToString(eDataType, instanceValue);
			case MyModelPackage.TIMER_TYPE:
				return convertTimer_TypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaData createMetaData() {
		MetaDataImpl metaData = new MetaDataImpl();
		return metaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskConfig createTaskConfig() {
		TaskConfigImpl taskConfig = new TaskConfigImpl();
		return taskConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalDependency createTemporalDependency() {
		TemporalDependencyImpl temporalDependency = new TemporalDependencyImpl();
		return temporalDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSA createMSA() {
		MSAImpl msa = new MSAImpl();
		return msa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MOA createMOA() {
		MOAImpl moa = new MOAImpl();
		return moa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFA createMFA() {
		MFAImpl mfa = new MFAImpl();
		return mfa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSI createMSI() {
		MSIImpl msi = new MSIImpl();
		return msi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MOI createMOI() {
		MOIImpl moi = new MOIImpl();
		return moi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFI createMFI() {
		MFIImpl mfi = new MFIImpl();
		return mfi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MustHappenAtAnInfiniteTime createMustHappenAtAnInfiniteTime() {
		MustHappenAtAnInfiniteTimeImpl mustHappenAtAnInfiniteTime = new MustHappenAtAnInfiniteTimeImpl();
		return mustHappenAtAnInfiniteTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MustHappenAsLongAsTheActivityIsExecuting createMustHappenAsLongAsTheActivityIsExecuting() {
		MustHappenAsLongAsTheActivityIsExecutingImpl mustHappenAsLongAsTheActivityIsExecuting = new MustHappenAsLongAsTheActivityIsExecutingImpl();
		return mustHappenAsLongAsTheActivityIsExecuting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MustHappenAtTheStartOfTheActivity createMustHappenAtTheStartOfTheActivity() {
		MustHappenAtTheStartOfTheActivityImpl mustHappenAtTheStartOfTheActivity = new MustHappenAtTheStartOfTheActivityImpl();
		return mustHappenAtTheStartOfTheActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MustHappenAtTheEndOfTheActivity createMustHappenAtTheEndOfTheActivity() {
		MustHappenAtTheEndOfTheActivityImpl mustHappenAtTheEndOfTheActivity = new MustHappenAtTheEndOfTheActivityImpl();
		return mustHappenAtTheEndOfTheActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MustHappenAtABoundTime createMustHappenAtABoundTime() {
		MustHappenAtABoundTimeImpl mustHappenAtABoundTime = new MustHappenAtABoundTimeImpl();
		return mustHappenAtABoundTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MustNeverHappenAtAnInfiniteTime createMustNeverHappenAtAnInfiniteTime() {
		MustNeverHappenAtAnInfiniteTimeImpl mustNeverHappenAtAnInfiniteTime = new MustNeverHappenAtAnInfiniteTimeImpl();
		return mustNeverHappenAtAnInfiniteTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MustNeverHappenAsLongAsTheActivityIsExecuting createMustNeverHappenAsLongAsTheActivityIsExecuting() {
		MustNeverHappenAsLongAsTheActivityIsExecutingImpl mustNeverHappenAsLongAsTheActivityIsExecuting = new MustNeverHappenAsLongAsTheActivityIsExecutingImpl();
		return mustNeverHappenAsLongAsTheActivityIsExecuting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MustNeverHappenAtTheStartOfTheActivity createMustNeverHappenAtTheStartOfTheActivity() {
		MustNeverHappenAtTheStartOfTheActivityImpl mustNeverHappenAtTheStartOfTheActivity = new MustNeverHappenAtTheStartOfTheActivityImpl();
		return mustNeverHappenAtTheStartOfTheActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MustNeverHappenAtTheEndOfTheActivity createMustNeverHappenAtTheEndOfTheActivity() {
		MustNeverHappenAtTheEndOfTheActivityImpl mustNeverHappenAtTheEndOfTheActivity = new MustNeverHappenAtTheEndOfTheActivityImpl();
		return mustNeverHappenAtTheEndOfTheActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MustNeverHappenAtABoundTime createMustNeverHappenAtABoundTime() {
		MustNeverHappenAtABoundTimeImpl mustNeverHappenAtABoundTime = new MustNeverHappenAtABoundTimeImpl();
		return mustNeverHappenAtABoundTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicEvent createPeriodicEvent() {
		PeriodicEventImpl periodicEvent = new PeriodicEventImpl();
		return periodicEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SporadicEvent createSporadicEvent() {
		SporadicEventImpl sporadicEvent = new SporadicEventImpl();
		return sporadicEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicActivity createPeriodicActivity() {
		PeriodicActivityImpl periodicActivity = new PeriodicActivityImpl();
		return periodicActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SporadicActivity createSporadicActivity() {
		SporadicActivityImpl sporadicActivity = new SporadicActivityImpl();
		return sporadicActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration createDuration() {
		DurationImpl duration = new DurationImpl();
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalEntityTask createPhysicalEntityTask() {
		PhysicalEntityTaskImpl physicalEntityTask = new PhysicalEntityTaskImpl();
		return physicalEntityTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyEventDefinition createMyEventDefinition() {
		MyEventDefinitionImpl myEventDefinition = new MyEventDefinitionImpl();
		return myEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealWorldProperties createRealWorldProperties() {
		RealWorldPropertiesImpl realWorldProperties = new RealWorldPropertiesImpl();
		return realWorldProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Physical_Properties createPhysical_PropertiesFromString(EDataType eDataType, String initialValue) {
		Physical_Properties result = Physical_Properties.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPhysical_PropertiesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDevice createTypeDeviceFromString(EDataType eDataType, String initialValue) {
		TypeDevice result = TypeDevice.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDeviceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timer_Type createTimer_TypeFromString(EDataType eDataType, String initialValue) {
		Timer_Type result = Timer_Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimer_TypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyModelPackage getMyModelPackage() {
		return (MyModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MyModelPackage getPackage() {
		return MyModelPackage.eINSTANCE;
	}

} //MyModelFactoryImpl
