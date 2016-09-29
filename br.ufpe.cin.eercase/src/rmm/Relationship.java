/**
 */
package rmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rmm.Relationship#getName <em>Name</em>}</li>
 *   <li>{@link rmm.Relationship#getUpdate <em>Update</em>}</li>
 *   <li>{@link rmm.Relationship#getDelete <em>Delete</em>}</li>
 *   <li>{@link rmm.Relationship#getSource <em>Source</em>}</li>
 *   <li>{@link rmm.Relationship#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see rmm.RmmPackage#getRelationship()
 * @model annotation="gmf.link label='name' source='source' target='target' style='solid' width='1' source.decoration='arrow' incoming='true'"
 * @generated
 */
public interface Relationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rmm.RmmPackage#getRelationship_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rmm.Relationship#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Update</b></em>' attribute.
	 * The literals are from the enumeration {@link rmm.OperationRestrictionIntegrity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update</em>' attribute.
	 * @see rmm.OperationRestrictionIntegrity
	 * @see #setUpdate(OperationRestrictionIntegrity)
	 * @see rmm.RmmPackage#getRelationship_Update()
	 * @model
	 * @generated
	 */
	OperationRestrictionIntegrity getUpdate();

	/**
	 * Sets the value of the '{@link rmm.Relationship#getUpdate <em>Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update</em>' attribute.
	 * @see rmm.OperationRestrictionIntegrity
	 * @see #getUpdate()
	 * @generated
	 */
	void setUpdate(OperationRestrictionIntegrity value);

	/**
	 * Returns the value of the '<em><b>Delete</b></em>' attribute.
	 * The literals are from the enumeration {@link rmm.OperationRestrictionIntegrity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete</em>' attribute.
	 * @see rmm.OperationRestrictionIntegrity
	 * @see #setDelete(OperationRestrictionIntegrity)
	 * @see rmm.RmmPackage#getRelationship_Delete()
	 * @model
	 * @generated
	 */
	OperationRestrictionIntegrity getDelete();

	/**
	 * Sets the value of the '{@link rmm.Relationship#getDelete <em>Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete</em>' attribute.
	 * @see rmm.OperationRestrictionIntegrity
	 * @see #getDelete()
	 * @generated
	 */
	void setDelete(OperationRestrictionIntegrity value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(PrimaryKey)
	 * @see rmm.RmmPackage#getRelationship_Source()
	 * @model
	 * @generated
	 */
	PrimaryKey getSource();

	/**
	 * Sets the value of the '{@link rmm.Relationship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(PrimaryKey value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ForeignKey)
	 * @see rmm.RmmPackage#getRelationship_Target()
	 * @model
	 * @generated
	 */
	ForeignKey getTarget();

	/**
	 * Sets the value of the '{@link rmm.Relationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ForeignKey value);

} // Relationship
