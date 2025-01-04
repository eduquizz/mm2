/**
 */
package mm2;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mm2.PageQuestion#getBoutonSuivant <em>Bouton Suivant</em>}</li>
 *   <li>{@link mm2.PageQuestion#getBoutonRetour <em>Bouton Retour</em>}</li>
 *   <li>{@link mm2.PageQuestion#getQuestion <em>Question</em>}</li>
 * </ul>
 *
 * @see mm2.Mm2Package#getPageQuestion()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='btnSuivant'"
 * @generated
 */
public interface PageQuestion extends Navigable, Page {
	/**
	 * Returns the value of the '<em><b>Question</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' containment reference.
	 * @see #setQuestion(Question)
	 * @see mm2.Mm2Package#getPageQuestion_Question()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Question getQuestion();

	/**
	 * Sets the value of the '{@link mm2.PageQuestion#getQuestion <em>Question</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' containment reference.
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(Question value);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if(self-&gt;oclAsType(Navigable).pageSuivante-&gt;notEmpty()) then self.boutonSuivant-&gt;isEmpty() else self.boutonSuivant-&gt;notEmpty() endif'"
	 * @generated
	 */
	boolean btnSuivant(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * Returns the value of the '<em><b>Bouton Suivant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bouton Suivant</em>' containment reference.
	 * @see #setBoutonSuivant(BoutonSuivant)
	 * @see mm2.Mm2Package#getPageQuestion_BoutonSuivant()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BoutonSuivant getBoutonSuivant();

	/**
	 * Sets the value of the '{@link mm2.PageQuestion#getBoutonSuivant <em>Bouton Suivant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bouton Suivant</em>' containment reference.
	 * @see #getBoutonSuivant()
	 * @generated
	 */
	void setBoutonSuivant(BoutonSuivant value);

	/**
	 * Returns the value of the '<em><b>Bouton Retour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bouton Retour</em>' containment reference.
	 * @see #setBoutonRetour(BoutonRetour)
	 * @see mm2.Mm2Package#getPageQuestion_BoutonRetour()
	 * @model containment="true"
	 * @generated
	 */
	BoutonRetour getBoutonRetour();

	/**
	 * Sets the value of the '{@link mm2.PageQuestion#getBoutonRetour <em>Bouton Retour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bouton Retour</em>' containment reference.
	 * @see #getBoutonRetour()
	 * @generated
	 */
	void setBoutonRetour(BoutonRetour value);

} // PageQuestion
