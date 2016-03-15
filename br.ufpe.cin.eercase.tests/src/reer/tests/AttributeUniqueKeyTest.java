/**
 */
package reer.tests;

import junit.textui.TestRunner;

import reer.AttributeUniqueKey;
import reer.ReerFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Attribute Unique Key</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeUniqueKeyTest extends ColumnTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AttributeUniqueKeyTest.class);
	}

	/**
	 * Constructs a new Attribute Unique Key test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeUniqueKeyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Attribute Unique Key test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AttributeUniqueKey getFixture() {
		return (AttributeUniqueKey)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ReerFactory.eINSTANCE.createAttributeUniqueKey());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AttributeUniqueKeyTest
