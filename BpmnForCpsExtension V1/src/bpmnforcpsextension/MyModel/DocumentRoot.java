/**
 */
package bpmnforcpsextension.MyModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmnforcpsextension.MyModel.DocumentRoot#getTaskConfig <em>Task Config</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.DocumentRoot#getTemporalDependency <em>Temporal Dependency</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.DocumentRoot#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.DocumentRoot#getMsa <em>Msa</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.DocumentRoot#getMoa <em>Moa</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.DocumentRoot#getMfa <em>Mfa</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.DocumentRoot#getMsi <em>Msi</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.DocumentRoot#getMoi <em>Moi</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.DocumentRoot#getMfi <em>Mfi</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.DocumentRoot#getMusthappenataninfinitetime <em>Musthappenataninfinitetime</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.DocumentRoot#getMusthappenaslongastheactivityisexecuting <em>Musthappenaslongastheactivityisexecuting</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.DocumentRoot#getMusthappenatthestartoftheactivity <em>Musthappenatthestartoftheactivity</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.DocumentRoot#getMusthappenattheendoftheactivity <em>Musthappenattheendoftheactivity</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.DocumentRoot#getMusthappenataboundtime <em>Musthappenataboundtime</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.DocumentRoot#getMustneverhappenataninfinitetime <em>Mustneverhappenataninfinitetime</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.DocumentRoot#getMustneverhappenatthestartoftheactivity <em>Mustneverhappenatthestartoftheactivity</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.DocumentRoot#getMustneverhappenattheendoftheactivity <em>Mustneverhappenattheendoftheactivity</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.DocumentRoot#getMustneverhappenataboundtime <em>Mustneverhappenataboundtime</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.DocumentRoot#getMyeventdefinition <em>Myeventdefinition</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.DocumentRoot#getDuration <em>Duration</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.DocumentRoot#getPeriodicevent <em>Periodicevent</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.DocumentRoot#getSporadicevent <em>Sporadicevent</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.DocumentRoot#getPhysicalentitytask <em>Physicalentitytask</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.DocumentRoot#getRealworldproperties <em>Realworldproperties</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmnforcpsextension.MyModel.MyModelPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Task Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Config</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Config</em>' containment reference.
	 * @see #setTaskConfig(TaskConfig)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getDocumentRoot_TaskConfig()
	 * @model containment="true" upper="-2"
	 *        extendedMetaData="name='taskConfig' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	TaskConfig getTaskConfig();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.DocumentRoot#getTaskConfig <em>Task Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Config</em>' containment reference.
	 * @see #getTaskConfig()
	 * @generated
	 */
	void setTaskConfig(TaskConfig value);

	/**
	 * Returns the value of the '<em><b>Temporal Dependency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temporal Dependency</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Dependency</em>' containment reference.
	 * @see #setTemporalDependency(TemporalDependency)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getDocumentRoot_TemporalDependency()
	 * @model containment="true" upper="-2"
	 *        extendedMetaData="name='temporalDependency' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	TemporalDependency getTemporalDependency();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.DocumentRoot#getTemporalDependency <em>Temporal Dependency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporal Dependency</em>' containment reference.
	 * @see #getTemporalDependency()
	 * @generated
	 */
	void setTemporalDependency(TemporalDependency value);

	/**
	 * Returns the value of the '<em><b>Meta Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Data</em>' containment reference.
	 * @see #setMetaData(MetaData)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getDocumentRoot_MetaData()
	 * @model containment="true" upper="-2"
	 *        extendedMetaData="name='metaData' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	MetaData getMetaData();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.DocumentRoot#getMetaData <em>Meta Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Data</em>' containment reference.
	 * @see #getMetaData()
	 * @generated
	 */
	void setMetaData(MetaData value);

	/**
	 * Returns the value of the '<em><b>Msa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msa</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msa</em>' reference.
	 * @see #setMsa(MSA)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getDocumentRoot_Msa()
	 * @model upper="-2"
	 *        extendedMetaData="name='msa' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	MSA getMsa();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.DocumentRoot#getMsa <em>Msa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msa</em>' reference.
	 * @see #getMsa()
	 * @generated
	 */
	void setMsa(MSA value);

	/**
	 * Returns the value of the '<em><b>Moa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moa</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moa</em>' reference.
	 * @see #setMoa(MOA)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getDocumentRoot_Moa()
	 * @model upper="-2"
	 *        extendedMetaData="name='moa' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	MOA getMoa();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.DocumentRoot#getMoa <em>Moa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moa</em>' reference.
	 * @see #getMoa()
	 * @generated
	 */
	void setMoa(MOA value);

	/**
	 * Returns the value of the '<em><b>Mfa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mfa</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mfa</em>' reference.
	 * @see #setMfa(MFA)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getDocumentRoot_Mfa()
	 * @model upper="-2"
	 *        extendedMetaData="name='mfa' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	MFA getMfa();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.DocumentRoot#getMfa <em>Mfa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mfa</em>' reference.
	 * @see #getMfa()
	 * @generated
	 */
	void setMfa(MFA value);

	/**
	 * Returns the value of the '<em><b>Msi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msi</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msi</em>' reference.
	 * @see #setMsi(MSI)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getDocumentRoot_Msi()
	 * @model upper="-2"
	 *        extendedMetaData="name='msi' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	MSI getMsi();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.DocumentRoot#getMsi <em>Msi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msi</em>' reference.
	 * @see #getMsi()
	 * @generated
	 */
	void setMsi(MSI value);

	/**
	 * Returns the value of the '<em><b>Moi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moi</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moi</em>' reference.
	 * @see #setMoi(MOI)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getDocumentRoot_Moi()
	 * @model upper="-2"
	 *        extendedMetaData="name='moi' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	MOI getMoi();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.DocumentRoot#getMoi <em>Moi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moi</em>' reference.
	 * @see #getMoi()
	 * @generated
	 */
	void setMoi(MOI value);

	/**
	 * Returns the value of the '<em><b>Mfi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mfi</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mfi</em>' reference.
	 * @see #setMfi(MFI)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getDocumentRoot_Mfi()
	 * @model upper="-2"
	 *        extendedMetaData="name='mfi' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	MFI getMfi();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.DocumentRoot#getMfi <em>Mfi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mfi</em>' reference.
	 * @see #getMfi()
	 * @generated
	 */
	void setMfi(MFI value);

	/**
	 * Returns the value of the '<em><b>Musthappenataninfinitetime</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Musthappenataninfinitetime</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Musthappenataninfinitetime</em>' reference.
	 * @see #setMusthappenataninfinitetime(MustHappenAtAnInfiniteTime)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getDocumentRoot_Musthappenataninfinitetime()
	 * @model upper="-2"
	 *        extendedMetaData="name='musthappenataninfinitetime' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	MustHappenAtAnInfiniteTime getMusthappenataninfinitetime();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.DocumentRoot#getMusthappenataninfinitetime <em>Musthappenataninfinitetime</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Musthappenataninfinitetime</em>' reference.
	 * @see #getMusthappenataninfinitetime()
	 * @generated
	 */
	void setMusthappenataninfinitetime(MustHappenAtAnInfiniteTime value);

	/**
	 * Returns the value of the '<em><b>Musthappenaslongastheactivityisexecuting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Musthappenaslongastheactivityisexecuting</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Musthappenaslongastheactivityisexecuting</em>' reference.
	 * @see #setMusthappenaslongastheactivityisexecuting(MustHappenAsLongAsTheActivityIsExecuting)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getDocumentRoot_Musthappenaslongastheactivityisexecuting()
	 * @model upper="-2"
	 *        extendedMetaData="name='musthappenaslongastheactivityisexecuting' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	MustHappenAsLongAsTheActivityIsExecuting getMusthappenaslongastheactivityisexecuting();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.DocumentRoot#getMusthappenaslongastheactivityisexecuting <em>Musthappenaslongastheactivityisexecuting</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Musthappenaslongastheactivityisexecuting</em>' reference.
	 * @see #getMusthappenaslongastheactivityisexecuting()
	 * @generated
	 */
	void setMusthappenaslongastheactivityisexecuting(MustHappenAsLongAsTheActivityIsExecuting value);

	/**
	 * Returns the value of the '<em><b>Musthappenatthestartoftheactivity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Musthappenatthestartoftheactivity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Musthappenatthestartoftheactivity</em>' reference.
	 * @see #setMusthappenatthestartoftheactivity(MustHappenAtTheStartOfTheActivity)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getDocumentRoot_Musthappenatthestartoftheactivity()
	 * @model upper="-2"
	 *        extendedMetaData="name='musthappenatthestartoftheactivity' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	MustHappenAtTheStartOfTheActivity getMusthappenatthestartoftheactivity();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.DocumentRoot#getMusthappenatthestartoftheactivity <em>Musthappenatthestartoftheactivity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Musthappenatthestartoftheactivity</em>' reference.
	 * @see #getMusthappenatthestartoftheactivity()
	 * @generated
	 */
	void setMusthappenatthestartoftheactivity(MustHappenAtTheStartOfTheActivity value);

	/**
	 * Returns the value of the '<em><b>Musthappenattheendoftheactivity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Musthappenattheendoftheactivity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Musthappenattheendoftheactivity</em>' reference.
	 * @see #setMusthappenattheendoftheactivity(MustHappenAtTheEndOfTheActivity)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getDocumentRoot_Musthappenattheendoftheactivity()
	 * @model upper="-2"
	 *        extendedMetaData="name='musthappenattheendoftheactivity' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	MustHappenAtTheEndOfTheActivity getMusthappenattheendoftheactivity();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.DocumentRoot#getMusthappenattheendoftheactivity <em>Musthappenattheendoftheactivity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Musthappenattheendoftheactivity</em>' reference.
	 * @see #getMusthappenattheendoftheactivity()
	 * @generated
	 */
	void setMusthappenattheendoftheactivity(MustHappenAtTheEndOfTheActivity value);

	/**
	 * Returns the value of the '<em><b>Musthappenataboundtime</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Musthappenataboundtime</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Musthappenataboundtime</em>' reference.
	 * @see #setMusthappenataboundtime(MustHappenAtABoundTime)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getDocumentRoot_Musthappenataboundtime()
	 * @model upper="-2"
	 *        extendedMetaData="name='musthappenataboundtime' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	MustHappenAtABoundTime getMusthappenataboundtime();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.DocumentRoot#getMusthappenataboundtime <em>Musthappenataboundtime</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Musthappenataboundtime</em>' reference.
	 * @see #getMusthappenataboundtime()
	 * @generated
	 */
	void setMusthappenataboundtime(MustHappenAtABoundTime value);

	/**
	 * Returns the value of the '<em><b>Mustneverhappenataninfinitetime</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mustneverhappenataninfinitetime</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mustneverhappenataninfinitetime</em>' reference.
	 * @see #setMustneverhappenataninfinitetime(MustNeverHappenAtAnInfiniteTime)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getDocumentRoot_Mustneverhappenataninfinitetime()
	 * @model upper="-2"
	 *        extendedMetaData="name='mustneverhappenataninfinitetime' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	MustNeverHappenAtAnInfiniteTime getMustneverhappenataninfinitetime();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.DocumentRoot#getMustneverhappenataninfinitetime <em>Mustneverhappenataninfinitetime</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mustneverhappenataninfinitetime</em>' reference.
	 * @see #getMustneverhappenataninfinitetime()
	 * @generated
	 */
	void setMustneverhappenataninfinitetime(MustNeverHappenAtAnInfiniteTime value);

	/**
	 * Returns the value of the '<em><b>Mustneverhappenatthestartoftheactivity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mustneverhappenatthestartoftheactivity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mustneverhappenatthestartoftheactivity</em>' reference.
	 * @see #setMustneverhappenatthestartoftheactivity(MustNeverHappenAtTheStartOfTheActivity)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getDocumentRoot_Mustneverhappenatthestartoftheactivity()
	 * @model upper="-2"
	 *        extendedMetaData="name='mustneverhappenatthestartoftheactivity' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	MustNeverHappenAtTheStartOfTheActivity getMustneverhappenatthestartoftheactivity();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.DocumentRoot#getMustneverhappenatthestartoftheactivity <em>Mustneverhappenatthestartoftheactivity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mustneverhappenatthestartoftheactivity</em>' reference.
	 * @see #getMustneverhappenatthestartoftheactivity()
	 * @generated
	 */
	void setMustneverhappenatthestartoftheactivity(MustNeverHappenAtTheStartOfTheActivity value);

	/**
	 * Returns the value of the '<em><b>Mustneverhappenattheendoftheactivity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mustneverhappenattheendoftheactivity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mustneverhappenattheendoftheactivity</em>' reference.
	 * @see #setMustneverhappenattheendoftheactivity(MustNeverHappenAtTheEndOfTheActivity)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getDocumentRoot_Mustneverhappenattheendoftheactivity()
	 * @model upper="-2"
	 *        extendedMetaData="name='mustneverhappenattheendoftheactivity' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	MustNeverHappenAtTheEndOfTheActivity getMustneverhappenattheendoftheactivity();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.DocumentRoot#getMustneverhappenattheendoftheactivity <em>Mustneverhappenattheendoftheactivity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mustneverhappenattheendoftheactivity</em>' reference.
	 * @see #getMustneverhappenattheendoftheactivity()
	 * @generated
	 */
	void setMustneverhappenattheendoftheactivity(MustNeverHappenAtTheEndOfTheActivity value);

	/**
	 * Returns the value of the '<em><b>Mustneverhappenataboundtime</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mustneverhappenataboundtime</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mustneverhappenataboundtime</em>' reference.
	 * @see #setMustneverhappenataboundtime(MustNeverHappenAtABoundTime)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getDocumentRoot_Mustneverhappenataboundtime()
	 * @model upper="-2"
	 *        extendedMetaData="name='mustneverhappenataboundtime' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	MustNeverHappenAtABoundTime getMustneverhappenataboundtime();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.DocumentRoot#getMustneverhappenataboundtime <em>Mustneverhappenataboundtime</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mustneverhappenataboundtime</em>' reference.
	 * @see #getMustneverhappenataboundtime()
	 * @generated
	 */
	void setMustneverhappenataboundtime(MustNeverHappenAtABoundTime value);

	/**
	 * Returns the value of the '<em><b>Myeventdefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Myeventdefinition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Myeventdefinition</em>' reference.
	 * @see #setMyeventdefinition(MyEventDefinition)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getDocumentRoot_Myeventdefinition()
	 * @model upper="-2"
	 *        extendedMetaData="name='myeventdefinition' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	MyEventDefinition getMyeventdefinition();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.DocumentRoot#getMyeventdefinition <em>Myeventdefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Myeventdefinition</em>' reference.
	 * @see #getMyeventdefinition()
	 * @generated
	 */
	void setMyeventdefinition(MyEventDefinition value);

	/**
	 * Returns the value of the '<em><b>Periodicevent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Periodicevent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Periodicevent</em>' reference.
	 * @see #setPeriodicevent(PeriodicEvent)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getDocumentRoot_Periodicevent()
	 * @model upper="-2"
	 *        extendedMetaData="name='periodicevent' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	PeriodicEvent getPeriodicevent();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.DocumentRoot#getPeriodicevent <em>Periodicevent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Periodicevent</em>' reference.
	 * @see #getPeriodicevent()
	 * @generated
	 */
	void setPeriodicevent(PeriodicEvent value);

	/**
	 * Returns the value of the '<em><b>Sporadicevent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sporadicevent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sporadicevent</em>' reference.
	 * @see #setSporadicevent(SporadicEvent)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getDocumentRoot_Sporadicevent()
	 * @model upper="-2"
	 *        extendedMetaData="name='sporadicevent' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	SporadicEvent getSporadicevent();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.DocumentRoot#getSporadicevent <em>Sporadicevent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sporadicevent</em>' reference.
	 * @see #getSporadicevent()
	 * @generated
	 */
	void setSporadicevent(SporadicEvent value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' reference.
	 * @see #setDuration(Duration)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getDocumentRoot_Duration()
	 * @model upper="-2"
	 *        extendedMetaData="name='duration' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getDuration();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.DocumentRoot#getDuration <em>Duration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Physicalentitytask</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physicalentitytask</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physicalentitytask</em>' reference.
	 * @see #setPhysicalentitytask(PhysicalEntityTask)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getDocumentRoot_Physicalentitytask()
	 * @model upper="-2"
	 *        extendedMetaData="name='physicalentitytask' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	PhysicalEntityTask getPhysicalentitytask();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.DocumentRoot#getPhysicalentitytask <em>Physicalentitytask</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physicalentitytask</em>' reference.
	 * @see #getPhysicalentitytask()
	 * @generated
	 */
	void setPhysicalentitytask(PhysicalEntityTask value);

	/**
	 * Returns the value of the '<em><b>Realworldproperties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realworldproperties</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realworldproperties</em>' reference.
	 * @see #setRealworldproperties(RealWorldProperties)
	 * @see bpmnforcpsextension.MyModel.MyModelPackage#getDocumentRoot_Realworldproperties()
	 * @model upper="-2"
	 *        extendedMetaData="name='realworldproperties' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	RealWorldProperties getRealworldproperties();

	/**
	 * Sets the value of the '{@link bpmnforcpsextension.MyModel.DocumentRoot#getRealworldproperties <em>Realworldproperties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realworldproperties</em>' reference.
	 * @see #getRealworldproperties()
	 * @generated
	 */
	void setRealworldproperties(RealWorldProperties value);

} // DocumentRoot
