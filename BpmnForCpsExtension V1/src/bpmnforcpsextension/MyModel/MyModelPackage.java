/**
 */
package bpmnforcpsextension.MyModel;

import org.eclipse.bpmn2.Bpmn2Package;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see bpmnforcpsextension.MyModel.MyModelFactory
 * @model kind="package"
 * @generated
 */
public interface MyModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MyModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.BpmnForCpsExtension";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MyModelPackage eINSTANCE = bpmnforcpsextension.MyModel.impl.MyModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link bpmnforcpsextension.MyModel.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnforcpsextension.MyModel.impl.DocumentRootImpl
	 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Task Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TASK_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Temporal Dependency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEMPORAL_DEPENDENCY = 1;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__META_DATA = 2;

	/**
	 * The feature id for the '<em><b>Msa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MSA = 3;

	/**
	 * The feature id for the '<em><b>Moa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MOA = 4;

	/**
	 * The feature id for the '<em><b>Mfa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MFA = 5;

	/**
	 * The feature id for the '<em><b>Msi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MSI = 6;

	/**
	 * The feature id for the '<em><b>Moi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MOI = 7;

	/**
	 * The feature id for the '<em><b>Mfi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MFI = 8;

	/**
	 * The feature id for the '<em><b>Musthappenataninfinitetime</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MUSTHAPPENATANINFINITETIME = 9;

	/**
	 * The feature id for the '<em><b>Musthappenaslongastheactivityisexecuting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MUSTHAPPENASLONGASTHEACTIVITYISEXECUTING = 10;

	/**
	 * The feature id for the '<em><b>Musthappenatthestartoftheactivity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MUSTHAPPENATTHESTARTOFTHEACTIVITY = 11;

	/**
	 * The feature id for the '<em><b>Musthappenattheendoftheactivity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MUSTHAPPENATTHEENDOFTHEACTIVITY = 12;

	/**
	 * The feature id for the '<em><b>Musthappenataboundtime</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MUSTHAPPENATABOUNDTIME = 13;

	/**
	 * The feature id for the '<em><b>Mustneverhappenataninfinitetime</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MUSTNEVERHAPPENATANINFINITETIME = 14;

	/**
	 * The feature id for the '<em><b>Mustneverhappenatthestartoftheactivity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MUSTNEVERHAPPENATTHESTARTOFTHEACTIVITY = 15;

	/**
	 * The feature id for the '<em><b>Mustneverhappenattheendoftheactivity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MUSTNEVERHAPPENATTHEENDOFTHEACTIVITY = 16;

	/**
	 * The feature id for the '<em><b>Mustneverhappenataboundtime</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MUSTNEVERHAPPENATABOUNDTIME = 17;

	/**
	 * The feature id for the '<em><b>Myeventdefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MYEVENTDEFINITION = 18;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DURATION = 19;

	/**
	 * The feature id for the '<em><b>Periodicevent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PERIODICEVENT = 20;

	/**
	 * The feature id for the '<em><b>Sporadicevent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPORADICEVENT = 21;

	/**
	 * The feature id for the '<em><b>Physicalentitytask</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PHYSICALENTITYTASK = 22;

	/**
	 * The feature id for the '<em><b>Realworldproperties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REALWORLDPROPERTIES = 23;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 24;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bpmnforcpsextension.MyModel.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnforcpsextension.MyModel.impl.ParameterImpl
	 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bpmnforcpsextension.MyModel.impl.MetaDataImpl <em>Meta Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnforcpsextension.MyModel.impl.MetaDataImpl
	 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getMetaData()
	 * @generated
	 */
	int META_DATA = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__NAME = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Meta Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Meta Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bpmnforcpsextension.MyModel.impl.TaskConfigImpl <em>Task Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnforcpsextension.MyModel.impl.TaskConfigImpl
	 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getTaskConfig()
	 * @generated
	 */
	int TASK_CONFIG = 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONFIG__PARAMETERS = 0;

	/**
	 * The number of structural features of the '<em>Task Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONFIG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Task Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bpmnforcpsextension.MyModel.impl.TemporalDependencyImpl <em>Temporal Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnforcpsextension.MyModel.impl.TemporalDependencyImpl
	 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getTemporalDependency()
	 * @generated
	 */
	int TEMPORAL_DEPENDENCY = 4;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEPENDENCY__EXTENSION_VALUES = Bpmn2Package.FLOW_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEPENDENCY__DOCUMENTATION = Bpmn2Package.FLOW_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEPENDENCY__EXTENSION_DEFINITIONS = Bpmn2Package.FLOW_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEPENDENCY__ID = Bpmn2Package.FLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEPENDENCY__ANY_ATTRIBUTE = Bpmn2Package.FLOW_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEPENDENCY__AUDITING = Bpmn2Package.FLOW_ELEMENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEPENDENCY__MONITORING = Bpmn2Package.FLOW_ELEMENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEPENDENCY__CATEGORY_VALUE_REF = Bpmn2Package.FLOW_ELEMENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEPENDENCY__NAME = Bpmn2Package.FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEPENDENCY__SOURCE_REF = Bpmn2Package.FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEPENDENCY__TARGET_REF = Bpmn2Package.FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEPENDENCY__MAX_VALUE = Bpmn2Package.FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Min value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEPENDENCY__MIN_VALUE = Bpmn2Package.FLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Temporal Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEPENDENCY_FEATURE_COUNT = Bpmn2Package.FLOW_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Temporal Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int TEMPORAL_DEPENDENCY_OPERATION_COUNT = Bpmn2Package.FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Temporal Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int TEMPORAL_DEPENDENCY_OPERATION_COUNT = Bpmn2Package.FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Temporal Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int TEMPORAL_DEPENDENCY_OPERATION_COUNT = Bpmn2Package.FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Temporal Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int TEMPORAL_DEPENDENCY_OPERATION_COUNT = Bpmn2Package.FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Temporal Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int TEMPORAL_DEPENDENCY_OPERATION_COUNT = Bpmn2Package.FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Temporal Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int TEMPORAL_DEPENDENCY_OPERATION_COUNT = Bpmn2Package.FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Temporal Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int TEMPORAL_DEPENDENCY_OPERATION_COUNT = Bpmn2Package.FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmnforcpsextension.MyModel.impl.MSAImpl <em>MSA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnforcpsextension.MyModel.impl.MSAImpl
	 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getMSA()
	 * @generated
	 */
	int MSA = 5;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSA__EXTENSION_VALUES = Bpmn2Package.EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSA__DOCUMENTATION = Bpmn2Package.EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSA__EXTENSION_DEFINITIONS = Bpmn2Package.EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSA__ID = Bpmn2Package.EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSA__ANY_ATTRIBUTE = Bpmn2Package.EVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSA__NAME = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSA__TYPE = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSA__TARGET = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSA__VALUE = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>MSA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSA_FEATURE_COUNT = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>MSA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MSA_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MSA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MSA_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MSA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MSA_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MSA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MSA_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MSA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MSA_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MSA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MSA_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MSA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MSA_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmnforcpsextension.MyModel.impl.MOAImpl <em>MOA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnforcpsextension.MyModel.impl.MOAImpl
	 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getMOA()
	 * @generated
	 */
	int MOA = 6;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOA__EXTENSION_VALUES = Bpmn2Package.EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOA__DOCUMENTATION = Bpmn2Package.EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOA__EXTENSION_DEFINITIONS = Bpmn2Package.EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOA__ID = Bpmn2Package.EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOA__ANY_ATTRIBUTE = Bpmn2Package.EVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOA__NAME = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOA__TYPE = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOA__TARGET = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOA__VALUE = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>MOA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOA_FEATURE_COUNT = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>MOA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MOA_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MOA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MOA_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MOA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MOA_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MOA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MOA_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MOA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MOA_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MOA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MOA_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MOA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int MOA_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmnforcpsextension.MyModel.impl.MFAImpl <em>MFA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnforcpsextension.MyModel.impl.MFAImpl
	 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getMFA()
	 * @generated
	 */
	int MFA = 7;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFA__EXTENSION_VALUES = Bpmn2Package.EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFA__DOCUMENTATION = Bpmn2Package.EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFA__EXTENSION_DEFINITIONS = Bpmn2Package.EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFA__ID = Bpmn2Package.EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFA__ANY_ATTRIBUTE = Bpmn2Package.EVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFA__NAME = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFA__TYPE = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFA__TARGET = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFA__VALUE = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>MFA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFA_FEATURE_COUNT = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>MFA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MFA_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MFA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MFA_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MFA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int MFA_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MFA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MFA_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MFA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MFA_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MFA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MFA_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MFA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MFA_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmnforcpsextension.MyModel.impl.MSIImpl <em>MSI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnforcpsextension.MyModel.impl.MSIImpl
	 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getMSI()
	 * @generated
	 */
	int MSI = 8;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSI__EXTENSION_VALUES = Bpmn2Package.EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSI__DOCUMENTATION = Bpmn2Package.EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSI__EXTENSION_DEFINITIONS = Bpmn2Package.EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSI__ID = Bpmn2Package.EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSI__ANY_ATTRIBUTE = Bpmn2Package.EVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSI__NAME = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSI__TYPE = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSI__TARGET = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSI__MIN_VALUE = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSI__MAX_VALUE = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>MSI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSI_FEATURE_COUNT = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>MSI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MSI_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MSI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int MSI_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MSI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MSI_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MSI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MSI_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MSI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MSI_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MSI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MSI_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MSI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int MSI_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmnforcpsextension.MyModel.impl.MOIImpl <em>MOI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnforcpsextension.MyModel.impl.MOIImpl
	 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getMOI()
	 * @generated
	 */
	int MOI = 9;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOI__EXTENSION_VALUES = Bpmn2Package.EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOI__DOCUMENTATION = Bpmn2Package.EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOI__EXTENSION_DEFINITIONS = Bpmn2Package.EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOI__ID = Bpmn2Package.EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOI__ANY_ATTRIBUTE = Bpmn2Package.EVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOI__NAME = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOI__TYPE = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOI__TARGET = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOI__MIN_VALUE = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOI__MAX_VALUE = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>MOI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOI_FEATURE_COUNT = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>MOI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MOI_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MOI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MOI_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MOI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int MOI_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MOI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int MOI_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MOI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MOI_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MOI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MOI_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MOI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int MOI_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmnforcpsextension.MyModel.impl.MFIImpl <em>MFI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnforcpsextension.MyModel.impl.MFIImpl
	 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getMFI()
	 * @generated
	 */
	int MFI = 10;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFI__EXTENSION_VALUES = Bpmn2Package.EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFI__DOCUMENTATION = Bpmn2Package.EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFI__EXTENSION_DEFINITIONS = Bpmn2Package.EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFI__ID = Bpmn2Package.EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFI__ANY_ATTRIBUTE = Bpmn2Package.EVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFI__NAME = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFI__TYPE = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFI__TARGET = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFI__MIN_VALUE = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFI__MAX_VALUE = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>MFI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFI_FEATURE_COUNT = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>MFI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MFI_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MFI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int MFI_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MFI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MFI_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MFI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int MFI_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MFI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MFI_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MFI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MFI_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MFI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MFI_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmnforcpsextension.MyModel.impl.MustHappenAtAnInfiniteTimeImpl <em>Must Happen At An Infinite Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnforcpsextension.MyModel.impl.MustHappenAtAnInfiniteTimeImpl
	 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getMustHappenAtAnInfiniteTime()
	 * @generated
	 */
	int MUST_HAPPEN_AT_AN_INFINITE_TIME = 11;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_AN_INFINITE_TIME__EXTENSION_VALUES = Bpmn2Package.EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_AN_INFINITE_TIME__DOCUMENTATION = Bpmn2Package.EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_AN_INFINITE_TIME__EXTENSION_DEFINITIONS = Bpmn2Package.EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_AN_INFINITE_TIME__ID = Bpmn2Package.EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_AN_INFINITE_TIME__ANY_ATTRIBUTE = Bpmn2Package.EVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_AN_INFINITE_TIME__NAME = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_AN_INFINITE_TIME__TYPE = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_AN_INFINITE_TIME__TARGET = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Do Happen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_AN_INFINITE_TIME__DO_HAPPEN = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>First physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_AN_INFINITE_TIME__FIRST_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min value of the first physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_AN_INFINITE_TIME__MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Max value of the first physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_AN_INFINITE_TIME__MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Second physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_AN_INFINITE_TIME__SECOND_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Min value of the second physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_AN_INFINITE_TIME__MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Max value of the second physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_AN_INFINITE_TIME__MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Third physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_AN_INFINITE_TIME__THIRD_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Min value of the third physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_AN_INFINITE_TIME__MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Max value of the third physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_AN_INFINITE_TIME__MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Physical dependency function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_AN_INFINITE_TIME__PHYSICAL_DEPENDENCY_FUNCTION = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Must Happen At An Infinite Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_AN_INFINITE_TIME_FEATURE_COUNT = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Must Happen At An Infinite Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_HAPPEN_AT_AN_INFINITE_TIME_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Happen At An Infinite Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int MUST_HAPPEN_AT_AN_INFINITE_TIME_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Happen At An Infinite Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_HAPPEN_AT_AN_INFINITE_TIME_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Happen At An Infinite Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_HAPPEN_AT_AN_INFINITE_TIME_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Happen At An Infinite Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_HAPPEN_AT_AN_INFINITE_TIME_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Happen At An Infinite Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_HAPPEN_AT_AN_INFINITE_TIME_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Happen At An Infinite Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_HAPPEN_AT_AN_INFINITE_TIME_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmnforcpsextension.MyModel.impl.MustHappenAsLongAsTheActivityIsExecutingImpl <em>Must Happen As Long As The Activity Is Executing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnforcpsextension.MyModel.impl.MustHappenAsLongAsTheActivityIsExecutingImpl
	 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getMustHappenAsLongAsTheActivityIsExecuting()
	 * @generated
	 */
	int MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING = 12;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__EXTENSION_VALUES = Bpmn2Package.EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__DOCUMENTATION = Bpmn2Package.EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__EXTENSION_DEFINITIONS = Bpmn2Package.EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__ID = Bpmn2Package.EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__ANY_ATTRIBUTE = Bpmn2Package.EVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__NAME = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__TYPE = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__TARGET = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Do Happen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__DO_HAPPEN = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>First physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__FIRST_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min value of the first physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Max value of the first physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Second physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__SECOND_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Min value of the second physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Max value of the second physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Third physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__THIRD_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Min value of the third physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Max value of the third physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Physical dependency function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__PHYSICAL_DEPENDENCY_FUNCTION = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Must Happen As Long As The Activity Is Executing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING_FEATURE_COUNT = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Must Happen As Long As The Activity Is Executing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Happen As Long As The Activity Is Executing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Happen As Long As The Activity Is Executing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Happen As Long As The Activity Is Executing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Happen As Long As The Activity Is Executing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Happen As Long As The Activity Is Executing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Happen As Long As The Activity Is Executing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmnforcpsextension.MyModel.impl.MustHappenAtTheStartOfTheActivityImpl <em>Must Happen At The Start Of The Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnforcpsextension.MyModel.impl.MustHappenAtTheStartOfTheActivityImpl
	 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getMustHappenAtTheStartOfTheActivity()
	 * @generated
	 */
	int MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY = 13;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__EXTENSION_VALUES = Bpmn2Package.EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__DOCUMENTATION = Bpmn2Package.EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__EXTENSION_DEFINITIONS = Bpmn2Package.EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__ID = Bpmn2Package.EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__ANY_ATTRIBUTE = Bpmn2Package.EVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__NAME = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__TYPE = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__TARGET = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Do Happen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__DO_HAPPEN = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>First physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__FIRST_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min value of the first physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Max value of the first physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Second physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__SECOND_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Min value of the second physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Max value of the second physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Third physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__THIRD_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Min value of the third physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Max value of the third physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Physical dependency function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__PHYSICAL_DEPENDENCY_FUNCTION = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Must Happen At The Start Of The Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY_FEATURE_COUNT = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Must Happen At The Start Of The Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Happen At The Start Of The Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Happen At The Start Of The Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Happen At The Start Of The Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Happen At The Start Of The Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Happen At The Start Of The Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Happen At The Start Of The Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmnforcpsextension.MyModel.impl.MustHappenAtTheEndOfTheActivityImpl <em>Must Happen At The End Of The Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnforcpsextension.MyModel.impl.MustHappenAtTheEndOfTheActivityImpl
	 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getMustHappenAtTheEndOfTheActivity()
	 * @generated
	 */
	int MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY = 14;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__EXTENSION_VALUES = Bpmn2Package.EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__DOCUMENTATION = Bpmn2Package.EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__EXTENSION_DEFINITIONS = Bpmn2Package.EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__ID = Bpmn2Package.EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__ANY_ATTRIBUTE = Bpmn2Package.EVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__NAME = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__TYPE = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__TARGET = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Do Happen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__DO_HAPPEN = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>First physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__FIRST_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min value of the first physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Max value of the first physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Second physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__SECOND_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Min value of the second physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Max value of the second physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Third physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__THIRD_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Min value of the third physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Max value of the third physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Physical dependency function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__PHYSICAL_DEPENDENCY_FUNCTION = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Must Happen At The End Of The Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY_FEATURE_COUNT = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Must Happen At The End Of The Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Happen At The End Of The Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Happen At The End Of The Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Happen At The End Of The Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Happen At The End Of The Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Happen At The End Of The Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Happen At The End Of The Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmnforcpsextension.MyModel.impl.MustHappenAtABoundTimeImpl <em>Must Happen At ABound Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnforcpsextension.MyModel.impl.MustHappenAtABoundTimeImpl
	 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getMustHappenAtABoundTime()
	 * @generated
	 */
	int MUST_HAPPEN_AT_ABOUND_TIME = 15;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_ABOUND_TIME__EXTENSION_VALUES = Bpmn2Package.EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_ABOUND_TIME__DOCUMENTATION = Bpmn2Package.EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_ABOUND_TIME__EXTENSION_DEFINITIONS = Bpmn2Package.EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_ABOUND_TIME__ID = Bpmn2Package.EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_ABOUND_TIME__ANY_ATTRIBUTE = Bpmn2Package.EVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_ABOUND_TIME__NAME = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_ABOUND_TIME__TYPE = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_ABOUND_TIME__TARGET = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Do Happen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_ABOUND_TIME__DO_HAPPEN = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Min bound time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_ABOUND_TIME__MIN_BOUND_TIME = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max bound time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_ABOUND_TIME__MAX_BOUND_TIME = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>First physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_ABOUND_TIME__FIRST_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Min value of the first physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_ABOUND_TIME__MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Max value of the first physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_ABOUND_TIME__MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Second physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_ABOUND_TIME__SECOND_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Min value of the second physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_ABOUND_TIME__MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Max value of the second physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_ABOUND_TIME__MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Third physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_ABOUND_TIME__THIRD_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Min value of the third physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_ABOUND_TIME__MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Max value of the third physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_ABOUND_TIME__MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Physical dependency function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_ABOUND_TIME__PHYSICAL_DEPENDENCY_FUNCTION = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Must Happen At ABound Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_HAPPEN_AT_ABOUND_TIME_FEATURE_COUNT = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>Must Happen At ABound Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_HAPPEN_AT_ABOUND_TIME_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Happen At ABound Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_HAPPEN_AT_ABOUND_TIME_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Happen At ABound Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int MUST_HAPPEN_AT_ABOUND_TIME_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Happen At ABound Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_HAPPEN_AT_ABOUND_TIME_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Happen At ABound Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_HAPPEN_AT_ABOUND_TIME_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Happen At ABound Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_HAPPEN_AT_ABOUND_TIME_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmnforcpsextension.MyModel.impl.MustNeverHappenAtAnInfiniteTimeImpl <em>Must Never Happen At An Infinite Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnforcpsextension.MyModel.impl.MustNeverHappenAtAnInfiniteTimeImpl
	 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getMustNeverHappenAtAnInfiniteTime()
	 * @generated
	 */
	int MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME = 16;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__EXTENSION_VALUES = Bpmn2Package.EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__DOCUMENTATION = Bpmn2Package.EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__EXTENSION_DEFINITIONS = Bpmn2Package.EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__ID = Bpmn2Package.EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__ANY_ATTRIBUTE = Bpmn2Package.EVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__NAME = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__TYPE = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__TARGET = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Do Happen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__DO_HAPPEN = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>First physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__FIRST_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min value of the first physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Max value of the first physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Second physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__SECOND_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Min value of the second physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Max value of the second physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Third physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__THIRD_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Min value of the third physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Max value of the third physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Physical dependency function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__PHYSICAL_DEPENDENCY_FUNCTION = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Must Never Happen At An Infinite Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME_FEATURE_COUNT = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Must Never Happen At An Infinite Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Never Happen At An Infinite Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Never Happen At An Infinite Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Never Happen At An Infinite Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Never Happen At An Infinite Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Never Happen At An Infinite Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Never Happen At An Infinite Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmnforcpsextension.MyModel.impl.MustNeverHappenAsLongAsTheActivityIsExecutingImpl <em>Must Never Happen As Long As The Activity Is Executing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnforcpsextension.MyModel.impl.MustNeverHappenAsLongAsTheActivityIsExecutingImpl
	 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getMustNeverHappenAsLongAsTheActivityIsExecuting()
	 * @generated
	 */
	int MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING = 17;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__EXTENSION_VALUES = Bpmn2Package.EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__DOCUMENTATION = Bpmn2Package.EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__EXTENSION_DEFINITIONS = Bpmn2Package.EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__ID = Bpmn2Package.EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__ANY_ATTRIBUTE = Bpmn2Package.EVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__NAME = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__TYPE = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__TARGET = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Do Happen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__DO_HAPPEN = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>First physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__FIRST_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min value of the first physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Max value of the first physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Second physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__SECOND_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Min value of the second physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Max value of the second physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Third physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__THIRD_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Min value of the third physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Max value of the third physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Physical dependency function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__PHYSICAL_DEPENDENCY_FUNCTION = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Must Never Happen As Long As The Activity Is Executing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING_FEATURE_COUNT = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Must Never Happen As Long As The Activity Is Executing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Never Happen As Long As The Activity Is Executing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Never Happen As Long As The Activity Is Executing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Never Happen As Long As The Activity Is Executing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Never Happen As Long As The Activity Is Executing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Never Happen As Long As The Activity Is Executing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Never Happen As Long As The Activity Is Executing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmnforcpsextension.MyModel.impl.MustNeverHappenAtTheStartOfTheActivityImpl <em>Must Never Happen At The Start Of The Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnforcpsextension.MyModel.impl.MustNeverHappenAtTheStartOfTheActivityImpl
	 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getMustNeverHappenAtTheStartOfTheActivity()
	 * @generated
	 */
	int MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY = 18;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__EXTENSION_VALUES = Bpmn2Package.EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__DOCUMENTATION = Bpmn2Package.EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__EXTENSION_DEFINITIONS = Bpmn2Package.EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__ID = Bpmn2Package.EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__ANY_ATTRIBUTE = Bpmn2Package.EVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__NAME = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__TYPE = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__TARGET = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Do Happen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__DO_HAPPEN = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>First physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__FIRST_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min value of the first physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Max value of the first physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Second physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__SECOND_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Min value of the second physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Max value of the second physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Third physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__THIRD_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Min value of the third physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Max value of the third physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Physical dependency function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__PHYSICAL_DEPENDENCY_FUNCTION = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Must Never Happen At The Start Of The Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY_FEATURE_COUNT = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Must Never Happen At The Start Of The Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Never Happen At The Start Of The Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Never Happen At The Start Of The Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Never Happen At The Start Of The Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Never Happen At The Start Of The Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Never Happen At The Start Of The Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Never Happen At The Start Of The Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmnforcpsextension.MyModel.impl.MustNeverHappenAtTheEndOfTheActivityImpl <em>Must Never Happen At The End Of The Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnforcpsextension.MyModel.impl.MustNeverHappenAtTheEndOfTheActivityImpl
	 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getMustNeverHappenAtTheEndOfTheActivity()
	 * @generated
	 */
	int MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY = 19;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__EXTENSION_VALUES = Bpmn2Package.EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__DOCUMENTATION = Bpmn2Package.EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__EXTENSION_DEFINITIONS = Bpmn2Package.EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__ID = Bpmn2Package.EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__ANY_ATTRIBUTE = Bpmn2Package.EVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__NAME = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__TYPE = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__TARGET = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Do Happen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__DO_HAPPEN = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>First physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__FIRST_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min value of the first physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Max value of the first physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Second physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__SECOND_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Min value of the second physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Max value of the second physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Third physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__THIRD_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Min value of the third physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Max value of the third physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Physical dependency function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__PHYSICAL_DEPENDENCY_FUNCTION = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Must Never Happen At The End Of The Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY_FEATURE_COUNT = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Must Never Happen At The End Of The Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Never Happen At The End Of The Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Never Happen At The End Of The Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Never Happen At The End Of The Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Never Happen At The End Of The Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Never Happen At The End Of The Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Never Happen At The End Of The Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmnforcpsextension.MyModel.impl.MustNeverHappenAtABoundTimeImpl <em>Must Never Happen At ABound Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnforcpsextension.MyModel.impl.MustNeverHappenAtABoundTimeImpl
	 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getMustNeverHappenAtABoundTime()
	 * @generated
	 */
	int MUST_NEVER_HAPPEN_AT_ABOUND_TIME = 20;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_ABOUND_TIME__EXTENSION_VALUES = Bpmn2Package.EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_ABOUND_TIME__DOCUMENTATION = Bpmn2Package.EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_ABOUND_TIME__EXTENSION_DEFINITIONS = Bpmn2Package.EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_ABOUND_TIME__ID = Bpmn2Package.EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_ABOUND_TIME__ANY_ATTRIBUTE = Bpmn2Package.EVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_ABOUND_TIME__NAME = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_ABOUND_TIME__TYPE = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_ABOUND_TIME__TARGET = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Do Happen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_ABOUND_TIME__DO_HAPPEN = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Min bound time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_ABOUND_TIME__MIN_BOUND_TIME = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max bound time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_ABOUND_TIME__MAX_BOUND_TIME = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>First physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_ABOUND_TIME__FIRST_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Min value of the first physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_ABOUND_TIME__MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Max value of the first physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_ABOUND_TIME__MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Second physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_ABOUND_TIME__SECOND_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Min value of the second physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_ABOUND_TIME__MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Max value of the second physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_ABOUND_TIME__MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Third physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_ABOUND_TIME__THIRD_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Min value of the third physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_ABOUND_TIME__MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Max value of the third physical property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_ABOUND_TIME__MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Physical dependency function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_ABOUND_TIME__PHYSICAL_DEPENDENCY_FUNCTION = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Must Never Happen At ABound Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_NEVER_HAPPEN_AT_ABOUND_TIME_FEATURE_COUNT = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>Must Never Happen At ABound Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_NEVER_HAPPEN_AT_ABOUND_TIME_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Never Happen At ABound Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int MUST_NEVER_HAPPEN_AT_ABOUND_TIME_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Never Happen At ABound Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_NEVER_HAPPEN_AT_ABOUND_TIME_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Never Happen At ABound Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int MUST_NEVER_HAPPEN_AT_ABOUND_TIME_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Never Happen At ABound Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_NEVER_HAPPEN_AT_ABOUND_TIME_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Never Happen At ABound Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_NEVER_HAPPEN_AT_ABOUND_TIME_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Must Never Happen At ABound Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MUST_NEVER_HAPPEN_AT_ABOUND_TIME_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmnforcpsextension.MyModel.impl.PeriodicEventImpl <em>Periodic Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnforcpsextension.MyModel.impl.PeriodicEventImpl
	 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getPeriodicEvent()
	 * @generated
	 */
	int PERIODIC_EVENT = 21;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EVENT__EXTENSION_VALUES = Bpmn2Package.EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EVENT__DOCUMENTATION = Bpmn2Package.EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EVENT__EXTENSION_DEFINITIONS = Bpmn2Package.EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EVENT__ID = Bpmn2Package.EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EVENT__ANY_ATTRIBUTE = Bpmn2Package.EVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EVENT__NAME = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EVENT__TARGET = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EVENT__VALUE = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EVENT__TYPE = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Periodic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EVENT_FEATURE_COUNT = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Periodic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int PERIODIC_EVENT_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Periodic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int PERIODIC_EVENT_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Periodic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int PERIODIC_EVENT_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Periodic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int PERIODIC_EVENT_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Periodic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int PERIODIC_EVENT_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Periodic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int PERIODIC_EVENT_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Periodic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int PERIODIC_EVENT_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmnforcpsextension.MyModel.impl.SporadicEventImpl <em>Sporadic Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnforcpsextension.MyModel.impl.SporadicEventImpl
	 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getSporadicEvent()
	 * @generated
	 */
	int SPORADIC_EVENT = 22;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_EVENT__EXTENSION_VALUES = Bpmn2Package.EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_EVENT__DOCUMENTATION = Bpmn2Package.EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_EVENT__EXTENSION_DEFINITIONS = Bpmn2Package.EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_EVENT__ID = Bpmn2Package.EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_EVENT__ANY_ATTRIBUTE = Bpmn2Package.EVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_EVENT__NAME = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_EVENT__TARGET = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_EVENT__MIN_TIME = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_EVENT__MAX_TIME = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_EVENT__TYPE = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Sporadic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_EVENT_FEATURE_COUNT = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Sporadic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int SPORADIC_EVENT_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sporadic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int SPORADIC_EVENT_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sporadic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int SPORADIC_EVENT_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sporadic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int SPORADIC_EVENT_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sporadic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int SPORADIC_EVENT_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sporadic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int SPORADIC_EVENT_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sporadic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int SPORADIC_EVENT_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmnforcpsextension.MyModel.impl.PeriodicActivityImpl <em>Periodic Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnforcpsextension.MyModel.impl.PeriodicActivityImpl
	 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getPeriodicActivity()
	 * @generated
	 */
	int PERIODIC_ACTIVITY = 23;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_ACTIVITY__EXTENSION_VALUES = Bpmn2Package.EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_ACTIVITY__DOCUMENTATION = Bpmn2Package.EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_ACTIVITY__EXTENSION_DEFINITIONS = Bpmn2Package.EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_ACTIVITY__ID = Bpmn2Package.EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_ACTIVITY__ANY_ATTRIBUTE = Bpmn2Package.EVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_ACTIVITY__NAME = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_ACTIVITY__TARGET = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_ACTIVITY__TIME_VALUE = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Timer Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_ACTIVITY__TIMER_TYPE = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Periodic Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_ACTIVITY_FEATURE_COUNT = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Periodic Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int PERIODIC_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Periodic Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int PERIODIC_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Periodic Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int PERIODIC_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Periodic Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int PERIODIC_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Periodic Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int PERIODIC_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Periodic Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int PERIODIC_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Periodic Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int PERIODIC_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmnforcpsextension.MyModel.impl.SporadicActivityImpl <em>Sporadic Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnforcpsextension.MyModel.impl.SporadicActivityImpl
	 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getSporadicActivity()
	 * @generated
	 */
	int SPORADIC_ACTIVITY = 24;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_ACTIVITY__EXTENSION_VALUES = Bpmn2Package.EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_ACTIVITY__DOCUMENTATION = Bpmn2Package.EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_ACTIVITY__EXTENSION_DEFINITIONS = Bpmn2Package.EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_ACTIVITY__ID = Bpmn2Package.EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_ACTIVITY__ANY_ATTRIBUTE = Bpmn2Package.EVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_ACTIVITY__NAME = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_ACTIVITY__TARGET = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_ACTIVITY__MAX_TIME = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Min time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_ACTIVITY__MIN_TIME = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Timer Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_ACTIVITY__TIMER_TYPE = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Sporadic Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_ACTIVITY_FEATURE_COUNT = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Sporadic Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int SPORADIC_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sporadic Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int SPORADIC_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sporadic Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int SPORADIC_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sporadic Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int SPORADIC_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sporadic Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int SPORADIC_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sporadic Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int SPORADIC_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sporadic Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int SPORADIC_ACTIVITY_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmnforcpsextension.MyModel.impl.DurationImpl <em>Duration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnforcpsextension.MyModel.impl.DurationImpl
	 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getDuration()
	 * @generated
	 */
	int DURATION = 25;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__EXTENSION_VALUES = Bpmn2Package.EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__DOCUMENTATION = Bpmn2Package.EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__EXTENSION_DEFINITIONS = Bpmn2Package.EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__ID = Bpmn2Package.EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__ANY_ATTRIBUTE = Bpmn2Package.EVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__NAME = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__TARGET = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min time duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__MIN_TIME_DURATION = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max time duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__MAX_TIME_DURATION = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Time Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__TIME_TYPE = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_FEATURE_COUNT = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int DURATION_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int DURATION_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int DURATION_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int DURATION_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int DURATION_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int DURATION_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int DURATION_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmnforcpsextension.MyModel.impl.PhysicalEntityTaskImpl <em>Physical Entity Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnforcpsextension.MyModel.impl.PhysicalEntityTaskImpl
	 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getPhysicalEntityTask()
	 * @generated
	 */
	int PHYSICAL_ENTITY_TASK = 26;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY_TASK__EXTENSION_VALUES = Bpmn2Package.TASK__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY_TASK__DOCUMENTATION = Bpmn2Package.TASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY_TASK__EXTENSION_DEFINITIONS = Bpmn2Package.TASK__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY_TASK__ID = Bpmn2Package.TASK__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY_TASK__ANY_ATTRIBUTE = Bpmn2Package.TASK__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY_TASK__AUDITING = Bpmn2Package.TASK__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY_TASK__MONITORING = Bpmn2Package.TASK__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY_TASK__CATEGORY_VALUE_REF = Bpmn2Package.TASK__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY_TASK__NAME = Bpmn2Package.TASK__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY_TASK__INCOMING = Bpmn2Package.TASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY_TASK__LANES = Bpmn2Package.TASK__LANES;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY_TASK__OUTGOING = Bpmn2Package.TASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY_TASK__IO_SPECIFICATION = Bpmn2Package.TASK__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY_TASK__BOUNDARY_EVENT_REFS = Bpmn2Package.TASK__BOUNDARY_EVENT_REFS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY_TASK__PROPERTIES = Bpmn2Package.TASK__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY_TASK__DATA_INPUT_ASSOCIATIONS = Bpmn2Package.TASK__DATA_INPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY_TASK__DATA_OUTPUT_ASSOCIATIONS = Bpmn2Package.TASK__DATA_OUTPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY_TASK__RESOURCES = Bpmn2Package.TASK__RESOURCES;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY_TASK__LOOP_CHARACTERISTICS = Bpmn2Package.TASK__LOOP_CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY_TASK__COMPLETION_QUANTITY = Bpmn2Package.TASK__COMPLETION_QUANTITY;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY_TASK__DEFAULT = Bpmn2Package.TASK__DEFAULT;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY_TASK__IS_FOR_COMPENSATION = Bpmn2Package.TASK__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY_TASK__START_QUANTITY = Bpmn2Package.TASK__START_QUANTITY;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY_TASK__INCOMING_CONVERSATION_LINKS = Bpmn2Package.TASK__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY_TASK__OUTGOING_CONVERSATION_LINKS = Bpmn2Package.TASK__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>CPS Performer Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY_TASK__CPS_PERFORMER_REF = Bpmn2Package.TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CPS Device Role Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY_TASK__CPS_DEVICE_ROLE_PARAMETERS = Bpmn2Package.TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY_TASK__TYPE = Bpmn2Package.TASK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Movable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY_TASK__IS_MOVABLE = Bpmn2Package.TASK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Physical Entity Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY_TASK_FEATURE_COUNT = Bpmn2Package.TASK_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Physical Entity Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int PHYSICAL_ENTITY_TASK_OPERATION_COUNT = Bpmn2Package.TASK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Physical Entity Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int PHYSICAL_ENTITY_TASK_OPERATION_COUNT = Bpmn2Package.TASK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Physical Entity Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int PHYSICAL_ENTITY_TASK_OPERATION_COUNT = Bpmn2Package.TASK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Physical Entity Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int PHYSICAL_ENTITY_TASK_OPERATION_COUNT = Bpmn2Package.TASK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Physical Entity Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int PHYSICAL_ENTITY_TASK_OPERATION_COUNT = Bpmn2Package.TASK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Physical Entity Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int PHYSICAL_ENTITY_TASK_OPERATION_COUNT = Bpmn2Package.TASK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Physical Entity Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int PHYSICAL_ENTITY_TASK_OPERATION_COUNT = Bpmn2Package.TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmnforcpsextension.MyModel.impl.MyEventDefinitionImpl <em>My Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnforcpsextension.MyModel.impl.MyEventDefinitionImpl
	 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getMyEventDefinition()
	 * @generated
	 */
	int MY_EVENT_DEFINITION = 27;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_EVENT_DEFINITION__EXTENSION_VALUES = Bpmn2Package.EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_EVENT_DEFINITION__DOCUMENTATION = Bpmn2Package.EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_EVENT_DEFINITION__EXTENSION_DEFINITIONS = Bpmn2Package.EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_EVENT_DEFINITION__ID = Bpmn2Package.EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_EVENT_DEFINITION__ANY_ATTRIBUTE = Bpmn2Package.EVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_EVENT_DEFINITION__VALUE = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>My Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_EVENT_DEFINITION_FEATURE_COUNT = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>My Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MY_EVENT_DEFINITION_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>My Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MY_EVENT_DEFINITION_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>My Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MY_EVENT_DEFINITION_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>My Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int MY_EVENT_DEFINITION_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>My Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MY_EVENT_DEFINITION_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>My Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int MY_EVENT_DEFINITION_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>My Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int MY_EVENT_DEFINITION_OPERATION_COUNT = Bpmn2Package.EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmnforcpsextension.MyModel.impl.RealWorldPropertiesImpl <em>Real World Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnforcpsextension.MyModel.impl.RealWorldPropertiesImpl
	 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getRealWorldProperties()
	 * @generated
	 */
	int REAL_WORLD_PROPERTIES = 28;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_WORLD_PROPERTIES__EXTENSION_VALUES = Bpmn2Package.TEXT_ANNOTATION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_WORLD_PROPERTIES__DOCUMENTATION = Bpmn2Package.TEXT_ANNOTATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_WORLD_PROPERTIES__EXTENSION_DEFINITIONS = Bpmn2Package.TEXT_ANNOTATION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_WORLD_PROPERTIES__ID = Bpmn2Package.TEXT_ANNOTATION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_WORLD_PROPERTIES__ANY_ATTRIBUTE = Bpmn2Package.TEXT_ANNOTATION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_WORLD_PROPERTIES__TEXT = Bpmn2Package.TEXT_ANNOTATION__TEXT;

	/**
	 * The feature id for the '<em><b>Text Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_WORLD_PROPERTIES__TEXT_FORMAT = Bpmn2Package.TEXT_ANNOTATION__TEXT_FORMAT;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_WORLD_PROPERTIES__PARAMETERS = Bpmn2Package.TEXT_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Real World Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_WORLD_PROPERTIES_FEATURE_COUNT = Bpmn2Package.TEXT_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Real World Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int REAL_WORLD_PROPERTIES_OPERATION_COUNT = Bpmn2Package.TEXT_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Real World Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int REAL_WORLD_PROPERTIES_OPERATION_COUNT = Bpmn2Package.TEXT_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Real World Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int REAL_WORLD_PROPERTIES_OPERATION_COUNT = Bpmn2Package.TEXT_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Real World Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int REAL_WORLD_PROPERTIES_OPERATION_COUNT = Bpmn2Package.TEXT_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Real World Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int REAL_WORLD_PROPERTIES_OPERATION_COUNT = Bpmn2Package.TEXT_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Real World Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int REAL_WORLD_PROPERTIES_OPERATION_COUNT = Bpmn2Package.TEXT_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Real World Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int REAL_WORLD_PROPERTIES_OPERATION_COUNT = Bpmn2Package.TEXT_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmnforcpsextension.MyModel.Physical_Properties <em>Physical Properties</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnforcpsextension.MyModel.Physical_Properties
	 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getPhysical_Properties()
	 * @generated
	 */
	int PHYSICAL_PROPERTIES = 29;

	/**
	 * The meta object id for the '{@link bpmnforcpsextension.MyModel.TypeDevice <em>Type Device</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnforcpsextension.MyModel.TypeDevice
	 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getTypeDevice()
	 * @generated
	 */
	int TYPE_DEVICE = 30;

	/**
	 * The meta object id for the '{@link bpmnforcpsextension.MyModel.Timer_Type <em>Timer Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnforcpsextension.MyModel.Timer_Type
	 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getTimer_Type()
	 * @generated
	 */
	int TIMER_TYPE = 31;


	/**
	 * Returns the meta object for class '{@link bpmnforcpsextension.MyModel.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see bpmnforcpsextension.MyModel.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the containment reference '{@link bpmnforcpsextension.MyModel.DocumentRoot#getTaskConfig <em>Task Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task Config</em>'.
	 * @see bpmnforcpsextension.MyModel.DocumentRoot#getTaskConfig()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TaskConfig();

	/**
	 * Returns the meta object for the containment reference '{@link bpmnforcpsextension.MyModel.DocumentRoot#getTemporalDependency <em>Temporal Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Temporal Dependency</em>'.
	 * @see bpmnforcpsextension.MyModel.DocumentRoot#getTemporalDependency()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TemporalDependency();

	/**
	 * Returns the meta object for the containment reference '{@link bpmnforcpsextension.MyModel.DocumentRoot#getMetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meta Data</em>'.
	 * @see bpmnforcpsextension.MyModel.DocumentRoot#getMetaData()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MetaData();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.DocumentRoot#getMsa <em>Msa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Msa</em>'.
	 * @see bpmnforcpsextension.MyModel.DocumentRoot#getMsa()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Msa();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.DocumentRoot#getMoa <em>Moa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Moa</em>'.
	 * @see bpmnforcpsextension.MyModel.DocumentRoot#getMoa()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Moa();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.DocumentRoot#getMfa <em>Mfa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mfa</em>'.
	 * @see bpmnforcpsextension.MyModel.DocumentRoot#getMfa()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Mfa();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.DocumentRoot#getMsi <em>Msi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Msi</em>'.
	 * @see bpmnforcpsextension.MyModel.DocumentRoot#getMsi()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Msi();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.DocumentRoot#getMoi <em>Moi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Moi</em>'.
	 * @see bpmnforcpsextension.MyModel.DocumentRoot#getMoi()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Moi();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.DocumentRoot#getMfi <em>Mfi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mfi</em>'.
	 * @see bpmnforcpsextension.MyModel.DocumentRoot#getMfi()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Mfi();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.DocumentRoot#getMusthappenataninfinitetime <em>Musthappenataninfinitetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Musthappenataninfinitetime</em>'.
	 * @see bpmnforcpsextension.MyModel.DocumentRoot#getMusthappenataninfinitetime()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Musthappenataninfinitetime();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.DocumentRoot#getMusthappenaslongastheactivityisexecuting <em>Musthappenaslongastheactivityisexecuting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Musthappenaslongastheactivityisexecuting</em>'.
	 * @see bpmnforcpsextension.MyModel.DocumentRoot#getMusthappenaslongastheactivityisexecuting()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Musthappenaslongastheactivityisexecuting();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.DocumentRoot#getMusthappenatthestartoftheactivity <em>Musthappenatthestartoftheactivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Musthappenatthestartoftheactivity</em>'.
	 * @see bpmnforcpsextension.MyModel.DocumentRoot#getMusthappenatthestartoftheactivity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Musthappenatthestartoftheactivity();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.DocumentRoot#getMusthappenattheendoftheactivity <em>Musthappenattheendoftheactivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Musthappenattheendoftheactivity</em>'.
	 * @see bpmnforcpsextension.MyModel.DocumentRoot#getMusthappenattheendoftheactivity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Musthappenattheendoftheactivity();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.DocumentRoot#getMusthappenataboundtime <em>Musthappenataboundtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Musthappenataboundtime</em>'.
	 * @see bpmnforcpsextension.MyModel.DocumentRoot#getMusthappenataboundtime()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Musthappenataboundtime();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.DocumentRoot#getMustneverhappenataninfinitetime <em>Mustneverhappenataninfinitetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mustneverhappenataninfinitetime</em>'.
	 * @see bpmnforcpsextension.MyModel.DocumentRoot#getMustneverhappenataninfinitetime()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Mustneverhappenataninfinitetime();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.DocumentRoot#getMustneverhappenatthestartoftheactivity <em>Mustneverhappenatthestartoftheactivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mustneverhappenatthestartoftheactivity</em>'.
	 * @see bpmnforcpsextension.MyModel.DocumentRoot#getMustneverhappenatthestartoftheactivity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Mustneverhappenatthestartoftheactivity();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.DocumentRoot#getMustneverhappenattheendoftheactivity <em>Mustneverhappenattheendoftheactivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mustneverhappenattheendoftheactivity</em>'.
	 * @see bpmnforcpsextension.MyModel.DocumentRoot#getMustneverhappenattheendoftheactivity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Mustneverhappenattheendoftheactivity();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.DocumentRoot#getMustneverhappenataboundtime <em>Mustneverhappenataboundtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mustneverhappenataboundtime</em>'.
	 * @see bpmnforcpsextension.MyModel.DocumentRoot#getMustneverhappenataboundtime()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Mustneverhappenataboundtime();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.DocumentRoot#getMyeventdefinition <em>Myeventdefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Myeventdefinition</em>'.
	 * @see bpmnforcpsextension.MyModel.DocumentRoot#getMyeventdefinition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Myeventdefinition();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.DocumentRoot#getPeriodicevent <em>Periodicevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Periodicevent</em>'.
	 * @see bpmnforcpsextension.MyModel.DocumentRoot#getPeriodicevent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Periodicevent();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.DocumentRoot#getSporadicevent <em>Sporadicevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sporadicevent</em>'.
	 * @see bpmnforcpsextension.MyModel.DocumentRoot#getSporadicevent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Sporadicevent();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.DocumentRoot#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Duration</em>'.
	 * @see bpmnforcpsextension.MyModel.DocumentRoot#getDuration()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Duration();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.DocumentRoot#getPhysicalentitytask <em>Physicalentitytask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Physicalentitytask</em>'.
	 * @see bpmnforcpsextension.MyModel.DocumentRoot#getPhysicalentitytask()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Physicalentitytask();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.DocumentRoot#getRealworldproperties <em>Realworldproperties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realworldproperties</em>'.
	 * @see bpmnforcpsextension.MyModel.DocumentRoot#getRealworldproperties()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Realworldproperties();

	/**
	 * Returns the meta object for class '{@link bpmnforcpsextension.MyModel.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see bpmnforcpsextension.MyModel.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bpmnforcpsextension.MyModel.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see bpmnforcpsextension.MyModel.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for class '{@link bpmnforcpsextension.MyModel.MetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Data</em>'.
	 * @see bpmnforcpsextension.MyModel.MetaData
	 * @generated
	 */
	EClass getMetaData();

	/**
	 * Returns the meta object for the attribute list '{@link bpmnforcpsextension.MyModel.MetaData#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see bpmnforcpsextension.MyModel.MetaData#getMixed()
	 * @see #getMetaData()
	 * @generated
	 */
	EAttribute getMetaData_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MetaData#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bpmnforcpsextension.MyModel.MetaData#getName()
	 * @see #getMetaData()
	 * @generated
	 */
	EAttribute getMetaData_Name();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MetaData#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see bpmnforcpsextension.MyModel.MetaData#getValue()
	 * @see #getMetaData()
	 * @generated
	 */
	EAttribute getMetaData_Value();

	/**
	 * Returns the meta object for class '{@link bpmnforcpsextension.MyModel.TaskConfig <em>Task Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Config</em>'.
	 * @see bpmnforcpsextension.MyModel.TaskConfig
	 * @generated
	 */
	EClass getTaskConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link bpmnforcpsextension.MyModel.TaskConfig#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see bpmnforcpsextension.MyModel.TaskConfig#getParameters()
	 * @see #getTaskConfig()
	 * @generated
	 */
	EReference getTaskConfig_Parameters();

	/**
	 * Returns the meta object for class '{@link bpmnforcpsextension.MyModel.TemporalDependency <em>Temporal Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Dependency</em>'.
	 * @see bpmnforcpsextension.MyModel.TemporalDependency
	 * @generated
	 */
	EClass getTemporalDependency();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.TemporalDependency#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Ref</em>'.
	 * @see bpmnforcpsextension.MyModel.TemporalDependency#getSourceRef()
	 * @see #getTemporalDependency()
	 * @generated
	 */
	EReference getTemporalDependency_SourceRef();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.TemporalDependency#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Ref</em>'.
	 * @see bpmnforcpsextension.MyModel.TemporalDependency#getTargetRef()
	 * @see #getTemporalDependency()
	 * @generated
	 */
	EReference getTemporalDependency_TargetRef();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.TemporalDependency#getMax_value <em>Max value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max value</em>'.
	 * @see bpmnforcpsextension.MyModel.TemporalDependency#getMax_value()
	 * @see #getTemporalDependency()
	 * @generated
	 */
	EAttribute getTemporalDependency_Max_value();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.TemporalDependency#getMin_value <em>Min value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min value</em>'.
	 * @see bpmnforcpsextension.MyModel.TemporalDependency#getMin_value()
	 * @see #getTemporalDependency()
	 * @generated
	 */
	EAttribute getTemporalDependency_Min_value();

	/**
	 * Returns the meta object for class '{@link bpmnforcpsextension.MyModel.MSA <em>MSA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MSA</em>'.
	 * @see bpmnforcpsextension.MyModel.MSA
	 * @generated
	 */
	EClass getMSA();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MSA#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bpmnforcpsextension.MyModel.MSA#getName()
	 * @see #getMSA()
	 * @generated
	 */
	EAttribute getMSA_Name();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MSA#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bpmnforcpsextension.MyModel.MSA#getType()
	 * @see #getMSA()
	 * @generated
	 */
	EAttribute getMSA_Type();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.MSA#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see bpmnforcpsextension.MyModel.MSA#getTarget()
	 * @see #getMSA()
	 * @generated
	 */
	EReference getMSA_Target();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MSA#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see bpmnforcpsextension.MyModel.MSA#getValue()
	 * @see #getMSA()
	 * @generated
	 */
	EAttribute getMSA_Value();

	/**
	 * Returns the meta object for class '{@link bpmnforcpsextension.MyModel.MOA <em>MOA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MOA</em>'.
	 * @see bpmnforcpsextension.MyModel.MOA
	 * @generated
	 */
	EClass getMOA();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MOA#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bpmnforcpsextension.MyModel.MOA#getName()
	 * @see #getMOA()
	 * @generated
	 */
	EAttribute getMOA_Name();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MOA#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bpmnforcpsextension.MyModel.MOA#getType()
	 * @see #getMOA()
	 * @generated
	 */
	EAttribute getMOA_Type();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.MOA#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see bpmnforcpsextension.MyModel.MOA#getTarget()
	 * @see #getMOA()
	 * @generated
	 */
	EReference getMOA_Target();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MOA#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see bpmnforcpsextension.MyModel.MOA#getValue()
	 * @see #getMOA()
	 * @generated
	 */
	EAttribute getMOA_Value();

	/**
	 * Returns the meta object for class '{@link bpmnforcpsextension.MyModel.MFA <em>MFA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MFA</em>'.
	 * @see bpmnforcpsextension.MyModel.MFA
	 * @generated
	 */
	EClass getMFA();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MFA#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bpmnforcpsextension.MyModel.MFA#getName()
	 * @see #getMFA()
	 * @generated
	 */
	EAttribute getMFA_Name();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MFA#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bpmnforcpsextension.MyModel.MFA#getType()
	 * @see #getMFA()
	 * @generated
	 */
	EAttribute getMFA_Type();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.MFA#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see bpmnforcpsextension.MyModel.MFA#getTarget()
	 * @see #getMFA()
	 * @generated
	 */
	EReference getMFA_Target();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MFA#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see bpmnforcpsextension.MyModel.MFA#getValue()
	 * @see #getMFA()
	 * @generated
	 */
	EAttribute getMFA_Value();

	/**
	 * Returns the meta object for class '{@link bpmnforcpsextension.MyModel.MSI <em>MSI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MSI</em>'.
	 * @see bpmnforcpsextension.MyModel.MSI
	 * @generated
	 */
	EClass getMSI();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MSI#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bpmnforcpsextension.MyModel.MSI#getName()
	 * @see #getMSI()
	 * @generated
	 */
	EAttribute getMSI_Name();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MSI#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bpmnforcpsextension.MyModel.MSI#getType()
	 * @see #getMSI()
	 * @generated
	 */
	EAttribute getMSI_Type();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.MSI#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see bpmnforcpsextension.MyModel.MSI#getTarget()
	 * @see #getMSI()
	 * @generated
	 */
	EReference getMSI_Target();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MSI#getMin_Value <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see bpmnforcpsextension.MyModel.MSI#getMin_Value()
	 * @see #getMSI()
	 * @generated
	 */
	EAttribute getMSI_Min_Value();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MSI#getMax_Value <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see bpmnforcpsextension.MyModel.MSI#getMax_Value()
	 * @see #getMSI()
	 * @generated
	 */
	EAttribute getMSI_Max_Value();

	/**
	 * Returns the meta object for class '{@link bpmnforcpsextension.MyModel.MOI <em>MOI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MOI</em>'.
	 * @see bpmnforcpsextension.MyModel.MOI
	 * @generated
	 */
	EClass getMOI();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MOI#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bpmnforcpsextension.MyModel.MOI#getName()
	 * @see #getMOI()
	 * @generated
	 */
	EAttribute getMOI_Name();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MOI#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bpmnforcpsextension.MyModel.MOI#getType()
	 * @see #getMOI()
	 * @generated
	 */
	EAttribute getMOI_Type();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.MOI#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see bpmnforcpsextension.MyModel.MOI#getTarget()
	 * @see #getMOI()
	 * @generated
	 */
	EReference getMOI_Target();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MOI#getMin_Value <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see bpmnforcpsextension.MyModel.MOI#getMin_Value()
	 * @see #getMOI()
	 * @generated
	 */
	EAttribute getMOI_Min_Value();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MOI#getMax_Value <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see bpmnforcpsextension.MyModel.MOI#getMax_Value()
	 * @see #getMOI()
	 * @generated
	 */
	EAttribute getMOI_Max_Value();

	/**
	 * Returns the meta object for class '{@link bpmnforcpsextension.MyModel.MFI <em>MFI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MFI</em>'.
	 * @see bpmnforcpsextension.MyModel.MFI
	 * @generated
	 */
	EClass getMFI();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MFI#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bpmnforcpsextension.MyModel.MFI#getName()
	 * @see #getMFI()
	 * @generated
	 */
	EAttribute getMFI_Name();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MFI#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bpmnforcpsextension.MyModel.MFI#getType()
	 * @see #getMFI()
	 * @generated
	 */
	EAttribute getMFI_Type();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.MFI#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see bpmnforcpsextension.MyModel.MFI#getTarget()
	 * @see #getMFI()
	 * @generated
	 */
	EReference getMFI_Target();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MFI#getMin_Value <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see bpmnforcpsextension.MyModel.MFI#getMin_Value()
	 * @see #getMFI()
	 * @generated
	 */
	EAttribute getMFI_Min_Value();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MFI#getMax_Value <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see bpmnforcpsextension.MyModel.MFI#getMax_Value()
	 * @see #getMFI()
	 * @generated
	 */
	EAttribute getMFI_Max_Value();

	/**
	 * Returns the meta object for class '{@link bpmnforcpsextension.MyModel.MustHappenAtAnInfiniteTime <em>Must Happen At An Infinite Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Must Happen At An Infinite Time</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtAnInfiniteTime
	 * @generated
	 */
	EClass getMustHappenAtAnInfiniteTime();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtAnInfiniteTime#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtAnInfiniteTime#getName()
	 * @see #getMustHappenAtAnInfiniteTime()
	 * @generated
	 */
	EAttribute getMustHappenAtAnInfiniteTime_Name();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtAnInfiniteTime#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtAnInfiniteTime#getType()
	 * @see #getMustHappenAtAnInfiniteTime()
	 * @generated
	 */
	EAttribute getMustHappenAtAnInfiniteTime_Type();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.MustHappenAtAnInfiniteTime#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtAnInfiniteTime#getTarget()
	 * @see #getMustHappenAtAnInfiniteTime()
	 * @generated
	 */
	EReference getMustHappenAtAnInfiniteTime_Target();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtAnInfiniteTime#getDo_Happen <em>Do Happen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Do Happen</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtAnInfiniteTime#getDo_Happen()
	 * @see #getMustHappenAtAnInfiniteTime()
	 * @generated
	 */
	EAttribute getMustHappenAtAnInfiniteTime_Do_Happen();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtAnInfiniteTime#getFirst_physical_property <em>First physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtAnInfiniteTime#getFirst_physical_property()
	 * @see #getMustHappenAtAnInfiniteTime()
	 * @generated
	 */
	EAttribute getMustHappenAtAnInfiniteTime_First_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtAnInfiniteTime#getMin_value_of_the_first_physical_property <em>Min value of the first physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min value of the first physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtAnInfiniteTime#getMin_value_of_the_first_physical_property()
	 * @see #getMustHappenAtAnInfiniteTime()
	 * @generated
	 */
	EAttribute getMustHappenAtAnInfiniteTime_Min_value_of_the_first_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtAnInfiniteTime#getMax_value_of_the_first_physical_property <em>Max value of the first physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max value of the first physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtAnInfiniteTime#getMax_value_of_the_first_physical_property()
	 * @see #getMustHappenAtAnInfiniteTime()
	 * @generated
	 */
	EAttribute getMustHappenAtAnInfiniteTime_Max_value_of_the_first_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtAnInfiniteTime#getSecond_physical_property <em>Second physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtAnInfiniteTime#getSecond_physical_property()
	 * @see #getMustHappenAtAnInfiniteTime()
	 * @generated
	 */
	EAttribute getMustHappenAtAnInfiniteTime_Second_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtAnInfiniteTime#getMin_value_of_the_second_physical_property <em>Min value of the second physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min value of the second physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtAnInfiniteTime#getMin_value_of_the_second_physical_property()
	 * @see #getMustHappenAtAnInfiniteTime()
	 * @generated
	 */
	EAttribute getMustHappenAtAnInfiniteTime_Min_value_of_the_second_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtAnInfiniteTime#getMax_value_of_the_second_physical_property <em>Max value of the second physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max value of the second physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtAnInfiniteTime#getMax_value_of_the_second_physical_property()
	 * @see #getMustHappenAtAnInfiniteTime()
	 * @generated
	 */
	EAttribute getMustHappenAtAnInfiniteTime_Max_value_of_the_second_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtAnInfiniteTime#getThird_physical_property <em>Third physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Third physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtAnInfiniteTime#getThird_physical_property()
	 * @see #getMustHappenAtAnInfiniteTime()
	 * @generated
	 */
	EAttribute getMustHappenAtAnInfiniteTime_Third_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtAnInfiniteTime#getMin_value_of_the_third_physical_property <em>Min value of the third physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min value of the third physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtAnInfiniteTime#getMin_value_of_the_third_physical_property()
	 * @see #getMustHappenAtAnInfiniteTime()
	 * @generated
	 */
	EAttribute getMustHappenAtAnInfiniteTime_Min_value_of_the_third_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtAnInfiniteTime#getMax_value_of_the_third_physical_property <em>Max value of the third physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max value of the third physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtAnInfiniteTime#getMax_value_of_the_third_physical_property()
	 * @see #getMustHappenAtAnInfiniteTime()
	 * @generated
	 */
	EAttribute getMustHappenAtAnInfiniteTime_Max_value_of_the_third_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtAnInfiniteTime#getPhysical_dependency_function <em>Physical dependency function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physical dependency function</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtAnInfiniteTime#getPhysical_dependency_function()
	 * @see #getMustHappenAtAnInfiniteTime()
	 * @generated
	 */
	EAttribute getMustHappenAtAnInfiniteTime_Physical_dependency_function();

	/**
	 * Returns the meta object for class '{@link bpmnforcpsextension.MyModel.MustHappenAsLongAsTheActivityIsExecuting <em>Must Happen As Long As The Activity Is Executing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Must Happen As Long As The Activity Is Executing</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAsLongAsTheActivityIsExecuting
	 * @generated
	 */
	EClass getMustHappenAsLongAsTheActivityIsExecuting();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAsLongAsTheActivityIsExecuting#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAsLongAsTheActivityIsExecuting#getName()
	 * @see #getMustHappenAsLongAsTheActivityIsExecuting()
	 * @generated
	 */
	EAttribute getMustHappenAsLongAsTheActivityIsExecuting_Name();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAsLongAsTheActivityIsExecuting#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAsLongAsTheActivityIsExecuting#getType()
	 * @see #getMustHappenAsLongAsTheActivityIsExecuting()
	 * @generated
	 */
	EAttribute getMustHappenAsLongAsTheActivityIsExecuting_Type();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.MustHappenAsLongAsTheActivityIsExecuting#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAsLongAsTheActivityIsExecuting#getTarget()
	 * @see #getMustHappenAsLongAsTheActivityIsExecuting()
	 * @generated
	 */
	EReference getMustHappenAsLongAsTheActivityIsExecuting_Target();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAsLongAsTheActivityIsExecuting#getDo_Happen <em>Do Happen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Do Happen</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAsLongAsTheActivityIsExecuting#getDo_Happen()
	 * @see #getMustHappenAsLongAsTheActivityIsExecuting()
	 * @generated
	 */
	EAttribute getMustHappenAsLongAsTheActivityIsExecuting_Do_Happen();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAsLongAsTheActivityIsExecuting#getFirst_physical_property <em>First physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAsLongAsTheActivityIsExecuting#getFirst_physical_property()
	 * @see #getMustHappenAsLongAsTheActivityIsExecuting()
	 * @generated
	 */
	EAttribute getMustHappenAsLongAsTheActivityIsExecuting_First_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAsLongAsTheActivityIsExecuting#getMin_value_of_the_first_physical_property <em>Min value of the first physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min value of the first physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAsLongAsTheActivityIsExecuting#getMin_value_of_the_first_physical_property()
	 * @see #getMustHappenAsLongAsTheActivityIsExecuting()
	 * @generated
	 */
	EAttribute getMustHappenAsLongAsTheActivityIsExecuting_Min_value_of_the_first_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAsLongAsTheActivityIsExecuting#getMax_value_of_the_first_physical_property <em>Max value of the first physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max value of the first physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAsLongAsTheActivityIsExecuting#getMax_value_of_the_first_physical_property()
	 * @see #getMustHappenAsLongAsTheActivityIsExecuting()
	 * @generated
	 */
	EAttribute getMustHappenAsLongAsTheActivityIsExecuting_Max_value_of_the_first_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAsLongAsTheActivityIsExecuting#getSecond_physical_property <em>Second physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAsLongAsTheActivityIsExecuting#getSecond_physical_property()
	 * @see #getMustHappenAsLongAsTheActivityIsExecuting()
	 * @generated
	 */
	EAttribute getMustHappenAsLongAsTheActivityIsExecuting_Second_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAsLongAsTheActivityIsExecuting#getMin_value_of_the_second_physical_property <em>Min value of the second physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min value of the second physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAsLongAsTheActivityIsExecuting#getMin_value_of_the_second_physical_property()
	 * @see #getMustHappenAsLongAsTheActivityIsExecuting()
	 * @generated
	 */
	EAttribute getMustHappenAsLongAsTheActivityIsExecuting_Min_value_of_the_second_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAsLongAsTheActivityIsExecuting#getMax_value_of_the_second_physical_property <em>Max value of the second physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max value of the second physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAsLongAsTheActivityIsExecuting#getMax_value_of_the_second_physical_property()
	 * @see #getMustHappenAsLongAsTheActivityIsExecuting()
	 * @generated
	 */
	EAttribute getMustHappenAsLongAsTheActivityIsExecuting_Max_value_of_the_second_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAsLongAsTheActivityIsExecuting#getThird_physical_property <em>Third physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Third physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAsLongAsTheActivityIsExecuting#getThird_physical_property()
	 * @see #getMustHappenAsLongAsTheActivityIsExecuting()
	 * @generated
	 */
	EAttribute getMustHappenAsLongAsTheActivityIsExecuting_Third_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAsLongAsTheActivityIsExecuting#getMin_value_of_the_third_physical_property <em>Min value of the third physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min value of the third physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAsLongAsTheActivityIsExecuting#getMin_value_of_the_third_physical_property()
	 * @see #getMustHappenAsLongAsTheActivityIsExecuting()
	 * @generated
	 */
	EAttribute getMustHappenAsLongAsTheActivityIsExecuting_Min_value_of_the_third_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAsLongAsTheActivityIsExecuting#getMax_value_of_the_third_physical_property <em>Max value of the third physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max value of the third physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAsLongAsTheActivityIsExecuting#getMax_value_of_the_third_physical_property()
	 * @see #getMustHappenAsLongAsTheActivityIsExecuting()
	 * @generated
	 */
	EAttribute getMustHappenAsLongAsTheActivityIsExecuting_Max_value_of_the_third_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAsLongAsTheActivityIsExecuting#getPhysical_dependency_function <em>Physical dependency function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physical dependency function</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAsLongAsTheActivityIsExecuting#getPhysical_dependency_function()
	 * @see #getMustHappenAsLongAsTheActivityIsExecuting()
	 * @generated
	 */
	EAttribute getMustHappenAsLongAsTheActivityIsExecuting_Physical_dependency_function();

	/**
	 * Returns the meta object for class '{@link bpmnforcpsextension.MyModel.MustHappenAtTheStartOfTheActivity <em>Must Happen At The Start Of The Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Must Happen At The Start Of The Activity</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtTheStartOfTheActivity
	 * @generated
	 */
	EClass getMustHappenAtTheStartOfTheActivity();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtTheStartOfTheActivity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtTheStartOfTheActivity#getName()
	 * @see #getMustHappenAtTheStartOfTheActivity()
	 * @generated
	 */
	EAttribute getMustHappenAtTheStartOfTheActivity_Name();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtTheStartOfTheActivity#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtTheStartOfTheActivity#getType()
	 * @see #getMustHappenAtTheStartOfTheActivity()
	 * @generated
	 */
	EAttribute getMustHappenAtTheStartOfTheActivity_Type();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.MustHappenAtTheStartOfTheActivity#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtTheStartOfTheActivity#getTarget()
	 * @see #getMustHappenAtTheStartOfTheActivity()
	 * @generated
	 */
	EReference getMustHappenAtTheStartOfTheActivity_Target();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtTheStartOfTheActivity#getDo_Happen <em>Do Happen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Do Happen</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtTheStartOfTheActivity#getDo_Happen()
	 * @see #getMustHappenAtTheStartOfTheActivity()
	 * @generated
	 */
	EAttribute getMustHappenAtTheStartOfTheActivity_Do_Happen();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtTheStartOfTheActivity#getFirst_physical_property <em>First physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtTheStartOfTheActivity#getFirst_physical_property()
	 * @see #getMustHappenAtTheStartOfTheActivity()
	 * @generated
	 */
	EAttribute getMustHappenAtTheStartOfTheActivity_First_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtTheStartOfTheActivity#getMin_value_of_the_first_physical_property <em>Min value of the first physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min value of the first physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtTheStartOfTheActivity#getMin_value_of_the_first_physical_property()
	 * @see #getMustHappenAtTheStartOfTheActivity()
	 * @generated
	 */
	EAttribute getMustHappenAtTheStartOfTheActivity_Min_value_of_the_first_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtTheStartOfTheActivity#getMax_value_of_the_first_physical_property <em>Max value of the first physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max value of the first physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtTheStartOfTheActivity#getMax_value_of_the_first_physical_property()
	 * @see #getMustHappenAtTheStartOfTheActivity()
	 * @generated
	 */
	EAttribute getMustHappenAtTheStartOfTheActivity_Max_value_of_the_first_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtTheStartOfTheActivity#getSecond_physical_property <em>Second physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtTheStartOfTheActivity#getSecond_physical_property()
	 * @see #getMustHappenAtTheStartOfTheActivity()
	 * @generated
	 */
	EAttribute getMustHappenAtTheStartOfTheActivity_Second_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtTheStartOfTheActivity#getMin_value_of_the_second_physical_property <em>Min value of the second physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min value of the second physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtTheStartOfTheActivity#getMin_value_of_the_second_physical_property()
	 * @see #getMustHappenAtTheStartOfTheActivity()
	 * @generated
	 */
	EAttribute getMustHappenAtTheStartOfTheActivity_Min_value_of_the_second_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtTheStartOfTheActivity#getMax_value_of_the_second_physical_property <em>Max value of the second physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max value of the second physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtTheStartOfTheActivity#getMax_value_of_the_second_physical_property()
	 * @see #getMustHappenAtTheStartOfTheActivity()
	 * @generated
	 */
	EAttribute getMustHappenAtTheStartOfTheActivity_Max_value_of_the_second_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtTheStartOfTheActivity#getThird_physical_property <em>Third physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Third physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtTheStartOfTheActivity#getThird_physical_property()
	 * @see #getMustHappenAtTheStartOfTheActivity()
	 * @generated
	 */
	EAttribute getMustHappenAtTheStartOfTheActivity_Third_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtTheStartOfTheActivity#getMin_value_of_the_third_physical_property <em>Min value of the third physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min value of the third physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtTheStartOfTheActivity#getMin_value_of_the_third_physical_property()
	 * @see #getMustHappenAtTheStartOfTheActivity()
	 * @generated
	 */
	EAttribute getMustHappenAtTheStartOfTheActivity_Min_value_of_the_third_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtTheStartOfTheActivity#getMax_value_of_the_third_physical_property <em>Max value of the third physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max value of the third physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtTheStartOfTheActivity#getMax_value_of_the_third_physical_property()
	 * @see #getMustHappenAtTheStartOfTheActivity()
	 * @generated
	 */
	EAttribute getMustHappenAtTheStartOfTheActivity_Max_value_of_the_third_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtTheStartOfTheActivity#getPhysical_dependency_function <em>Physical dependency function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physical dependency function</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtTheStartOfTheActivity#getPhysical_dependency_function()
	 * @see #getMustHappenAtTheStartOfTheActivity()
	 * @generated
	 */
	EAttribute getMustHappenAtTheStartOfTheActivity_Physical_dependency_function();

	/**
	 * Returns the meta object for class '{@link bpmnforcpsextension.MyModel.MustHappenAtTheEndOfTheActivity <em>Must Happen At The End Of The Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Must Happen At The End Of The Activity</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtTheEndOfTheActivity
	 * @generated
	 */
	EClass getMustHappenAtTheEndOfTheActivity();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtTheEndOfTheActivity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtTheEndOfTheActivity#getName()
	 * @see #getMustHappenAtTheEndOfTheActivity()
	 * @generated
	 */
	EAttribute getMustHappenAtTheEndOfTheActivity_Name();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtTheEndOfTheActivity#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtTheEndOfTheActivity#getType()
	 * @see #getMustHappenAtTheEndOfTheActivity()
	 * @generated
	 */
	EAttribute getMustHappenAtTheEndOfTheActivity_Type();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.MustHappenAtTheEndOfTheActivity#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtTheEndOfTheActivity#getTarget()
	 * @see #getMustHappenAtTheEndOfTheActivity()
	 * @generated
	 */
	EReference getMustHappenAtTheEndOfTheActivity_Target();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtTheEndOfTheActivity#getDo_Happen <em>Do Happen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Do Happen</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtTheEndOfTheActivity#getDo_Happen()
	 * @see #getMustHappenAtTheEndOfTheActivity()
	 * @generated
	 */
	EAttribute getMustHappenAtTheEndOfTheActivity_Do_Happen();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtTheEndOfTheActivity#getFirst_physical_property <em>First physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtTheEndOfTheActivity#getFirst_physical_property()
	 * @see #getMustHappenAtTheEndOfTheActivity()
	 * @generated
	 */
	EAttribute getMustHappenAtTheEndOfTheActivity_First_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtTheEndOfTheActivity#getMin_value_of_the_first_physical_property <em>Min value of the first physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min value of the first physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtTheEndOfTheActivity#getMin_value_of_the_first_physical_property()
	 * @see #getMustHappenAtTheEndOfTheActivity()
	 * @generated
	 */
	EAttribute getMustHappenAtTheEndOfTheActivity_Min_value_of_the_first_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtTheEndOfTheActivity#getMax_value_of_the_first_physical_property <em>Max value of the first physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max value of the first physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtTheEndOfTheActivity#getMax_value_of_the_first_physical_property()
	 * @see #getMustHappenAtTheEndOfTheActivity()
	 * @generated
	 */
	EAttribute getMustHappenAtTheEndOfTheActivity_Max_value_of_the_first_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtTheEndOfTheActivity#getSecond_physical_property <em>Second physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtTheEndOfTheActivity#getSecond_physical_property()
	 * @see #getMustHappenAtTheEndOfTheActivity()
	 * @generated
	 */
	EAttribute getMustHappenAtTheEndOfTheActivity_Second_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtTheEndOfTheActivity#getMin_value_of_the_second_physical_property <em>Min value of the second physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min value of the second physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtTheEndOfTheActivity#getMin_value_of_the_second_physical_property()
	 * @see #getMustHappenAtTheEndOfTheActivity()
	 * @generated
	 */
	EAttribute getMustHappenAtTheEndOfTheActivity_Min_value_of_the_second_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtTheEndOfTheActivity#getMax_value_of_the_second_physical_property <em>Max value of the second physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max value of the second physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtTheEndOfTheActivity#getMax_value_of_the_second_physical_property()
	 * @see #getMustHappenAtTheEndOfTheActivity()
	 * @generated
	 */
	EAttribute getMustHappenAtTheEndOfTheActivity_Max_value_of_the_second_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtTheEndOfTheActivity#getThird_physical_property <em>Third physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Third physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtTheEndOfTheActivity#getThird_physical_property()
	 * @see #getMustHappenAtTheEndOfTheActivity()
	 * @generated
	 */
	EAttribute getMustHappenAtTheEndOfTheActivity_Third_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtTheEndOfTheActivity#getMin_value_of_the_third_physical_property <em>Min value of the third physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min value of the third physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtTheEndOfTheActivity#getMin_value_of_the_third_physical_property()
	 * @see #getMustHappenAtTheEndOfTheActivity()
	 * @generated
	 */
	EAttribute getMustHappenAtTheEndOfTheActivity_Min_value_of_the_third_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtTheEndOfTheActivity#getMax_value_of_the_third_physical_property <em>Max value of the third physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max value of the third physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtTheEndOfTheActivity#getMax_value_of_the_third_physical_property()
	 * @see #getMustHappenAtTheEndOfTheActivity()
	 * @generated
	 */
	EAttribute getMustHappenAtTheEndOfTheActivity_Max_value_of_the_third_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtTheEndOfTheActivity#getPhysical_dependency_function <em>Physical dependency function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physical dependency function</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtTheEndOfTheActivity#getPhysical_dependency_function()
	 * @see #getMustHappenAtTheEndOfTheActivity()
	 * @generated
	 */
	EAttribute getMustHappenAtTheEndOfTheActivity_Physical_dependency_function();

	/**
	 * Returns the meta object for class '{@link bpmnforcpsextension.MyModel.MustHappenAtABoundTime <em>Must Happen At ABound Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Must Happen At ABound Time</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtABoundTime
	 * @generated
	 */
	EClass getMustHappenAtABoundTime();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtABoundTime#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtABoundTime#getName()
	 * @see #getMustHappenAtABoundTime()
	 * @generated
	 */
	EAttribute getMustHappenAtABoundTime_Name();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtABoundTime#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtABoundTime#getType()
	 * @see #getMustHappenAtABoundTime()
	 * @generated
	 */
	EAttribute getMustHappenAtABoundTime_Type();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.MustHappenAtABoundTime#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtABoundTime#getTarget()
	 * @see #getMustHappenAtABoundTime()
	 * @generated
	 */
	EReference getMustHappenAtABoundTime_Target();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtABoundTime#getDo_Happen <em>Do Happen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Do Happen</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtABoundTime#getDo_Happen()
	 * @see #getMustHappenAtABoundTime()
	 * @generated
	 */
	EAttribute getMustHappenAtABoundTime_Do_Happen();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtABoundTime#getMin_bound_time <em>Min bound time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min bound time</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtABoundTime#getMin_bound_time()
	 * @see #getMustHappenAtABoundTime()
	 * @generated
	 */
	EAttribute getMustHappenAtABoundTime_Min_bound_time();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtABoundTime#getMax_bound_time <em>Max bound time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max bound time</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtABoundTime#getMax_bound_time()
	 * @see #getMustHappenAtABoundTime()
	 * @generated
	 */
	EAttribute getMustHappenAtABoundTime_Max_bound_time();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtABoundTime#getFirst_physical_property <em>First physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtABoundTime#getFirst_physical_property()
	 * @see #getMustHappenAtABoundTime()
	 * @generated
	 */
	EAttribute getMustHappenAtABoundTime_First_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtABoundTime#getMin_value_of_the_first_physical_property <em>Min value of the first physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min value of the first physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtABoundTime#getMin_value_of_the_first_physical_property()
	 * @see #getMustHappenAtABoundTime()
	 * @generated
	 */
	EAttribute getMustHappenAtABoundTime_Min_value_of_the_first_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtABoundTime#getMax_value_of_the_first_physical_property <em>Max value of the first physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max value of the first physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtABoundTime#getMax_value_of_the_first_physical_property()
	 * @see #getMustHappenAtABoundTime()
	 * @generated
	 */
	EAttribute getMustHappenAtABoundTime_Max_value_of_the_first_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtABoundTime#getSecond_physical_property <em>Second physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtABoundTime#getSecond_physical_property()
	 * @see #getMustHappenAtABoundTime()
	 * @generated
	 */
	EAttribute getMustHappenAtABoundTime_Second_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtABoundTime#getMin_value_of_the_second_physical_property <em>Min value of the second physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min value of the second physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtABoundTime#getMin_value_of_the_second_physical_property()
	 * @see #getMustHappenAtABoundTime()
	 * @generated
	 */
	EAttribute getMustHappenAtABoundTime_Min_value_of_the_second_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtABoundTime#getMax_value_of_the_second_physical_property <em>Max value of the second physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max value of the second physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtABoundTime#getMax_value_of_the_second_physical_property()
	 * @see #getMustHappenAtABoundTime()
	 * @generated
	 */
	EAttribute getMustHappenAtABoundTime_Max_value_of_the_second_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtABoundTime#getThird_physical_property <em>Third physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Third physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtABoundTime#getThird_physical_property()
	 * @see #getMustHappenAtABoundTime()
	 * @generated
	 */
	EAttribute getMustHappenAtABoundTime_Third_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtABoundTime#getMin_value_of_the_third_physical_property <em>Min value of the third physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min value of the third physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtABoundTime#getMin_value_of_the_third_physical_property()
	 * @see #getMustHappenAtABoundTime()
	 * @generated
	 */
	EAttribute getMustHappenAtABoundTime_Min_value_of_the_third_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtABoundTime#getMax_value_of_the_third_physical_property <em>Max value of the third physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max value of the third physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtABoundTime#getMax_value_of_the_third_physical_property()
	 * @see #getMustHappenAtABoundTime()
	 * @generated
	 */
	EAttribute getMustHappenAtABoundTime_Max_value_of_the_third_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustHappenAtABoundTime#getPhysical_dependency_function <em>Physical dependency function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physical dependency function</em>'.
	 * @see bpmnforcpsextension.MyModel.MustHappenAtABoundTime#getPhysical_dependency_function()
	 * @see #getMustHappenAtABoundTime()
	 * @generated
	 */
	EAttribute getMustHappenAtABoundTime_Physical_dependency_function();

	/**
	 * Returns the meta object for class '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtAnInfiniteTime <em>Must Never Happen At An Infinite Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Must Never Happen At An Infinite Time</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtAnInfiniteTime
	 * @generated
	 */
	EClass getMustNeverHappenAtAnInfiniteTime();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtAnInfiniteTime#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtAnInfiniteTime#getName()
	 * @see #getMustNeverHappenAtAnInfiniteTime()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtAnInfiniteTime_Name();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtAnInfiniteTime#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtAnInfiniteTime#getType()
	 * @see #getMustNeverHappenAtAnInfiniteTime()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtAnInfiniteTime_Type();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtAnInfiniteTime#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtAnInfiniteTime#getTarget()
	 * @see #getMustNeverHappenAtAnInfiniteTime()
	 * @generated
	 */
	EReference getMustNeverHappenAtAnInfiniteTime_Target();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtAnInfiniteTime#getDo_Happen <em>Do Happen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Do Happen</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtAnInfiniteTime#getDo_Happen()
	 * @see #getMustNeverHappenAtAnInfiniteTime()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtAnInfiniteTime_Do_Happen();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtAnInfiniteTime#getFirst_physical_property <em>First physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtAnInfiniteTime#getFirst_physical_property()
	 * @see #getMustNeverHappenAtAnInfiniteTime()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtAnInfiniteTime_First_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtAnInfiniteTime#getMin_value_of_the_first_physical_property <em>Min value of the first physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min value of the first physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtAnInfiniteTime#getMin_value_of_the_first_physical_property()
	 * @see #getMustNeverHappenAtAnInfiniteTime()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtAnInfiniteTime_Min_value_of_the_first_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtAnInfiniteTime#getMax_value_of_the_first_physical_property <em>Max value of the first physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max value of the first physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtAnInfiniteTime#getMax_value_of_the_first_physical_property()
	 * @see #getMustNeverHappenAtAnInfiniteTime()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtAnInfiniteTime_Max_value_of_the_first_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtAnInfiniteTime#getSecond_physical_property <em>Second physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtAnInfiniteTime#getSecond_physical_property()
	 * @see #getMustNeverHappenAtAnInfiniteTime()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtAnInfiniteTime_Second_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtAnInfiniteTime#getMin_value_of_the_second_physical_property <em>Min value of the second physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min value of the second physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtAnInfiniteTime#getMin_value_of_the_second_physical_property()
	 * @see #getMustNeverHappenAtAnInfiniteTime()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtAnInfiniteTime_Min_value_of_the_second_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtAnInfiniteTime#getMax_value_of_the_second_physical_property <em>Max value of the second physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max value of the second physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtAnInfiniteTime#getMax_value_of_the_second_physical_property()
	 * @see #getMustNeverHappenAtAnInfiniteTime()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtAnInfiniteTime_Max_value_of_the_second_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtAnInfiniteTime#getThird_physical_property <em>Third physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Third physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtAnInfiniteTime#getThird_physical_property()
	 * @see #getMustNeverHappenAtAnInfiniteTime()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtAnInfiniteTime_Third_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtAnInfiniteTime#getMin_value_of_the_third_physical_property <em>Min value of the third physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min value of the third physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtAnInfiniteTime#getMin_value_of_the_third_physical_property()
	 * @see #getMustNeverHappenAtAnInfiniteTime()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtAnInfiniteTime_Min_value_of_the_third_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtAnInfiniteTime#getMax_value_of_the_third_physical_property <em>Max value of the third physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max value of the third physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtAnInfiniteTime#getMax_value_of_the_third_physical_property()
	 * @see #getMustNeverHappenAtAnInfiniteTime()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtAnInfiniteTime_Max_value_of_the_third_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtAnInfiniteTime#getPhysical_dependency_function <em>Physical dependency function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physical dependency function</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtAnInfiniteTime#getPhysical_dependency_function()
	 * @see #getMustNeverHappenAtAnInfiniteTime()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtAnInfiniteTime_Physical_dependency_function();

	/**
	 * Returns the meta object for class '{@link bpmnforcpsextension.MyModel.MustNeverHappenAsLongAsTheActivityIsExecuting <em>Must Never Happen As Long As The Activity Is Executing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Must Never Happen As Long As The Activity Is Executing</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAsLongAsTheActivityIsExecuting
	 * @generated
	 */
	EClass getMustNeverHappenAsLongAsTheActivityIsExecuting();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAsLongAsTheActivityIsExecuting#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAsLongAsTheActivityIsExecuting#getName()
	 * @see #getMustNeverHappenAsLongAsTheActivityIsExecuting()
	 * @generated
	 */
	EAttribute getMustNeverHappenAsLongAsTheActivityIsExecuting_Name();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAsLongAsTheActivityIsExecuting#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAsLongAsTheActivityIsExecuting#getType()
	 * @see #getMustNeverHappenAsLongAsTheActivityIsExecuting()
	 * @generated
	 */
	EAttribute getMustNeverHappenAsLongAsTheActivityIsExecuting_Type();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.MustNeverHappenAsLongAsTheActivityIsExecuting#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAsLongAsTheActivityIsExecuting#getTarget()
	 * @see #getMustNeverHappenAsLongAsTheActivityIsExecuting()
	 * @generated
	 */
	EReference getMustNeverHappenAsLongAsTheActivityIsExecuting_Target();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAsLongAsTheActivityIsExecuting#getDo_Happen <em>Do Happen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Do Happen</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAsLongAsTheActivityIsExecuting#getDo_Happen()
	 * @see #getMustNeverHappenAsLongAsTheActivityIsExecuting()
	 * @generated
	 */
	EAttribute getMustNeverHappenAsLongAsTheActivityIsExecuting_Do_Happen();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAsLongAsTheActivityIsExecuting#getFirst_physical_property <em>First physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAsLongAsTheActivityIsExecuting#getFirst_physical_property()
	 * @see #getMustNeverHappenAsLongAsTheActivityIsExecuting()
	 * @generated
	 */
	EAttribute getMustNeverHappenAsLongAsTheActivityIsExecuting_First_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAsLongAsTheActivityIsExecuting#getMin_value_of_the_first_physical_property <em>Min value of the first physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min value of the first physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAsLongAsTheActivityIsExecuting#getMin_value_of_the_first_physical_property()
	 * @see #getMustNeverHappenAsLongAsTheActivityIsExecuting()
	 * @generated
	 */
	EAttribute getMustNeverHappenAsLongAsTheActivityIsExecuting_Min_value_of_the_first_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAsLongAsTheActivityIsExecuting#getMax_value_of_the_first_physical_property <em>Max value of the first physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max value of the first physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAsLongAsTheActivityIsExecuting#getMax_value_of_the_first_physical_property()
	 * @see #getMustNeverHappenAsLongAsTheActivityIsExecuting()
	 * @generated
	 */
	EAttribute getMustNeverHappenAsLongAsTheActivityIsExecuting_Max_value_of_the_first_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAsLongAsTheActivityIsExecuting#getSecond_physical_property <em>Second physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAsLongAsTheActivityIsExecuting#getSecond_physical_property()
	 * @see #getMustNeverHappenAsLongAsTheActivityIsExecuting()
	 * @generated
	 */
	EAttribute getMustNeverHappenAsLongAsTheActivityIsExecuting_Second_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAsLongAsTheActivityIsExecuting#getMin_value_of_the_second_physical_property <em>Min value of the second physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min value of the second physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAsLongAsTheActivityIsExecuting#getMin_value_of_the_second_physical_property()
	 * @see #getMustNeverHappenAsLongAsTheActivityIsExecuting()
	 * @generated
	 */
	EAttribute getMustNeverHappenAsLongAsTheActivityIsExecuting_Min_value_of_the_second_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAsLongAsTheActivityIsExecuting#getMax_value_of_the_second_physical_property <em>Max value of the second physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max value of the second physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAsLongAsTheActivityIsExecuting#getMax_value_of_the_second_physical_property()
	 * @see #getMustNeverHappenAsLongAsTheActivityIsExecuting()
	 * @generated
	 */
	EAttribute getMustNeverHappenAsLongAsTheActivityIsExecuting_Max_value_of_the_second_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAsLongAsTheActivityIsExecuting#getThird_physical_property <em>Third physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Third physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAsLongAsTheActivityIsExecuting#getThird_physical_property()
	 * @see #getMustNeverHappenAsLongAsTheActivityIsExecuting()
	 * @generated
	 */
	EAttribute getMustNeverHappenAsLongAsTheActivityIsExecuting_Third_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAsLongAsTheActivityIsExecuting#getMin_value_of_the_third_physical_property <em>Min value of the third physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min value of the third physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAsLongAsTheActivityIsExecuting#getMin_value_of_the_third_physical_property()
	 * @see #getMustNeverHappenAsLongAsTheActivityIsExecuting()
	 * @generated
	 */
	EAttribute getMustNeverHappenAsLongAsTheActivityIsExecuting_Min_value_of_the_third_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAsLongAsTheActivityIsExecuting#getMax_value_of_the_third_physical_property <em>Max value of the third physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max value of the third physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAsLongAsTheActivityIsExecuting#getMax_value_of_the_third_physical_property()
	 * @see #getMustNeverHappenAsLongAsTheActivityIsExecuting()
	 * @generated
	 */
	EAttribute getMustNeverHappenAsLongAsTheActivityIsExecuting_Max_value_of_the_third_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAsLongAsTheActivityIsExecuting#getPhysical_dependency_function <em>Physical dependency function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physical dependency function</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAsLongAsTheActivityIsExecuting#getPhysical_dependency_function()
	 * @see #getMustNeverHappenAsLongAsTheActivityIsExecuting()
	 * @generated
	 */
	EAttribute getMustNeverHappenAsLongAsTheActivityIsExecuting_Physical_dependency_function();

	/**
	 * Returns the meta object for class '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheStartOfTheActivity <em>Must Never Happen At The Start Of The Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Must Never Happen At The Start Of The Activity</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtTheStartOfTheActivity
	 * @generated
	 */
	EClass getMustNeverHappenAtTheStartOfTheActivity();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheStartOfTheActivity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtTheStartOfTheActivity#getName()
	 * @see #getMustNeverHappenAtTheStartOfTheActivity()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtTheStartOfTheActivity_Name();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheStartOfTheActivity#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtTheStartOfTheActivity#getType()
	 * @see #getMustNeverHappenAtTheStartOfTheActivity()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtTheStartOfTheActivity_Type();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheStartOfTheActivity#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtTheStartOfTheActivity#getTarget()
	 * @see #getMustNeverHappenAtTheStartOfTheActivity()
	 * @generated
	 */
	EReference getMustNeverHappenAtTheStartOfTheActivity_Target();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheStartOfTheActivity#getDo_Happen <em>Do Happen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Do Happen</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtTheStartOfTheActivity#getDo_Happen()
	 * @see #getMustNeverHappenAtTheStartOfTheActivity()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtTheStartOfTheActivity_Do_Happen();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheStartOfTheActivity#getFirst_physical_property <em>First physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtTheStartOfTheActivity#getFirst_physical_property()
	 * @see #getMustNeverHappenAtTheStartOfTheActivity()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtTheStartOfTheActivity_First_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheStartOfTheActivity#getMin_value_of_the_first_physical_property <em>Min value of the first physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min value of the first physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtTheStartOfTheActivity#getMin_value_of_the_first_physical_property()
	 * @see #getMustNeverHappenAtTheStartOfTheActivity()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtTheStartOfTheActivity_Min_value_of_the_first_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheStartOfTheActivity#getMax_value_of_the_first_physical_property <em>Max value of the first physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max value of the first physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtTheStartOfTheActivity#getMax_value_of_the_first_physical_property()
	 * @see #getMustNeverHappenAtTheStartOfTheActivity()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtTheStartOfTheActivity_Max_value_of_the_first_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheStartOfTheActivity#getSecond_physical_property <em>Second physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtTheStartOfTheActivity#getSecond_physical_property()
	 * @see #getMustNeverHappenAtTheStartOfTheActivity()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtTheStartOfTheActivity_Second_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheStartOfTheActivity#getMin_value_of_the_second_physical_property <em>Min value of the second physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min value of the second physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtTheStartOfTheActivity#getMin_value_of_the_second_physical_property()
	 * @see #getMustNeverHappenAtTheStartOfTheActivity()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtTheStartOfTheActivity_Min_value_of_the_second_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheStartOfTheActivity#getMax_value_of_the_second_physical_property <em>Max value of the second physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max value of the second physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtTheStartOfTheActivity#getMax_value_of_the_second_physical_property()
	 * @see #getMustNeverHappenAtTheStartOfTheActivity()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtTheStartOfTheActivity_Max_value_of_the_second_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheStartOfTheActivity#getThird_physical_property <em>Third physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Third physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtTheStartOfTheActivity#getThird_physical_property()
	 * @see #getMustNeverHappenAtTheStartOfTheActivity()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtTheStartOfTheActivity_Third_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheStartOfTheActivity#getMin_value_of_the_third_physical_property <em>Min value of the third physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min value of the third physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtTheStartOfTheActivity#getMin_value_of_the_third_physical_property()
	 * @see #getMustNeverHappenAtTheStartOfTheActivity()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtTheStartOfTheActivity_Min_value_of_the_third_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheStartOfTheActivity#getMax_value_of_the_third_physical_property <em>Max value of the third physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max value of the third physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtTheStartOfTheActivity#getMax_value_of_the_third_physical_property()
	 * @see #getMustNeverHappenAtTheStartOfTheActivity()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtTheStartOfTheActivity_Max_value_of_the_third_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheStartOfTheActivity#getPhysical_dependency_function <em>Physical dependency function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physical dependency function</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtTheStartOfTheActivity#getPhysical_dependency_function()
	 * @see #getMustNeverHappenAtTheStartOfTheActivity()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtTheStartOfTheActivity_Physical_dependency_function();

	/**
	 * Returns the meta object for class '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity <em>Must Never Happen At The End Of The Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Must Never Happen At The End Of The Activity</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity
	 * @generated
	 */
	EClass getMustNeverHappenAtTheEndOfTheActivity();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getName()
	 * @see #getMustNeverHappenAtTheEndOfTheActivity()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtTheEndOfTheActivity_Name();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getType()
	 * @see #getMustNeverHappenAtTheEndOfTheActivity()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtTheEndOfTheActivity_Type();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getTarget()
	 * @see #getMustNeverHappenAtTheEndOfTheActivity()
	 * @generated
	 */
	EReference getMustNeverHappenAtTheEndOfTheActivity_Target();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getDo_Happen <em>Do Happen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Do Happen</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getDo_Happen()
	 * @see #getMustNeverHappenAtTheEndOfTheActivity()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtTheEndOfTheActivity_Do_Happen();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getFirst_physical_property <em>First physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getFirst_physical_property()
	 * @see #getMustNeverHappenAtTheEndOfTheActivity()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtTheEndOfTheActivity_First_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getMin_value_of_the_first_physical_property <em>Min value of the first physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min value of the first physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getMin_value_of_the_first_physical_property()
	 * @see #getMustNeverHappenAtTheEndOfTheActivity()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtTheEndOfTheActivity_Min_value_of_the_first_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getMax_value_of_the_first_physical_property <em>Max value of the first physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max value of the first physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getMax_value_of_the_first_physical_property()
	 * @see #getMustNeverHappenAtTheEndOfTheActivity()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtTheEndOfTheActivity_Max_value_of_the_first_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getSecond_physical_property <em>Second physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getSecond_physical_property()
	 * @see #getMustNeverHappenAtTheEndOfTheActivity()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtTheEndOfTheActivity_Second_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getMin_value_of_the_second_physical_property <em>Min value of the second physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min value of the second physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getMin_value_of_the_second_physical_property()
	 * @see #getMustNeverHappenAtTheEndOfTheActivity()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtTheEndOfTheActivity_Min_value_of_the_second_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getMax_value_of_the_second_physical_property <em>Max value of the second physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max value of the second physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getMax_value_of_the_second_physical_property()
	 * @see #getMustNeverHappenAtTheEndOfTheActivity()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtTheEndOfTheActivity_Max_value_of_the_second_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getThird_physical_property <em>Third physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Third physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getThird_physical_property()
	 * @see #getMustNeverHappenAtTheEndOfTheActivity()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtTheEndOfTheActivity_Third_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getMin_value_of_the_third_physical_property <em>Min value of the third physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min value of the third physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getMin_value_of_the_third_physical_property()
	 * @see #getMustNeverHappenAtTheEndOfTheActivity()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtTheEndOfTheActivity_Min_value_of_the_third_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getMax_value_of_the_third_physical_property <em>Max value of the third physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max value of the third physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getMax_value_of_the_third_physical_property()
	 * @see #getMustNeverHappenAtTheEndOfTheActivity()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtTheEndOfTheActivity_Max_value_of_the_third_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getPhysical_dependency_function <em>Physical dependency function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physical dependency function</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity#getPhysical_dependency_function()
	 * @see #getMustNeverHappenAtTheEndOfTheActivity()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtTheEndOfTheActivity_Physical_dependency_function();

	/**
	 * Returns the meta object for class '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime <em>Must Never Happen At ABound Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Must Never Happen At ABound Time</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime
	 * @generated
	 */
	EClass getMustNeverHappenAtABoundTime();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime#getName()
	 * @see #getMustNeverHappenAtABoundTime()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtABoundTime_Name();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime#getType()
	 * @see #getMustNeverHappenAtABoundTime()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtABoundTime_Type();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime#getTarget()
	 * @see #getMustNeverHappenAtABoundTime()
	 * @generated
	 */
	EReference getMustNeverHappenAtABoundTime_Target();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime#getDo_Happen <em>Do Happen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Do Happen</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime#getDo_Happen()
	 * @see #getMustNeverHappenAtABoundTime()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtABoundTime_Do_Happen();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime#getMax_bound_time <em>Max bound time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max bound time</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime#getMax_bound_time()
	 * @see #getMustNeverHappenAtABoundTime()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtABoundTime_Max_bound_time();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime#getMin_bound_time <em>Min bound time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min bound time</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime#getMin_bound_time()
	 * @see #getMustNeverHappenAtABoundTime()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtABoundTime_Min_bound_time();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime#getFirst_physical_property <em>First physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime#getFirst_physical_property()
	 * @see #getMustNeverHappenAtABoundTime()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtABoundTime_First_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime#getMin_value_of_the_first_physical_property <em>Min value of the first physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min value of the first physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime#getMin_value_of_the_first_physical_property()
	 * @see #getMustNeverHappenAtABoundTime()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtABoundTime_Min_value_of_the_first_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime#getMax_value_of_the_first_physical_property <em>Max value of the first physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max value of the first physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime#getMax_value_of_the_first_physical_property()
	 * @see #getMustNeverHappenAtABoundTime()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtABoundTime_Max_value_of_the_first_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime#getSecond_physical_property <em>Second physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime#getSecond_physical_property()
	 * @see #getMustNeverHappenAtABoundTime()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtABoundTime_Second_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime#getMin_value_of_the_second_physical_property <em>Min value of the second physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min value of the second physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime#getMin_value_of_the_second_physical_property()
	 * @see #getMustNeverHappenAtABoundTime()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtABoundTime_Min_value_of_the_second_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime#getMax_value_of_the_second_physical_property <em>Max value of the second physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max value of the second physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime#getMax_value_of_the_second_physical_property()
	 * @see #getMustNeverHappenAtABoundTime()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtABoundTime_Max_value_of_the_second_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime#getThird_physical_property <em>Third physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Third physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime#getThird_physical_property()
	 * @see #getMustNeverHappenAtABoundTime()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtABoundTime_Third_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime#getMin_value_of_the_third_physical_property <em>Min value of the third physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min value of the third physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime#getMin_value_of_the_third_physical_property()
	 * @see #getMustNeverHappenAtABoundTime()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtABoundTime_Min_value_of_the_third_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime#getMax_value_of_the_third_physical_property <em>Max value of the third physical property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max value of the third physical property</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime#getMax_value_of_the_third_physical_property()
	 * @see #getMustNeverHappenAtABoundTime()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtABoundTime_Max_value_of_the_third_physical_property();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime#getPhysical_dependency_function <em>Physical dependency function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physical dependency function</em>'.
	 * @see bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime#getPhysical_dependency_function()
	 * @see #getMustNeverHappenAtABoundTime()
	 * @generated
	 */
	EAttribute getMustNeverHappenAtABoundTime_Physical_dependency_function();

	/**
	 * Returns the meta object for class '{@link bpmnforcpsextension.MyModel.PeriodicEvent <em>Periodic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Periodic Event</em>'.
	 * @see bpmnforcpsextension.MyModel.PeriodicEvent
	 * @generated
	 */
	EClass getPeriodicEvent();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.PeriodicEvent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bpmnforcpsextension.MyModel.PeriodicEvent#getName()
	 * @see #getPeriodicEvent()
	 * @generated
	 */
	EAttribute getPeriodicEvent_Name();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.PeriodicEvent#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see bpmnforcpsextension.MyModel.PeriodicEvent#getTarget()
	 * @see #getPeriodicEvent()
	 * @generated
	 */
	EReference getPeriodicEvent_Target();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.PeriodicEvent#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see bpmnforcpsextension.MyModel.PeriodicEvent#getValue()
	 * @see #getPeriodicEvent()
	 * @generated
	 */
	EAttribute getPeriodicEvent_Value();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.PeriodicEvent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bpmnforcpsextension.MyModel.PeriodicEvent#getType()
	 * @see #getPeriodicEvent()
	 * @generated
	 */
	EAttribute getPeriodicEvent_Type();

	/**
	 * Returns the meta object for class '{@link bpmnforcpsextension.MyModel.SporadicEvent <em>Sporadic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sporadic Event</em>'.
	 * @see bpmnforcpsextension.MyModel.SporadicEvent
	 * @generated
	 */
	EClass getSporadicEvent();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.SporadicEvent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bpmnforcpsextension.MyModel.SporadicEvent#getName()
	 * @see #getSporadicEvent()
	 * @generated
	 */
	EAttribute getSporadicEvent_Name();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.SporadicEvent#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see bpmnforcpsextension.MyModel.SporadicEvent#getTarget()
	 * @see #getSporadicEvent()
	 * @generated
	 */
	EReference getSporadicEvent_Target();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.SporadicEvent#getMax_time <em>Max time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max time</em>'.
	 * @see bpmnforcpsextension.MyModel.SporadicEvent#getMax_time()
	 * @see #getSporadicEvent()
	 * @generated
	 */
	EAttribute getSporadicEvent_Max_time();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.SporadicEvent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bpmnforcpsextension.MyModel.SporadicEvent#getType()
	 * @see #getSporadicEvent()
	 * @generated
	 */
	EAttribute getSporadicEvent_Type();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.SporadicEvent#getMin_time <em>Min time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min time</em>'.
	 * @see bpmnforcpsextension.MyModel.SporadicEvent#getMin_time()
	 * @see #getSporadicEvent()
	 * @generated
	 */
	EAttribute getSporadicEvent_Min_time();

	/**
	 * Returns the meta object for class '{@link bpmnforcpsextension.MyModel.PeriodicActivity <em>Periodic Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Periodic Activity</em>'.
	 * @see bpmnforcpsextension.MyModel.PeriodicActivity
	 * @generated
	 */
	EClass getPeriodicActivity();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.PeriodicActivity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bpmnforcpsextension.MyModel.PeriodicActivity#getName()
	 * @see #getPeriodicActivity()
	 * @generated
	 */
	EAttribute getPeriodicActivity_Name();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.PeriodicActivity#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see bpmnforcpsextension.MyModel.PeriodicActivity#getTarget()
	 * @see #getPeriodicActivity()
	 * @generated
	 */
	EReference getPeriodicActivity_Target();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.PeriodicActivity#getTime_value <em>Time value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time value</em>'.
	 * @see bpmnforcpsextension.MyModel.PeriodicActivity#getTime_value()
	 * @see #getPeriodicActivity()
	 * @generated
	 */
	EAttribute getPeriodicActivity_Time_value();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.PeriodicActivity#getTimer_Type <em>Timer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timer Type</em>'.
	 * @see bpmnforcpsextension.MyModel.PeriodicActivity#getTimer_Type()
	 * @see #getPeriodicActivity()
	 * @generated
	 */
	EAttribute getPeriodicActivity_Timer_Type();

	/**
	 * Returns the meta object for class '{@link bpmnforcpsextension.MyModel.SporadicActivity <em>Sporadic Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sporadic Activity</em>'.
	 * @see bpmnforcpsextension.MyModel.SporadicActivity
	 * @generated
	 */
	EClass getSporadicActivity();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.SporadicActivity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bpmnforcpsextension.MyModel.SporadicActivity#getName()
	 * @see #getSporadicActivity()
	 * @generated
	 */
	EAttribute getSporadicActivity_Name();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.SporadicActivity#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see bpmnforcpsextension.MyModel.SporadicActivity#getTarget()
	 * @see #getSporadicActivity()
	 * @generated
	 */
	EReference getSporadicActivity_Target();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.SporadicActivity#getMax_time <em>Max time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max time</em>'.
	 * @see bpmnforcpsextension.MyModel.SporadicActivity#getMax_time()
	 * @see #getSporadicActivity()
	 * @generated
	 */
	EAttribute getSporadicActivity_Max_time();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.SporadicActivity#getMin_time <em>Min time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min time</em>'.
	 * @see bpmnforcpsextension.MyModel.SporadicActivity#getMin_time()
	 * @see #getSporadicActivity()
	 * @generated
	 */
	EAttribute getSporadicActivity_Min_time();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.SporadicActivity#getTimer_Type <em>Timer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timer Type</em>'.
	 * @see bpmnforcpsextension.MyModel.SporadicActivity#getTimer_Type()
	 * @see #getSporadicActivity()
	 * @generated
	 */
	EAttribute getSporadicActivity_Timer_Type();

	/**
	 * Returns the meta object for class '{@link bpmnforcpsextension.MyModel.Duration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duration</em>'.
	 * @see bpmnforcpsextension.MyModel.Duration
	 * @generated
	 */
	EClass getDuration();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.Duration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bpmnforcpsextension.MyModel.Duration#getName()
	 * @see #getDuration()
	 * @generated
	 */
	EAttribute getDuration_Name();

	/**
	 * Returns the meta object for the reference '{@link bpmnforcpsextension.MyModel.Duration#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see bpmnforcpsextension.MyModel.Duration#getTarget()
	 * @see #getDuration()
	 * @generated
	 */
	EReference getDuration_Target();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.Duration#getMin_time_duration <em>Min time duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min time duration</em>'.
	 * @see bpmnforcpsextension.MyModel.Duration#getMin_time_duration()
	 * @see #getDuration()
	 * @generated
	 */
	EAttribute getDuration_Min_time_duration();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.Duration#getMax_time_duration <em>Max time duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max time duration</em>'.
	 * @see bpmnforcpsextension.MyModel.Duration#getMax_time_duration()
	 * @see #getDuration()
	 * @generated
	 */
	EAttribute getDuration_Max_time_duration();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.Duration#getTime_Type <em>Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Type</em>'.
	 * @see bpmnforcpsextension.MyModel.Duration#getTime_Type()
	 * @see #getDuration()
	 * @generated
	 */
	EAttribute getDuration_Time_Type();

	/**
	 * Returns the meta object for class '{@link bpmnforcpsextension.MyModel.PhysicalEntityTask <em>Physical Entity Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Entity Task</em>'.
	 * @see bpmnforcpsextension.MyModel.PhysicalEntityTask
	 * @generated
	 */
	EClass getPhysicalEntityTask();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.PhysicalEntityTask#getCPSPerformerRef <em>CPS Performer Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CPS Performer Ref</em>'.
	 * @see bpmnforcpsextension.MyModel.PhysicalEntityTask#getCPSPerformerRef()
	 * @see #getPhysicalEntityTask()
	 * @generated
	 */
	EAttribute getPhysicalEntityTask_CPSPerformerRef();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.PhysicalEntityTask#getCPSDeviceRoleParameters <em>CPS Device Role Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CPS Device Role Parameters</em>'.
	 * @see bpmnforcpsextension.MyModel.PhysicalEntityTask#getCPSDeviceRoleParameters()
	 * @see #getPhysicalEntityTask()
	 * @generated
	 */
	EAttribute getPhysicalEntityTask_CPSDeviceRoleParameters();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.PhysicalEntityTask#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bpmnforcpsextension.MyModel.PhysicalEntityTask#getType()
	 * @see #getPhysicalEntityTask()
	 * @generated
	 */
	EAttribute getPhysicalEntityTask_Type();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.PhysicalEntityTask#isIsMovable <em>Is Movable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Movable</em>'.
	 * @see bpmnforcpsextension.MyModel.PhysicalEntityTask#isIsMovable()
	 * @see #getPhysicalEntityTask()
	 * @generated
	 */
	EAttribute getPhysicalEntityTask_IsMovable();

	/**
	 * Returns the meta object for class '{@link bpmnforcpsextension.MyModel.MyEventDefinition <em>My Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>My Event Definition</em>'.
	 * @see bpmnforcpsextension.MyModel.MyEventDefinition
	 * @generated
	 */
	EClass getMyEventDefinition();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.MyEventDefinition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see bpmnforcpsextension.MyModel.MyEventDefinition#getValue()
	 * @see #getMyEventDefinition()
	 * @generated
	 */
	EAttribute getMyEventDefinition_Value();

	/**
	 * Returns the meta object for class '{@link bpmnforcpsextension.MyModel.RealWorldProperties <em>Real World Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real World Properties</em>'.
	 * @see bpmnforcpsextension.MyModel.RealWorldProperties
	 * @generated
	 */
	EClass getRealWorldProperties();

	/**
	 * Returns the meta object for the attribute '{@link bpmnforcpsextension.MyModel.RealWorldProperties#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameters</em>'.
	 * @see bpmnforcpsextension.MyModel.RealWorldProperties#getParameters()
	 * @see #getRealWorldProperties()
	 * @generated
	 */
	EAttribute getRealWorldProperties_Parameters();

	/**
	 * Returns the meta object for enum '{@link bpmnforcpsextension.MyModel.Physical_Properties <em>Physical Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Physical Properties</em>'.
	 * @see bpmnforcpsextension.MyModel.Physical_Properties
	 * @generated
	 */
	EEnum getPhysical_Properties();

	/**
	 * Returns the meta object for enum '{@link bpmnforcpsextension.MyModel.TypeDevice <em>Type Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Device</em>'.
	 * @see bpmnforcpsextension.MyModel.TypeDevice
	 * @generated
	 */
	EEnum getTypeDevice();

	/**
	 * Returns the meta object for enum '{@link bpmnforcpsextension.MyModel.Timer_Type <em>Timer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Timer Type</em>'.
	 * @see bpmnforcpsextension.MyModel.Timer_Type
	 * @generated
	 */
	EEnum getTimer_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MyModelFactory getMyModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link bpmnforcpsextension.MyModel.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnforcpsextension.MyModel.impl.DocumentRootImpl
		 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Task Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TASK_CONFIG = eINSTANCE.getDocumentRoot_TaskConfig();

		/**
		 * The meta object literal for the '<em><b>Temporal Dependency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TEMPORAL_DEPENDENCY = eINSTANCE.getDocumentRoot_TemporalDependency();

		/**
		 * The meta object literal for the '<em><b>Meta Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__META_DATA = eINSTANCE.getDocumentRoot_MetaData();

		/**
		 * The meta object literal for the '<em><b>Msa</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MSA = eINSTANCE.getDocumentRoot_Msa();

		/**
		 * The meta object literal for the '<em><b>Moa</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MOA = eINSTANCE.getDocumentRoot_Moa();

		/**
		 * The meta object literal for the '<em><b>Mfa</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MFA = eINSTANCE.getDocumentRoot_Mfa();

		/**
		 * The meta object literal for the '<em><b>Msi</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MSI = eINSTANCE.getDocumentRoot_Msi();

		/**
		 * The meta object literal for the '<em><b>Moi</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MOI = eINSTANCE.getDocumentRoot_Moi();

		/**
		 * The meta object literal for the '<em><b>Mfi</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MFI = eINSTANCE.getDocumentRoot_Mfi();

		/**
		 * The meta object literal for the '<em><b>Musthappenataninfinitetime</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MUSTHAPPENATANINFINITETIME = eINSTANCE.getDocumentRoot_Musthappenataninfinitetime();

		/**
		 * The meta object literal for the '<em><b>Musthappenaslongastheactivityisexecuting</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MUSTHAPPENASLONGASTHEACTIVITYISEXECUTING = eINSTANCE.getDocumentRoot_Musthappenaslongastheactivityisexecuting();

		/**
		 * The meta object literal for the '<em><b>Musthappenatthestartoftheactivity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MUSTHAPPENATTHESTARTOFTHEACTIVITY = eINSTANCE.getDocumentRoot_Musthappenatthestartoftheactivity();

		/**
		 * The meta object literal for the '<em><b>Musthappenattheendoftheactivity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MUSTHAPPENATTHEENDOFTHEACTIVITY = eINSTANCE.getDocumentRoot_Musthappenattheendoftheactivity();

		/**
		 * The meta object literal for the '<em><b>Musthappenataboundtime</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MUSTHAPPENATABOUNDTIME = eINSTANCE.getDocumentRoot_Musthappenataboundtime();

		/**
		 * The meta object literal for the '<em><b>Mustneverhappenataninfinitetime</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MUSTNEVERHAPPENATANINFINITETIME = eINSTANCE.getDocumentRoot_Mustneverhappenataninfinitetime();

		/**
		 * The meta object literal for the '<em><b>Mustneverhappenatthestartoftheactivity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MUSTNEVERHAPPENATTHESTARTOFTHEACTIVITY = eINSTANCE.getDocumentRoot_Mustneverhappenatthestartoftheactivity();

		/**
		 * The meta object literal for the '<em><b>Mustneverhappenattheendoftheactivity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MUSTNEVERHAPPENATTHEENDOFTHEACTIVITY = eINSTANCE.getDocumentRoot_Mustneverhappenattheendoftheactivity();

		/**
		 * The meta object literal for the '<em><b>Mustneverhappenataboundtime</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MUSTNEVERHAPPENATABOUNDTIME = eINSTANCE.getDocumentRoot_Mustneverhappenataboundtime();

		/**
		 * The meta object literal for the '<em><b>Myeventdefinition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MYEVENTDEFINITION = eINSTANCE.getDocumentRoot_Myeventdefinition();

		/**
		 * The meta object literal for the '<em><b>Periodicevent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PERIODICEVENT = eINSTANCE.getDocumentRoot_Periodicevent();

		/**
		 * The meta object literal for the '<em><b>Sporadicevent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SPORADICEVENT = eINSTANCE.getDocumentRoot_Sporadicevent();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DURATION = eINSTANCE.getDocumentRoot_Duration();

		/**
		 * The meta object literal for the '<em><b>Physicalentitytask</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PHYSICALENTITYTASK = eINSTANCE.getDocumentRoot_Physicalentitytask();

		/**
		 * The meta object literal for the '<em><b>Realworldproperties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REALWORLDPROPERTIES = eINSTANCE.getDocumentRoot_Realworldproperties();

		/**
		 * The meta object literal for the '{@link bpmnforcpsextension.MyModel.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnforcpsextension.MyModel.impl.ParameterImpl
		 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '{@link bpmnforcpsextension.MyModel.impl.MetaDataImpl <em>Meta Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnforcpsextension.MyModel.impl.MetaDataImpl
		 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getMetaData()
		 * @generated
		 */
		EClass META_DATA = eINSTANCE.getMetaData();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_DATA__MIXED = eINSTANCE.getMetaData_Mixed();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_DATA__NAME = eINSTANCE.getMetaData_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_DATA__VALUE = eINSTANCE.getMetaData_Value();

		/**
		 * The meta object literal for the '{@link bpmnforcpsextension.MyModel.impl.TaskConfigImpl <em>Task Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnforcpsextension.MyModel.impl.TaskConfigImpl
		 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getTaskConfig()
		 * @generated
		 */
		EClass TASK_CONFIG = eINSTANCE.getTaskConfig();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_CONFIG__PARAMETERS = eINSTANCE.getTaskConfig_Parameters();

		/**
		 * The meta object literal for the '{@link bpmnforcpsextension.MyModel.impl.TemporalDependencyImpl <em>Temporal Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnforcpsextension.MyModel.impl.TemporalDependencyImpl
		 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getTemporalDependency()
		 * @generated
		 */
		EClass TEMPORAL_DEPENDENCY = eINSTANCE.getTemporalDependency();

		/**
		 * The meta object literal for the '<em><b>Source Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_DEPENDENCY__SOURCE_REF = eINSTANCE.getTemporalDependency_SourceRef();

		/**
		 * The meta object literal for the '<em><b>Target Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_DEPENDENCY__TARGET_REF = eINSTANCE.getTemporalDependency_TargetRef();

		/**
		 * The meta object literal for the '<em><b>Max value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_DEPENDENCY__MAX_VALUE = eINSTANCE.getTemporalDependency_Max_value();

		/**
		 * The meta object literal for the '<em><b>Min value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_DEPENDENCY__MIN_VALUE = eINSTANCE.getTemporalDependency_Min_value();

		/**
		 * The meta object literal for the '{@link bpmnforcpsextension.MyModel.impl.MSAImpl <em>MSA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnforcpsextension.MyModel.impl.MSAImpl
		 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getMSA()
		 * @generated
		 */
		EClass MSA = eINSTANCE.getMSA();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSA__NAME = eINSTANCE.getMSA_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSA__TYPE = eINSTANCE.getMSA_Type();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSA__TARGET = eINSTANCE.getMSA_Target();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSA__VALUE = eINSTANCE.getMSA_Value();

		/**
		 * The meta object literal for the '{@link bpmnforcpsextension.MyModel.impl.MOAImpl <em>MOA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnforcpsextension.MyModel.impl.MOAImpl
		 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getMOA()
		 * @generated
		 */
		EClass MOA = eINSTANCE.getMOA();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOA__NAME = eINSTANCE.getMOA_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOA__TYPE = eINSTANCE.getMOA_Type();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOA__TARGET = eINSTANCE.getMOA_Target();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOA__VALUE = eINSTANCE.getMOA_Value();

		/**
		 * The meta object literal for the '{@link bpmnforcpsextension.MyModel.impl.MFAImpl <em>MFA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnforcpsextension.MyModel.impl.MFAImpl
		 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getMFA()
		 * @generated
		 */
		EClass MFA = eINSTANCE.getMFA();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MFA__NAME = eINSTANCE.getMFA_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MFA__TYPE = eINSTANCE.getMFA_Type();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MFA__TARGET = eINSTANCE.getMFA_Target();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MFA__VALUE = eINSTANCE.getMFA_Value();

		/**
		 * The meta object literal for the '{@link bpmnforcpsextension.MyModel.impl.MSIImpl <em>MSI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnforcpsextension.MyModel.impl.MSIImpl
		 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getMSI()
		 * @generated
		 */
		EClass MSI = eINSTANCE.getMSI();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSI__NAME = eINSTANCE.getMSI_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSI__TYPE = eINSTANCE.getMSI_Type();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSI__TARGET = eINSTANCE.getMSI_Target();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSI__MIN_VALUE = eINSTANCE.getMSI_Min_Value();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSI__MAX_VALUE = eINSTANCE.getMSI_Max_Value();

		/**
		 * The meta object literal for the '{@link bpmnforcpsextension.MyModel.impl.MOIImpl <em>MOI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnforcpsextension.MyModel.impl.MOIImpl
		 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getMOI()
		 * @generated
		 */
		EClass MOI = eINSTANCE.getMOI();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOI__NAME = eINSTANCE.getMOI_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOI__TYPE = eINSTANCE.getMOI_Type();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOI__TARGET = eINSTANCE.getMOI_Target();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOI__MIN_VALUE = eINSTANCE.getMOI_Min_Value();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOI__MAX_VALUE = eINSTANCE.getMOI_Max_Value();

		/**
		 * The meta object literal for the '{@link bpmnforcpsextension.MyModel.impl.MFIImpl <em>MFI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnforcpsextension.MyModel.impl.MFIImpl
		 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getMFI()
		 * @generated
		 */
		EClass MFI = eINSTANCE.getMFI();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MFI__NAME = eINSTANCE.getMFI_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MFI__TYPE = eINSTANCE.getMFI_Type();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MFI__TARGET = eINSTANCE.getMFI_Target();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MFI__MIN_VALUE = eINSTANCE.getMFI_Min_Value();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MFI__MAX_VALUE = eINSTANCE.getMFI_Max_Value();

		/**
		 * The meta object literal for the '{@link bpmnforcpsextension.MyModel.impl.MustHappenAtAnInfiniteTimeImpl <em>Must Happen At An Infinite Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnforcpsextension.MyModel.impl.MustHappenAtAnInfiniteTimeImpl
		 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getMustHappenAtAnInfiniteTime()
		 * @generated
		 */
		EClass MUST_HAPPEN_AT_AN_INFINITE_TIME = eINSTANCE.getMustHappenAtAnInfiniteTime();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_AN_INFINITE_TIME__NAME = eINSTANCE.getMustHappenAtAnInfiniteTime_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_AN_INFINITE_TIME__TYPE = eINSTANCE.getMustHappenAtAnInfiniteTime_Type();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUST_HAPPEN_AT_AN_INFINITE_TIME__TARGET = eINSTANCE.getMustHappenAtAnInfiniteTime_Target();

		/**
		 * The meta object literal for the '<em><b>Do Happen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_AN_INFINITE_TIME__DO_HAPPEN = eINSTANCE.getMustHappenAtAnInfiniteTime_Do_Happen();

		/**
		 * The meta object literal for the '<em><b>First physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_AN_INFINITE_TIME__FIRST_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAtAnInfiniteTime_First_physical_property();

		/**
		 * The meta object literal for the '<em><b>Min value of the first physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_AN_INFINITE_TIME__MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAtAnInfiniteTime_Min_value_of_the_first_physical_property();

		/**
		 * The meta object literal for the '<em><b>Max value of the first physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_AN_INFINITE_TIME__MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAtAnInfiniteTime_Max_value_of_the_first_physical_property();

		/**
		 * The meta object literal for the '<em><b>Second physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_AN_INFINITE_TIME__SECOND_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAtAnInfiniteTime_Second_physical_property();

		/**
		 * The meta object literal for the '<em><b>Min value of the second physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_AN_INFINITE_TIME__MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAtAnInfiniteTime_Min_value_of_the_second_physical_property();

		/**
		 * The meta object literal for the '<em><b>Max value of the second physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_AN_INFINITE_TIME__MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAtAnInfiniteTime_Max_value_of_the_second_physical_property();

		/**
		 * The meta object literal for the '<em><b>Third physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_AN_INFINITE_TIME__THIRD_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAtAnInfiniteTime_Third_physical_property();

		/**
		 * The meta object literal for the '<em><b>Min value of the third physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_AN_INFINITE_TIME__MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAtAnInfiniteTime_Min_value_of_the_third_physical_property();

		/**
		 * The meta object literal for the '<em><b>Max value of the third physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_AN_INFINITE_TIME__MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAtAnInfiniteTime_Max_value_of_the_third_physical_property();

		/**
		 * The meta object literal for the '<em><b>Physical dependency function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_AN_INFINITE_TIME__PHYSICAL_DEPENDENCY_FUNCTION = eINSTANCE.getMustHappenAtAnInfiniteTime_Physical_dependency_function();

		/**
		 * The meta object literal for the '{@link bpmnforcpsextension.MyModel.impl.MustHappenAsLongAsTheActivityIsExecutingImpl <em>Must Happen As Long As The Activity Is Executing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnforcpsextension.MyModel.impl.MustHappenAsLongAsTheActivityIsExecutingImpl
		 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getMustHappenAsLongAsTheActivityIsExecuting()
		 * @generated
		 */
		EClass MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING = eINSTANCE.getMustHappenAsLongAsTheActivityIsExecuting();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__NAME = eINSTANCE.getMustHappenAsLongAsTheActivityIsExecuting_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__TYPE = eINSTANCE.getMustHappenAsLongAsTheActivityIsExecuting_Type();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__TARGET = eINSTANCE.getMustHappenAsLongAsTheActivityIsExecuting_Target();

		/**
		 * The meta object literal for the '<em><b>Do Happen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__DO_HAPPEN = eINSTANCE.getMustHappenAsLongAsTheActivityIsExecuting_Do_Happen();

		/**
		 * The meta object literal for the '<em><b>First physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__FIRST_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAsLongAsTheActivityIsExecuting_First_physical_property();

		/**
		 * The meta object literal for the '<em><b>Min value of the first physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAsLongAsTheActivityIsExecuting_Min_value_of_the_first_physical_property();

		/**
		 * The meta object literal for the '<em><b>Max value of the first physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAsLongAsTheActivityIsExecuting_Max_value_of_the_first_physical_property();

		/**
		 * The meta object literal for the '<em><b>Second physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__SECOND_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAsLongAsTheActivityIsExecuting_Second_physical_property();

		/**
		 * The meta object literal for the '<em><b>Min value of the second physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAsLongAsTheActivityIsExecuting_Min_value_of_the_second_physical_property();

		/**
		 * The meta object literal for the '<em><b>Max value of the second physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAsLongAsTheActivityIsExecuting_Max_value_of_the_second_physical_property();

		/**
		 * The meta object literal for the '<em><b>Third physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__THIRD_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAsLongAsTheActivityIsExecuting_Third_physical_property();

		/**
		 * The meta object literal for the '<em><b>Min value of the third physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAsLongAsTheActivityIsExecuting_Min_value_of_the_third_physical_property();

		/**
		 * The meta object literal for the '<em><b>Max value of the third physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAsLongAsTheActivityIsExecuting_Max_value_of_the_third_physical_property();

		/**
		 * The meta object literal for the '<em><b>Physical dependency function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__PHYSICAL_DEPENDENCY_FUNCTION = eINSTANCE.getMustHappenAsLongAsTheActivityIsExecuting_Physical_dependency_function();

		/**
		 * The meta object literal for the '{@link bpmnforcpsextension.MyModel.impl.MustHappenAtTheStartOfTheActivityImpl <em>Must Happen At The Start Of The Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnforcpsextension.MyModel.impl.MustHappenAtTheStartOfTheActivityImpl
		 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getMustHappenAtTheStartOfTheActivity()
		 * @generated
		 */
		EClass MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY = eINSTANCE.getMustHappenAtTheStartOfTheActivity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__NAME = eINSTANCE.getMustHappenAtTheStartOfTheActivity_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__TYPE = eINSTANCE.getMustHappenAtTheStartOfTheActivity_Type();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__TARGET = eINSTANCE.getMustHappenAtTheStartOfTheActivity_Target();

		/**
		 * The meta object literal for the '<em><b>Do Happen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__DO_HAPPEN = eINSTANCE.getMustHappenAtTheStartOfTheActivity_Do_Happen();

		/**
		 * The meta object literal for the '<em><b>First physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__FIRST_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAtTheStartOfTheActivity_First_physical_property();

		/**
		 * The meta object literal for the '<em><b>Min value of the first physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAtTheStartOfTheActivity_Min_value_of_the_first_physical_property();

		/**
		 * The meta object literal for the '<em><b>Max value of the first physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAtTheStartOfTheActivity_Max_value_of_the_first_physical_property();

		/**
		 * The meta object literal for the '<em><b>Second physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__SECOND_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAtTheStartOfTheActivity_Second_physical_property();

		/**
		 * The meta object literal for the '<em><b>Min value of the second physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAtTheStartOfTheActivity_Min_value_of_the_second_physical_property();

		/**
		 * The meta object literal for the '<em><b>Max value of the second physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAtTheStartOfTheActivity_Max_value_of_the_second_physical_property();

		/**
		 * The meta object literal for the '<em><b>Third physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__THIRD_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAtTheStartOfTheActivity_Third_physical_property();

		/**
		 * The meta object literal for the '<em><b>Min value of the third physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAtTheStartOfTheActivity_Min_value_of_the_third_physical_property();

		/**
		 * The meta object literal for the '<em><b>Max value of the third physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAtTheStartOfTheActivity_Max_value_of_the_third_physical_property();

		/**
		 * The meta object literal for the '<em><b>Physical dependency function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__PHYSICAL_DEPENDENCY_FUNCTION = eINSTANCE.getMustHappenAtTheStartOfTheActivity_Physical_dependency_function();

		/**
		 * The meta object literal for the '{@link bpmnforcpsextension.MyModel.impl.MustHappenAtTheEndOfTheActivityImpl <em>Must Happen At The End Of The Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnforcpsextension.MyModel.impl.MustHappenAtTheEndOfTheActivityImpl
		 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getMustHappenAtTheEndOfTheActivity()
		 * @generated
		 */
		EClass MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY = eINSTANCE.getMustHappenAtTheEndOfTheActivity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__NAME = eINSTANCE.getMustHappenAtTheEndOfTheActivity_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__TYPE = eINSTANCE.getMustHappenAtTheEndOfTheActivity_Type();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__TARGET = eINSTANCE.getMustHappenAtTheEndOfTheActivity_Target();

		/**
		 * The meta object literal for the '<em><b>Do Happen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__DO_HAPPEN = eINSTANCE.getMustHappenAtTheEndOfTheActivity_Do_Happen();

		/**
		 * The meta object literal for the '<em><b>First physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__FIRST_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAtTheEndOfTheActivity_First_physical_property();

		/**
		 * The meta object literal for the '<em><b>Min value of the first physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAtTheEndOfTheActivity_Min_value_of_the_first_physical_property();

		/**
		 * The meta object literal for the '<em><b>Max value of the first physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAtTheEndOfTheActivity_Max_value_of_the_first_physical_property();

		/**
		 * The meta object literal for the '<em><b>Second physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__SECOND_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAtTheEndOfTheActivity_Second_physical_property();

		/**
		 * The meta object literal for the '<em><b>Min value of the second physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAtTheEndOfTheActivity_Min_value_of_the_second_physical_property();

		/**
		 * The meta object literal for the '<em><b>Max value of the second physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAtTheEndOfTheActivity_Max_value_of_the_second_physical_property();

		/**
		 * The meta object literal for the '<em><b>Third physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__THIRD_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAtTheEndOfTheActivity_Third_physical_property();

		/**
		 * The meta object literal for the '<em><b>Min value of the third physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAtTheEndOfTheActivity_Min_value_of_the_third_physical_property();

		/**
		 * The meta object literal for the '<em><b>Max value of the third physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAtTheEndOfTheActivity_Max_value_of_the_third_physical_property();

		/**
		 * The meta object literal for the '<em><b>Physical dependency function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__PHYSICAL_DEPENDENCY_FUNCTION = eINSTANCE.getMustHappenAtTheEndOfTheActivity_Physical_dependency_function();

		/**
		 * The meta object literal for the '{@link bpmnforcpsextension.MyModel.impl.MustHappenAtABoundTimeImpl <em>Must Happen At ABound Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnforcpsextension.MyModel.impl.MustHappenAtABoundTimeImpl
		 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getMustHappenAtABoundTime()
		 * @generated
		 */
		EClass MUST_HAPPEN_AT_ABOUND_TIME = eINSTANCE.getMustHappenAtABoundTime();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_ABOUND_TIME__NAME = eINSTANCE.getMustHappenAtABoundTime_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_ABOUND_TIME__TYPE = eINSTANCE.getMustHappenAtABoundTime_Type();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUST_HAPPEN_AT_ABOUND_TIME__TARGET = eINSTANCE.getMustHappenAtABoundTime_Target();

		/**
		 * The meta object literal for the '<em><b>Do Happen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_ABOUND_TIME__DO_HAPPEN = eINSTANCE.getMustHappenAtABoundTime_Do_Happen();

		/**
		 * The meta object literal for the '<em><b>Min bound time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_ABOUND_TIME__MIN_BOUND_TIME = eINSTANCE.getMustHappenAtABoundTime_Min_bound_time();

		/**
		 * The meta object literal for the '<em><b>Max bound time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_ABOUND_TIME__MAX_BOUND_TIME = eINSTANCE.getMustHappenAtABoundTime_Max_bound_time();

		/**
		 * The meta object literal for the '<em><b>First physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_ABOUND_TIME__FIRST_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAtABoundTime_First_physical_property();

		/**
		 * The meta object literal for the '<em><b>Min value of the first physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_ABOUND_TIME__MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAtABoundTime_Min_value_of_the_first_physical_property();

		/**
		 * The meta object literal for the '<em><b>Max value of the first physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_ABOUND_TIME__MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAtABoundTime_Max_value_of_the_first_physical_property();

		/**
		 * The meta object literal for the '<em><b>Second physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_ABOUND_TIME__SECOND_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAtABoundTime_Second_physical_property();

		/**
		 * The meta object literal for the '<em><b>Min value of the second physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_ABOUND_TIME__MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAtABoundTime_Min_value_of_the_second_physical_property();

		/**
		 * The meta object literal for the '<em><b>Max value of the second physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_ABOUND_TIME__MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAtABoundTime_Max_value_of_the_second_physical_property();

		/**
		 * The meta object literal for the '<em><b>Third physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_ABOUND_TIME__THIRD_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAtABoundTime_Third_physical_property();

		/**
		 * The meta object literal for the '<em><b>Min value of the third physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_ABOUND_TIME__MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAtABoundTime_Min_value_of_the_third_physical_property();

		/**
		 * The meta object literal for the '<em><b>Max value of the third physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_ABOUND_TIME__MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = eINSTANCE.getMustHappenAtABoundTime_Max_value_of_the_third_physical_property();

		/**
		 * The meta object literal for the '<em><b>Physical dependency function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_HAPPEN_AT_ABOUND_TIME__PHYSICAL_DEPENDENCY_FUNCTION = eINSTANCE.getMustHappenAtABoundTime_Physical_dependency_function();

		/**
		 * The meta object literal for the '{@link bpmnforcpsextension.MyModel.impl.MustNeverHappenAtAnInfiniteTimeImpl <em>Must Never Happen At An Infinite Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnforcpsextension.MyModel.impl.MustNeverHappenAtAnInfiniteTimeImpl
		 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getMustNeverHappenAtAnInfiniteTime()
		 * @generated
		 */
		EClass MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME = eINSTANCE.getMustNeverHappenAtAnInfiniteTime();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__NAME = eINSTANCE.getMustNeverHappenAtAnInfiniteTime_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__TYPE = eINSTANCE.getMustNeverHappenAtAnInfiniteTime_Type();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__TARGET = eINSTANCE.getMustNeverHappenAtAnInfiniteTime_Target();

		/**
		 * The meta object literal for the '<em><b>Do Happen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__DO_HAPPEN = eINSTANCE.getMustNeverHappenAtAnInfiniteTime_Do_Happen();

		/**
		 * The meta object literal for the '<em><b>First physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__FIRST_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAtAnInfiniteTime_First_physical_property();

		/**
		 * The meta object literal for the '<em><b>Min value of the first physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAtAnInfiniteTime_Min_value_of_the_first_physical_property();

		/**
		 * The meta object literal for the '<em><b>Max value of the first physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAtAnInfiniteTime_Max_value_of_the_first_physical_property();

		/**
		 * The meta object literal for the '<em><b>Second physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__SECOND_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAtAnInfiniteTime_Second_physical_property();

		/**
		 * The meta object literal for the '<em><b>Min value of the second physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAtAnInfiniteTime_Min_value_of_the_second_physical_property();

		/**
		 * The meta object literal for the '<em><b>Max value of the second physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAtAnInfiniteTime_Max_value_of_the_second_physical_property();

		/**
		 * The meta object literal for the '<em><b>Third physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__THIRD_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAtAnInfiniteTime_Third_physical_property();

		/**
		 * The meta object literal for the '<em><b>Min value of the third physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAtAnInfiniteTime_Min_value_of_the_third_physical_property();

		/**
		 * The meta object literal for the '<em><b>Max value of the third physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAtAnInfiniteTime_Max_value_of_the_third_physical_property();

		/**
		 * The meta object literal for the '<em><b>Physical dependency function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_AN_INFINITE_TIME__PHYSICAL_DEPENDENCY_FUNCTION = eINSTANCE.getMustNeverHappenAtAnInfiniteTime_Physical_dependency_function();

		/**
		 * The meta object literal for the '{@link bpmnforcpsextension.MyModel.impl.MustNeverHappenAsLongAsTheActivityIsExecutingImpl <em>Must Never Happen As Long As The Activity Is Executing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnforcpsextension.MyModel.impl.MustNeverHappenAsLongAsTheActivityIsExecutingImpl
		 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getMustNeverHappenAsLongAsTheActivityIsExecuting()
		 * @generated
		 */
		EClass MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING = eINSTANCE.getMustNeverHappenAsLongAsTheActivityIsExecuting();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__NAME = eINSTANCE.getMustNeverHappenAsLongAsTheActivityIsExecuting_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__TYPE = eINSTANCE.getMustNeverHappenAsLongAsTheActivityIsExecuting_Type();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__TARGET = eINSTANCE.getMustNeverHappenAsLongAsTheActivityIsExecuting_Target();

		/**
		 * The meta object literal for the '<em><b>Do Happen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__DO_HAPPEN = eINSTANCE.getMustNeverHappenAsLongAsTheActivityIsExecuting_Do_Happen();

		/**
		 * The meta object literal for the '<em><b>First physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__FIRST_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAsLongAsTheActivityIsExecuting_First_physical_property();

		/**
		 * The meta object literal for the '<em><b>Min value of the first physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAsLongAsTheActivityIsExecuting_Min_value_of_the_first_physical_property();

		/**
		 * The meta object literal for the '<em><b>Max value of the first physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAsLongAsTheActivityIsExecuting_Max_value_of_the_first_physical_property();

		/**
		 * The meta object literal for the '<em><b>Second physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__SECOND_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAsLongAsTheActivityIsExecuting_Second_physical_property();

		/**
		 * The meta object literal for the '<em><b>Min value of the second physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAsLongAsTheActivityIsExecuting_Min_value_of_the_second_physical_property();

		/**
		 * The meta object literal for the '<em><b>Max value of the second physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAsLongAsTheActivityIsExecuting_Max_value_of_the_second_physical_property();

		/**
		 * The meta object literal for the '<em><b>Third physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__THIRD_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAsLongAsTheActivityIsExecuting_Third_physical_property();

		/**
		 * The meta object literal for the '<em><b>Min value of the third physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAsLongAsTheActivityIsExecuting_Min_value_of_the_third_physical_property();

		/**
		 * The meta object literal for the '<em><b>Max value of the third physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAsLongAsTheActivityIsExecuting_Max_value_of_the_third_physical_property();

		/**
		 * The meta object literal for the '<em><b>Physical dependency function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AS_LONG_AS_THE_ACTIVITY_IS_EXECUTING__PHYSICAL_DEPENDENCY_FUNCTION = eINSTANCE.getMustNeverHappenAsLongAsTheActivityIsExecuting_Physical_dependency_function();

		/**
		 * The meta object literal for the '{@link bpmnforcpsextension.MyModel.impl.MustNeverHappenAtTheStartOfTheActivityImpl <em>Must Never Happen At The Start Of The Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnforcpsextension.MyModel.impl.MustNeverHappenAtTheStartOfTheActivityImpl
		 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getMustNeverHappenAtTheStartOfTheActivity()
		 * @generated
		 */
		EClass MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY = eINSTANCE.getMustNeverHappenAtTheStartOfTheActivity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__NAME = eINSTANCE.getMustNeverHappenAtTheStartOfTheActivity_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__TYPE = eINSTANCE.getMustNeverHappenAtTheStartOfTheActivity_Type();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__TARGET = eINSTANCE.getMustNeverHappenAtTheStartOfTheActivity_Target();

		/**
		 * The meta object literal for the '<em><b>Do Happen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__DO_HAPPEN = eINSTANCE.getMustNeverHappenAtTheStartOfTheActivity_Do_Happen();

		/**
		 * The meta object literal for the '<em><b>First physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__FIRST_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAtTheStartOfTheActivity_First_physical_property();

		/**
		 * The meta object literal for the '<em><b>Min value of the first physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAtTheStartOfTheActivity_Min_value_of_the_first_physical_property();

		/**
		 * The meta object literal for the '<em><b>Max value of the first physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAtTheStartOfTheActivity_Max_value_of_the_first_physical_property();

		/**
		 * The meta object literal for the '<em><b>Second physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__SECOND_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAtTheStartOfTheActivity_Second_physical_property();

		/**
		 * The meta object literal for the '<em><b>Min value of the second physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAtTheStartOfTheActivity_Min_value_of_the_second_physical_property();

		/**
		 * The meta object literal for the '<em><b>Max value of the second physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAtTheStartOfTheActivity_Max_value_of_the_second_physical_property();

		/**
		 * The meta object literal for the '<em><b>Third physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__THIRD_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAtTheStartOfTheActivity_Third_physical_property();

		/**
		 * The meta object literal for the '<em><b>Min value of the third physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAtTheStartOfTheActivity_Min_value_of_the_third_physical_property();

		/**
		 * The meta object literal for the '<em><b>Max value of the third physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAtTheStartOfTheActivity_Max_value_of_the_third_physical_property();

		/**
		 * The meta object literal for the '<em><b>Physical dependency function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_THE_START_OF_THE_ACTIVITY__PHYSICAL_DEPENDENCY_FUNCTION = eINSTANCE.getMustNeverHappenAtTheStartOfTheActivity_Physical_dependency_function();

		/**
		 * The meta object literal for the '{@link bpmnforcpsextension.MyModel.impl.MustNeverHappenAtTheEndOfTheActivityImpl <em>Must Never Happen At The End Of The Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnforcpsextension.MyModel.impl.MustNeverHappenAtTheEndOfTheActivityImpl
		 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getMustNeverHappenAtTheEndOfTheActivity()
		 * @generated
		 */
		EClass MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY = eINSTANCE.getMustNeverHappenAtTheEndOfTheActivity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__NAME = eINSTANCE.getMustNeverHappenAtTheEndOfTheActivity_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__TYPE = eINSTANCE.getMustNeverHappenAtTheEndOfTheActivity_Type();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__TARGET = eINSTANCE.getMustNeverHappenAtTheEndOfTheActivity_Target();

		/**
		 * The meta object literal for the '<em><b>Do Happen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__DO_HAPPEN = eINSTANCE.getMustNeverHappenAtTheEndOfTheActivity_Do_Happen();

		/**
		 * The meta object literal for the '<em><b>First physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__FIRST_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAtTheEndOfTheActivity_First_physical_property();

		/**
		 * The meta object literal for the '<em><b>Min value of the first physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAtTheEndOfTheActivity_Min_value_of_the_first_physical_property();

		/**
		 * The meta object literal for the '<em><b>Max value of the first physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAtTheEndOfTheActivity_Max_value_of_the_first_physical_property();

		/**
		 * The meta object literal for the '<em><b>Second physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__SECOND_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAtTheEndOfTheActivity_Second_physical_property();

		/**
		 * The meta object literal for the '<em><b>Min value of the second physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAtTheEndOfTheActivity_Min_value_of_the_second_physical_property();

		/**
		 * The meta object literal for the '<em><b>Max value of the second physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAtTheEndOfTheActivity_Max_value_of_the_second_physical_property();

		/**
		 * The meta object literal for the '<em><b>Third physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__THIRD_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAtTheEndOfTheActivity_Third_physical_property();

		/**
		 * The meta object literal for the '<em><b>Min value of the third physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAtTheEndOfTheActivity_Min_value_of_the_third_physical_property();

		/**
		 * The meta object literal for the '<em><b>Max value of the third physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAtTheEndOfTheActivity_Max_value_of_the_third_physical_property();

		/**
		 * The meta object literal for the '<em><b>Physical dependency function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_THE_END_OF_THE_ACTIVITY__PHYSICAL_DEPENDENCY_FUNCTION = eINSTANCE.getMustNeverHappenAtTheEndOfTheActivity_Physical_dependency_function();

		/**
		 * The meta object literal for the '{@link bpmnforcpsextension.MyModel.impl.MustNeverHappenAtABoundTimeImpl <em>Must Never Happen At ABound Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnforcpsextension.MyModel.impl.MustNeverHappenAtABoundTimeImpl
		 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getMustNeverHappenAtABoundTime()
		 * @generated
		 */
		EClass MUST_NEVER_HAPPEN_AT_ABOUND_TIME = eINSTANCE.getMustNeverHappenAtABoundTime();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_ABOUND_TIME__NAME = eINSTANCE.getMustNeverHappenAtABoundTime_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_ABOUND_TIME__TYPE = eINSTANCE.getMustNeverHappenAtABoundTime_Type();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUST_NEVER_HAPPEN_AT_ABOUND_TIME__TARGET = eINSTANCE.getMustNeverHappenAtABoundTime_Target();

		/**
		 * The meta object literal for the '<em><b>Do Happen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_ABOUND_TIME__DO_HAPPEN = eINSTANCE.getMustNeverHappenAtABoundTime_Do_Happen();

		/**
		 * The meta object literal for the '<em><b>Max bound time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_ABOUND_TIME__MAX_BOUND_TIME = eINSTANCE.getMustNeverHappenAtABoundTime_Max_bound_time();

		/**
		 * The meta object literal for the '<em><b>Min bound time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_ABOUND_TIME__MIN_BOUND_TIME = eINSTANCE.getMustNeverHappenAtABoundTime_Min_bound_time();

		/**
		 * The meta object literal for the '<em><b>First physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_ABOUND_TIME__FIRST_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAtABoundTime_First_physical_property();

		/**
		 * The meta object literal for the '<em><b>Min value of the first physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_ABOUND_TIME__MIN_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAtABoundTime_Min_value_of_the_first_physical_property();

		/**
		 * The meta object literal for the '<em><b>Max value of the first physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_ABOUND_TIME__MAX_VALUE_OF_THE_FIRST_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAtABoundTime_Max_value_of_the_first_physical_property();

		/**
		 * The meta object literal for the '<em><b>Second physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_ABOUND_TIME__SECOND_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAtABoundTime_Second_physical_property();

		/**
		 * The meta object literal for the '<em><b>Min value of the second physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_ABOUND_TIME__MIN_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAtABoundTime_Min_value_of_the_second_physical_property();

		/**
		 * The meta object literal for the '<em><b>Max value of the second physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_ABOUND_TIME__MAX_VALUE_OF_THE_SECOND_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAtABoundTime_Max_value_of_the_second_physical_property();

		/**
		 * The meta object literal for the '<em><b>Third physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_ABOUND_TIME__THIRD_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAtABoundTime_Third_physical_property();

		/**
		 * The meta object literal for the '<em><b>Min value of the third physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_ABOUND_TIME__MIN_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAtABoundTime_Min_value_of_the_third_physical_property();

		/**
		 * The meta object literal for the '<em><b>Max value of the third physical property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_ABOUND_TIME__MAX_VALUE_OF_THE_THIRD_PHYSICAL_PROPERTY = eINSTANCE.getMustNeverHappenAtABoundTime_Max_value_of_the_third_physical_property();

		/**
		 * The meta object literal for the '<em><b>Physical dependency function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_NEVER_HAPPEN_AT_ABOUND_TIME__PHYSICAL_DEPENDENCY_FUNCTION = eINSTANCE.getMustNeverHappenAtABoundTime_Physical_dependency_function();

		/**
		 * The meta object literal for the '{@link bpmnforcpsextension.MyModel.impl.PeriodicEventImpl <em>Periodic Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnforcpsextension.MyModel.impl.PeriodicEventImpl
		 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getPeriodicEvent()
		 * @generated
		 */
		EClass PERIODIC_EVENT = eINSTANCE.getPeriodicEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODIC_EVENT__NAME = eINSTANCE.getPeriodicEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIODIC_EVENT__TARGET = eINSTANCE.getPeriodicEvent_Target();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODIC_EVENT__VALUE = eINSTANCE.getPeriodicEvent_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODIC_EVENT__TYPE = eINSTANCE.getPeriodicEvent_Type();

		/**
		 * The meta object literal for the '{@link bpmnforcpsextension.MyModel.impl.SporadicEventImpl <em>Sporadic Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnforcpsextension.MyModel.impl.SporadicEventImpl
		 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getSporadicEvent()
		 * @generated
		 */
		EClass SPORADIC_EVENT = eINSTANCE.getSporadicEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPORADIC_EVENT__NAME = eINSTANCE.getSporadicEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPORADIC_EVENT__TARGET = eINSTANCE.getSporadicEvent_Target();

		/**
		 * The meta object literal for the '<em><b>Max time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPORADIC_EVENT__MAX_TIME = eINSTANCE.getSporadicEvent_Max_time();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPORADIC_EVENT__TYPE = eINSTANCE.getSporadicEvent_Type();

		/**
		 * The meta object literal for the '<em><b>Min time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPORADIC_EVENT__MIN_TIME = eINSTANCE.getSporadicEvent_Min_time();

		/**
		 * The meta object literal for the '{@link bpmnforcpsextension.MyModel.impl.PeriodicActivityImpl <em>Periodic Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnforcpsextension.MyModel.impl.PeriodicActivityImpl
		 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getPeriodicActivity()
		 * @generated
		 */
		EClass PERIODIC_ACTIVITY = eINSTANCE.getPeriodicActivity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODIC_ACTIVITY__NAME = eINSTANCE.getPeriodicActivity_Name();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIODIC_ACTIVITY__TARGET = eINSTANCE.getPeriodicActivity_Target();

		/**
		 * The meta object literal for the '<em><b>Time value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODIC_ACTIVITY__TIME_VALUE = eINSTANCE.getPeriodicActivity_Time_value();

		/**
		 * The meta object literal for the '<em><b>Timer Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODIC_ACTIVITY__TIMER_TYPE = eINSTANCE.getPeriodicActivity_Timer_Type();

		/**
		 * The meta object literal for the '{@link bpmnforcpsextension.MyModel.impl.SporadicActivityImpl <em>Sporadic Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnforcpsextension.MyModel.impl.SporadicActivityImpl
		 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getSporadicActivity()
		 * @generated
		 */
		EClass SPORADIC_ACTIVITY = eINSTANCE.getSporadicActivity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPORADIC_ACTIVITY__NAME = eINSTANCE.getSporadicActivity_Name();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPORADIC_ACTIVITY__TARGET = eINSTANCE.getSporadicActivity_Target();

		/**
		 * The meta object literal for the '<em><b>Max time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPORADIC_ACTIVITY__MAX_TIME = eINSTANCE.getSporadicActivity_Max_time();

		/**
		 * The meta object literal for the '<em><b>Min time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPORADIC_ACTIVITY__MIN_TIME = eINSTANCE.getSporadicActivity_Min_time();

		/**
		 * The meta object literal for the '<em><b>Timer Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPORADIC_ACTIVITY__TIMER_TYPE = eINSTANCE.getSporadicActivity_Timer_Type();

		/**
		 * The meta object literal for the '{@link bpmnforcpsextension.MyModel.impl.DurationImpl <em>Duration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnforcpsextension.MyModel.impl.DurationImpl
		 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getDuration()
		 * @generated
		 */
		EClass DURATION = eINSTANCE.getDuration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION__NAME = eINSTANCE.getDuration_Name();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DURATION__TARGET = eINSTANCE.getDuration_Target();

		/**
		 * The meta object literal for the '<em><b>Min time duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION__MIN_TIME_DURATION = eINSTANCE.getDuration_Min_time_duration();

		/**
		 * The meta object literal for the '<em><b>Max time duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION__MAX_TIME_DURATION = eINSTANCE.getDuration_Max_time_duration();

		/**
		 * The meta object literal for the '<em><b>Time Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION__TIME_TYPE = eINSTANCE.getDuration_Time_Type();

		/**
		 * The meta object literal for the '{@link bpmnforcpsextension.MyModel.impl.PhysicalEntityTaskImpl <em>Physical Entity Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnforcpsextension.MyModel.impl.PhysicalEntityTaskImpl
		 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getPhysicalEntityTask()
		 * @generated
		 */
		EClass PHYSICAL_ENTITY_TASK = eINSTANCE.getPhysicalEntityTask();

		/**
		 * The meta object literal for the '<em><b>CPS Performer Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_ENTITY_TASK__CPS_PERFORMER_REF = eINSTANCE.getPhysicalEntityTask_CPSPerformerRef();

		/**
		 * The meta object literal for the '<em><b>CPS Device Role Parameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_ENTITY_TASK__CPS_DEVICE_ROLE_PARAMETERS = eINSTANCE.getPhysicalEntityTask_CPSDeviceRoleParameters();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_ENTITY_TASK__TYPE = eINSTANCE.getPhysicalEntityTask_Type();

		/**
		 * The meta object literal for the '<em><b>Is Movable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_ENTITY_TASK__IS_MOVABLE = eINSTANCE.getPhysicalEntityTask_IsMovable();

		/**
		 * The meta object literal for the '{@link bpmnforcpsextension.MyModel.impl.MyEventDefinitionImpl <em>My Event Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnforcpsextension.MyModel.impl.MyEventDefinitionImpl
		 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getMyEventDefinition()
		 * @generated
		 */
		EClass MY_EVENT_DEFINITION = eINSTANCE.getMyEventDefinition();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MY_EVENT_DEFINITION__VALUE = eINSTANCE.getMyEventDefinition_Value();

		/**
		 * The meta object literal for the '{@link bpmnforcpsextension.MyModel.impl.RealWorldPropertiesImpl <em>Real World Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnforcpsextension.MyModel.impl.RealWorldPropertiesImpl
		 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getRealWorldProperties()
		 * @generated
		 */
		EClass REAL_WORLD_PROPERTIES = eINSTANCE.getRealWorldProperties();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_WORLD_PROPERTIES__PARAMETERS = eINSTANCE.getRealWorldProperties_Parameters();

		/**
		 * The meta object literal for the '{@link bpmnforcpsextension.MyModel.Physical_Properties <em>Physical Properties</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnforcpsextension.MyModel.Physical_Properties
		 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getPhysical_Properties()
		 * @generated
		 */
		EEnum PHYSICAL_PROPERTIES = eINSTANCE.getPhysical_Properties();

		/**
		 * The meta object literal for the '{@link bpmnforcpsextension.MyModel.TypeDevice <em>Type Device</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnforcpsextension.MyModel.TypeDevice
		 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getTypeDevice()
		 * @generated
		 */
		EEnum TYPE_DEVICE = eINSTANCE.getTypeDevice();

		/**
		 * The meta object literal for the '{@link bpmnforcpsextension.MyModel.Timer_Type <em>Timer Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnforcpsextension.MyModel.Timer_Type
		 * @see bpmnforcpsextension.MyModel.impl.MyModelPackageImpl#getTimer_Type()
		 * @generated
		 */
		EEnum TIMER_TYPE = eINSTANCE.getTimer_Type();

	}

} //MyModelPackage
