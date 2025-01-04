/**
 */
package mm2;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Soumission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mm2.PageSoumission#getBoutonRetour <em>Bouton Retour</em>}</li>
 *   <li>{@link mm2.PageSoumission#getBoutonSoumettre <em>Bouton Soumettre</em>}</li>
 *   <li>{@link mm2.PageSoumission#getQuestion <em>Question</em>}</li>
 * </ul>
 *
 * @see mm2.Mm2Package#getPageSoumission()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='btnSuivant'"
 * @generated
 */
public interface PageSoumission extends Navigable, Page {
	/**
	 * Returns the value of the '<em><b>Bouton Soumettre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bouton Soumettre</em>' containment reference.
	 * @see #setBoutonSoumettre(BoutonSoumettre)
	 * @see mm2.Mm2Package#getPageSoumission_BoutonSoumettre()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BoutonSoumettre getBoutonSoumettre();

	/**
	 * Sets the value of the '{@link mm2.PageSoumission#getBoutonSoumettre <em>Bouton Soumettre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bouton Soumettre</em>' containment reference.
	 * @see #getBoutonSoumettre()
	 * @generated
	 */
	void setBoutonSoumettre(BoutonSoumettre value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if (self-&gt;oclAsType(Page).Questionnaire.retourAutorise) then self.boutonRetour-&gt;notEmpty() else self.boutonRetour-&gt;isEmpty() endif'"
	 * @generated
	 */
	boolean btnRetour(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.pageSuivante-&gt;isEmpty()'"
	 * @generated
	 */
	boolean btnSuivant(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * Returns the value of the '<em><b>Question</b></em>' reference list.
	 * The list contents are of type {@link mm2.Question}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' reference list.
	 * @see mm2.Mm2Package#getPageSoumission_Question()
	 * @model required="true"
	 * @generated
	 */
	EList<Question> getQuestion();

	/**
	 * Returns the value of the '<em><b>Bouton Retour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bouton Retour</em>' containment reference.
	 * @see #setBoutonRetour(BoutonRetour)
	 * @see mm2.Mm2Package#getPageSoumission_BoutonRetour()
	 * @model containment="true"
	 * @generated
	 */
	BoutonRetour getBoutonRetour();

	/**
	 * Sets the value of the '{@link mm2.PageSoumission#getBoutonRetour <em>Bouton Retour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bouton Retour</em>' containment reference.
	 * @see #getBoutonRetour()
	 * @generated
	 */
	void setBoutonRetour(BoutonRetour value);

} // PageSoumission
