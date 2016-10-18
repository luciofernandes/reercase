/**
 */
package rmm.tests;

import junit.textui.TestRunner;

import rmm.RmmFactory;
import rmm.UniqueKey;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Unique Key</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UniqueKeyTest extends ConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UniqueKeyTest.class);
	}

	/**
	 * Constructs a new Unique Key test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniqueKeyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Unique Key test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UniqueKey getFixture() {
		return (UniqueKey)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RmmFactory.eINSTANCE.createUniqueKey());
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

} //UniqueKeyTest
