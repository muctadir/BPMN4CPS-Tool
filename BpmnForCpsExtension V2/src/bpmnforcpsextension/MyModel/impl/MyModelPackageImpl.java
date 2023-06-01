/**
 */
package bpmnforcpsextension.MyModel.impl;

import bpmnforcpsextension.MyModel.DocumentRoot;
import bpmnforcpsextension.MyModel.Duration;
import bpmnforcpsextension.MyModel.MetaData;
import bpmnforcpsextension.MyModel.MustHappenAsLongAsTheActivityIsExecuting;
import bpmnforcpsextension.MyModel.MustHappenAtABoundTime;
import bpmnforcpsextension.MyModel.MustHappenAtAnInfiniteTime;
import bpmnforcpsextension.MyModel.MustHappenAtTheEndOfTheActivity;
import bpmnforcpsextension.MyModel.MustHappenAtTheStartOfTheActivity;
import bpmnforcpsextension.MyModel.MustNeverHappenAsLongAsTheActivityIsExecuting;
import bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime;
import bpmnforcpsextension.MyModel.MustNeverHappenAtAnInfiniteTime;
import bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity;
import bpmnforcpsextension.MyModel.MustNeverHappenAtTheStartOfTheActivity;
import bpmnforcpsextension.MyModel.MyEventDefinition;
import bpmnforcpsextension.MyModel.MyModelFactory;
import bpmnforcpsextension.MyModel.MyModelPackage;
import bpmnforcpsextension.MyModel.Parameter;
import bpmnforcpsextension.MyModel.PeriodicActivity;
import bpmnforcpsextension.MyModel.PeriodicEvent;
import bpmnforcpsextension.MyModel.PhysicalEntityTask;
import bpmnforcpsextension.MyModel.Physical_Properties;
import bpmnforcpsextension.MyModel.RealWorldProperties;
import bpmnforcpsextension.MyModel.SporadicActivity;
import bpmnforcpsextension.MyModel.SporadicEvent;
import bpmnforcpsextension.MyModel.TaskConfig;
import bpmnforcpsextension.MyModel.TemporalDependency;
import bpmnforcpsextension.MyModel.Timer_Type;
import bpmnforcpsextension.MyModel.TypeDevice;

import org.eclipse.bpmn2.Bpmn2Package;

import org.eclipse.bpmn2.di.BpmnDiPackage;

import org.eclipse.dd.dc.DcPackage;

import org.eclipse.dd.di.DiPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyModelPackageImpl extends EPackageImpl implements MyModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass msaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mfaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass msiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mfiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mustHappenAtAnInfiniteTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mustHappenAsLongAsTheActivityIsExecutingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mustHappenAtTheStartOfTheActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mustHappenAtTheEndOfTheActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mustHappenAtABoundTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mustNeverHappenAtAnInfiniteTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mustNeverHappenAsLongAsTheActivityIsExecutingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mustNeverHappenAtTheStartOfTheActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mustNeverHappenAtTheEndOfTheActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mustNeverHappenAtABoundTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodicEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sporadicEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodicActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sporadicActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalEntityTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass myEventDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realWorldPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum physical_PropertiesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeDeviceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timer_TypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MyModelPackageImpl() {
		super(eNS_URI, MyModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MyModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MyModelPackage init() {
		if (isInited) return (MyModelPackage)EPackage.Registry.INSTANCE.getEPackage(MyModelPackage.eNS_URI);

		// Obtain or create and register package
		MyModelPackageImpl theMyModelPackage = (MyModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MyModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MyModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Bpmn2Package.eINSTANCE.eClass();
		BpmnDiPackage.eINSTANCE.eClass();
		DiPackage.eINSTANCE.eClass();
		DcPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMyModelPackage.createPackageContents();

		// Initialize created meta-data
		theMyModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMyModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MyModelPackage.eNS_URI, theMyModelPackage);
		return theMyModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TaskConfig() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TemporalDependency() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MetaData() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Msa() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Moa() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Mfa() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Msi() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Moi() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Mfi() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Musthappenataninfinitetime() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Musthappenaslongastheactivityisexecuting() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Musthappenatthestartoftheactivity() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Musthappenattheendoftheactivity() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Musthappenataboundtime() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Mustneverhappenataninfinitetime() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Mustneverhappenatthestartoftheactivity() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Mustneverhappenattheendoftheactivity() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Mustneverhappenataboundtime() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Myeventdefinition() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Periodicevent() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Sporadicevent() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Duration() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Physicalentitytask() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Realworldproperties() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Value() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaData() {
		return metaDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaData_Mixed() {
		return (EAttribute)metaDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaData_Name() {
		return (EAttribute)metaDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaData_Value() {
		return (EAttribute)metaDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskConfig() {
		return taskConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskConfig_Parameters() {
		return (EReference)taskConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporalDependency() {
		return temporalDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemporalDependency_SourceRef() {
		return (EReference)temporalDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemporalDependency_TargetRef() {
		return (EReference)temporalDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalDependency_Max_value() {
		return (EAttribute)temporalDependencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalDependency_Min_value() {
		return (EAttribute)temporalDependencyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMSA() {
		return msaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMSA_Name() {
		return (EAttribute)msaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMSA_Type() {
		return (EAttribute)msaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSA_Target() {
		return (EReference)msaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMSA_Value() {
		return (EAttribute)msaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMOA() {
		return moaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMOA_Name() {
		return (EAttribute)moaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMOA_Type() {
		return (EAttribute)moaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMOA_Target() {
		return (EReference)moaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMOA_Value() {
		return (EAttribute)moaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMFA() {
		return mfaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMFA_Name() {
		return (EAttribute)mfaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMFA_Type() {
		return (EAttribute)mfaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMFA_Target() {
		return (EReference)mfaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMFA_Value() {
		return (EAttribute)mfaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMSI() {
		return msiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMSI_Name() {
		return (EAttribute)msiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMSI_Type() {
		return (EAttribute)msiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSI_Target() {
		return (EReference)msiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMSI_Min_Value() {
		return (EAttribute)msiEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMSI_Max_Value() {
		return (EAttribute)msiEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMOI() {
		return moiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMOI_Name() {
		return (EAttribute)moiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMOI_Type() {
		return (EAttribute)moiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMOI_Target() {
		return (EReference)moiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMOI_Min_Value() {
		return (EAttribute)moiEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMOI_Max_Value() {
		return (EAttribute)moiEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMFI() {
		return mfiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMFI_Name() {
		return (EAttribute)mfiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMFI_Type() {
		return (EAttribute)mfiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMFI_Target() {
		return (EReference)mfiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMFI_Min_Value() {
		return (EAttribute)mfiEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMFI_Max_Value() {
		return (EAttribute)mfiEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMustHappenAtAnInfiniteTime() {
		return mustHappenAtAnInfiniteTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtAnInfiniteTime_Name() {
		return (EAttribute)mustHappenAtAnInfiniteTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtAnInfiniteTime_Type() {
		return (EAttribute)mustHappenAtAnInfiniteTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMustHappenAtAnInfiniteTime_Target() {
		return (EReference)mustHappenAtAnInfiniteTimeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtAnInfiniteTime_Do_Happen() {
		return (EAttribute)mustHappenAtAnInfiniteTimeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtAnInfiniteTime_First_physical_property() {
		return (EAttribute)mustHappenAtAnInfiniteTimeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtAnInfiniteTime_Min_value_of_the_first_physical_property() {
		return (EAttribute)mustHappenAtAnInfiniteTimeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtAnInfiniteTime_Max_value_of_the_first_physical_property() {
		return (EAttribute)mustHappenAtAnInfiniteTimeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtAnInfiniteTime_Second_physical_property() {
		return (EAttribute)mustHappenAtAnInfiniteTimeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtAnInfiniteTime_Min_value_of_the_second_physical_property() {
		return (EAttribute)mustHappenAtAnInfiniteTimeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtAnInfiniteTime_Max_value_of_the_second_physical_property() {
		return (EAttribute)mustHappenAtAnInfiniteTimeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtAnInfiniteTime_Third_physical_property() {
		return (EAttribute)mustHappenAtAnInfiniteTimeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtAnInfiniteTime_Min_value_of_the_third_physical_property() {
		return (EAttribute)mustHappenAtAnInfiniteTimeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtAnInfiniteTime_Max_value_of_the_third_physical_property() {
		return (EAttribute)mustHappenAtAnInfiniteTimeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtAnInfiniteTime_Physical_dependency_function() {
		return (EAttribute)mustHappenAtAnInfiniteTimeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMustHappenAsLongAsTheActivityIsExecuting() {
		return mustHappenAsLongAsTheActivityIsExecutingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAsLongAsTheActivityIsExecuting_Name() {
		return (EAttribute)mustHappenAsLongAsTheActivityIsExecutingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAsLongAsTheActivityIsExecuting_Type() {
		return (EAttribute)mustHappenAsLongAsTheActivityIsExecutingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMustHappenAsLongAsTheActivityIsExecuting_Target() {
		return (EReference)mustHappenAsLongAsTheActivityIsExecutingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAsLongAsTheActivityIsExecuting_Do_Happen() {
		return (EAttribute)mustHappenAsLongAsTheActivityIsExecutingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAsLongAsTheActivityIsExecuting_First_physical_property() {
		return (EAttribute)mustHappenAsLongAsTheActivityIsExecutingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAsLongAsTheActivityIsExecuting_Min_value_of_the_first_physical_property() {
		return (EAttribute)mustHappenAsLongAsTheActivityIsExecutingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAsLongAsTheActivityIsExecuting_Max_value_of_the_first_physical_property() {
		return (EAttribute)mustHappenAsLongAsTheActivityIsExecutingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAsLongAsTheActivityIsExecuting_Second_physical_property() {
		return (EAttribute)mustHappenAsLongAsTheActivityIsExecutingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAsLongAsTheActivityIsExecuting_Min_value_of_the_second_physical_property() {
		return (EAttribute)mustHappenAsLongAsTheActivityIsExecutingEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAsLongAsTheActivityIsExecuting_Max_value_of_the_second_physical_property() {
		return (EAttribute)mustHappenAsLongAsTheActivityIsExecutingEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAsLongAsTheActivityIsExecuting_Third_physical_property() {
		return (EAttribute)mustHappenAsLongAsTheActivityIsExecutingEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAsLongAsTheActivityIsExecuting_Min_value_of_the_third_physical_property() {
		return (EAttribute)mustHappenAsLongAsTheActivityIsExecutingEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAsLongAsTheActivityIsExecuting_Max_value_of_the_third_physical_property() {
		return (EAttribute)mustHappenAsLongAsTheActivityIsExecutingEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAsLongAsTheActivityIsExecuting_Physical_dependency_function() {
		return (EAttribute)mustHappenAsLongAsTheActivityIsExecutingEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMustHappenAtTheStartOfTheActivity() {
		return mustHappenAtTheStartOfTheActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtTheStartOfTheActivity_Name() {
		return (EAttribute)mustHappenAtTheStartOfTheActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtTheStartOfTheActivity_Type() {
		return (EAttribute)mustHappenAtTheStartOfTheActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMustHappenAtTheStartOfTheActivity_Target() {
		return (EReference)mustHappenAtTheStartOfTheActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtTheStartOfTheActivity_Do_Happen() {
		return (EAttribute)mustHappenAtTheStartOfTheActivityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtTheStartOfTheActivity_First_physical_property() {
		return (EAttribute)mustHappenAtTheStartOfTheActivityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtTheStartOfTheActivity_Min_value_of_the_first_physical_property() {
		return (EAttribute)mustHappenAtTheStartOfTheActivityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtTheStartOfTheActivity_Max_value_of_the_first_physical_property() {
		return (EAttribute)mustHappenAtTheStartOfTheActivityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtTheStartOfTheActivity_Second_physical_property() {
		return (EAttribute)mustHappenAtTheStartOfTheActivityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtTheStartOfTheActivity_Min_value_of_the_second_physical_property() {
		return (EAttribute)mustHappenAtTheStartOfTheActivityEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtTheStartOfTheActivity_Max_value_of_the_second_physical_property() {
		return (EAttribute)mustHappenAtTheStartOfTheActivityEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtTheStartOfTheActivity_Third_physical_property() {
		return (EAttribute)mustHappenAtTheStartOfTheActivityEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtTheStartOfTheActivity_Min_value_of_the_third_physical_property() {
		return (EAttribute)mustHappenAtTheStartOfTheActivityEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtTheStartOfTheActivity_Max_value_of_the_third_physical_property() {
		return (EAttribute)mustHappenAtTheStartOfTheActivityEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtTheStartOfTheActivity_Physical_dependency_function() {
		return (EAttribute)mustHappenAtTheStartOfTheActivityEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMustHappenAtTheEndOfTheActivity() {
		return mustHappenAtTheEndOfTheActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtTheEndOfTheActivity_Name() {
		return (EAttribute)mustHappenAtTheEndOfTheActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtTheEndOfTheActivity_Type() {
		return (EAttribute)mustHappenAtTheEndOfTheActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMustHappenAtTheEndOfTheActivity_Target() {
		return (EReference)mustHappenAtTheEndOfTheActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtTheEndOfTheActivity_Do_Happen() {
		return (EAttribute)mustHappenAtTheEndOfTheActivityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtTheEndOfTheActivity_First_physical_property() {
		return (EAttribute)mustHappenAtTheEndOfTheActivityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtTheEndOfTheActivity_Min_value_of_the_first_physical_property() {
		return (EAttribute)mustHappenAtTheEndOfTheActivityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtTheEndOfTheActivity_Max_value_of_the_first_physical_property() {
		return (EAttribute)mustHappenAtTheEndOfTheActivityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtTheEndOfTheActivity_Second_physical_property() {
		return (EAttribute)mustHappenAtTheEndOfTheActivityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtTheEndOfTheActivity_Min_value_of_the_second_physical_property() {
		return (EAttribute)mustHappenAtTheEndOfTheActivityEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtTheEndOfTheActivity_Max_value_of_the_second_physical_property() {
		return (EAttribute)mustHappenAtTheEndOfTheActivityEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtTheEndOfTheActivity_Third_physical_property() {
		return (EAttribute)mustHappenAtTheEndOfTheActivityEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtTheEndOfTheActivity_Min_value_of_the_third_physical_property() {
		return (EAttribute)mustHappenAtTheEndOfTheActivityEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtTheEndOfTheActivity_Max_value_of_the_third_physical_property() {
		return (EAttribute)mustHappenAtTheEndOfTheActivityEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtTheEndOfTheActivity_Physical_dependency_function() {
		return (EAttribute)mustHappenAtTheEndOfTheActivityEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMustHappenAtABoundTime() {
		return mustHappenAtABoundTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtABoundTime_Name() {
		return (EAttribute)mustHappenAtABoundTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtABoundTime_Type() {
		return (EAttribute)mustHappenAtABoundTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMustHappenAtABoundTime_Target() {
		return (EReference)mustHappenAtABoundTimeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtABoundTime_Do_Happen() {
		return (EAttribute)mustHappenAtABoundTimeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtABoundTime_Min_bound_time() {
		return (EAttribute)mustHappenAtABoundTimeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtABoundTime_Max_bound_time() {
		return (EAttribute)mustHappenAtABoundTimeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtABoundTime_First_physical_property() {
		return (EAttribute)mustHappenAtABoundTimeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtABoundTime_Min_value_of_the_first_physical_property() {
		return (EAttribute)mustHappenAtABoundTimeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtABoundTime_Max_value_of_the_first_physical_property() {
		return (EAttribute)mustHappenAtABoundTimeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtABoundTime_Second_physical_property() {
		return (EAttribute)mustHappenAtABoundTimeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtABoundTime_Min_value_of_the_second_physical_property() {
		return (EAttribute)mustHappenAtABoundTimeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtABoundTime_Max_value_of_the_second_physical_property() {
		return (EAttribute)mustHappenAtABoundTimeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtABoundTime_Third_physical_property() {
		return (EAttribute)mustHappenAtABoundTimeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtABoundTime_Min_value_of_the_third_physical_property() {
		return (EAttribute)mustHappenAtABoundTimeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtABoundTime_Max_value_of_the_third_physical_property() {
		return (EAttribute)mustHappenAtABoundTimeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustHappenAtABoundTime_Physical_dependency_function() {
		return (EAttribute)mustHappenAtABoundTimeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMustNeverHappenAtAnInfiniteTime() {
		return mustNeverHappenAtAnInfiniteTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtAnInfiniteTime_Name() {
		return (EAttribute)mustNeverHappenAtAnInfiniteTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtAnInfiniteTime_Type() {
		return (EAttribute)mustNeverHappenAtAnInfiniteTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMustNeverHappenAtAnInfiniteTime_Target() {
		return (EReference)mustNeverHappenAtAnInfiniteTimeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtAnInfiniteTime_Do_Happen() {
		return (EAttribute)mustNeverHappenAtAnInfiniteTimeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtAnInfiniteTime_First_physical_property() {
		return (EAttribute)mustNeverHappenAtAnInfiniteTimeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtAnInfiniteTime_Min_value_of_the_first_physical_property() {
		return (EAttribute)mustNeverHappenAtAnInfiniteTimeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtAnInfiniteTime_Max_value_of_the_first_physical_property() {
		return (EAttribute)mustNeverHappenAtAnInfiniteTimeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtAnInfiniteTime_Second_physical_property() {
		return (EAttribute)mustNeverHappenAtAnInfiniteTimeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtAnInfiniteTime_Min_value_of_the_second_physical_property() {
		return (EAttribute)mustNeverHappenAtAnInfiniteTimeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtAnInfiniteTime_Max_value_of_the_second_physical_property() {
		return (EAttribute)mustNeverHappenAtAnInfiniteTimeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtAnInfiniteTime_Third_physical_property() {
		return (EAttribute)mustNeverHappenAtAnInfiniteTimeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtAnInfiniteTime_Min_value_of_the_third_physical_property() {
		return (EAttribute)mustNeverHappenAtAnInfiniteTimeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtAnInfiniteTime_Max_value_of_the_third_physical_property() {
		return (EAttribute)mustNeverHappenAtAnInfiniteTimeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtAnInfiniteTime_Physical_dependency_function() {
		return (EAttribute)mustNeverHappenAtAnInfiniteTimeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMustNeverHappenAsLongAsTheActivityIsExecuting() {
		return mustNeverHappenAsLongAsTheActivityIsExecutingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAsLongAsTheActivityIsExecuting_Name() {
		return (EAttribute)mustNeverHappenAsLongAsTheActivityIsExecutingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAsLongAsTheActivityIsExecuting_Type() {
		return (EAttribute)mustNeverHappenAsLongAsTheActivityIsExecutingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMustNeverHappenAsLongAsTheActivityIsExecuting_Target() {
		return (EReference)mustNeverHappenAsLongAsTheActivityIsExecutingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAsLongAsTheActivityIsExecuting_Do_Happen() {
		return (EAttribute)mustNeverHappenAsLongAsTheActivityIsExecutingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAsLongAsTheActivityIsExecuting_First_physical_property() {
		return (EAttribute)mustNeverHappenAsLongAsTheActivityIsExecutingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAsLongAsTheActivityIsExecuting_Min_value_of_the_first_physical_property() {
		return (EAttribute)mustNeverHappenAsLongAsTheActivityIsExecutingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAsLongAsTheActivityIsExecuting_Max_value_of_the_first_physical_property() {
		return (EAttribute)mustNeverHappenAsLongAsTheActivityIsExecutingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAsLongAsTheActivityIsExecuting_Second_physical_property() {
		return (EAttribute)mustNeverHappenAsLongAsTheActivityIsExecutingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAsLongAsTheActivityIsExecuting_Min_value_of_the_second_physical_property() {
		return (EAttribute)mustNeverHappenAsLongAsTheActivityIsExecutingEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAsLongAsTheActivityIsExecuting_Max_value_of_the_second_physical_property() {
		return (EAttribute)mustNeverHappenAsLongAsTheActivityIsExecutingEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAsLongAsTheActivityIsExecuting_Third_physical_property() {
		return (EAttribute)mustNeverHappenAsLongAsTheActivityIsExecutingEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAsLongAsTheActivityIsExecuting_Min_value_of_the_third_physical_property() {
		return (EAttribute)mustNeverHappenAsLongAsTheActivityIsExecutingEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAsLongAsTheActivityIsExecuting_Max_value_of_the_third_physical_property() {
		return (EAttribute)mustNeverHappenAsLongAsTheActivityIsExecutingEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAsLongAsTheActivityIsExecuting_Physical_dependency_function() {
		return (EAttribute)mustNeverHappenAsLongAsTheActivityIsExecutingEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMustNeverHappenAtTheStartOfTheActivity() {
		return mustNeverHappenAtTheStartOfTheActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtTheStartOfTheActivity_Name() {
		return (EAttribute)mustNeverHappenAtTheStartOfTheActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtTheStartOfTheActivity_Type() {
		return (EAttribute)mustNeverHappenAtTheStartOfTheActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMustNeverHappenAtTheStartOfTheActivity_Target() {
		return (EReference)mustNeverHappenAtTheStartOfTheActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtTheStartOfTheActivity_Do_Happen() {
		return (EAttribute)mustNeverHappenAtTheStartOfTheActivityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtTheStartOfTheActivity_First_physical_property() {
		return (EAttribute)mustNeverHappenAtTheStartOfTheActivityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtTheStartOfTheActivity_Min_value_of_the_first_physical_property() {
		return (EAttribute)mustNeverHappenAtTheStartOfTheActivityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtTheStartOfTheActivity_Max_value_of_the_first_physical_property() {
		return (EAttribute)mustNeverHappenAtTheStartOfTheActivityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtTheStartOfTheActivity_Second_physical_property() {
		return (EAttribute)mustNeverHappenAtTheStartOfTheActivityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtTheStartOfTheActivity_Min_value_of_the_second_physical_property() {
		return (EAttribute)mustNeverHappenAtTheStartOfTheActivityEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtTheStartOfTheActivity_Max_value_of_the_second_physical_property() {
		return (EAttribute)mustNeverHappenAtTheStartOfTheActivityEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtTheStartOfTheActivity_Third_physical_property() {
		return (EAttribute)mustNeverHappenAtTheStartOfTheActivityEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtTheStartOfTheActivity_Min_value_of_the_third_physical_property() {
		return (EAttribute)mustNeverHappenAtTheStartOfTheActivityEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtTheStartOfTheActivity_Max_value_of_the_third_physical_property() {
		return (EAttribute)mustNeverHappenAtTheStartOfTheActivityEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtTheStartOfTheActivity_Physical_dependency_function() {
		return (EAttribute)mustNeverHappenAtTheStartOfTheActivityEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMustNeverHappenAtTheEndOfTheActivity() {
		return mustNeverHappenAtTheEndOfTheActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtTheEndOfTheActivity_Name() {
		return (EAttribute)mustNeverHappenAtTheEndOfTheActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtTheEndOfTheActivity_Type() {
		return (EAttribute)mustNeverHappenAtTheEndOfTheActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMustNeverHappenAtTheEndOfTheActivity_Target() {
		return (EReference)mustNeverHappenAtTheEndOfTheActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtTheEndOfTheActivity_Do_Happen() {
		return (EAttribute)mustNeverHappenAtTheEndOfTheActivityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtTheEndOfTheActivity_First_physical_property() {
		return (EAttribute)mustNeverHappenAtTheEndOfTheActivityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtTheEndOfTheActivity_Min_value_of_the_first_physical_property() {
		return (EAttribute)mustNeverHappenAtTheEndOfTheActivityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtTheEndOfTheActivity_Max_value_of_the_first_physical_property() {
		return (EAttribute)mustNeverHappenAtTheEndOfTheActivityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtTheEndOfTheActivity_Second_physical_property() {
		return (EAttribute)mustNeverHappenAtTheEndOfTheActivityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtTheEndOfTheActivity_Min_value_of_the_second_physical_property() {
		return (EAttribute)mustNeverHappenAtTheEndOfTheActivityEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtTheEndOfTheActivity_Max_value_of_the_second_physical_property() {
		return (EAttribute)mustNeverHappenAtTheEndOfTheActivityEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtTheEndOfTheActivity_Third_physical_property() {
		return (EAttribute)mustNeverHappenAtTheEndOfTheActivityEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtTheEndOfTheActivity_Min_value_of_the_third_physical_property() {
		return (EAttribute)mustNeverHappenAtTheEndOfTheActivityEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtTheEndOfTheActivity_Max_value_of_the_third_physical_property() {
		return (EAttribute)mustNeverHappenAtTheEndOfTheActivityEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtTheEndOfTheActivity_Physical_dependency_function() {
		return (EAttribute)mustNeverHappenAtTheEndOfTheActivityEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMustNeverHappenAtABoundTime() {
		return mustNeverHappenAtABoundTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtABoundTime_Name() {
		return (EAttribute)mustNeverHappenAtABoundTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtABoundTime_Type() {
		return (EAttribute)mustNeverHappenAtABoundTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMustNeverHappenAtABoundTime_Target() {
		return (EReference)mustNeverHappenAtABoundTimeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtABoundTime_Do_Happen() {
		return (EAttribute)mustNeverHappenAtABoundTimeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtABoundTime_Max_bound_time() {
		return (EAttribute)mustNeverHappenAtABoundTimeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtABoundTime_Min_bound_time() {
		return (EAttribute)mustNeverHappenAtABoundTimeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtABoundTime_First_physical_property() {
		return (EAttribute)mustNeverHappenAtABoundTimeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtABoundTime_Min_value_of_the_first_physical_property() {
		return (EAttribute)mustNeverHappenAtABoundTimeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtABoundTime_Max_value_of_the_first_physical_property() {
		return (EAttribute)mustNeverHappenAtABoundTimeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtABoundTime_Second_physical_property() {
		return (EAttribute)mustNeverHappenAtABoundTimeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtABoundTime_Min_value_of_the_second_physical_property() {
		return (EAttribute)mustNeverHappenAtABoundTimeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtABoundTime_Max_value_of_the_second_physical_property() {
		return (EAttribute)mustNeverHappenAtABoundTimeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtABoundTime_Third_physical_property() {
		return (EAttribute)mustNeverHappenAtABoundTimeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtABoundTime_Min_value_of_the_third_physical_property() {
		return (EAttribute)mustNeverHappenAtABoundTimeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtABoundTime_Max_value_of_the_third_physical_property() {
		return (EAttribute)mustNeverHappenAtABoundTimeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustNeverHappenAtABoundTime_Physical_dependency_function() {
		return (EAttribute)mustNeverHappenAtABoundTimeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeriodicEvent() {
		return periodicEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodicEvent_Name() {
		return (EAttribute)periodicEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriodicEvent_Target() {
		return (EReference)periodicEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodicEvent_Value() {
		return (EAttribute)periodicEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodicEvent_Type() {
		return (EAttribute)periodicEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSporadicEvent() {
		return sporadicEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSporadicEvent_Name() {
		return (EAttribute)sporadicEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSporadicEvent_Target() {
		return (EReference)sporadicEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSporadicEvent_Max_time() {
		return (EAttribute)sporadicEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSporadicEvent_Type() {
		return (EAttribute)sporadicEventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSporadicEvent_Min_time() {
		return (EAttribute)sporadicEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeriodicActivity() {
		return periodicActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodicActivity_Name() {
		return (EAttribute)periodicActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriodicActivity_Target() {
		return (EReference)periodicActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodicActivity_Time_value() {
		return (EAttribute)periodicActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodicActivity_Timer_Type() {
		return (EAttribute)periodicActivityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSporadicActivity() {
		return sporadicActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSporadicActivity_Name() {
		return (EAttribute)sporadicActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSporadicActivity_Target() {
		return (EReference)sporadicActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSporadicActivity_Max_time() {
		return (EAttribute)sporadicActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSporadicActivity_Min_time() {
		return (EAttribute)sporadicActivityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSporadicActivity_Timer_Type() {
		return (EAttribute)sporadicActivityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDuration() {
		return durationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_Name() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDuration_Target() {
		return (EReference)durationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_Min_time_duration() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_Max_time_duration() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_Time_Type() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalEntityTask() {
		return physicalEntityTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalEntityTask_CPSPerformerRef() {
		return (EAttribute)physicalEntityTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalEntityTask_CPSDeviceRoleParameters() {
		return (EAttribute)physicalEntityTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalEntityTask_Type() {
		return (EAttribute)physicalEntityTaskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalEntityTask_IsMovable() {
		return (EAttribute)physicalEntityTaskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMyEventDefinition() {
		return myEventDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMyEventDefinition_Value() {
		return (EAttribute)myEventDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealWorldProperties() {
		return realWorldPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealWorldProperties_Parameters() {
		return (EAttribute)realWorldPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPhysical_Properties() {
		return physical_PropertiesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeDevice() {
		return typeDeviceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimer_Type() {
		return timer_TypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyModelFactory getMyModelFactory() {
		return (MyModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TASK_CONFIG);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TEMPORAL_DEPENDENCY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__META_DATA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MSA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MOA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MFA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MSI);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MOI);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MFI);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MUSTHAPPENATANINFINITETIME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MUSTHAPPENASLONGASTHEACTIVITYISEXECUTING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MUSTHAPPENATTHESTARTOFTHEACTIVITY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MUSTHAPPENATTHEENDOFTHEACTIVITY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MUSTHAPPENATABOUNDTIME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MUSTNEVERHAPPENATANINFINITETIME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MUSTNEVERHAPPENATTHESTARTOFTHEACTIVITY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MUSTNEVERHAPPENATTHEENDOFTHEACTIVITY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MUSTNEVERHAPPENATABOUNDTIME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MYEVENTDEFINITION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DURATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PERIODICEVENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SPORADICEVENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PHYSICALENTITYTASK);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REALWORLDPROPERTIES);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEAttribute(parameterEClass, PARAMETER__VALUE);

		metaDataEClass = createEClass(META_DATA);
		createEAttribute(metaDataEClass, META_DATA__MIXED);
		createEAttribute(metaDataEClass, META_DATA__NAME);
		createEAttribute(metaDataEClass, META_DATA__VALUE);

		taskConfigEClass = createEClass(TASK_CONFIG);
		createEReference(taskConfigEClass, TASK_CONFIG__PARAMETERS);

		temporalDependencyEClass = createEClass(TEMPORAL_DEPENDENCY);
		createEReference(temporalDependencyEClass, TEMPORAL_DEPENDENCY__SOURCE_REF);
		createEReference(temporalDependencyEClass, TEMPORAL_DEPENDENCY__TARGET_REF);
		createEAttribute(temporalDependencyEClass, TEMPORAL_DEPENDENCY__MAX_VALUE);
		createEAttribute(temporalDependencyEClass, TEMPORAL_DEPENDENCY__MIN_VALUE);

		msaEClass = createEClass(MSA);
		createEAttribute(msaEClass, MSA__NAME);
		createEAttribute(msaEClass, MSA__TYPE);
		createEReference(msaEClass, MSA__TARGET);
		createEAttribute(msaEClass, MSA__VALUE);

		moaEClass = createEClass(MOA);
		createEAttribute(moaEClass, MOA__NAME);
		createEAttribute(moaEClass, MOA__TYPE);
		createEReference(moaEClass, MOA__TARGET);
		createEAttribute(moaEClass, MOA__VALUE);

		mfaEClass = createEClass(MFA);
		createEAttribute(mfaEClass, MFA__NAME);
		createEAttribute(mfaEClass, MFA__TYPE);
		createEReference(mfaEClass, MFA__TARGET);
		createEAttribute(mfaEClass, MFA__VALUE);

		msiEClass = createEClass(MSI);
		createEAttribute(msiEClass, MSI__NAME);
		createEAttribute(msiEClass, MSI__TYPE);
		createEReference(msiEClass, MSI__TARGET);
		createEAttribute(msiEClass, MSI__MIN_VALUE);
		createEAttribute(msiEClass, MSI__MAX_VALUE);

		moiEClass = createEClass(MOI);
		createEAttribute(moiEClass, MOI__NAME);
		createEAttribute(moiEClass, MOI__TYPE);
		createEReference(moiEClass, MOI__TARGET);
		createEAttribute(moiEClass, MOI__MIN_VALUE);
		createEAttribute(moiEClass, MOI__MAX_VALUE);

		mfiEClass = createEClass(MFI);
		createEAttribute(mfiEClass, MFI__NAME);
		createEAttribute(mfiEClass, MFI__TYPE);
		createEReference(mfiEClass, MFI__TARGET);
		createEAttribute(mfiEClass, MFI__MIN_VALUE);
		createEAttribute(mfiEClass, MFI__MAX_VALUE);

		mustHappenAtAnInfiniteTimeEClass = createEClass(MUST_HAPPEN_AT_AN_INFINITE_TIME);
		createEAttribute(mustHappenAtAnInfiniteTimeEClass, MUST_HAPPEN_AT_AN_INFINITE_TIME__NAME);
		createEAttribute(mustHappenAtAnInfiniteTimeEClass, MUST_HAPPEN_AT_AN_INFINITE_TIME__TYPE);
		createEReference(mustHappenAtAnInfiniteTimeEClass, MUST_HAPPEN_AT_AN_INFINITE_TIME__TARGET);
		createEAttribute(mustHappenAtAnInfiniteTimeEClass, MUST_HAPPEN_AT_AN_INFINITE_TIME__DO_HAPPEN);
		createEAttribute(mustHappenAtAnInfiniteTimeEClass, MUST_HAPPEN_AT_AN_INFINITE_TIME__FIRST_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAtAnInfiniteTimeEClass, MUST_HAPPEN_AT_AN_INFINITE_TIME__MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAtAnInfiniteTimeEClass, MUST_HAPPEN_AT_AN_INFINITE_TIME__MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAtAnInfiniteTimeEClass, MUST_HAPPEN_AT_AN_INFINITE_TIME__SECOND_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAtAnInfiniteTimeEClass, MUST_HAPPEN_AT_AN_INFINITE_TIME__MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAtAnInfiniteTimeEClass, MUST_HAPPEN_AT_AN_INFINITE_TIME__MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAtAnInfiniteTimeEClass, MUST_HAPPEN_AT_AN_INFINITE_TIME__THIRD_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAtAnInfiniteTimeEClass, MUST_HAPPEN_AT_AN_INFINITE_TIME__MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAtAnInfiniteTimeEClass, MUST_HAPPEN_AT_AN_INFINITE_TIME__MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAtAnInfiniteTimeEClass, MUST_HAPPEN_AT_AN_INFINITE_TIME__PHYSICAL_DEPENDENCY_FUNCTION);

		mustHappenAsLongAsTheActivityIsExecutingEClass = createEClass(MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING);
		createEAttribute(mustHappenAsLongAsTheActivityIsExecutingEClass, MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__NAME);
		createEAttribute(mustHappenAsLongAsTheActivityIsExecutingEClass, MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__TYPE);
		createEReference(mustHappenAsLongAsTheActivityIsExecutingEClass, MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__TARGET);
		createEAttribute(mustHappenAsLongAsTheActivityIsExecutingEClass, MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__DO_HAPPEN);
		createEAttribute(mustHappenAsLongAsTheActivityIsExecutingEClass, MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__FIRST_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAsLongAsTheActivityIsExecutingEClass, MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAsLongAsTheActivityIsExecutingEClass, MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAsLongAsTheActivityIsExecutingEClass, MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__SECOND_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAsLongAsTheActivityIsExecutingEClass, MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAsLongAsTheActivityIsExecutingEClass, MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAsLongAsTheActivityIsExecutingEClass, MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__THIRD_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAsLongAsTheActivityIsExecutingEClass, MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAsLongAsTheActivityIsExecutingEClass, MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAsLongAsTheActivityIsExecutingEClass, MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__PHYSICAL_DEPENDENCY_FUNCTION);

		mustHappenAtTheStartOfTheActivityEClass = createEClass(MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY);
		createEAttribute(mustHappenAtTheStartOfTheActivityEClass, MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__NAME);
		createEAttribute(mustHappenAtTheStartOfTheActivityEClass, MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__TYPE);
		createEReference(mustHappenAtTheStartOfTheActivityEClass, MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__TARGET);
		createEAttribute(mustHappenAtTheStartOfTheActivityEClass, MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__DO_HAPPEN);
		createEAttribute(mustHappenAtTheStartOfTheActivityEClass, MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__FIRST_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAtTheStartOfTheActivityEClass, MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAtTheStartOfTheActivityEClass, MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAtTheStartOfTheActivityEClass, MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__SECOND_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAtTheStartOfTheActivityEClass, MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAtTheStartOfTheActivityEClass, MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAtTheStartOfTheActivityEClass, MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__THIRD_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAtTheStartOfTheActivityEClass, MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAtTheStartOfTheActivityEClass, MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAtTheStartOfTheActivityEClass, MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__PHYSICAL_DEPENDENCY_FUNCTION);

		mustHappenAtTheEndOfTheActivityEClass = createEClass(MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY);
		createEAttribute(mustHappenAtTheEndOfTheActivityEClass, MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__NAME);
		createEAttribute(mustHappenAtTheEndOfTheActivityEClass, MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__TYPE);
		createEReference(mustHappenAtTheEndOfTheActivityEClass, MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__TARGET);
		createEAttribute(mustHappenAtTheEndOfTheActivityEClass, MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__DO_HAPPEN);
		createEAttribute(mustHappenAtTheEndOfTheActivityEClass, MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__FIRST_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAtTheEndOfTheActivityEClass, MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAtTheEndOfTheActivityEClass, MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAtTheEndOfTheActivityEClass, MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__SECOND_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAtTheEndOfTheActivityEClass, MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAtTheEndOfTheActivityEClass, MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAtTheEndOfTheActivityEClass, MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__THIRD_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAtTheEndOfTheActivityEClass, MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAtTheEndOfTheActivityEClass, MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAtTheEndOfTheActivityEClass, MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__PHYSICAL_DEPENDENCY_FUNCTION);

		mustHappenAtABoundTimeEClass = createEClass(MUST_HAPPEN_AT_ABOUND_TIME);
		createEAttribute(mustHappenAtABoundTimeEClass, MUST_HAPPEN_AT_ABOUND_TIME__NAME);
		createEAttribute(mustHappenAtABoundTimeEClass, MUST_HAPPEN_AT_ABOUND_TIME__TYPE);
		createEReference(mustHappenAtABoundTimeEClass, MUST_HAPPEN_AT_ABOUND_TIME__TARGET);
		createEAttribute(mustHappenAtABoundTimeEClass, MUST_HAPPEN_AT_ABOUND_TIME__DO_HAPPEN);
		createEAttribute(mustHappenAtABoundTimeEClass, MUST_HAPPEN_AT_ABOUND_TIME__MIN_BOUND_TIME);
		createEAttribute(mustHappenAtABoundTimeEClass, MUST_HAPPEN_AT_ABOUND_TIME__MAX_BOUND_TIME);
		createEAttribute(mustHappenAtABoundTimeEClass, MUST_HAPPEN_AT_ABOUND_TIME__FIRST_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAtABoundTimeEClass, MUST_HAPPEN_AT_ABOUND_TIME__MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAtABoundTimeEClass, MUST_HAPPEN_AT_ABOUND_TIME__MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAtABoundTimeEClass, MUST_HAPPEN_AT_ABOUND_TIME__SECOND_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAtABoundTimeEClass, MUST_HAPPEN_AT_ABOUND_TIME__MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAtABoundTimeEClass, MUST_HAPPEN_AT_ABOUND_TIME__MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAtABoundTimeEClass, MUST_HAPPEN_AT_ABOUND_TIME__THIRD_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAtABoundTimeEClass, MUST_HAPPEN_AT_ABOUND_TIME__MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAtABoundTimeEClass, MUST_HAPPEN_AT_ABOUND_TIME__MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY);
		createEAttribute(mustHappenAtABoundTimeEClass, MUST_HAPPEN_AT_ABOUND_TIME__PHYSICAL_DEPENDENCY_FUNCTION);

		mustNeverHappenAtAnInfiniteTimeEClass = createEClass(MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME);
		createEAttribute(mustNeverHappenAtAnInfiniteTimeEClass, MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__NAME);
		createEAttribute(mustNeverHappenAtAnInfiniteTimeEClass, MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__TYPE);
		createEReference(mustNeverHappenAtAnInfiniteTimeEClass, MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__TARGET);
		createEAttribute(mustNeverHappenAtAnInfiniteTimeEClass, MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__DO_HAPPEN);
		createEAttribute(mustNeverHappenAtAnInfiniteTimeEClass, MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__FIRST_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAtAnInfiniteTimeEClass, MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAtAnInfiniteTimeEClass, MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAtAnInfiniteTimeEClass, MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__SECOND_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAtAnInfiniteTimeEClass, MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAtAnInfiniteTimeEClass, MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAtAnInfiniteTimeEClass, MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__THIRD_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAtAnInfiniteTimeEClass, MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAtAnInfiniteTimeEClass, MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAtAnInfiniteTimeEClass, MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__PHYSICAL_DEPENDENCY_FUNCTION);

		mustNeverHappenAsLongAsTheActivityIsExecutingEClass = createEClass(MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING);
		createEAttribute(mustNeverHappenAsLongAsTheActivityIsExecutingEClass, MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__NAME);
		createEAttribute(mustNeverHappenAsLongAsTheActivityIsExecutingEClass, MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__TYPE);
		createEReference(mustNeverHappenAsLongAsTheActivityIsExecutingEClass, MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__TARGET);
		createEAttribute(mustNeverHappenAsLongAsTheActivityIsExecutingEClass, MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__DO_HAPPEN);
		createEAttribute(mustNeverHappenAsLongAsTheActivityIsExecutingEClass, MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__FIRST_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAsLongAsTheActivityIsExecutingEClass, MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAsLongAsTheActivityIsExecutingEClass, MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAsLongAsTheActivityIsExecutingEClass, MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__SECOND_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAsLongAsTheActivityIsExecutingEClass, MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAsLongAsTheActivityIsExecutingEClass, MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAsLongAsTheActivityIsExecutingEClass, MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__THIRD_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAsLongAsTheActivityIsExecutingEClass, MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAsLongAsTheActivityIsExecutingEClass, MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAsLongAsTheActivityIsExecutingEClass, MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__PHYSICAL_DEPENDENCY_FUNCTION);

		mustNeverHappenAtTheStartOfTheActivityEClass = createEClass(MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY);
		createEAttribute(mustNeverHappenAtTheStartOfTheActivityEClass, MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__NAME);
		createEAttribute(mustNeverHappenAtTheStartOfTheActivityEClass, MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__TYPE);
		createEReference(mustNeverHappenAtTheStartOfTheActivityEClass, MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__TARGET);
		createEAttribute(mustNeverHappenAtTheStartOfTheActivityEClass, MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__DO_HAPPEN);
		createEAttribute(mustNeverHappenAtTheStartOfTheActivityEClass, MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__FIRST_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAtTheStartOfTheActivityEClass, MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAtTheStartOfTheActivityEClass, MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAtTheStartOfTheActivityEClass, MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__SECOND_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAtTheStartOfTheActivityEClass, MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAtTheStartOfTheActivityEClass, MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAtTheStartOfTheActivityEClass, MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__THIRD_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAtTheStartOfTheActivityEClass, MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAtTheStartOfTheActivityEClass, MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAtTheStartOfTheActivityEClass, MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__PHYSICAL_DEPENDENCY_FUNCTION);

		mustNeverHappenAtTheEndOfTheActivityEClass = createEClass(MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY);
		createEAttribute(mustNeverHappenAtTheEndOfTheActivityEClass, MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__NAME);
		createEAttribute(mustNeverHappenAtTheEndOfTheActivityEClass, MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__TYPE);
		createEReference(mustNeverHappenAtTheEndOfTheActivityEClass, MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__TARGET);
		createEAttribute(mustNeverHappenAtTheEndOfTheActivityEClass, MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__DO_HAPPEN);
		createEAttribute(mustNeverHappenAtTheEndOfTheActivityEClass, MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__FIRST_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAtTheEndOfTheActivityEClass, MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAtTheEndOfTheActivityEClass, MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAtTheEndOfTheActivityEClass, MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__SECOND_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAtTheEndOfTheActivityEClass, MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAtTheEndOfTheActivityEClass, MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAtTheEndOfTheActivityEClass, MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__THIRD_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAtTheEndOfTheActivityEClass, MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAtTheEndOfTheActivityEClass, MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAtTheEndOfTheActivityEClass, MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__PHYSICAL_DEPENDENCY_FUNCTION);

		mustNeverHappenAtABoundTimeEClass = createEClass(MUST_NEVER_HAPPEN_AT_ABOUND_TIME);
		createEAttribute(mustNeverHappenAtABoundTimeEClass, MUST_NEVER_HAPPEN_AT_ABOUND_TIME__NAME);
		createEAttribute(mustNeverHappenAtABoundTimeEClass, MUST_NEVER_HAPPEN_AT_ABOUND_TIME__TYPE);
		createEReference(mustNeverHappenAtABoundTimeEClass, MUST_NEVER_HAPPEN_AT_ABOUND_TIME__TARGET);
		createEAttribute(mustNeverHappenAtABoundTimeEClass, MUST_NEVER_HAPPEN_AT_ABOUND_TIME__DO_HAPPEN);
		createEAttribute(mustNeverHappenAtABoundTimeEClass, MUST_NEVER_HAPPEN_AT_ABOUND_TIME__MIN_BOUND_TIME);
		createEAttribute(mustNeverHappenAtABoundTimeEClass, MUST_NEVER_HAPPEN_AT_ABOUND_TIME__MAX_BOUND_TIME);
		createEAttribute(mustNeverHappenAtABoundTimeEClass, MUST_NEVER_HAPPEN_AT_ABOUND_TIME__FIRST_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAtABoundTimeEClass, MUST_NEVER_HAPPEN_AT_ABOUND_TIME__MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAtABoundTimeEClass, MUST_NEVER_HAPPEN_AT_ABOUND_TIME__MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAtABoundTimeEClass, MUST_NEVER_HAPPEN_AT_ABOUND_TIME__SECOND_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAtABoundTimeEClass, MUST_NEVER_HAPPEN_AT_ABOUND_TIME__MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAtABoundTimeEClass, MUST_NEVER_HAPPEN_AT_ABOUND_TIME__MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAtABoundTimeEClass, MUST_NEVER_HAPPEN_AT_ABOUND_TIME__THIRD_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAtABoundTimeEClass, MUST_NEVER_HAPPEN_AT_ABOUND_TIME__MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAtABoundTimeEClass, MUST_NEVER_HAPPEN_AT_ABOUND_TIME__MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY);
		createEAttribute(mustNeverHappenAtABoundTimeEClass, MUST_NEVER_HAPPEN_AT_ABOUND_TIME__PHYSICAL_DEPENDENCY_FUNCTION);

		periodicEventEClass = createEClass(PERIODIC_EVENT);
		createEAttribute(periodicEventEClass, PERIODIC_EVENT__NAME);
		createEReference(periodicEventEClass, PERIODIC_EVENT__TARGET);
		createEAttribute(periodicEventEClass, PERIODIC_EVENT__VALUE);
		createEAttribute(periodicEventEClass, PERIODIC_EVENT__TYPE);

		sporadicEventEClass = createEClass(SPORADIC_EVENT);
		createEAttribute(sporadicEventEClass, SPORADIC_EVENT__NAME);
		createEReference(sporadicEventEClass, SPORADIC_EVENT__TARGET);
		createEAttribute(sporadicEventEClass, SPORADIC_EVENT__MIN_TIME);
		createEAttribute(sporadicEventEClass, SPORADIC_EVENT__MAX_TIME);
		createEAttribute(sporadicEventEClass, SPORADIC_EVENT__TYPE);

		periodicActivityEClass = createEClass(PERIODIC_ACTIVITY);
		createEAttribute(periodicActivityEClass, PERIODIC_ACTIVITY__NAME);
		createEReference(periodicActivityEClass, PERIODIC_ACTIVITY__TARGET);
		createEAttribute(periodicActivityEClass, PERIODIC_ACTIVITY__TIME_VALUE);
		createEAttribute(periodicActivityEClass, PERIODIC_ACTIVITY__TIMER_TYPE);

		sporadicActivityEClass = createEClass(SPORADIC_ACTIVITY);
		createEAttribute(sporadicActivityEClass, SPORADIC_ACTIVITY__NAME);
		createEReference(sporadicActivityEClass, SPORADIC_ACTIVITY__TARGET);
		createEAttribute(sporadicActivityEClass, SPORADIC_ACTIVITY__MAX_TIME);
		createEAttribute(sporadicActivityEClass, SPORADIC_ACTIVITY__MIN_TIME);
		createEAttribute(sporadicActivityEClass, SPORADIC_ACTIVITY__TIMER_TYPE);

		durationEClass = createEClass(DURATION);
		createEAttribute(durationEClass, DURATION__NAME);
		createEReference(durationEClass, DURATION__TARGET);
		createEAttribute(durationEClass, DURATION__MIN_TIME_DURATION);
		createEAttribute(durationEClass, DURATION__MAX_TIME_DURATION);
		createEAttribute(durationEClass, DURATION__TIME_TYPE);

		physicalEntityTaskEClass = createEClass(PHYSICAL_ENTITY_TASK);
		createEAttribute(physicalEntityTaskEClass, PHYSICAL_ENTITY_TASK__CPS_PERFORMER_REF);
		createEAttribute(physicalEntityTaskEClass, PHYSICAL_ENTITY_TASK__CPS_DEVICE_ROLE_PARAMETERS);
		createEAttribute(physicalEntityTaskEClass, PHYSICAL_ENTITY_TASK__TYPE);
		createEAttribute(physicalEntityTaskEClass, PHYSICAL_ENTITY_TASK__IS_MOVABLE);

		myEventDefinitionEClass = createEClass(MY_EVENT_DEFINITION);
		createEAttribute(myEventDefinitionEClass, MY_EVENT_DEFINITION__VALUE);

		realWorldPropertiesEClass = createEClass(REAL_WORLD_PROPERTIES);
		createEAttribute(realWorldPropertiesEClass, REAL_WORLD_PROPERTIES__PARAMETERS);

		// Create enums
		physical_PropertiesEEnum = createEEnum(PHYSICAL_PROPERTIES);
		typeDeviceEEnum = createEEnum(TYPE_DEVICE);
		timer_TypeEEnum = createEEnum(TIMER_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Bpmn2Package theBpmn2Package = (Bpmn2Package)EPackage.Registry.INSTANCE.getEPackage(Bpmn2Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		temporalDependencyEClass.getESuperTypes().add(theBpmn2Package.getFlowElement());
		msaEClass.getESuperTypes().add(theBpmn2Package.getEventDefinition());
		moaEClass.getESuperTypes().add(theBpmn2Package.getEventDefinition());
		mfaEClass.getESuperTypes().add(theBpmn2Package.getEventDefinition());
		msiEClass.getESuperTypes().add(theBpmn2Package.getEventDefinition());
		moiEClass.getESuperTypes().add(theBpmn2Package.getEventDefinition());
		mfiEClass.getESuperTypes().add(theBpmn2Package.getEventDefinition());
		mustHappenAtAnInfiniteTimeEClass.getESuperTypes().add(theBpmn2Package.getEventDefinition());
		mustHappenAsLongAsTheActivityIsExecutingEClass.getESuperTypes().add(theBpmn2Package.getEventDefinition());
		mustHappenAtTheStartOfTheActivityEClass.getESuperTypes().add(theBpmn2Package.getEventDefinition());
		mustHappenAtTheEndOfTheActivityEClass.getESuperTypes().add(theBpmn2Package.getEventDefinition());
		mustHappenAtABoundTimeEClass.getESuperTypes().add(theBpmn2Package.getEventDefinition());
		mustNeverHappenAtAnInfiniteTimeEClass.getESuperTypes().add(theBpmn2Package.getEventDefinition());
		mustNeverHappenAsLongAsTheActivityIsExecutingEClass.getESuperTypes().add(theBpmn2Package.getEventDefinition());
		mustNeverHappenAtTheStartOfTheActivityEClass.getESuperTypes().add(theBpmn2Package.getEventDefinition());
		mustNeverHappenAtTheEndOfTheActivityEClass.getESuperTypes().add(theBpmn2Package.getEventDefinition());
		mustNeverHappenAtABoundTimeEClass.getESuperTypes().add(theBpmn2Package.getEventDefinition());
		periodicEventEClass.getESuperTypes().add(theBpmn2Package.getEventDefinition());
		sporadicEventEClass.getESuperTypes().add(theBpmn2Package.getEventDefinition());
		periodicActivityEClass.getESuperTypes().add(theBpmn2Package.getEventDefinition());
		sporadicActivityEClass.getESuperTypes().add(theBpmn2Package.getEventDefinition());
		durationEClass.getESuperTypes().add(theBpmn2Package.getEventDefinition());
		physicalEntityTaskEClass.getESuperTypes().add(theBpmn2Package.getTask());
		myEventDefinitionEClass.getESuperTypes().add(theBpmn2Package.getEventDefinition());
		realWorldPropertiesEClass.getESuperTypes().add(theBpmn2Package.getTextAnnotation());

		// Initialize classes, features, and operations; add parameters
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentRoot_TaskConfig(), this.getTaskConfig(), null, "taskConfig", null, 0, -2, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TemporalDependency(), this.getTemporalDependency(), null, "temporalDependency", null, 0, -2, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MetaData(), this.getMetaData(), null, "metaData", null, 0, -2, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Msa(), this.getMSA(), null, "msa", null, 0, -2, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Moa(), this.getMOA(), null, "moa", null, 0, -2, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Mfa(), this.getMFA(), null, "mfa", null, 0, -2, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Msi(), this.getMSI(), null, "msi", null, 0, -2, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Moi(), this.getMOI(), null, "moi", null, 0, -2, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Mfi(), this.getMFI(), null, "mfi", null, 0, -2, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Musthappenataninfinitetime(), this.getMustHappenAtAnInfiniteTime(), null, "musthappenataninfinitetime", null, 0, -2, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Musthappenaslongastheactivityisexecuting(), this.getMustHappenAsLongAsTheActivityIsExecuting(), null, "musthappenaslongastheactivityisexecuting", null, 0, -2, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Musthappenatthestartoftheactivity(), this.getMustHappenAtTheStartOfTheActivity(), null, "musthappenatthestartoftheactivity", null, 0, -2, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Musthappenattheendoftheactivity(), this.getMustHappenAtTheEndOfTheActivity(), null, "musthappenattheendoftheactivity", null, 0, -2, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Musthappenataboundtime(), this.getMustHappenAtABoundTime(), null, "musthappenataboundtime", null, 0, -2, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Mustneverhappenataninfinitetime(), this.getMustNeverHappenAtAnInfiniteTime(), null, "mustneverhappenataninfinitetime", null, 0, -2, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Mustneverhappenatthestartoftheactivity(), this.getMustNeverHappenAtTheStartOfTheActivity(), null, "mustneverhappenatthestartoftheactivity", null, 0, -2, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Mustneverhappenattheendoftheactivity(), this.getMustNeverHappenAtTheEndOfTheActivity(), null, "mustneverhappenattheendoftheactivity", null, 0, -2, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Mustneverhappenataboundtime(), this.getMustNeverHappenAtABoundTime(), null, "mustneverhappenataboundtime", null, 0, -2, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Myeventdefinition(), this.getMyEventDefinition(), null, "myeventdefinition", null, 0, -2, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Duration(), this.getDuration(), null, "duration", null, 0, -2, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Periodicevent(), this.getPeriodicEvent(), null, "periodicevent", null, 0, -2, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Sporadicevent(), this.getSporadicEvent(), null, "sporadicevent", null, 0, -2, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Physicalentitytask(), this.getPhysicalEntityTask(), null, "physicalentitytask", null, 0, -2, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Realworldproperties(), this.getRealWorldProperties(), null, "realworldproperties", null, 0, -2, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metaDataEClass, MetaData.class, "MetaData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetaData_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, MetaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetaData_Name(), ecorePackage.getEString(), "name", null, 0, 1, MetaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetaData_Value(), ecorePackage.getEString(), "value", null, 0, 1, MetaData.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(taskConfigEClass, TaskConfig.class, "TaskConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskConfig_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, TaskConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temporalDependencyEClass, TemporalDependency.class, "TemporalDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemporalDependency_SourceRef(), theBpmn2Package.getBoundaryEvent(), null, "sourceRef", null, 0, 1, TemporalDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemporalDependency_TargetRef(), theBpmn2Package.getBoundaryEvent(), null, "targetRef", null, 0, 1, TemporalDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemporalDependency_Max_value(), ecorePackage.getEString(), "Max_value", null, 0, 1, TemporalDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemporalDependency_Min_value(), ecorePackage.getEString(), "Min_value", null, 0, 1, TemporalDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(msaEClass, bpmnforcpsextension.MyModel.MSA.class, "MSA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMSA_Name(), ecorePackage.getEString(), "name", null, 0, 1, bpmnforcpsextension.MyModel.MSA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMSA_Type(), ecorePackage.getEString(), "Type", "MSA", 0, 1, bpmnforcpsextension.MyModel.MSA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSA_Target(), theBpmn2Package.getActivity(), null, "Target", null, 0, 1, bpmnforcpsextension.MyModel.MSA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMSA_Value(), ecorePackage.getEString(), "value", null, 0, 1, bpmnforcpsextension.MyModel.MSA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moaEClass, bpmnforcpsextension.MyModel.MOA.class, "MOA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMOA_Name(), ecorePackage.getEString(), "name", null, 0, 1, bpmnforcpsextension.MyModel.MOA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMOA_Type(), ecorePackage.getEString(), "Type", "MOA", 0, 1, bpmnforcpsextension.MyModel.MOA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMOA_Target(), theBpmn2Package.getActivity(), null, "Target", null, 0, 1, bpmnforcpsextension.MyModel.MOA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMOA_Value(), ecorePackage.getEString(), "value", null, 0, 1, bpmnforcpsextension.MyModel.MOA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mfaEClass, bpmnforcpsextension.MyModel.MFA.class, "MFA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMFA_Name(), ecorePackage.getEString(), "name", null, 0, 1, bpmnforcpsextension.MyModel.MFA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMFA_Type(), ecorePackage.getEString(), "Type", "MFA", 0, 1, bpmnforcpsextension.MyModel.MFA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMFA_Target(), theBpmn2Package.getActivity(), null, "Target", null, 0, 1, bpmnforcpsextension.MyModel.MFA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMFA_Value(), ecorePackage.getEString(), "value", null, 0, 1, bpmnforcpsextension.MyModel.MFA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(msiEClass, bpmnforcpsextension.MyModel.MSI.class, "MSI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMSI_Name(), ecorePackage.getEString(), "name", null, 0, 1, bpmnforcpsextension.MyModel.MSI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMSI_Type(), ecorePackage.getEString(), "Type", "MSI", 0, 1, bpmnforcpsextension.MyModel.MSI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSI_Target(), theBpmn2Package.getActivity(), null, "Target", null, 0, 1, bpmnforcpsextension.MyModel.MSI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMSI_Min_Value(), ecorePackage.getEString(), "Min_Value", null, 0, 1, bpmnforcpsextension.MyModel.MSI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMSI_Max_Value(), ecorePackage.getEString(), "Max_Value", null, 0, 1, bpmnforcpsextension.MyModel.MSI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moiEClass, bpmnforcpsextension.MyModel.MOI.class, "MOI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMOI_Name(), ecorePackage.getEString(), "name", null, 0, 1, bpmnforcpsextension.MyModel.MOI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMOI_Type(), ecorePackage.getEString(), "Type", "MOI", 0, 1, bpmnforcpsextension.MyModel.MOI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMOI_Target(), theBpmn2Package.getActivity(), null, "Target", null, 0, 1, bpmnforcpsextension.MyModel.MOI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMOI_Min_Value(), ecorePackage.getEString(), "Min_Value", null, 0, 1, bpmnforcpsextension.MyModel.MOI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMOI_Max_Value(), ecorePackage.getEString(), "Max_Value", null, 0, 1, bpmnforcpsextension.MyModel.MOI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mfiEClass, bpmnforcpsextension.MyModel.MFI.class, "MFI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMFI_Name(), ecorePackage.getEString(), "name", null, 0, 1, bpmnforcpsextension.MyModel.MFI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMFI_Type(), ecorePackage.getEString(), "Type", "MFI", 0, 1, bpmnforcpsextension.MyModel.MFI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMFI_Target(), theBpmn2Package.getActivity(), null, "Target", null, 0, 1, bpmnforcpsextension.MyModel.MFI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMFI_Min_Value(), ecorePackage.getEString(), "Min_Value", null, 0, 1, bpmnforcpsextension.MyModel.MFI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMFI_Max_Value(), ecorePackage.getEString(), "Max_Value", null, 0, 1, bpmnforcpsextension.MyModel.MFI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mustHappenAtAnInfiniteTimeEClass, MustHappenAtAnInfiniteTime.class, "MustHappenAtAnInfiniteTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMustHappenAtAnInfiniteTime_Name(), ecorePackage.getEString(), "name", null, 0, 1, MustHappenAtAnInfiniteTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtAnInfiniteTime_Type(), ecorePackage.getEString(), "Type", "MHIT", 0, 1, MustHappenAtAnInfiniteTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMustHappenAtAnInfiniteTime_Target(), theBpmn2Package.getActivity(), null, "Target", null, 0, 1, MustHappenAtAnInfiniteTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtAnInfiniteTime_Do_Happen(), ecorePackage.getEString(), "Do_Happen", "True", 0, 1, MustHappenAtAnInfiniteTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtAnInfiniteTime_First_physical_property(), ecorePackage.getEString(), "First_physical_property", "Please do not insert a  gap ", 0, 1, MustHappenAtAnInfiniteTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtAnInfiniteTime_Min_value_of_the_first_physical_property(), ecorePackage.getEString(), "Min_value_of_the_first_physical_property", "0", 0, 1, MustHappenAtAnInfiniteTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtAnInfiniteTime_Max_value_of_the_first_physical_property(), ecorePackage.getEString(), "Max_value_of_the_first_physical_property", "0", 0, 1, MustHappenAtAnInfiniteTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtAnInfiniteTime_Second_physical_property(), ecorePackage.getEString(), "Second_physical_property", "Please do not insert a  gap ", 0, 1, MustHappenAtAnInfiniteTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtAnInfiniteTime_Min_value_of_the_second_physical_property(), ecorePackage.getEString(), "Min_value_of_the_second_physical_property", "0", 0, 1, MustHappenAtAnInfiniteTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtAnInfiniteTime_Max_value_of_the_second_physical_property(), ecorePackage.getEString(), "Max_value_of_the_second_physical_property", "0", 0, 1, MustHappenAtAnInfiniteTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtAnInfiniteTime_Third_physical_property(), ecorePackage.getEString(), "Third_physical_property", "Please do not insert a  gap ", 0, 1, MustHappenAtAnInfiniteTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtAnInfiniteTime_Min_value_of_the_third_physical_property(), ecorePackage.getEString(), "Min_value_of_the_third_physical_property", "0", 0, 1, MustHappenAtAnInfiniteTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtAnInfiniteTime_Max_value_of_the_third_physical_property(), ecorePackage.getEString(), "Max_value_of_the_third_physical_property", "0", 0, 1, MustHappenAtAnInfiniteTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtAnInfiniteTime_Physical_dependency_function(), ecorePackage.getEString(), "Physical_dependency_function", "Other variables that can be used : Duration, StartTime, FinishTime. Please enter a C function!", 0, 1, MustHappenAtAnInfiniteTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mustHappenAsLongAsTheActivityIsExecutingEClass, MustHappenAsLongAsTheActivityIsExecuting.class, "MustHappenAsLongAsTheActivityIsExecuting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMustHappenAsLongAsTheActivityIsExecuting_Name(), ecorePackage.getEString(), "name", null, 0, 1, MustHappenAsLongAsTheActivityIsExecuting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAsLongAsTheActivityIsExecuting_Type(), ecorePackage.getEString(), "Type", "MHDA", 0, 1, MustHappenAsLongAsTheActivityIsExecuting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMustHappenAsLongAsTheActivityIsExecuting_Target(), theBpmn2Package.getActivity(), null, "Target", null, 0, 1, MustHappenAsLongAsTheActivityIsExecuting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAsLongAsTheActivityIsExecuting_Do_Happen(), ecorePackage.getEString(), "Do_Happen", "True", 0, 1, MustHappenAsLongAsTheActivityIsExecuting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAsLongAsTheActivityIsExecuting_First_physical_property(), ecorePackage.getEString(), "First_physical_property", "Please do not insert a  gap ", 0, 1, MustHappenAsLongAsTheActivityIsExecuting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAsLongAsTheActivityIsExecuting_Min_value_of_the_first_physical_property(), ecorePackage.getEString(), "Min_value_of_the_first_physical_property", "0", 0, 1, MustHappenAsLongAsTheActivityIsExecuting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAsLongAsTheActivityIsExecuting_Max_value_of_the_first_physical_property(), ecorePackage.getEString(), "Max_value_of_the_first_physical_property", "0", 0, 1, MustHappenAsLongAsTheActivityIsExecuting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAsLongAsTheActivityIsExecuting_Second_physical_property(), ecorePackage.getEString(), "Second_physical_property", "Please do not insert a  gap ", 0, 1, MustHappenAsLongAsTheActivityIsExecuting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAsLongAsTheActivityIsExecuting_Min_value_of_the_second_physical_property(), ecorePackage.getEString(), "Min_value_of_the_second_physical_property", "0", 0, 1, MustHappenAsLongAsTheActivityIsExecuting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAsLongAsTheActivityIsExecuting_Max_value_of_the_second_physical_property(), ecorePackage.getEString(), "Max_value_of_the_second_physical_property", "0", 0, 1, MustHappenAsLongAsTheActivityIsExecuting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAsLongAsTheActivityIsExecuting_Third_physical_property(), ecorePackage.getEString(), "Third_physical_property", "Please do not insert a  gap ", 0, 1, MustHappenAsLongAsTheActivityIsExecuting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAsLongAsTheActivityIsExecuting_Min_value_of_the_third_physical_property(), ecorePackage.getEString(), "Min_value_of_the_third_physical_property", "0", 0, 1, MustHappenAsLongAsTheActivityIsExecuting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAsLongAsTheActivityIsExecuting_Max_value_of_the_third_physical_property(), ecorePackage.getEString(), "Max_value_of_the_third_physical_property", "0", 0, 1, MustHappenAsLongAsTheActivityIsExecuting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAsLongAsTheActivityIsExecuting_Physical_dependency_function(), ecorePackage.getEString(), "Physical_dependency_function", "Other variables that can be used : Duration, StartTime, FinishTime. Please enter a C function!", 0, 1, MustHappenAsLongAsTheActivityIsExecuting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mustHappenAtTheStartOfTheActivityEClass, MustHappenAtTheStartOfTheActivity.class, "MustHappenAtTheStartOfTheActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMustHappenAtTheStartOfTheActivity_Name(), ecorePackage.getEString(), "name", null, 0, 1, MustHappenAtTheStartOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtTheStartOfTheActivity_Type(), ecorePackage.getEString(), "Type", "MHST", 0, 1, MustHappenAtTheStartOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMustHappenAtTheStartOfTheActivity_Target(), theBpmn2Package.getActivity(), null, "Target", null, 0, 1, MustHappenAtTheStartOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtTheStartOfTheActivity_Do_Happen(), ecorePackage.getEString(), "Do_Happen", "True", 0, 1, MustHappenAtTheStartOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtTheStartOfTheActivity_First_physical_property(), ecorePackage.getEString(), "First_physical_property", "Please do not insert a  gap ", 0, 1, MustHappenAtTheStartOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtTheStartOfTheActivity_Min_value_of_the_first_physical_property(), ecorePackage.getEString(), "Min_value_of_the_first_physical_property", "0", 0, 1, MustHappenAtTheStartOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtTheStartOfTheActivity_Max_value_of_the_first_physical_property(), ecorePackage.getEString(), "Max_value_of_the_first_physical_property", "0", 0, 1, MustHappenAtTheStartOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtTheStartOfTheActivity_Second_physical_property(), ecorePackage.getEString(), "Second_physical_property", "Please do not insert a  gap ", 0, 1, MustHappenAtTheStartOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtTheStartOfTheActivity_Min_value_of_the_second_physical_property(), ecorePackage.getEString(), "Min_value_of_the_second_physical_property", "0", 0, 1, MustHappenAtTheStartOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtTheStartOfTheActivity_Max_value_of_the_second_physical_property(), ecorePackage.getEString(), "Max_value_of_the_second_physical_property", "0", 0, 1, MustHappenAtTheStartOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtTheStartOfTheActivity_Third_physical_property(), ecorePackage.getEString(), "Third_physical_property", "Please do not insert a  gap ", 0, 1, MustHappenAtTheStartOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtTheStartOfTheActivity_Min_value_of_the_third_physical_property(), ecorePackage.getEString(), "Min_value_of_the_third_physical_property", "0", 0, 1, MustHappenAtTheStartOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtTheStartOfTheActivity_Max_value_of_the_third_physical_property(), ecorePackage.getEString(), "Max_value_of_the_third_physical_property", "0", 0, 1, MustHappenAtTheStartOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtTheStartOfTheActivity_Physical_dependency_function(), ecorePackage.getEString(), "Physical_dependency_function", "Other variables that can be used : Duration, StartTime, FinishTime. Please enter a C function!", 0, 1, MustHappenAtTheStartOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mustHappenAtTheEndOfTheActivityEClass, MustHappenAtTheEndOfTheActivity.class, "MustHappenAtTheEndOfTheActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMustHappenAtTheEndOfTheActivity_Name(), ecorePackage.getEString(), "name", null, 0, 1, MustHappenAtTheEndOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtTheEndOfTheActivity_Type(), ecorePackage.getEString(), "Type", "MHFT", 0, 1, MustHappenAtTheEndOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMustHappenAtTheEndOfTheActivity_Target(), theBpmn2Package.getActivity(), null, "Target", null, 0, 1, MustHappenAtTheEndOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtTheEndOfTheActivity_Do_Happen(), ecorePackage.getEString(), "Do_Happen", "True", 0, 1, MustHappenAtTheEndOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtTheEndOfTheActivity_First_physical_property(), ecorePackage.getEString(), "First_physical_property", "Please do not insert a  gap ", 0, 1, MustHappenAtTheEndOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtTheEndOfTheActivity_Min_value_of_the_first_physical_property(), ecorePackage.getEString(), "Min_value_of_the_first_physical_property", "0", 0, 1, MustHappenAtTheEndOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtTheEndOfTheActivity_Max_value_of_the_first_physical_property(), ecorePackage.getEString(), "Max_value_of_the_first_physical_property", "0", 0, 1, MustHappenAtTheEndOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtTheEndOfTheActivity_Second_physical_property(), ecorePackage.getEString(), "Second_physical_property", "Please do not insert a  gap ", 0, 1, MustHappenAtTheEndOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtTheEndOfTheActivity_Min_value_of_the_second_physical_property(), ecorePackage.getEString(), "Min_value_of_the_second_physical_property", "0", 0, 1, MustHappenAtTheEndOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtTheEndOfTheActivity_Max_value_of_the_second_physical_property(), ecorePackage.getEString(), "Max_value_of_the_second_physical_property", "0", 0, 1, MustHappenAtTheEndOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtTheEndOfTheActivity_Third_physical_property(), ecorePackage.getEString(), "Third_physical_property", "Please do not insert a  gap ", 0, 1, MustHappenAtTheEndOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtTheEndOfTheActivity_Min_value_of_the_third_physical_property(), ecorePackage.getEString(), "Min_value_of_the_third_physical_property", "0", 0, 1, MustHappenAtTheEndOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtTheEndOfTheActivity_Max_value_of_the_third_physical_property(), ecorePackage.getEString(), "Max_value_of_the_third_physical_property", "0", 0, 1, MustHappenAtTheEndOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtTheEndOfTheActivity_Physical_dependency_function(), ecorePackage.getEString(), "Physical_dependency_function", "Other variables that can be used : Duration, StartTime, FinishTime. Please enter a C function!", 0, 1, MustHappenAtTheEndOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mustHappenAtABoundTimeEClass, MustHappenAtABoundTime.class, "MustHappenAtABoundTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMustHappenAtABoundTime_Name(), ecorePackage.getEString(), "name", null, 0, 1, MustHappenAtABoundTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtABoundTime_Type(), ecorePackage.getEString(), "Type", "MHBT", 0, 1, MustHappenAtABoundTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMustHappenAtABoundTime_Target(), theBpmn2Package.getActivity(), null, "Target", null, 0, 1, MustHappenAtABoundTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtABoundTime_Do_Happen(), ecorePackage.getEString(), "Do_Happen", "True", 0, 1, MustHappenAtABoundTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtABoundTime_Min_bound_time(), ecorePackage.getEString(), "Min_bound_time", "0", 0, 1, MustHappenAtABoundTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtABoundTime_Max_bound_time(), ecorePackage.getEString(), "Max_bound_time", "0", 0, 1, MustHappenAtABoundTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtABoundTime_First_physical_property(), ecorePackage.getEString(), "First_physical_property", "Please do not insert a  gap ", 0, 1, MustHappenAtABoundTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtABoundTime_Min_value_of_the_first_physical_property(), ecorePackage.getEString(), "Min_value_of_the_first_physical_property", "0", 0, 1, MustHappenAtABoundTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtABoundTime_Max_value_of_the_first_physical_property(), ecorePackage.getEString(), "Max_value_of_the_first_physical_property", "0", 0, 1, MustHappenAtABoundTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtABoundTime_Second_physical_property(), ecorePackage.getEString(), "Second_physical_property", "Please do not insert a  gap ", 0, 1, MustHappenAtABoundTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtABoundTime_Min_value_of_the_second_physical_property(), ecorePackage.getEString(), "Min_value_of_the_second_physical_property", "0", 0, 1, MustHappenAtABoundTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtABoundTime_Max_value_of_the_second_physical_property(), ecorePackage.getEString(), "Max_value_of_the_second_physical_property", "0", 0, 1, MustHappenAtABoundTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtABoundTime_Third_physical_property(), ecorePackage.getEString(), "Third_physical_property", "Please do not insert a  gap ", 0, 1, MustHappenAtABoundTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtABoundTime_Min_value_of_the_third_physical_property(), ecorePackage.getEString(), "Min_value_of_the_third_physical_property", "0", 0, 1, MustHappenAtABoundTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtABoundTime_Max_value_of_the_third_physical_property(), ecorePackage.getEString(), "Max_value_of_the_third_physical_property", "0", 0, 1, MustHappenAtABoundTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustHappenAtABoundTime_Physical_dependency_function(), ecorePackage.getEString(), "Physical_dependency_function", "Other variables that can be used : Duration, StartTime, FinishTime. Please enter a C function!", 0, 1, MustHappenAtABoundTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mustNeverHappenAtAnInfiniteTimeEClass, MustNeverHappenAtAnInfiniteTime.class, "MustNeverHappenAtAnInfiniteTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMustNeverHappenAtAnInfiniteTime_Name(), ecorePackage.getEString(), "name", null, 0, 1, MustNeverHappenAtAnInfiniteTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtAnInfiniteTime_Type(), ecorePackage.getEString(), "Type", "MHIT", 0, 1, MustNeverHappenAtAnInfiniteTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMustNeverHappenAtAnInfiniteTime_Target(), theBpmn2Package.getActivity(), null, "Target", null, 0, 1, MustNeverHappenAtAnInfiniteTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtAnInfiniteTime_Do_Happen(), ecorePackage.getEString(), "Do_Happen", "false", 0, 1, MustNeverHappenAtAnInfiniteTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtAnInfiniteTime_First_physical_property(), ecorePackage.getEString(), "First_physical_property", "Please do not insert a  gap ", 0, 1, MustNeverHappenAtAnInfiniteTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtAnInfiniteTime_Min_value_of_the_first_physical_property(), ecorePackage.getEString(), "Min_value_of_the_first_physical_property", "0", 0, 1, MustNeverHappenAtAnInfiniteTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtAnInfiniteTime_Max_value_of_the_first_physical_property(), ecorePackage.getEString(), "Max_value_of_the_first_physical_property", "0", 0, 1, MustNeverHappenAtAnInfiniteTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtAnInfiniteTime_Second_physical_property(), ecorePackage.getEString(), "Second_physical_property", "Please do not insert a  gap ", 0, 1, MustNeverHappenAtAnInfiniteTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtAnInfiniteTime_Min_value_of_the_second_physical_property(), ecorePackage.getEString(), "Min_value_of_the_second_physical_property", "0", 0, 1, MustNeverHappenAtAnInfiniteTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtAnInfiniteTime_Max_value_of_the_second_physical_property(), ecorePackage.getEString(), "Max_value_of_the_second_physical_property", "0", 0, 1, MustNeverHappenAtAnInfiniteTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtAnInfiniteTime_Third_physical_property(), ecorePackage.getEString(), "Third_physical_property", "Please do not insert a  gap ", 0, 1, MustNeverHappenAtAnInfiniteTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtAnInfiniteTime_Min_value_of_the_third_physical_property(), ecorePackage.getEString(), "Min_value_of_the_third_physical_property", "0", 0, 1, MustNeverHappenAtAnInfiniteTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtAnInfiniteTime_Max_value_of_the_third_physical_property(), ecorePackage.getEString(), "Max_value_of_the_third_physical_property", "0", 0, 1, MustNeverHappenAtAnInfiniteTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtAnInfiniteTime_Physical_dependency_function(), ecorePackage.getEString(), "Physical_dependency_function", "Other variables that can be used : Duration, StartTime, FinishTime. Please enter a C function!", 0, 1, MustNeverHappenAtAnInfiniteTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mustNeverHappenAsLongAsTheActivityIsExecutingEClass, MustNeverHappenAsLongAsTheActivityIsExecuting.class, "MustNeverHappenAsLongAsTheActivityIsExecuting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMustNeverHappenAsLongAsTheActivityIsExecuting_Name(), ecorePackage.getEString(), "name", null, 0, 1, MustNeverHappenAsLongAsTheActivityIsExecuting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAsLongAsTheActivityIsExecuting_Type(), ecorePackage.getEString(), "Type", "MNHALATAIE", 0, 1, MustNeverHappenAsLongAsTheActivityIsExecuting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMustNeverHappenAsLongAsTheActivityIsExecuting_Target(), theBpmn2Package.getActivity(), null, "Target", null, 0, 1, MustNeverHappenAsLongAsTheActivityIsExecuting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAsLongAsTheActivityIsExecuting_Do_Happen(), ecorePackage.getEString(), "Do_Happen", "false", 0, 1, MustNeverHappenAsLongAsTheActivityIsExecuting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAsLongAsTheActivityIsExecuting_First_physical_property(), ecorePackage.getEString(), "First_physical_property", "Please do not insert a  gap ", 0, 1, MustNeverHappenAsLongAsTheActivityIsExecuting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAsLongAsTheActivityIsExecuting_Min_value_of_the_first_physical_property(), ecorePackage.getEString(), "Min_value_of_the_first_physical_property", "0", 0, 1, MustNeverHappenAsLongAsTheActivityIsExecuting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAsLongAsTheActivityIsExecuting_Max_value_of_the_first_physical_property(), ecorePackage.getEString(), "Max_value_of_the_first_physical_property", "0", 0, 1, MustNeverHappenAsLongAsTheActivityIsExecuting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAsLongAsTheActivityIsExecuting_Second_physical_property(), ecorePackage.getEString(), "Second_physical_property", "Please do not insert a  gap ", 0, 1, MustNeverHappenAsLongAsTheActivityIsExecuting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAsLongAsTheActivityIsExecuting_Min_value_of_the_second_physical_property(), ecorePackage.getEString(), "Min_value_of_the_second_physical_property", "0", 0, 1, MustNeverHappenAsLongAsTheActivityIsExecuting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAsLongAsTheActivityIsExecuting_Max_value_of_the_second_physical_property(), ecorePackage.getEString(), "Max_value_of_the_second_physical_property", "0", 0, 1, MustNeverHappenAsLongAsTheActivityIsExecuting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAsLongAsTheActivityIsExecuting_Third_physical_property(), ecorePackage.getEString(), "Third_physical_property", "Please do not insert a  gap ", 0, 1, MustNeverHappenAsLongAsTheActivityIsExecuting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAsLongAsTheActivityIsExecuting_Min_value_of_the_third_physical_property(), ecorePackage.getEString(), "Min_value_of_the_third_physical_property", "0", 0, 1, MustNeverHappenAsLongAsTheActivityIsExecuting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAsLongAsTheActivityIsExecuting_Max_value_of_the_third_physical_property(), ecorePackage.getEString(), "Max_value_of_the_third_physical_property", "0", 0, 1, MustNeverHappenAsLongAsTheActivityIsExecuting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAsLongAsTheActivityIsExecuting_Physical_dependency_function(), ecorePackage.getEString(), "Physical_dependency_function", "Other variables that can be used : Duration, StartTime, FinishTime. Please enter a C function!", 0, 1, MustNeverHappenAsLongAsTheActivityIsExecuting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mustNeverHappenAtTheStartOfTheActivityEClass, MustNeverHappenAtTheStartOfTheActivity.class, "MustNeverHappenAtTheStartOfTheActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMustNeverHappenAtTheStartOfTheActivity_Name(), ecorePackage.getEString(), "name", null, 0, 1, MustNeverHappenAtTheStartOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtTheStartOfTheActivity_Type(), ecorePackage.getEString(), "Type", "MNHST", 0, 1, MustNeverHappenAtTheStartOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMustNeverHappenAtTheStartOfTheActivity_Target(), theBpmn2Package.getActivity(), null, "Target", null, 0, 1, MustNeverHappenAtTheStartOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtTheStartOfTheActivity_Do_Happen(), ecorePackage.getEString(), "Do_Happen", "False", 0, 1, MustNeverHappenAtTheStartOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtTheStartOfTheActivity_First_physical_property(), ecorePackage.getEString(), "First_physical_property", "Please do not insert a  gap ", 0, 1, MustNeverHappenAtTheStartOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtTheStartOfTheActivity_Min_value_of_the_first_physical_property(), ecorePackage.getEString(), "Min_value_of_the_first_physical_property", "0", 0, 1, MustNeverHappenAtTheStartOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtTheStartOfTheActivity_Max_value_of_the_first_physical_property(), ecorePackage.getEString(), "Max_value_of_the_first_physical_property", "0", 0, 1, MustNeverHappenAtTheStartOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtTheStartOfTheActivity_Second_physical_property(), ecorePackage.getEString(), "Second_physical_property", "Please do not insert a  gap ", 0, 1, MustNeverHappenAtTheStartOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtTheStartOfTheActivity_Min_value_of_the_second_physical_property(), ecorePackage.getEString(), "Min_value_of_the_second_physical_property", "0", 0, 1, MustNeverHappenAtTheStartOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtTheStartOfTheActivity_Max_value_of_the_second_physical_property(), ecorePackage.getEString(), "Max_value_of_the_second_physical_property", "0", 0, 1, MustNeverHappenAtTheStartOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtTheStartOfTheActivity_Third_physical_property(), ecorePackage.getEString(), "Third_physical_property", "Please do not insert a  gap ", 0, 1, MustNeverHappenAtTheStartOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtTheStartOfTheActivity_Min_value_of_the_third_physical_property(), ecorePackage.getEString(), "Min_value_of_the_third_physical_property", "0", 0, 1, MustNeverHappenAtTheStartOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtTheStartOfTheActivity_Max_value_of_the_third_physical_property(), ecorePackage.getEString(), "Max_value_of_the_third_physical_property", "0", 0, 1, MustNeverHappenAtTheStartOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtTheStartOfTheActivity_Physical_dependency_function(), ecorePackage.getEString(), "Physical_dependency_function", "Other variables that can be used : Duration, StartTime, FinishTime. Please enter a C function!", 0, 1, MustNeverHappenAtTheStartOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mustNeverHappenAtTheEndOfTheActivityEClass, MustNeverHappenAtTheEndOfTheActivity.class, "MustNeverHappenAtTheEndOfTheActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMustNeverHappenAtTheEndOfTheActivity_Name(), ecorePackage.getEString(), "name", null, 0, 1, MustNeverHappenAtTheEndOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtTheEndOfTheActivity_Type(), ecorePackage.getEString(), "Type", "MNHFT", 0, 1, MustNeverHappenAtTheEndOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMustNeverHappenAtTheEndOfTheActivity_Target(), theBpmn2Package.getActivity(), null, "Target", null, 0, 1, MustNeverHappenAtTheEndOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtTheEndOfTheActivity_Do_Happen(), ecorePackage.getEString(), "Do_Happen", "False", 0, 1, MustNeverHappenAtTheEndOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtTheEndOfTheActivity_First_physical_property(), ecorePackage.getEString(), "First_physical_property", "Please do not insert a  gap ", 0, 1, MustNeverHappenAtTheEndOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtTheEndOfTheActivity_Min_value_of_the_first_physical_property(), ecorePackage.getEString(), "Min_value_of_the_first_physical_property", "0", 0, 1, MustNeverHappenAtTheEndOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtTheEndOfTheActivity_Max_value_of_the_first_physical_property(), ecorePackage.getEString(), "Max_value_of_the_first_physical_property", "0", 0, 1, MustNeverHappenAtTheEndOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtTheEndOfTheActivity_Second_physical_property(), ecorePackage.getEString(), "Second_physical_property", "Please do not insert a  gap ", 0, 1, MustNeverHappenAtTheEndOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtTheEndOfTheActivity_Min_value_of_the_second_physical_property(), ecorePackage.getEString(), "Min_value_of_the_second_physical_property", "0", 0, 1, MustNeverHappenAtTheEndOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtTheEndOfTheActivity_Max_value_of_the_second_physical_property(), ecorePackage.getEString(), "Max_value_of_the_second_physical_property", "0", 0, 1, MustNeverHappenAtTheEndOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtTheEndOfTheActivity_Third_physical_property(), ecorePackage.getEString(), "Third_physical_property", "Please do not insert a  gap ", 0, 1, MustNeverHappenAtTheEndOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtTheEndOfTheActivity_Min_value_of_the_third_physical_property(), ecorePackage.getEString(), "Min_value_of_the_third_physical_property", "0", 0, 1, MustNeverHappenAtTheEndOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtTheEndOfTheActivity_Max_value_of_the_third_physical_property(), ecorePackage.getEString(), "Max_value_of_the_third_physical_property", "0", 0, 1, MustNeverHappenAtTheEndOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtTheEndOfTheActivity_Physical_dependency_function(), ecorePackage.getEString(), "Physical_dependency_function", "Other variables that can be used : Duration, StartTime, FinishTime. Please enter a C function!", 0, 1, MustNeverHappenAtTheEndOfTheActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mustNeverHappenAtABoundTimeEClass, MustNeverHappenAtABoundTime.class, "MustNeverHappenAtABoundTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMustNeverHappenAtABoundTime_Name(), ecorePackage.getEString(), "name", null, 0, 1, MustNeverHappenAtABoundTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtABoundTime_Type(), ecorePackage.getEString(), "Type", "MNHBT", 0, 1, MustNeverHappenAtABoundTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMustNeverHappenAtABoundTime_Target(), theBpmn2Package.getActivity(), null, "Target", null, 0, 1, MustNeverHappenAtABoundTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtABoundTime_Do_Happen(), ecorePackage.getEString(), "Do_Happen", "False", 0, 1, MustNeverHappenAtABoundTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtABoundTime_Min_bound_time(), ecorePackage.getEString(), "Min_bound_time", "0", 0, 1, MustNeverHappenAtABoundTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtABoundTime_Max_bound_time(), ecorePackage.getEString(), "Max_bound_time", "0", 0, 1, MustNeverHappenAtABoundTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtABoundTime_First_physical_property(), ecorePackage.getEString(), "First_physical_property", "Please do not insert a  gap ", 0, 1, MustNeverHappenAtABoundTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtABoundTime_Min_value_of_the_first_physical_property(), ecorePackage.getEString(), "Min_value_of_the_first_physical_property", "0", 0, 1, MustNeverHappenAtABoundTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtABoundTime_Max_value_of_the_first_physical_property(), ecorePackage.getEString(), "Max_value_of_the_first_physical_property", "0", 0, 1, MustNeverHappenAtABoundTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtABoundTime_Second_physical_property(), ecorePackage.getEString(), "Second_physical_property", "Please do not insert a  gap ", 0, 1, MustNeverHappenAtABoundTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtABoundTime_Min_value_of_the_second_physical_property(), ecorePackage.getEString(), "Min_value_of_the_second_physical_property", "0", 0, 1, MustNeverHappenAtABoundTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtABoundTime_Max_value_of_the_second_physical_property(), ecorePackage.getEString(), "Max_value_of_the_second_physical_property", "0", 0, 1, MustNeverHappenAtABoundTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtABoundTime_Third_physical_property(), ecorePackage.getEString(), "Third_physical_property", "Please do not insert a  gap ", 0, 1, MustNeverHappenAtABoundTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtABoundTime_Min_value_of_the_third_physical_property(), ecorePackage.getEString(), "Min_value_of_the_third_physical_property", "0", 0, 1, MustNeverHappenAtABoundTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtABoundTime_Max_value_of_the_third_physical_property(), ecorePackage.getEString(), "Max_value_of_the_third_physical_property", "0", 0, 1, MustNeverHappenAtABoundTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMustNeverHappenAtABoundTime_Physical_dependency_function(), ecorePackage.getEString(), "Physical_dependency_function", "Other variables that can be used : Duration, StartTime, FinishTime. Please enter a C function!", 0, 1, MustNeverHappenAtABoundTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(periodicEventEClass, PeriodicEvent.class, "PeriodicEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPeriodicEvent_Name(), ecorePackage.getEString(), "name", null, 0, 1, PeriodicEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeriodicEvent_Target(), theBpmn2Package.getTask(), null, "target", null, 0, 1, PeriodicEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPeriodicEvent_Value(), ecorePackage.getEInt(), "value", null, 0, 1, PeriodicEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPeriodicEvent_Type(), ecorePackage.getEString(), "type", "EventPeriodic", 0, 1, PeriodicEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sporadicEventEClass, SporadicEvent.class, "SporadicEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSporadicEvent_Name(), ecorePackage.getEString(), "name", null, 0, 1, SporadicEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSporadicEvent_Target(), theBpmn2Package.getTask(), null, "target", null, 0, 1, SporadicEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSporadicEvent_Min_time(), ecorePackage.getEInt(), "Min_time", null, 0, 1, SporadicEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSporadicEvent_Max_time(), ecorePackage.getEInt(), "Max_time", null, 0, 1, SporadicEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSporadicEvent_Type(), ecorePackage.getEString(), "type", "EventSporadic", 0, 1, SporadicEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(periodicActivityEClass, PeriodicActivity.class, "PeriodicActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPeriodicActivity_Name(), ecorePackage.getEString(), "name", null, 0, 1, PeriodicActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeriodicActivity_Target(), theBpmn2Package.getStandardLoopCharacteristics(), null, "target", null, 0, 1, PeriodicActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPeriodicActivity_Time_value(), ecorePackage.getEInt(), "Time_value", null, 0, 1, PeriodicActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPeriodicActivity_Timer_Type(), this.getTimer_Type(), "Timer_Type", null, 0, 1, PeriodicActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sporadicActivityEClass, SporadicActivity.class, "SporadicActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSporadicActivity_Name(), ecorePackage.getEString(), "name", null, 0, 1, SporadicActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSporadicActivity_Target(), theBpmn2Package.getStandardLoopCharacteristics(), null, "target", null, 0, 1, SporadicActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSporadicActivity_Max_time(), ecorePackage.getEInt(), "Max_time", null, 0, 1, SporadicActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSporadicActivity_Min_time(), ecorePackage.getEInt(), "Min_time", null, 0, 1, SporadicActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSporadicActivity_Timer_Type(), this.getTimer_Type(), "Timer_Type", null, 0, 1, SporadicActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(durationEClass, Duration.class, "Duration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDuration_Name(), ecorePackage.getEString(), "name", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDuration_Target(), theBpmn2Package.getActivity(), null, "target", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDuration_Min_time_duration(), ecorePackage.getEString(), "Min_time_duration", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDuration_Max_time_duration(), ecorePackage.getEString(), "Max_time_duration", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDuration_Time_Type(), this.getTimer_Type(), "Time_Type", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalEntityTaskEClass, PhysicalEntityTask.class, "PhysicalEntityTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhysicalEntityTask_CPSPerformerRef(), ecorePackage.getEString(), "CPSPerformerRef", null, 0, 1, PhysicalEntityTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalEntityTask_CPSDeviceRoleParameters(), ecorePackage.getEString(), "CPSDeviceRoleParameters", null, 0, 1, PhysicalEntityTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalEntityTask_Type(), this.getTypeDevice(), "Type", null, 0, 1, PhysicalEntityTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalEntityTask_IsMovable(), ecorePackage.getEBoolean(), "isMovable", null, 0, 1, PhysicalEntityTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(myEventDefinitionEClass, MyEventDefinition.class, "MyEventDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMyEventDefinition_Value(), ecorePackage.getEString(), "value", null, 0, 1, MyEventDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realWorldPropertiesEClass, RealWorldProperties.class, "RealWorldProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRealWorldProperties_Parameters(), ecorePackage.getEString(), "Parameters", null, 0, 1, RealWorldProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(physical_PropertiesEEnum, Physical_Properties.class, "Physical_Properties");
		addEEnumLiteral(physical_PropertiesEEnum, Physical_Properties.VITESSE);
		addEEnumLiteral(physical_PropertiesEEnum, Physical_Properties.FORCE);

		initEEnum(typeDeviceEEnum, TypeDevice.class, "TypeDevice");
		addEEnumLiteral(typeDeviceEEnum, TypeDevice.SENSOR_ROLE);
		addEEnumLiteral(typeDeviceEEnum, TypeDevice.ACTUATOR_ROLE);

		initEEnum(timer_TypeEEnum, Timer_Type.class, "Timer_Type");
		addEEnumLiteral(timer_TypeEEnum, Timer_Type.TIME_DATA);
		addEEnumLiteral(timer_TypeEEnum, Timer_Type.INTERVAL);
		addEEnumLiteral(timer_TypeEEnum, Timer_Type.DURATION);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_TaskConfig(), 
		   source, 
		   new String[] {
			 "name", "taskConfig",
			 "kind", "element",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_TemporalDependency(), 
		   source, 
		   new String[] {
			 "name", "temporalDependency",
			 "kind", "element",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_MetaData(), 
		   source, 
		   new String[] {
			 "name", "metaData",
			 "kind", "element",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Msa(), 
		   source, 
		   new String[] {
			 "name", "msa",
			 "kind", "element",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Moa(), 
		   source, 
		   new String[] {
			 "name", "moa",
			 "kind", "element",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Mfa(), 
		   source, 
		   new String[] {
			 "name", "mfa",
			 "kind", "element",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Msi(), 
		   source, 
		   new String[] {
			 "name", "msi",
			 "kind", "element",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Moi(), 
		   source, 
		   new String[] {
			 "name", "moi",
			 "kind", "element",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Mfi(), 
		   source, 
		   new String[] {
			 "name", "mfi",
			 "kind", "element",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Musthappenataninfinitetime(), 
		   source, 
		   new String[] {
			 "name", "musthappenataninfinitetime",
			 "kind", "element",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Musthappenaslongastheactivityisexecuting(), 
		   source, 
		   new String[] {
			 "name", "musthappenaslongastheactivityisexecuting",
			 "kind", "element",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Musthappenatthestartoftheactivity(), 
		   source, 
		   new String[] {
			 "name", "musthappenatthestartoftheactivity",
			 "kind", "element",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Musthappenattheendoftheactivity(), 
		   source, 
		   new String[] {
			 "name", "musthappenattheendoftheactivity",
			 "kind", "element",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Musthappenataboundtime(), 
		   source, 
		   new String[] {
			 "name", "musthappenataboundtime",
			 "kind", "element",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Mustneverhappenataninfinitetime(), 
		   source, 
		   new String[] {
			 "name", "mustneverhappenataninfinitetime",
			 "kind", "element",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Mustneverhappenatthestartoftheactivity(), 
		   source, 
		   new String[] {
			 "name", "mustneverhappenatthestartoftheactivity",
			 "kind", "element",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Mustneverhappenattheendoftheactivity(), 
		   source, 
		   new String[] {
			 "name", "mustneverhappenattheendoftheactivity",
			 "kind", "element",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Mustneverhappenataboundtime(), 
		   source, 
		   new String[] {
			 "name", "mustneverhappenataboundtime",
			 "kind", "element",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Myeventdefinition(), 
		   source, 
		   new String[] {
			 "name", "myeventdefinition",
			 "kind", "element",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Duration(), 
		   source, 
		   new String[] {
			 "name", "duration",
			 "kind", "element",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Periodicevent(), 
		   source, 
		   new String[] {
			 "name", "periodicevent",
			 "kind", "element",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Sporadicevent(), 
		   source, 
		   new String[] {
			 "name", "sporadicevent",
			 "kind", "element",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Physicalentitytask(), 
		   source, 
		   new String[] {
			 "name", "physicalentitytask",
			 "kind", "element",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Realworldproperties(), 
		   source, 
		   new String[] {
			 "name", "realworldproperties",
			 "kind", "element",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (metaDataEClass, 
		   source, 
		   new String[] {
			 "kind", "mixed",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMetaData_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTaskConfig_Parameters(), 
		   source, 
		   new String[] {
			 "name", "parameter",
			 "kind", "element",
			 "namespace", "##targetNamespace"
		   });
	}

} //MyModelPackageImpl
