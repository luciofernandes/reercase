/**
 */
package rmm.tests;

import junit.textui.TestRunner;

import rmm.AlternateKey;
import rmm.RmmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Alternate Key</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlternateKeyTest extends ConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AlternateKeyTest.class);
	}

	/**
	 * Constructs a new Alternate Key test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlternateKeyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Alternate Key test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AlternateKey getFixture() {
		return (AlternateKey)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RmmFactory.eINSTANCE.createAlternateKey());
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

} //AlternateKeyTest
