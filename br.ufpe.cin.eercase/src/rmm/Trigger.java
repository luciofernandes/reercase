/**
 */
package rmm;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rmm.Trigger#isInsert <em>Insert</em>}</li>
 *   <li>{@link rmm.Trigger#isUpdate <em>Update</em>}</li>
 *   <li>{@link rmm.Trigger#isDelete <em>Delete</em>}</li>
 *   <li>{@link rmm.Trigger#getActionTime <em>Action Time</em>}</li>
 *   <li>{@link rmm.Trigger#getCondition <em>Condition</em>}</li>
 *   <li>{@link rmm.Trigger#getStatementSQL <em>Statement SQL</em>}</li>
 *   <li>{@link rmm.Trigger#getActionGranularity <em>Action Granularity</em>}</li>
 *   <li>{@link rmm.Trigger#getOldRow <em>Old Row</em>}</li>
 *   <li>{@link rmm.Trigger#getNewRow <em>New Row</em>}</li>
 *   <li>{@link rmm.Trigger#getOldTable <em>Old Table</em>}</li>
 *   <li>{@link rmm.Trigger#getNewTable <em>New Table</em>}</li>
 *   <li>{@link rmm.Trigger#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see rmm.RmmPackage#getTrigger()
 * @model
 * @generated
 */
public interface Trigger extends Constraint {
	/**
	 * Returns the value of the '<em><b>Action Granularity</b></em>' attribute.
	 * The literals are from the enumeration {@link rmm.ActionGranularityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Granularity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Granularity</em>' attribute.
	 * @see rmm.ActionGranularityType
	 * @see #setActionGranularity(ActionGranularityType)
	 * @see rmm.RmmPackage#getTrigger_ActionGranularity()
	 * @model
	 * @generated
	 */
	ActionGranularityType getActionGranularity();

	/**
	 * Sets the value of the '{@link rmm.Trigger#getActionGranularity <em>Action Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Granularity</em>' attribute.
	 * @see rmm.ActionGranularityType
	 * @see #getActionGranularity()
	 * @generated
	 */
	void setActionGranularity(ActionGranularityType value);

	/**
	 * Returns the value of the '<em><b>Old Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Row</em>' attribute.
	 * @see #setOldRow(String)
	 * @see rmm.RmmPackage#getTrigger_OldRow()
	 * @model
	 * @generated
	 */
	String getOldRow();

	/**
	 * Sets the value of the '{@link rmm.Trigger#getOldRow <em>Old Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Row</em>' attribute.
	 * @see #getOldRow()
	 * @generated
	 */
	void setOldRow(String value);

	/**
	 * Returns the value of the '<em><b>New Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Row</em>' attribute.
	 * @see #setNewRow(String)
	 * @see rmm.RmmPackage#getTrigger_NewRow()
	 * @model
	 * @generated
	 */
	String getNewRow();

	/**
	 * Sets the value of the '{@link rmm.Trigger#getNewRow <em>New Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Row</em>' attribute.
	 * @see #getNewRow()
	 * @generated
	 */
	void setNewRow(String value);

	/**
	 * Returns the value of the '<em><b>Old Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Table</em>' attribute.
	 * @see #setOldTable(String)
	 * @see rmm.RmmPackage#getTrigger_OldTable()
	 * @model
	 * @generated
	 */
	String getOldTable();

	/**
	 * Sets the value of the '{@link rmm.Trigger#getOldTable <em>Old Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Table</em>' attribute.
	 * @see #getOldTable()
	 * @generated
	 */
	void setOldTable(String value);

	/**
	 * Returns the value of the '<em><b>New Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Table</em>' attribute.
	 * @see #setNewTable(String)
	 * @see rmm.RmmPackage#getTrigger_NewTable()
	 * @model
	 * @generated
	 */
	String getNewTable();

	/**
	 * Sets the value of the '{@link rmm.Trigger#getNewTable <em>New Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Table</em>' attribute.
	 * @see #getNewTable()
	 * @generated
	 */
	void setNewTable(String value);

	/**
	 * Returns the value of the '<em><b>Insert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insert</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insert</em>' attribute.
	 * @see #setInsert(boolean)
	 * @see rmm.RmmPackage#getTrigger_Insert()
	 * @model
	 * @generated
	 */
	boolean isInsert();

	/**
	 * Sets the value of the '{@link rmm.Trigger#isInsert <em>Insert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insert</em>' attribute.
	 * @see #isInsert()
	 * @generated
	 */
	void setInsert(boolean value);

	/**
	 * Returns the value of the '<em><b>Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update</em>' attribute.
	 * @see #setUpdate(boolean)
	 * @see rmm.RmmPackage#getTrigger_Update()
	 * @model
	 * @generated
	 */
	boolean isUpdate();

	/**
	 * Sets the value of the '{@link rmm.Trigger#isUpdate <em>Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update</em>' attribute.
	 * @see #isUpdate()
	 * @generated
	 */
	void setUpdate(boolean value);

	/**
	 * Returns the value of the '<em><b>Delete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete</em>' attribute.
	 * @see #setDelete(boolean)
	 * @see rmm.RmmPackage#getTrigger_Delete()
	 * @model
	 * @generated
	 */
	boolean isDelete();

	/**
	 * Sets the value of the '{@link rmm.Trigger#isDelete <em>Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete</em>' attribute.
	 * @see #isDelete()
	 * @generated
	 */
	void setDelete(boolean value);

	/**
	 * Returns the value of the '<em><b>Action Time</b></em>' attribute.
	 * The literals are from the enumeration {@link rmm.ActionTimeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Time</em>' attribute.
	 * @see rmm.ActionTimeType
	 * @see #setActionTime(ActionTimeType)
	 * @see rmm.RmmPackage#getTrigger_ActionTime()
	 * @model
	 * @generated
	 */
	ActionTimeType getActionTime();

	/**
	 * Sets the value of the '{@link rmm.Trigger#getActionTime <em>Action Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Time</em>' attribute.
	 * @see rmm.ActionTimeType
	 * @see #getActionTime()
	 * @generated
	 */
	void setActionTime(ActionTimeType value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see rmm.RmmPackage#getTrigger_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link rmm.Trigger#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Statement SQL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement SQL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement SQL</em>' attribute.
	 * @see #setStatementSQL(String)
	 * @see rmm.RmmPackage#getTrigger_StatementSQL()
	 * @model
	 * @generated
	 */
	String getStatementSQL();

	/**
	 * Sets the value of the '{@link rmm.Trigger#getStatementSQL <em>Statement SQL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement SQL</em>' attribute.
	 * @see #getStatementSQL()
	 * @generated
	 */
	void setStatementSQL(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference list.
	 * The list contents are of type {@link rmm.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference list.
	 * @see rmm.RmmPackage#getTrigger_Attributes()
	 * @model
	 * @generated
	 */
	EList<Attribute> getAttributes();

} // Trigger
