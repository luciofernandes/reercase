/**
 */
package rmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rmm.Trigger#getBody <em>Body</em>}</li>
 *   <li>{@link rmm.Trigger#getCondition <em>Condition</em>}</li>
 *   <li>{@link rmm.Trigger#isInsert <em>Insert</em>}</li>
 *   <li>{@link rmm.Trigger#isUpdate <em>Update</em>}</li>
 *   <li>{@link rmm.Trigger#isDelete <em>Delete</em>}</li>
 *   <li>{@link rmm.Trigger#getExecution <em>Execution</em>}</li>
 * </ul>
 * </p>
 *
 * @see rmm.RmmPackage#getTrigger()
 * @model
 * @generated
 */
public interface Trigger extends Constraint {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see rmm.RmmPackage#getTrigger_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link rmm.Trigger#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

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
	 * Returns the value of the '<em><b>Execution</b></em>' attribute.
	 * The literals are from the enumeration {@link rmm.DataTypeExecution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution</em>' attribute.
	 * @see rmm.DataTypeExecution
	 * @see #setExecution(DataTypeExecution)
	 * @see rmm.RmmPackage#getTrigger_Execution()
	 * @model
	 * @generated
	 */
	DataTypeExecution getExecution();

	/**
	 * Sets the value of the '{@link rmm.Trigger#getExecution <em>Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution</em>' attribute.
	 * @see rmm.DataTypeExecution
	 * @see #getExecution()
	 * @generated
	 */
	void setExecution(DataTypeExecution value);

} // Trigger
