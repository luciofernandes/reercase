/**
 */
package rmm.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import rmm.ActionGranularityType;
import rmm.ActionTime;
import rmm.ActionTimeType;
import rmm.Attribute;
import rmm.DataTypeExecution;
import rmm.RmmPackage;
import rmm.Table;
import rmm.Trigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rmm.impl.TriggerImpl#isInsert <em>Insert</em>}</li>
 *   <li>{@link rmm.impl.TriggerImpl#isUpdate <em>Update</em>}</li>
 *   <li>{@link rmm.impl.TriggerImpl#isDelete <em>Delete</em>}</li>
 *   <li>{@link rmm.impl.TriggerImpl#getActionTime <em>Action Time</em>}</li>
 *   <li>{@link rmm.impl.TriggerImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link rmm.impl.TriggerImpl#getStatementSQL <em>Statement SQL</em>}</li>
 *   <li>{@link rmm.impl.TriggerImpl#getActionGranularity <em>Action Granularity</em>}</li>
 *   <li>{@link rmm.impl.TriggerImpl#getOldRow <em>Old Row</em>}</li>
 *   <li>{@link rmm.impl.TriggerImpl#getNewRow <em>New Row</em>}</li>
 *   <li>{@link rmm.impl.TriggerImpl#getOldTable <em>Old Table</em>}</li>
 *   <li>{@link rmm.impl.TriggerImpl#getNewTable <em>New Table</em>}</li>
 *   <li>{@link rmm.impl.TriggerImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TriggerImpl extends ConstraintImpl implements Trigger {
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
	 * The default value of the '{@link #getActionTime() <em>Action Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionTime()
	 * @generated
	 * @ordered
	 */
	protected static final ActionTimeType ACTION_TIME_EDEFAULT = ActionTimeType.AFTER;

	/**
	 * The cached value of the '{@link #getActionTime() <em>Action Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionTime()
	 * @generated
	 * @ordered
	 */
	protected ActionTimeType actionTime = ACTION_TIME_EDEFAULT;

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
	 * The default value of the '{@link #getStatementSQL() <em>Statement SQL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementSQL()
	 * @generated
	 * @ordered
	 */
	protected static final String STATEMENT_SQL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatementSQL() <em>Statement SQL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementSQL()
	 * @generated
	 * @ordered
	 */
	protected String statementSQL = STATEMENT_SQL_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionGranularity() <em>Action Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionGranularity()
	 * @generated
	 * @ordered
	 */
	protected static final ActionGranularityType ACTION_GRANULARITY_EDEFAULT = ActionGranularityType.STATEMENT;

	/**
	 * The cached value of the '{@link #getActionGranularity() <em>Action Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionGranularity()
	 * @generated
	 * @ordered
	 */
	protected ActionGranularityType actionGranularity = ACTION_GRANULARITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOldRow() <em>Old Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldRow()
	 * @generated
	 * @ordered
	 */
	protected static final String OLD_ROW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOldRow() <em>Old Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldRow()
	 * @generated
	 * @ordered
	 */
	protected String oldRow = OLD_ROW_EDEFAULT;

	/**
	 * The default value of the '{@link #getNewRow() <em>New Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewRow()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_ROW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewRow() <em>New Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewRow()
	 * @generated
	 * @ordered
	 */
	protected String newRow = NEW_ROW_EDEFAULT;

	/**
	 * The default value of the '{@link #getOldTable() <em>Old Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldTable()
	 * @generated
	 * @ordered
	 */
	protected static final String OLD_TABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOldTable() <em>Old Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldTable()
	 * @generated
	 * @ordered
	 */
	protected String oldTable = OLD_TABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNewTable() <em>New Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewTable()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_TABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewTable() <em>New Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewTable()
	 * @generated
	 * @ordered
	 */
	protected String newTable = NEW_TABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

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
	public ActionGranularityType getActionGranularity() {
		return actionGranularity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionGranularity(ActionGranularityType newActionGranularity) {
		ActionGranularityType oldActionGranularity = actionGranularity;
		actionGranularity = newActionGranularity == null ? ACTION_GRANULARITY_EDEFAULT : newActionGranularity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmmPackage.TRIGGER__ACTION_GRANULARITY, oldActionGranularity, actionGranularity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOldRow() {
		return oldRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOldRow(String newOldRow) {
		String oldOldRow = oldRow;
		oldRow = newOldRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmmPackage.TRIGGER__OLD_ROW, oldOldRow, oldRow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewRow() {
		return newRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewRow(String newNewRow) {
		String oldNewRow = newRow;
		newRow = newNewRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmmPackage.TRIGGER__NEW_ROW, oldNewRow, newRow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOldTable() {
		return oldTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOldTable(String newOldTable) {
		String oldOldTable = oldTable;
		oldTable = newOldTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmmPackage.TRIGGER__OLD_TABLE, oldOldTable, oldTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewTable() {
		return newTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewTable(String newNewTable) {
		String oldNewTable = newTable;
		newTable = newNewTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmmPackage.TRIGGER__NEW_TABLE, oldNewTable, newTable));
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
	public ActionTimeType getActionTime() {
		return actionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionTime(ActionTimeType newActionTime) {
		ActionTimeType oldActionTime = actionTime;
		actionTime = newActionTime == null ? ACTION_TIME_EDEFAULT : newActionTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmmPackage.TRIGGER__ACTION_TIME, oldActionTime, actionTime));
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
	public String getStatementSQL() {
		return statementSQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatementSQL(String newStatementSQL) {
		String oldStatementSQL = statementSQL;
		statementSQL = newStatementSQL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmmPackage.TRIGGER__STATEMENT_SQL, oldStatementSQL, statementSQL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectResolvingEList<Attribute>(Attribute.class, this, RmmPackage.TRIGGER__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RmmPackage.TRIGGER__INSERT:
				return isInsert();
			case RmmPackage.TRIGGER__UPDATE:
				return isUpdate();
			case RmmPackage.TRIGGER__DELETE:
				return isDelete();
			case RmmPackage.TRIGGER__ACTION_TIME:
				return getActionTime();
			case RmmPackage.TRIGGER__CONDITION:
				return getCondition();
			case RmmPackage.TRIGGER__STATEMENT_SQL:
				return getStatementSQL();
			case RmmPackage.TRIGGER__ACTION_GRANULARITY:
				return getActionGranularity();
			case RmmPackage.TRIGGER__OLD_ROW:
				return getOldRow();
			case RmmPackage.TRIGGER__NEW_ROW:
				return getNewRow();
			case RmmPackage.TRIGGER__OLD_TABLE:
				return getOldTable();
			case RmmPackage.TRIGGER__NEW_TABLE:
				return getNewTable();
			case RmmPackage.TRIGGER__ATTRIBUTES:
				return getAttributes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RmmPackage.TRIGGER__INSERT:
				setInsert((Boolean)newValue);
				return;
			case RmmPackage.TRIGGER__UPDATE:
				setUpdate((Boolean)newValue);
				return;
			case RmmPackage.TRIGGER__DELETE:
				setDelete((Boolean)newValue);
				return;
			case RmmPackage.TRIGGER__ACTION_TIME:
				setActionTime((ActionTimeType)newValue);
				return;
			case RmmPackage.TRIGGER__CONDITION:
				setCondition((String)newValue);
				return;
			case RmmPackage.TRIGGER__STATEMENT_SQL:
				setStatementSQL((String)newValue);
				return;
			case RmmPackage.TRIGGER__ACTION_GRANULARITY:
				setActionGranularity((ActionGranularityType)newValue);
				return;
			case RmmPackage.TRIGGER__OLD_ROW:
				setOldRow((String)newValue);
				return;
			case RmmPackage.TRIGGER__NEW_ROW:
				setNewRow((String)newValue);
				return;
			case RmmPackage.TRIGGER__OLD_TABLE:
				setOldTable((String)newValue);
				return;
			case RmmPackage.TRIGGER__NEW_TABLE:
				setNewTable((String)newValue);
				return;
			case RmmPackage.TRIGGER__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
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
			case RmmPackage.TRIGGER__INSERT:
				setInsert(INSERT_EDEFAULT);
				return;
			case RmmPackage.TRIGGER__UPDATE:
				setUpdate(UPDATE_EDEFAULT);
				return;
			case RmmPackage.TRIGGER__DELETE:
				setDelete(DELETE_EDEFAULT);
				return;
			case RmmPackage.TRIGGER__ACTION_TIME:
				setActionTime(ACTION_TIME_EDEFAULT);
				return;
			case RmmPackage.TRIGGER__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case RmmPackage.TRIGGER__STATEMENT_SQL:
				setStatementSQL(STATEMENT_SQL_EDEFAULT);
				return;
			case RmmPackage.TRIGGER__ACTION_GRANULARITY:
				setActionGranularity(ACTION_GRANULARITY_EDEFAULT);
				return;
			case RmmPackage.TRIGGER__OLD_ROW:
				setOldRow(OLD_ROW_EDEFAULT);
				return;
			case RmmPackage.TRIGGER__NEW_ROW:
				setNewRow(NEW_ROW_EDEFAULT);
				return;
			case RmmPackage.TRIGGER__OLD_TABLE:
				setOldTable(OLD_TABLE_EDEFAULT);
				return;
			case RmmPackage.TRIGGER__NEW_TABLE:
				setNewTable(NEW_TABLE_EDEFAULT);
				return;
			case RmmPackage.TRIGGER__ATTRIBUTES:
				getAttributes().clear();
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
			case RmmPackage.TRIGGER__INSERT:
				return insert != INSERT_EDEFAULT;
			case RmmPackage.TRIGGER__UPDATE:
				return update != UPDATE_EDEFAULT;
			case RmmPackage.TRIGGER__DELETE:
				return delete != DELETE_EDEFAULT;
			case RmmPackage.TRIGGER__ACTION_TIME:
				return actionTime != ACTION_TIME_EDEFAULT;
			case RmmPackage.TRIGGER__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case RmmPackage.TRIGGER__STATEMENT_SQL:
				return STATEMENT_SQL_EDEFAULT == null ? statementSQL != null : !STATEMENT_SQL_EDEFAULT.equals(statementSQL);
			case RmmPackage.TRIGGER__ACTION_GRANULARITY:
				return actionGranularity != ACTION_GRANULARITY_EDEFAULT;
			case RmmPackage.TRIGGER__OLD_ROW:
				return OLD_ROW_EDEFAULT == null ? oldRow != null : !OLD_ROW_EDEFAULT.equals(oldRow);
			case RmmPackage.TRIGGER__NEW_ROW:
				return NEW_ROW_EDEFAULT == null ? newRow != null : !NEW_ROW_EDEFAULT.equals(newRow);
			case RmmPackage.TRIGGER__OLD_TABLE:
				return OLD_TABLE_EDEFAULT == null ? oldTable != null : !OLD_TABLE_EDEFAULT.equals(oldTable);
			case RmmPackage.TRIGGER__NEW_TABLE:
				return NEW_TABLE_EDEFAULT == null ? newTable != null : !NEW_TABLE_EDEFAULT.equals(newTable);
			case RmmPackage.TRIGGER__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
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
		result.append(" (insert: ");
		result.append(insert);
		result.append(", update: ");
		result.append(update);
		result.append(", delete: ");
		result.append(delete);
		result.append(", actionTime: ");
		result.append(actionTime);
		result.append(", condition: ");
		result.append(condition);
		result.append(", statementSQL: ");
		result.append(statementSQL);
		result.append(", actionGranularity: ");
		result.append(actionGranularity);
		result.append(", oldRow: ");
		result.append(oldRow);
		result.append(", newRow: ");
		result.append(newRow);
		result.append(", oldTable: ");
		result.append(oldTable);
		result.append(", newTable: ");
		result.append(newTable);
		result.append(')');
		return result.toString();
	}

} //TriggerImpl
