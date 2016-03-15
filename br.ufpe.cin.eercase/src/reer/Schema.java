/**
 */
package reer;

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
 *   <li>{@link reer.Schema#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see reer.ReerPackage#getSchema()
 * @model annotation="gmf.diagram foo='bar' rcp='false' onefile='true' diagram.extension='eer'"
 * @generated
 */
public interface Schema extends EObject {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference list.
	 * The list contents are of type {@link reer.Table}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference list.
	 * @see reer.ReerPackage#getSchema_Table()
	 * @model containment="true"
	 * @generated
	 */
	EList<Table> getTable();

} // Schema
