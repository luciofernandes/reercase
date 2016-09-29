/**
 */
package rmm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rmm.DataTypeExecution;
import rmm.RmmPackage;
import rmm.Trigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rmm.impl.TriggerImpl#getBody <em>Body</em>}</li>
 *   <li>{@link rmm.impl.TriggerImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link rmm.impl.TriggerImpl#isInsert <em>Insert</em>}</li>
 *   <li>{@link rmm.impl.TriggerImpl#isUpdate <em>Update</em>}</li>
 *   <li>{@link rmm.impl.TriggerImpl#isDelete <em>Delete</em>}</li>
 *   <li>{@link rmm.impl.TriggerImpl#getExecution <em>Execution</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TriggerImpl extends ConstraintImpl implements Trigger {
	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #isInsert() <em>Insert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInsert()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INSERT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInsert() <em>Insert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInsert()
	 * @generated
	 * @ordered
	 */
	protected boolean insert = INSERT_EDEFAULT;

	/**
	 * The default value of the '{@link #isUpdate() <em>Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UPDATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUpdate() <em>Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUpdate()
	 * @generated
	 * @ordered
	 */
	protected boolean update = UPDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDelete() <em>Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDelete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DELETE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDelete() <em>Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDelete()
	 * @generated
	 * @ordered
	 */
	protected boolean delete = DELETE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecution() <em>Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecution()
	 * @generated
	 * @ordered
	 */
	protected static final DataTypeExecution EXECUTION_EDEFAULT = DataTypeExecution.AFTER;

	/**
	 * The cached value of the '{@link #getExecution() <em>Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecution()
	 * @generated
	 * @ordered
	 */
	protected DataTypeExecution execution = EXECUTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RmmPackage.Literals.TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmmPackage.TRIGGER__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmmPackage.TRIGGER__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInsert() {
		return insert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsert(boolean newInsert) {
		boolean oldInsert = insert;
		insert = newInsert;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmmPackage.TRIGGER__INSERT, oldInsert, insert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUpdate() {
		return update;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdate(boolean newUpdate) {
		boolean oldUpdate = update;
		update = newUpdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmmPackage.TRIGGER__UPDATE, oldUpdate, update));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDelete() {
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelete(boolean newDelete) {
		boolean oldDelete = delete;
		delete = newDelete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmmPackage.TRIGGER__DELETE, oldDelete, delete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeExecution getExecution() {
		return execution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecution(DataTypeExecution newExecution) {
		DataTypeExecution oldExecution = execution;
		execution = newExecution == null ? EXECUTION_EDEFAULT : newExecution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmmPackage.TRIGGER__EXECUTION, oldExecution, execution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RmmPackage.TRIGGER__BODY:
				return getBody();
			case RmmPackage.TRIGGER__CONDITION:
				return getCondition();
			case RmmPackage.TRIGGER__INSERT:
				return isInsert();
			case RmmPackage.TRIGGER__UPDATE:
				return isUpdate();
			case RmmPackage.TRIGGER__DELETE:
				return isDelete();
			case RmmPackage.TRIGGER__EXECUTION:
				return getExecution();
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
			case RmmPackage.TRIGGER__BODY:
				setBody((String)newValue);
				return;
			case RmmPackage.TRIGGER__CONDITION:
				setCondition((String)newValue);
				return;
			case RmmPackage.TRIGGER__INSERT:
				setInsert((Boolean)newValue);
				return;
			case RmmPackage.TRIGGER__UPDATE:
				setUpdate((Boolean)newValue);
				return;
			case RmmPackage.TRIGGER__DELETE:
				setDelete((Boolean)newValue);
				return;
			case RmmPackage.TRIGGER__EXECUTION:
				setExecution((DataTypeExecution)newValue);
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
			case RmmPackage.TRIGGER__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case RmmPackage.TRIGGER__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case RmmPackage.TRIGGER__INSERT:
				setInsert(INSERT_EDEFAULT);
				return;
			case RmmPackage.TRIGGER__UPDATE:
				setUpdate(UPDATE_EDEFAULT);
				return;
			case RmmPackage.TRIGGER__DELETE:
				setDelete(DELETE_EDEFAULT);
				return;
			case RmmPackage.TRIGGER__EXECUTION:
				setExecution(EXECUTION_EDEFAULT);
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
			case RmmPackage.TRIGGER__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case RmmPackage.TRIGGER__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case RmmPackage.TRIGGER__INSERT:
				return insert != INSERT_EDEFAULT;
			case RmmPackage.TRIGGER__UPDATE:
				return update != UPDATE_EDEFAULT;
			case RmmPackage.TRIGGER__DELETE:
				return delete != DELETE_EDEFAULT;
			case RmmPackage.TRIGGER__EXECUTION:
				return execution != EXECUTION_EDEFAULT;
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
		result.append(" (body: ");
		result.append(body);
		result.append(", condition: ");
		result.append(condition);
		result.append(", insert: ");
		result.append(insert);
		result.append(", update: ");
		result.append(update);
		result.append(", delete: ");
		result.append(delete);
		result.append(", execution: ");
		result.append(execution);
		result.append(')');
		return result.toString();
	}

} //TriggerImpl
