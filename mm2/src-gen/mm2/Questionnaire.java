/**
 */
package mm2;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mm2.Questionnaire#getPage <em>Page</em>}</li>
 *   <li>{@link mm2.Questionnaire#getNom <em>Nom</em>}</li>
 *   <li>{@link mm2.Questionnaire#isRetourAutorise <em>Retour Autorise</em>}</li>
 * </ul>
 *
 * @see mm2.Mm2Package#getQuestionnaire()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='questionPrecedente'"
 * @generated
 */
public interface Questionnaire extends EObject {
	/**
	 * Returns the value of the '<em><b>Page</b></em>' containment reference list.
	 * The list contents are of type {@link mm2.Page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' containment reference list.
	 * @see mm2.Mm2Package#getQuestionnaire_Page()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Page> getPage();

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see mm2.Mm2Package#getQuestionnaire_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link mm2.Questionnaire#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Retour Autorise</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retour Autorise</em>' attribute.
	 * @see #setRetourAutorise(boolean)
	 * @see mm2.Mm2Package#getQuestionnaire_RetourAutorise()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isRetourAutorise();

	/**
	 * Sets the value of the '{@link mm2.Questionnaire#isRetourAutorise <em>Retour Autorise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retour Autorise</em>' attribute.
	 * @see #isRetourAutorise()
	 * @generated
	 */
	void setRetourAutorise(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t    self.retourAutorise = false implies \n\t    self.page-&gt;forAll(p |\n\t        p.oclIsTypeOf(PageQuestion) implies p.oclAsType(PageQuestion).boutonRetour-&gt;isEmpty()\n\t    )'"
	 * @generated
	 */
	boolean boutonRetourInterdit(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='page-&gt;exists(p | p.oclIsTypeOf(PageSoumission))'"
	 * @generated
	 */
	boolean auMoinsUneSoumission(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='page-&gt;exists(p | p.oclIsTypeOf(PageResultat))'"
	 * @generated
	 */
	boolean auMoinsUneResult(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='page-&gt;exists(p | p.oclIsTypeOf(PageQuestion))'"
	 * @generated
	 */
	boolean auMoinsUneQuestion(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.page-&gt;forAll(p | \n        (p.oclIsTypeOf(PageQuestion) and not self.retourAutorise) \n        implies \n        (p.oclIsKindOf(Navigable) and p.oclAsType(Navigable).pagePrecedente-&gt;isEmpty()))'"
	 * @generated
	 */
	boolean questionPrecedente(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Questionnaire
