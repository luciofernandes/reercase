/**
 */
package reer.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import reer.Dominio;
import reer.ReerFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dominio</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DominioTest extends TestCase {

	/**
	 * The fixture for this Dominio test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Dominio fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DominioTest.class);
	}

	/**
	 * Constructs a new Dominio test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DominioTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Dominio test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Dominio fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Dominio test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Dominio getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ReerFactory.eINSTANCE.createDominio());
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

} //DominioTest
