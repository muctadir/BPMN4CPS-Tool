/**
 */
package bpmnforcpsextension.MyModel.impl;

import bpmnforcpsextension.MyModel.DocumentRoot;
import bpmnforcpsextension.MyModel.Duration;
import bpmnforcpsextension.MyModel.MFA;
import bpmnforcpsextension.MyModel.MFI;
import bpmnforcpsextension.MyModel.MOA;
import bpmnforcpsextension.MyModel.MOI;
import bpmnforcpsextension.MyModel.MSA;
import bpmnforcpsextension.MyModel.MSI;
import bpmnforcpsextension.MyModel.MetaData;
import bpmnforcpsextension.MyModel.MustHappenAsLongAsTheActivityIsExecuting;
import bpmnforcpsextension.MyModel.MustHappenAtABoundTime;
import bpmnforcpsextension.MyModel.MustHappenAtAnInfiniteTime;
import bpmnforcpsextension.MyModel.MustHappenAtTheEndOfTheActivity;
import bpmnforcpsextension.MyModel.MustHappenAtTheStartOfTheActivity;
import bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime;
import bpmnforcpsextension.MyModel.MustNeverHappenAtAnInfiniteTime;
import bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity;
import bpmnforcpsextension.MyModel.MustNeverHappenAtTheStartOfTheActivity;
import bpmnforcpsextension.MyModel.MyEventDefinition;
import bpmnforcpsextension.MyModel.MyModelPackage;
import bpmnforcpsextension.MyModel.PeriodicEvent;
import bpmnforcpsextension.MyModel.PhysicalEntityTask;
import bpmnforcpsextension.MyModel.RealWorldProperties;
import bpmnforcpsextension.MyModel.SporadicEvent;
import bpmnforcpsextension.MyModel.TaskConfig;
import bpmnforcpsextension.MyModel.TemporalDependency;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.DocumentRootImpl#getTaskConfig <em>Task Config</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.DocumentRootImpl#getTemporalDependency <em>Temporal Dependency</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.DocumentRootImpl#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.DocumentRootImpl#getMsa <em>Msa</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.DocumentRootImpl#getMoa <em>Moa</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.DocumentRootImpl#getMfa <em>Mfa</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.DocumentRootImpl#getMsi <em>Msi</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.DocumentRootImpl#getMoi <em>Moi</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.DocumentRootImpl#getMfi <em>Mfi</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.DocumentRootImpl#getMusthappenataninfinitetime <em>Musthappenataninfinitetime</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.DocumentRootImpl#getMusthappenaslongastheactivityisexecuting <em>Musthappenaslongastheactivityisexecuting</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.DocumentRootImpl#getMusthappenatthestartoftheactivity <em>Musthappenatthestartoftheactivity</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.DocumentRootImpl#getMusthappenattheendoftheactivity <em>Musthappenattheendoftheactivity</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.DocumentRootImpl#getMusthappenataboundtime <em>Musthappenataboundtime</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.DocumentRootImpl#getMustneverhappenataninfinitetime <em>Mustneverhappenataninfinitetime</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.DocumentRootImpl#getMustneverhappenatthestartoftheactivity <em>Mustneverhappenatthestartoftheactivity</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.DocumentRootImpl#getMustneverhappenattheendoftheactivity <em>Mustneverhappenattheendoftheactivity</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.DocumentRootImpl#getMustneverhappenataboundtime <em>Mustneverhappenataboundtime</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.DocumentRootImpl#getMyeventdefinition <em>Myeventdefinition</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.DocumentRootImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.DocumentRootImpl#getPeriodicevent <em>Periodicevent</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.DocumentRootImpl#getSporadicevent <em>Sporadicevent</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.DocumentRootImpl#getPhysicalentitytask <em>Physicalentitytask</em>}</li>
 *   <li>{@link bpmnforcpsextension.MyModel.impl.DocumentRootImpl#getRealworldproperties <em>Realworldproperties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getTaskConfig() <em>Task Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskConfig()
	 * @generated
	 * @ordered
	 */
	protected TaskConfig taskConfig;

	/**
	 * The cached value of the '{@link #getTemporalDependency() <em>Temporal Dependency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalDependency()
	 * @generated
	 * @ordered
	 */
	protected TemporalDependency temporalDependency;

	/**
	 * The cached value of the '{@link #getMetaData() <em>Meta Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaData()
	 * @generated
	 * @ordered
	 */
	protected MetaData metaData;

	/**
	 * The cached value of the '{@link #getMsa() <em>Msa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsa()
	 * @generated
	 * @ordered
	 */
	protected MSA msa;

	/**
	 * The cached value of the '{@link #getMoa() <em>Moa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoa()
	 * @generated
	 * @ordered
	 */
	protected MOA moa;

	/**
	 * The cached value of the '{@link #getMfa() <em>Mfa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMfa()
	 * @generated
	 * @ordered
	 */
	protected MFA mfa;

	/**
	 * The cached value of the '{@link #getMsi() <em>Msi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsi()
	 * @generated
	 * @ordered
	 */
	protected MSI msi;

	/**
	 * The cached value of the '{@link #getMoi() <em>Moi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoi()
	 * @generated
	 * @ordered
	 */
	protected MOI moi;

	/**
	 * The cached value of the '{@link #getMfi() <em>Mfi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMfi()
	 * @generated
	 * @ordered
	 */
	protected MFI mfi;

	/**
	 * The cached value of the '{@link #getMusthappenataninfinitetime() <em>Musthappenataninfinitetime</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMusthappenataninfinitetime()
	 * @generated
	 * @ordered
	 */
	protected MustHappenAtAnInfiniteTime musthappenataninfinitetime;

	/**
	 * The cached value of the '{@link #getMusthappenaslongastheactivityisexecuting() <em>Musthappenaslongastheactivityisexecuting</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMusthappenaslongastheactivityisexecuting()
	 * @generated
	 * @ordered
	 */
	protected MustHappenAsLongAsTheActivityIsExecuting musthappenaslongastheactivityisexecuting;

	/**
	 * The cached value of the '{@link #getMusthappenatthestartoftheactivity() <em>Musthappenatthestartoftheactivity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMusthappenatthestartoftheactivity()
	 * @generated
	 * @ordered
	 */
	protected MustHappenAtTheStartOfTheActivity musthappenatthestartoftheactivity;

	/**
	 * The cached value of the '{@link #getMusthappenattheendoftheactivity() <em>Musthappenattheendoftheactivity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMusthappenattheendoftheactivity()
	 * @generated
	 * @ordered
	 */
	protected MustHappenAtTheEndOfTheActivity musthappenattheendoftheactivity;

	/**
	 * The cached value of the '{@link #getMusthappenataboundtime() <em>Musthappenataboundtime</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMusthappenataboundtime()
	 * @generated
	 * @ordered
	 */
	protected MustHappenAtABoundTime musthappenataboundtime;

	/**
	 * The cached value of the '{@link #getMustneverhappenataninfinitetime() <em>Mustneverhappenataninfinitetime</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMustneverhappenataninfinitetime()
	 * @generated
	 * @ordered
	 */
	protected MustNeverHappenAtAnInfiniteTime mustneverhappenataninfinitetime;

	/**
	 * The cached value of the '{@link #getMustneverhappenatthestartoftheactivity() <em>Mustneverhappenatthestartoftheactivity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMustneverhappenatthestartoftheactivity()
	 * @generated
	 * @ordered
	 */
	protected MustNeverHappenAtTheStartOfTheActivity mustneverhappenatthestartoftheactivity;

	/**
	 * The cached value of the '{@link #getMustneverhappenattheendoftheactivity() <em>Mustneverhappenattheendoftheactivity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMustneverhappenattheendoftheactivity()
	 * @generated
	 * @ordered
	 */
	protected MustNeverHappenAtTheEndOfTheActivity mustneverhappenattheendoftheactivity;

	/**
	 * The cached value of the '{@link #getMustneverhappenataboundtime() <em>Mustneverhappenataboundtime</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMustneverhappenataboundtime()
	 * @generated
	 * @ordered
	 */
	protected MustNeverHappenAtABoundTime mustneverhappenataboundtime;

	/**
	 * The cached value of the '{@link #getMyeventdefinition() <em>Myeventdefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyeventdefinition()
	 * @generated
	 * @ordered
	 */
	protected MyEventDefinition myeventdefinition;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration duration;

	/**
	 * The cached value of the '{@link #getPeriodicevent() <em>Periodicevent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodicevent()
	 * @generated
	 * @ordered
	 */
	protected PeriodicEvent periodicevent;

	/**
	 * The cached value of the '{@link #getSporadicevent() <em>Sporadicevent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSporadicevent()
	 * @generated
	 * @ordered
	 */
	protected SporadicEvent sporadicevent;

	/**
	 * The cached value of the '{@link #getPhysicalentitytask() <em>Physicalentitytask</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalentitytask()
	 * @generated
	 * @ordered
	 */
	protected PhysicalEntityTask physicalentitytask;

	/**
	 * The cached value of the '{@link #getRealworldproperties() <em>Realworldproperties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealworldproperties()
	 * @generated
	 * @ordered
	 */
	protected RealWorldProperties realworldproperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyModelPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskConfig getTaskConfig() {
		return taskConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaskConfig(TaskConfig newTaskConfig, NotificationChain msgs) {
		TaskConfig oldTaskConfig = taskConfig;
		taskConfig = newTaskConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyModelPackage.DOCUMENT_ROOT__TASK_CONFIG, oldTaskConfig, newTaskConfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskConfig(TaskConfig newTaskConfig) {
		if (newTaskConfig != taskConfig) {
			NotificationChain msgs = null;
			if (taskConfig != null)
				msgs = ((InternalEObject)taskConfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyModelPackage.DOCUMENT_ROOT__TASK_CONFIG, null, msgs);
			if (newTaskConfig != null)
				msgs = ((InternalEObject)newTaskConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyModelPackage.DOCUMENT_ROOT__TASK_CONFIG, null, msgs);
			msgs = basicSetTaskConfig(newTaskConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.DOCUMENT_ROOT__TASK_CONFIG, newTaskConfig, newTaskConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalDependency getTemporalDependency() {
		return temporalDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemporalDependency(TemporalDependency newTemporalDependency, NotificationChain msgs) {
		TemporalDependency oldTemporalDependency = temporalDependency;
		temporalDependency = newTemporalDependency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyModelPackage.DOCUMENT_ROOT__TEMPORAL_DEPENDENCY, oldTemporalDependency, newTemporalDependency);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemporalDependency(TemporalDependency newTemporalDependency) {
		if (newTemporalDependency != temporalDependency) {
			NotificationChain msgs = null;
			if (temporalDependency != null)
				msgs = ((InternalEObject)temporalDependency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyModelPackage.DOCUMENT_ROOT__TEMPORAL_DEPENDENCY, null, msgs);
			if (newTemporalDependency != null)
				msgs = ((InternalEObject)newTemporalDependency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyModelPackage.DOCUMENT_ROOT__TEMPORAL_DEPENDENCY, null, msgs);
			msgs = basicSetTemporalDependency(newTemporalDependency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.DOCUMENT_ROOT__TEMPORAL_DEPENDENCY, newTemporalDependency, newTemporalDependency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaData getMetaData() {
		return metaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetaData(MetaData newMetaData, NotificationChain msgs) {
		MetaData oldMetaData = metaData;
		metaData = newMetaData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyModelPackage.DOCUMENT_ROOT__META_DATA, oldMetaData, newMetaData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaData(MetaData newMetaData) {
		if (newMetaData != metaData) {
			NotificationChain msgs = null;
			if (metaData != null)
				msgs = ((InternalEObject)metaData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyModelPackage.DOCUMENT_ROOT__META_DATA, null, msgs);
			if (newMetaData != null)
				msgs = ((InternalEObject)newMetaData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyModelPackage.DOCUMENT_ROOT__META_DATA, null, msgs);
			msgs = basicSetMetaData(newMetaData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.DOCUMENT_ROOT__META_DATA, newMetaData, newMetaData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSA getMsa() {
		if (msa != null && msa.eIsProxy()) {
			InternalEObject oldMsa = (InternalEObject)msa;
			msa = (MSA)eResolveProxy(oldMsa);
			if (msa != oldMsa) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyModelPackage.DOCUMENT_ROOT__MSA, oldMsa, msa));
			}
		}
		return msa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSA basicGetMsa() {
		return msa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMsa(MSA newMsa) {
		MSA oldMsa = msa;
		msa = newMsa;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.DOCUMENT_ROOT__MSA, oldMsa, msa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MOA getMoa() {
		if (moa != null && moa.eIsProxy()) {
			InternalEObject oldMoa = (InternalEObject)moa;
			moa = (MOA)eResolveProxy(oldMoa);
			if (moa != oldMoa) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyModelPackage.DOCUMENT_ROOT__MOA, oldMoa, moa));
			}
		}
		return moa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MOA basicGetMoa() {
		return moa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoa(MOA newMoa) {
		MOA oldMoa = moa;
		moa = newMoa;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.DOCUMENT_ROOT__MOA, oldMoa, moa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFA getMfa() {
		if (mfa != null && mfa.eIsProxy()) {
			InternalEObject oldMfa = (InternalEObject)mfa;
			mfa = (MFA)eResolveProxy(oldMfa);
			if (mfa != oldMfa) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyModelPackage.DOCUMENT_ROOT__MFA, oldMfa, mfa));
			}
		}
		return mfa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFA basicGetMfa() {
		return mfa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMfa(MFA newMfa) {
		MFA oldMfa = mfa;
		mfa = newMfa;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.DOCUMENT_ROOT__MFA, oldMfa, mfa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSI getMsi() {
		if (msi != null && msi.eIsProxy()) {
			InternalEObject oldMsi = (InternalEObject)msi;
			msi = (MSI)eResolveProxy(oldMsi);
			if (msi != oldMsi) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyModelPackage.DOCUMENT_ROOT__MSI, oldMsi, msi));
			}
		}
		return msi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSI basicGetMsi() {
		return msi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMsi(MSI newMsi) {
		MSI oldMsi = msi;
		msi = newMsi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.DOCUMENT_ROOT__MSI, oldMsi, msi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MOI getMoi() {
		if (moi != null && moi.eIsProxy()) {
			InternalEObject oldMoi = (InternalEObject)moi;
			moi = (MOI)eResolveProxy(oldMoi);
			if (moi != oldMoi) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyModelPackage.DOCUMENT_ROOT__MOI, oldMoi, moi));
			}
		}
		return moi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MOI basicGetMoi() {
		return moi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoi(MOI newMoi) {
		MOI oldMoi = moi;
		moi = newMoi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.DOCUMENT_ROOT__MOI, oldMoi, moi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFI getMfi() {
		if (mfi != null && mfi.eIsProxy()) {
			InternalEObject oldMfi = (InternalEObject)mfi;
			mfi = (MFI)eResolveProxy(oldMfi);
			if (mfi != oldMfi) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyModelPackage.DOCUMENT_ROOT__MFI, oldMfi, mfi));
			}
		}
		return mfi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFI basicGetMfi() {
		return mfi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMfi(MFI newMfi) {
		MFI oldMfi = mfi;
		mfi = newMfi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.DOCUMENT_ROOT__MFI, oldMfi, mfi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MustHappenAtAnInfiniteTime getMusthappenataninfinitetime() {
		if (musthappenataninfinitetime != null && musthappenataninfinitetime.eIsProxy()) {
			InternalEObject oldMusthappenataninfinitetime = (InternalEObject)musthappenataninfinitetime;
			musthappenataninfinitetime = (MustHappenAtAnInfiniteTime)eResolveProxy(oldMusthappenataninfinitetime);
			if (musthappenataninfinitetime != oldMusthappenataninfinitetime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyModelPackage.DOCUMENT_ROOT__MUSTHAPPENATANINFINITETIME, oldMusthappenataninfinitetime, musthappenataninfinitetime));
			}
		}
		return musthappenataninfinitetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MustHappenAtAnInfiniteTime basicGetMusthappenataninfinitetime() {
		return musthappenataninfinitetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMusthappenataninfinitetime(MustHappenAtAnInfiniteTime newMusthappenataninfinitetime) {
		MustHappenAtAnInfiniteTime oldMusthappenataninfinitetime = musthappenataninfinitetime;
		musthappenataninfinitetime = newMusthappenataninfinitetime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.DOCUMENT_ROOT__MUSTHAPPENATANINFINITETIME, oldMusthappenataninfinitetime, musthappenataninfinitetime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MustHappenAsLongAsTheActivityIsExecuting getMusthappenaslongastheactivityisexecuting() {
		if (musthappenaslongastheactivityisexecuting != null && musthappenaslongastheactivityisexecuting.eIsProxy()) {
			InternalEObject oldMusthappenaslongastheactivityisexecuting = (InternalEObject)musthappenaslongastheactivityisexecuting;
			musthappenaslongastheactivityisexecuting = (MustHappenAsLongAsTheActivityIsExecuting)eResolveProxy(oldMusthappenaslongastheactivityisexecuting);
			if (musthappenaslongastheactivityisexecuting != oldMusthappenaslongastheactivityisexecuting) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyModelPackage.DOCUMENT_ROOT__MUSTHAPPENASLONGASTHEACTIVITYISEXECUTING, oldMusthappenaslongastheactivityisexecuting, musthappenaslongastheactivityisexecuting));
			}
		}
		return musthappenaslongastheactivityisexecuting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MustHappenAsLongAsTheActivityIsExecuting basicGetMusthappenaslongastheactivityisexecuting() {
		return musthappenaslongastheactivityisexecuting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMusthappenaslongastheactivityisexecuting(MustHappenAsLongAsTheActivityIsExecuting newMusthappenaslongastheactivityisexecuting) {
		MustHappenAsLongAsTheActivityIsExecuting oldMusthappenaslongastheactivityisexecuting = musthappenaslongastheactivityisexecuting;
		musthappenaslongastheactivityisexecuting = newMusthappenaslongastheactivityisexecuting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.DOCUMENT_ROOT__MUSTHAPPENASLONGASTHEACTIVITYISEXECUTING, oldMusthappenaslongastheactivityisexecuting, musthappenaslongastheactivityisexecuting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MustHappenAtTheStartOfTheActivity getMusthappenatthestartoftheactivity() {
		if (musthappenatthestartoftheactivity != null && musthappenatthestartoftheactivity.eIsProxy()) {
			InternalEObject oldMusthappenatthestartoftheactivity = (InternalEObject)musthappenatthestartoftheactivity;
			musthappenatthestartoftheactivity = (MustHappenAtTheStartOfTheActivity)eResolveProxy(oldMusthappenatthestartoftheactivity);
			if (musthappenatthestartoftheactivity != oldMusthappenatthestartoftheactivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyModelPackage.DOCUMENT_ROOT__MUSTHAPPENATTHESTARTOFTHEACTIVITY, oldMusthappenatthestartoftheactivity, musthappenatthestartoftheactivity));
			}
		}
		return musthappenatthestartoftheactivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MustHappenAtTheStartOfTheActivity basicGetMusthappenatthestartoftheactivity() {
		return musthappenatthestartoftheactivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMusthappenatthestartoftheactivity(MustHappenAtTheStartOfTheActivity newMusthappenatthestartoftheactivity) {
		MustHappenAtTheStartOfTheActivity oldMusthappenatthestartoftheactivity = musthappenatthestartoftheactivity;
		musthappenatthestartoftheactivity = newMusthappenatthestartoftheactivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.DOCUMENT_ROOT__MUSTHAPPENATTHESTARTOFTHEACTIVITY, oldMusthappenatthestartoftheactivity, musthappenatthestartoftheactivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MustHappenAtTheEndOfTheActivity getMusthappenattheendoftheactivity() {
		if (musthappenattheendoftheactivity != null && musthappenattheendoftheactivity.eIsProxy()) {
			InternalEObject oldMusthappenattheendoftheactivity = (InternalEObject)musthappenattheendoftheactivity;
			musthappenattheendoftheactivity = (MustHappenAtTheEndOfTheActivity)eResolveProxy(oldMusthappenattheendoftheactivity);
			if (musthappenattheendoftheactivity != oldMusthappenattheendoftheactivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyModelPackage.DOCUMENT_ROOT__MUSTHAPPENATTHEENDOFTHEACTIVITY, oldMusthappenattheendoftheactivity, musthappenattheendoftheactivity));
			}
		}
		return musthappenattheendoftheactivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MustHappenAtTheEndOfTheActivity basicGetMusthappenattheendoftheactivity() {
		return musthappenattheendoftheactivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMusthappenattheendoftheactivity(MustHappenAtTheEndOfTheActivity newMusthappenattheendoftheactivity) {
		MustHappenAtTheEndOfTheActivity oldMusthappenattheendoftheactivity = musthappenattheendoftheactivity;
		musthappenattheendoftheactivity = newMusthappenattheendoftheactivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.DOCUMENT_ROOT__MUSTHAPPENATTHEENDOFTHEACTIVITY, oldMusthappenattheendoftheactivity, musthappenattheendoftheactivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MustHappenAtABoundTime getMusthappenataboundtime() {
		if (musthappenataboundtime != null && musthappenataboundtime.eIsProxy()) {
			InternalEObject oldMusthappenataboundtime = (InternalEObject)musthappenataboundtime;
			musthappenataboundtime = (MustHappenAtABoundTime)eResolveProxy(oldMusthappenataboundtime);
			if (musthappenataboundtime != oldMusthappenataboundtime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyModelPackage.DOCUMENT_ROOT__MUSTHAPPENATABOUNDTIME, oldMusthappenataboundtime, musthappenataboundtime));
			}
		}
		return musthappenataboundtime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MustHappenAtABoundTime basicGetMusthappenataboundtime() {
		return musthappenataboundtime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMusthappenataboundtime(MustHappenAtABoundTime newMusthappenataboundtime) {
		MustHappenAtABoundTime oldMusthappenataboundtime = musthappenataboundtime;
		musthappenataboundtime = newMusthappenataboundtime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.DOCUMENT_ROOT__MUSTHAPPENATABOUNDTIME, oldMusthappenataboundtime, musthappenataboundtime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MustNeverHappenAtAnInfiniteTime getMustneverhappenataninfinitetime() {
		if (mustneverhappenataninfinitetime != null && mustneverhappenataninfinitetime.eIsProxy()) {
			InternalEObject oldMustneverhappenataninfinitetime = (InternalEObject)mustneverhappenataninfinitetime;
			mustneverhappenataninfinitetime = (MustNeverHappenAtAnInfiniteTime)eResolveProxy(oldMustneverhappenataninfinitetime);
			if (mustneverhappenataninfinitetime != oldMustneverhappenataninfinitetime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyModelPackage.DOCUMENT_ROOT__MUSTNEVERHAPPENATANINFINITETIME, oldMustneverhappenataninfinitetime, mustneverhappenataninfinitetime));
			}
		}
		return mustneverhappenataninfinitetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MustNeverHappenAtAnInfiniteTime basicGetMustneverhappenataninfinitetime() {
		return mustneverhappenataninfinitetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustneverhappenataninfinitetime(MustNeverHappenAtAnInfiniteTime newMustneverhappenataninfinitetime) {
		MustNeverHappenAtAnInfiniteTime oldMustneverhappenataninfinitetime = mustneverhappenataninfinitetime;
		mustneverhappenataninfinitetime = newMustneverhappenataninfinitetime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.DOCUMENT_ROOT__MUSTNEVERHAPPENATANINFINITETIME, oldMustneverhappenataninfinitetime, mustneverhappenataninfinitetime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MustNeverHappenAtTheStartOfTheActivity getMustneverhappenatthestartoftheactivity() {
		if (mustneverhappenatthestartoftheactivity != null && mustneverhappenatthestartoftheactivity.eIsProxy()) {
			InternalEObject oldMustneverhappenatthestartoftheactivity = (InternalEObject)mustneverhappenatthestartoftheactivity;
			mustneverhappenatthestartoftheactivity = (MustNeverHappenAtTheStartOfTheActivity)eResolveProxy(oldMustneverhappenatthestartoftheactivity);
			if (mustneverhappenatthestartoftheactivity != oldMustneverhappenatthestartoftheactivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyModelPackage.DOCUMENT_ROOT__MUSTNEVERHAPPENATTHESTARTOFTHEACTIVITY, oldMustneverhappenatthestartoftheactivity, mustneverhappenatthestartoftheactivity));
			}
		}
		return mustneverhappenatthestartoftheactivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MustNeverHappenAtTheStartOfTheActivity basicGetMustneverhappenatthestartoftheactivity() {
		return mustneverhappenatthestartoftheactivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustneverhappenatthestartoftheactivity(MustNeverHappenAtTheStartOfTheActivity newMustneverhappenatthestartoftheactivity) {
		MustNeverHappenAtTheStartOfTheActivity oldMustneverhappenatthestartoftheactivity = mustneverhappenatthestartoftheactivity;
		mustneverhappenatthestartoftheactivity = newMustneverhappenatthestartoftheactivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.DOCUMENT_ROOT__MUSTNEVERHAPPENATTHESTARTOFTHEACTIVITY, oldMustneverhappenatthestartoftheactivity, mustneverhappenatthestartoftheactivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MustNeverHappenAtTheEndOfTheActivity getMustneverhappenattheendoftheactivity() {
		if (mustneverhappenattheendoftheactivity != null && mustneverhappenattheendoftheactivity.eIsProxy()) {
			InternalEObject oldMustneverhappenattheendoftheactivity = (InternalEObject)mustneverhappenattheendoftheactivity;
			mustneverhappenattheendoftheactivity = (MustNeverHappenAtTheEndOfTheActivity)eResolveProxy(oldMustneverhappenattheendoftheactivity);
			if (mustneverhappenattheendoftheactivity != oldMustneverhappenattheendoftheactivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyModelPackage.DOCUMENT_ROOT__MUSTNEVERHAPPENATTHEENDOFTHEACTIVITY, oldMustneverhappenattheendoftheactivity, mustneverhappenattheendoftheactivity));
			}
		}
		return mustneverhappenattheendoftheactivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MustNeverHappenAtTheEndOfTheActivity basicGetMustneverhappenattheendoftheactivity() {
		return mustneverhappenattheendoftheactivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustneverhappenattheendoftheactivity(MustNeverHappenAtTheEndOfTheActivity newMustneverhappenattheendoftheactivity) {
		MustNeverHappenAtTheEndOfTheActivity oldMustneverhappenattheendoftheactivity = mustneverhappenattheendoftheactivity;
		mustneverhappenattheendoftheactivity = newMustneverhappenattheendoftheactivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.DOCUMENT_ROOT__MUSTNEVERHAPPENATTHEENDOFTHEACTIVITY, oldMustneverhappenattheendoftheactivity, mustneverhappenattheendoftheactivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MustNeverHappenAtABoundTime getMustneverhappenataboundtime() {
		if (mustneverhappenataboundtime != null && mustneverhappenataboundtime.eIsProxy()) {
			InternalEObject oldMustneverhappenataboundtime = (InternalEObject)mustneverhappenataboundtime;
			mustneverhappenataboundtime = (MustNeverHappenAtABoundTime)eResolveProxy(oldMustneverhappenataboundtime);
			if (mustneverhappenataboundtime != oldMustneverhappenataboundtime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyModelPackage.DOCUMENT_ROOT__MUSTNEVERHAPPENATABOUNDTIME, oldMustneverhappenataboundtime, mustneverhappenataboundtime));
			}
		}
		return mustneverhappenataboundtime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MustNeverHappenAtABoundTime basicGetMustneverhappenataboundtime() {
		return mustneverhappenataboundtime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustneverhappenataboundtime(MustNeverHappenAtABoundTime newMustneverhappenataboundtime) {
		MustNeverHappenAtABoundTime oldMustneverhappenataboundtime = mustneverhappenataboundtime;
		mustneverhappenataboundtime = newMustneverhappenataboundtime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.DOCUMENT_ROOT__MUSTNEVERHAPPENATABOUNDTIME, oldMustneverhappenataboundtime, mustneverhappenataboundtime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyEventDefinition getMyeventdefinition() {
		if (myeventdefinition != null && myeventdefinition.eIsProxy()) {
			InternalEObject oldMyeventdefinition = (InternalEObject)myeventdefinition;
			myeventdefinition = (MyEventDefinition)eResolveProxy(oldMyeventdefinition);
			if (myeventdefinition != oldMyeventdefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyModelPackage.DOCUMENT_ROOT__MYEVENTDEFINITION, oldMyeventdefinition, myeventdefinition));
			}
		}
		return myeventdefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyEventDefinition basicGetMyeventdefinition() {
		return myeventdefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyeventdefinition(MyEventDefinition newMyeventdefinition) {
		MyEventDefinition oldMyeventdefinition = myeventdefinition;
		myeventdefinition = newMyeventdefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.DOCUMENT_ROOT__MYEVENTDEFINITION, oldMyeventdefinition, myeventdefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicEvent getPeriodicevent() {
		if (periodicevent != null && periodicevent.eIsProxy()) {
			InternalEObject oldPeriodicevent = (InternalEObject)periodicevent;
			periodicevent = (PeriodicEvent)eResolveProxy(oldPeriodicevent);
			if (periodicevent != oldPeriodicevent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyModelPackage.DOCUMENT_ROOT__PERIODICEVENT, oldPeriodicevent, periodicevent));
			}
		}
		return periodicevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicEvent basicGetPeriodicevent() {
		return periodicevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriodicevent(PeriodicEvent newPeriodicevent) {
		PeriodicEvent oldPeriodicevent = periodicevent;
		periodicevent = newPeriodicevent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.DOCUMENT_ROOT__PERIODICEVENT, oldPeriodicevent, periodicevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SporadicEvent getSporadicevent() {
		if (sporadicevent != null && sporadicevent.eIsProxy()) {
			InternalEObject oldSporadicevent = (InternalEObject)sporadicevent;
			sporadicevent = (SporadicEvent)eResolveProxy(oldSporadicevent);
			if (sporadicevent != oldSporadicevent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyModelPackage.DOCUMENT_ROOT__SPORADICEVENT, oldSporadicevent, sporadicevent));
			}
		}
		return sporadicevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SporadicEvent basicGetSporadicevent() {
		return sporadicevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSporadicevent(SporadicEvent newSporadicevent) {
		SporadicEvent oldSporadicevent = sporadicevent;
		sporadicevent = newSporadicevent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.DOCUMENT_ROOT__SPORADICEVENT, oldSporadicevent, sporadicevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getDuration() {
		if (duration != null && duration.eIsProxy()) {
			InternalEObject oldDuration = (InternalEObject)duration;
			duration = (Duration)eResolveProxy(oldDuration);
			if (duration != oldDuration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyModelPackage.DOCUMENT_ROOT__DURATION, oldDuration, duration));
			}
		}
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration basicGetDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(Duration newDuration) {
		Duration oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.DOCUMENT_ROOT__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalEntityTask getPhysicalentitytask() {
		if (physicalentitytask != null && physicalentitytask.eIsProxy()) {
			InternalEObject oldPhysicalentitytask = (InternalEObject)physicalentitytask;
			physicalentitytask = (PhysicalEntityTask)eResolveProxy(oldPhysicalentitytask);
			if (physicalentitytask != oldPhysicalentitytask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyModelPackage.DOCUMENT_ROOT__PHYSICALENTITYTASK, oldPhysicalentitytask, physicalentitytask));
			}
		}
		return physicalentitytask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalEntityTask basicGetPhysicalentitytask() {
		return physicalentitytask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalentitytask(PhysicalEntityTask newPhysicalentitytask) {
		PhysicalEntityTask oldPhysicalentitytask = physicalentitytask;
		physicalentitytask = newPhysicalentitytask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.DOCUMENT_ROOT__PHYSICALENTITYTASK, oldPhysicalentitytask, physicalentitytask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealWorldProperties getRealworldproperties() {
		if (realworldproperties != null && realworldproperties.eIsProxy()) {
			InternalEObject oldRealworldproperties = (InternalEObject)realworldproperties;
			realworldproperties = (RealWorldProperties)eResolveProxy(oldRealworldproperties);
			if (realworldproperties != oldRealworldproperties) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyModelPackage.DOCUMENT_ROOT__REALWORLDPROPERTIES, oldRealworldproperties, realworldproperties));
			}
		}
		return realworldproperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealWorldProperties basicGetRealworldproperties() {
		return realworldproperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealworldproperties(RealWorldProperties newRealworldproperties) {
		RealWorldProperties oldRealworldproperties = realworldproperties;
		realworldproperties = newRealworldproperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.DOCUMENT_ROOT__REALWORLDPROPERTIES, oldRealworldproperties, realworldproperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyModelPackage.DOCUMENT_ROOT__TASK_CONFIG:
				return basicSetTaskConfig(null, msgs);
			case MyModelPackage.DOCUMENT_ROOT__TEMPORAL_DEPENDENCY:
				return basicSetTemporalDependency(null, msgs);
			case MyModelPackage.DOCUMENT_ROOT__META_DATA:
				return basicSetMetaData(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyModelPackage.DOCUMENT_ROOT__TASK_CONFIG:
				return getTaskConfig();
			case MyModelPackage.DOCUMENT_ROOT__TEMPORAL_DEPENDENCY:
				return getTemporalDependency();
			case MyModelPackage.DOCUMENT_ROOT__META_DATA:
				return getMetaData();
			case MyModelPackage.DOCUMENT_ROOT__MSA:
				if (resolve) return getMsa();
				return basicGetMsa();
			case MyModelPackage.DOCUMENT_ROOT__MOA:
				if (resolve) return getMoa();
				return basicGetMoa();
			case MyModelPackage.DOCUMENT_ROOT__MFA:
				if (resolve) return getMfa();
				return basicGetMfa();
			case MyModelPackage.DOCUMENT_ROOT__MSI:
				if (resolve) return getMsi();
				return basicGetMsi();
			case MyModelPackage.DOCUMENT_ROOT__MOI:
				if (resolve) return getMoi();
				return basicGetMoi();
			case MyModelPackage.DOCUMENT_ROOT__MFI:
				if (resolve) return getMfi();
				return basicGetMfi();
			case MyModelPackage.DOCUMENT_ROOT__MUSTHAPPENATANINFINITETIME:
				if (resolve) return getMusthappenataninfinitetime();
				return basicGetMusthappenataninfinitetime();
			case MyModelPackage.DOCUMENT_ROOT__MUSTHAPPENASLONGASTHEACTIVITYISEXECUTING:
				if (resolve) return getMusthappenaslongastheactivityisexecuting();
				return basicGetMusthappenaslongastheactivityisexecuting();
			case MyModelPackage.DOCUMENT_ROOT__MUSTHAPPENATTHESTARTOFTHEACTIVITY:
				if (resolve) return getMusthappenatthestartoftheactivity();
				return basicGetMusthappenatthestartoftheactivity();
			case MyModelPackage.DOCUMENT_ROOT__MUSTHAPPENATTHEENDOFTHEACTIVITY:
				if (resolve) return getMusthappenattheendoftheactivity();
				return basicGetMusthappenattheendoftheactivity();
			case MyModelPackage.DOCUMENT_ROOT__MUSTHAPPENATABOUNDTIME:
				if (resolve) return getMusthappenataboundtime();
				return basicGetMusthappenataboundtime();
			case MyModelPackage.DOCUMENT_ROOT__MUSTNEVERHAPPENATANINFINITETIME:
				if (resolve) return getMustneverhappenataninfinitetime();
				return basicGetMustneverhappenataninfinitetime();
			case MyModelPackage.DOCUMENT_ROOT__MUSTNEVERHAPPENATTHESTARTOFTHEACTIVITY:
				if (resolve) return getMustneverhappenatthestartoftheactivity();
				return basicGetMustneverhappenatthestartoftheactivity();
			case MyModelPackage.DOCUMENT_ROOT__MUSTNEVERHAPPENATTHEENDOFTHEACTIVITY:
				if (resolve) return getMustneverhappenattheendoftheactivity();
				return basicGetMustneverhappenattheendoftheactivity();
			case MyModelPackage.DOCUMENT_ROOT__MUSTNEVERHAPPENATABOUNDTIME:
				if (resolve) return getMustneverhappenataboundtime();
				return basicGetMustneverhappenataboundtime();
			case MyModelPackage.DOCUMENT_ROOT__MYEVENTDEFINITION:
				if (resolve) return getMyeventdefinition();
				return basicGetMyeventdefinition();
			case MyModelPackage.DOCUMENT_ROOT__DURATION:
				if (resolve) return getDuration();
				return basicGetDuration();
			case MyModelPackage.DOCUMENT_ROOT__PERIODICEVENT:
				if (resolve) return getPeriodicevent();
				return basicGetPeriodicevent();
			case MyModelPackage.DOCUMENT_ROOT__SPORADICEVENT:
				if (resolve) return getSporadicevent();
				return basicGetSporadicevent();
			case MyModelPackage.DOCUMENT_ROOT__PHYSICALENTITYTASK:
				if (resolve) return getPhysicalentitytask();
				return basicGetPhysicalentitytask();
			case MyModelPackage.DOCUMENT_ROOT__REALWORLDPROPERTIES:
				if (resolve) return getRealworldproperties();
				return basicGetRealworldproperties();
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
			case MyModelPackage.DOCUMENT_ROOT__TASK_CONFIG:
				setTaskConfig((TaskConfig)newValue);
				return;
			case MyModelPackage.DOCUMENT_ROOT__TEMPORAL_DEPENDENCY:
				setTemporalDependency((TemporalDependency)newValue);
				return;
			case MyModelPackage.DOCUMENT_ROOT__META_DATA:
				setMetaData((MetaData)newValue);
				return;
			case MyModelPackage.DOCUMENT_ROOT__MSA:
				setMsa((MSA)newValue);
				return;
			case MyModelPackage.DOCUMENT_ROOT__MOA:
				setMoa((MOA)newValue);
				return;
			case MyModelPackage.DOCUMENT_ROOT__MFA:
				setMfa((MFA)newValue);
				return;
			case MyModelPackage.DOCUMENT_ROOT__MSI:
				setMsi((MSI)newValue);
				return;
			case MyModelPackage.DOCUMENT_ROOT__MOI:
				setMoi((MOI)newValue);
				return;
			case MyModelPackage.DOCUMENT_ROOT__MFI:
				setMfi((MFI)newValue);
				return;
			case MyModelPackage.DOCUMENT_ROOT__MUSTHAPPENATANINFINITETIME:
				setMusthappenataninfinitetime((MustHappenAtAnInfiniteTime)newValue);
				return;
			case MyModelPackage.DOCUMENT_ROOT__MUSTHAPPENASLONGASTHEACTIVITYISEXECUTING:
				setMusthappenaslongastheactivityisexecuting((MustHappenAsLongAsTheActivityIsExecuting)newValue);
				return;
			case MyModelPackage.DOCUMENT_ROOT__MUSTHAPPENATTHESTARTOFTHEACTIVITY:
				setMusthappenatthestartoftheactivity((MustHappenAtTheStartOfTheActivity)newValue);
				return;
			case MyModelPackage.DOCUMENT_ROOT__MUSTHAPPENATTHEENDOFTHEACTIVITY:
				setMusthappenattheendoftheactivity((MustHappenAtTheEndOfTheActivity)newValue);
				return;
			case MyModelPackage.DOCUMENT_ROOT__MUSTHAPPENATABOUNDTIME:
				setMusthappenataboundtime((MustHappenAtABoundTime)newValue);
				return;
			case MyModelPackage.DOCUMENT_ROOT__MUSTNEVERHAPPENATANINFINITETIME:
				setMustneverhappenataninfinitetime((MustNeverHappenAtAnInfiniteTime)newValue);
				return;
			case MyModelPackage.DOCUMENT_ROOT__MUSTNEVERHAPPENATTHESTARTOFTHEACTIVITY:
				setMustneverhappenatthestartoftheactivity((MustNeverHappenAtTheStartOfTheActivity)newValue);
				return;
			case MyModelPackage.DOCUMENT_ROOT__MUSTNEVERHAPPENATTHEENDOFTHEACTIVITY:
				setMustneverhappenattheendoftheactivity((MustNeverHappenAtTheEndOfTheActivity)newValue);
				return;
			case MyModelPackage.DOCUMENT_ROOT__MUSTNEVERHAPPENATABOUNDTIME:
				setMustneverhappenataboundtime((MustNeverHappenAtABoundTime)newValue);
				return;
			case MyModelPackage.DOCUMENT_ROOT__MYEVENTDEFINITION:
				setMyeventdefinition((MyEventDefinition)newValue);
				return;
			case MyModelPackage.DOCUMENT_ROOT__DURATION:
				setDuration((Duration)newValue);
				return;
			case MyModelPackage.DOCUMENT_ROOT__PERIODICEVENT:
				setPeriodicevent((PeriodicEvent)newValue);
				return;
			case MyModelPackage.DOCUMENT_ROOT__SPORADICEVENT:
				setSporadicevent((SporadicEvent)newValue);
				return;
			case MyModelPackage.DOCUMENT_ROOT__PHYSICALENTITYTASK:
				setPhysicalentitytask((PhysicalEntityTask)newValue);
				return;
			case MyModelPackage.DOCUMENT_ROOT__REALWORLDPROPERTIES:
				setRealworldproperties((RealWorldProperties)newValue);
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
			case MyModelPackage.DOCUMENT_ROOT__TASK_CONFIG:
				setTaskConfig((TaskConfig)null);
				return;
			case MyModelPackage.DOCUMENT_ROOT__TEMPORAL_DEPENDENCY:
				setTemporalDependency((TemporalDependency)null);
				return;
			case MyModelPackage.DOCUMENT_ROOT__META_DATA:
				setMetaData((MetaData)null);
				return;
			case MyModelPackage.DOCUMENT_ROOT__MSA:
				setMsa((MSA)null);
				return;
			case MyModelPackage.DOCUMENT_ROOT__MOA:
				setMoa((MOA)null);
				return;
			case MyModelPackage.DOCUMENT_ROOT__MFA:
				setMfa((MFA)null);
				return;
			case MyModelPackage.DOCUMENT_ROOT__MSI:
				setMsi((MSI)null);
				return;
			case MyModelPackage.DOCUMENT_ROOT__MOI:
				setMoi((MOI)null);
				return;
			case MyModelPackage.DOCUMENT_ROOT__MFI:
				setMfi((MFI)null);
				return;
			case MyModelPackage.DOCUMENT_ROOT__MUSTHAPPENATANINFINITETIME:
				setMusthappenataninfinitetime((MustHappenAtAnInfiniteTime)null);
				return;
			case MyModelPackage.DOCUMENT_ROOT__MUSTHAPPENASLONGASTHEACTIVITYISEXECUTING:
				setMusthappenaslongastheactivityisexecuting((MustHappenAsLongAsTheActivityIsExecuting)null);
				return;
			case MyModelPackage.DOCUMENT_ROOT__MUSTHAPPENATTHESTARTOFTHEACTIVITY:
				setMusthappenatthestartoftheactivity((MustHappenAtTheStartOfTheActivity)null);
				return;
			case MyModelPackage.DOCUMENT_ROOT__MUSTHAPPENATTHEENDOFTHEACTIVITY:
				setMusthappenattheendoftheactivity((MustHappenAtTheEndOfTheActivity)null);
				return;
			case MyModelPackage.DOCUMENT_ROOT__MUSTHAPPENATABOUNDTIME:
				setMusthappenataboundtime((MustHappenAtABoundTime)null);
				return;
			case MyModelPackage.DOCUMENT_ROOT__MUSTNEVERHAPPENATANINFINITETIME:
				setMustneverhappenataninfinitetime((MustNeverHappenAtAnInfiniteTime)null);
				return;
			case MyModelPackage.DOCUMENT_ROOT__MUSTNEVERHAPPENATTHESTARTOFTHEACTIVITY:
				setMustneverhappenatthestartoftheactivity((MustNeverHappenAtTheStartOfTheActivity)null);
				return;
			case MyModelPackage.DOCUMENT_ROOT__MUSTNEVERHAPPENATTHEENDOFTHEACTIVITY:
				setMustneverhappenattheendoftheactivity((MustNeverHappenAtTheEndOfTheActivity)null);
				return;
			case MyModelPackage.DOCUMENT_ROOT__MUSTNEVERHAPPENATABOUNDTIME:
				setMustneverhappenataboundtime((MustNeverHappenAtABoundTime)null);
				return;
			case MyModelPackage.DOCUMENT_ROOT__MYEVENTDEFINITION:
				setMyeventdefinition((MyEventDefinition)null);
				return;
			case MyModelPackage.DOCUMENT_ROOT__DURATION:
				setDuration((Duration)null);
				return;
			case MyModelPackage.DOCUMENT_ROOT__PERIODICEVENT:
				setPeriodicevent((PeriodicEvent)null);
				return;
			case MyModelPackage.DOCUMENT_ROOT__SPORADICEVENT:
				setSporadicevent((SporadicEvent)null);
				return;
			case MyModelPackage.DOCUMENT_ROOT__PHYSICALENTITYTASK:
				setPhysicalentitytask((PhysicalEntityTask)null);
				return;
			case MyModelPackage.DOCUMENT_ROOT__REALWORLDPROPERTIES:
				setRealworldproperties((RealWorldProperties)null);
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
			case MyModelPackage.DOCUMENT_ROOT__TASK_CONFIG:
				return taskConfig != null;
			case MyModelPackage.DOCUMENT_ROOT__TEMPORAL_DEPENDENCY:
				return temporalDependency != null;
			case MyModelPackage.DOCUMENT_ROOT__META_DATA:
				return metaData != null;
			case MyModelPackage.DOCUMENT_ROOT__MSA:
				return msa != null;
			case MyModelPackage.DOCUMENT_ROOT__MOA:
				return moa != null;
			case MyModelPackage.DOCUMENT_ROOT__MFA:
				return mfa != null;
			case MyModelPackage.DOCUMENT_ROOT__MSI:
				return msi != null;
			case MyModelPackage.DOCUMENT_ROOT__MOI:
				return moi != null;
			case MyModelPackage.DOCUMENT_ROOT__MFI:
				return mfi != null;
			case MyModelPackage.DOCUMENT_ROOT__MUSTHAPPENATANINFINITETIME:
				return musthappenataninfinitetime != null;
			case MyModelPackage.DOCUMENT_ROOT__MUSTHAPPENASLONGASTHEACTIVITYISEXECUTING:
				return musthappenaslongastheactivityisexecuting != null;
			case MyModelPackage.DOCUMENT_ROOT__MUSTHAPPENATTHESTARTOFTHEACTIVITY:
				return musthappenatthestartoftheactivity != null;
			case MyModelPackage.DOCUMENT_ROOT__MUSTHAPPENATTHEENDOFTHEACTIVITY:
				return musthappenattheendoftheactivity != null;
			case MyModelPackage.DOCUMENT_ROOT__MUSTHAPPENATABOUNDTIME:
				return musthappenataboundtime != null;
			case MyModelPackage.DOCUMENT_ROOT__MUSTNEVERHAPPENATANINFINITETIME:
				return mustneverhappenataninfinitetime != null;
			case MyModelPackage.DOCUMENT_ROOT__MUSTNEVERHAPPENATTHESTARTOFTHEACTIVITY:
				return mustneverhappenatthestartoftheactivity != null;
			case MyModelPackage.DOCUMENT_ROOT__MUSTNEVERHAPPENATTHEENDOFTHEACTIVITY:
				return mustneverhappenattheendoftheactivity != null;
			case MyModelPackage.DOCUMENT_ROOT__MUSTNEVERHAPPENATABOUNDTIME:
				return mustneverhappenataboundtime != null;
			case MyModelPackage.DOCUMENT_ROOT__MYEVENTDEFINITION:
				return myeventdefinition != null;
			case MyModelPackage.DOCUMENT_ROOT__DURATION:
				return duration != null;
			case MyModelPackage.DOCUMENT_ROOT__PERIODICEVENT:
				return periodicevent != null;
			case MyModelPackage.DOCUMENT_ROOT__SPORADICEVENT:
				return sporadicevent != null;
			case MyModelPackage.DOCUMENT_ROOT__PHYSICALENTITYTASK:
				return physicalentitytask != null;
			case MyModelPackage.DOCUMENT_ROOT__REALWORLDPROPERTIES:
				return realworldproperties != null;
		}
		return super.eIsSet(featureID);
	}

} //DocumentRootImpl
