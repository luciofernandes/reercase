/**
 */
package rmm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import rmm.ForeignKey;
import rmm.OperationRestrictionIntegrity;
import rmm.PrimaryKey;
import rmm.Relationship;
import rmm.RmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rmm.impl.RelationshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link rmm.impl.RelationshipImpl#getUpdate <em>Update</em>}</li>
 *   <li>{@link rmm.impl.RelationshipImpl#getDelete <em>Delete</em>}</li>
 *   <li>{@link rmm.impl.RelationshipImpl#getSource <em>Source</em>}</li>
 *   <li>{@link rmm.impl.RelationshipImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationshipImpl extends EObjectImpl implements Relationship {
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
	 * The default value of the '{@link #getUpdate() <em>Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final OperationRestrictionIntegrity UPDATE_EDEFAULT = OperationRestrictionIntegrity.RESTRICT;

	/**
	 * The cached value of the '{@link #getUpdate() <em>Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdate()
	 * @generated
	 * @ordered
	 */
	protected OperationRestrictionIntegrity update = UPDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDelete() <em>Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelete()
	 * @generated
	 * @ordered
	 */
	protected static final OperationRestrictionIntegrity DELETE_EDEFAULT = OperationRestrictionIntegrity.RESTRICT;

	/**
	 * The cached value of the '{@link #getDelete() <em>Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelete()
	 * @generated
	 * @ordered
	 */
	protected OperationRestrictionIntegrity delete = DELETE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected PrimaryKey source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ForeignKey target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RmmPackage.Literals.RELATIONSHIP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RmmPackage.RELATIONSHIP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationRestrictionIntegrity getUpdate() {
		return update;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdate(OperationRestrictionIntegrity newUpdate) {
		OperationRestrictionIntegrity oldUpdate = update;
		update = newUpdate == null ? UPDATE_EDEFAULT : newUpdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmmPackage.RELATIONSHIP__UPDATE, oldUpdate, update));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationRestrictionIntegrity getDelete() {
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelete(OperationRestrictionIntegrity newDelete) {
		OperationRestrictionIntegrity oldDelete = delete;
		delete = newDelete == null ? DELETE_EDEFAULT : newDelete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmmPackage.RELATIONSHIP__DELETE, oldDelete, delete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKey getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (PrimaryKey)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmmPackage.RELATIONSHIP__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKey basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(PrimaryKey newSource) {
		PrimaryKey oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmmPackage.RELATIONSHIP__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForeignKey getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ForeignKey)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmmPackage.RELATIONSHIP__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForeignKey basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ForeignKey newTarget) {
		ForeignKey oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmmPackage.RELATIONSHIP__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RmmPackage.RELATIONSHIP__NAME:
				return getName();
			case RmmPackage.RELATIONSHIP__UPDATE:
				return getUpdate();
			case RmmPackage.RELATIONSHIP__DELETE:
				return getDelete();
			case RmmPackage.RELATIONSHIP__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case RmmPackage.RELATIONSHIP__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case RmmPackage.RELATIONSHIP__NAME:
				setName((String)newValue);
				return;
			case RmmPackage.RELATIONSHIP__UPDATE:
				setUpdate((OperationRestrictionIntegrity)newValue);
				return;
			case RmmPackage.RELATIONSHIP__DELETE:
				setDelete((OperationRestrictionIntegrity)newValue);
				return;
			case RmmPackage.RELATIONSHIP__SOURCE:
				setSource((PrimaryKey)newValue);
				return;
			case RmmPackage.RELATIONSHIP__TARGET:
				setTarget((ForeignKey)newValue);
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
			case RmmPackage.RELATIONSHIP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RmmPackage.RELATIONSHIP__UPDATE:
				setUpdate(UPDATE_EDEFAULT);
				return;
			case RmmPackage.RELATIONSHIP__DELETE:
				setDelete(DELETE_EDEFAULT);
				return;
			case RmmPackage.RELATIONSHIP__SOURCE:
				setSource((PrimaryKey)null);
				return;
			case RmmPackage.RELATIONSHIP__TARGET:
				setTarget((ForeignKey)null);
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
			case RmmPackage.RELATIONSHIP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RmmPackage.RELATIONSHIP__UPDATE:
				return update != UPDATE_EDEFAULT;
			case RmmPackage.RELATIONSHIP__DELETE:
				return delete != DELETE_EDEFAULT;
			case RmmPackage.RELATIONSHIP__SOURCE:
				return source != null;
			case RmmPackage.RELATIONSHIP__TARGET:
				return target != null;
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
		result.append(", update: ");
		result.append(update);
		result.append(", delete: ");
		result.append(delete);
		result.append(')');
		return result.toString();
	}

} //RelationshipImpl
