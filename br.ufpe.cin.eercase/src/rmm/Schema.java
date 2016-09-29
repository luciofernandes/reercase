/**
 */
package rmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rmm.Schema#getTable <em>Table</em>}</li>
 *   <li>{@link rmm.Schema#getAssertion <em>Assertion</em>}</li>
 *   <li>{@link rmm.Schema#getDomain <em>Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see rmm.RmmPackage#getSchema()
 * @model annotation="gmf.diagram foo='bar' rcp='false' onefile='true' diagram.extension='rmm'"
 * @generated
 */
public interface Schema extends EObject {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference list.
	 * The list contents are of type {@link rmm.Table}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference list.
	 * @see rmm.RmmPackage#getSchema_Table()
	 * @model containment="true"
	 * @generated
	 */
	EList<Table> getTable();

	/**
	 * Returns the value of the '<em><b>Assertion</b></em>' containment reference list.
	 * The list contents are of type {@link rmm.Assertion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assertion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assertion</em>' containment reference list.
	 * @see rmm.RmmPackage#getSchema_Assertion()
	 * @model containment="true"
	 * @generated
	 */
	EList<Assertion> getAssertion();

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference list.
	 * The list contents are of type {@link rmm.Domain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference list.
	 * @see rmm.RmmPackage#getSchema_Domain()
	 * @model containment="true"
	 * @generated
	 */
	EList<Domain> getDomain();

} // Schema
