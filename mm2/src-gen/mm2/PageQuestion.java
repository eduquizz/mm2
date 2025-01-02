/**
 */
package mm2;

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
 * @model
 * @generated
 */
public interface PageQuestion extends Navigable, Page {
	/**
	 * Returns the value of the '<em><b>Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' reference.
	 * @see #setQuestion(Question)
	 * @see mm2.Mm2Package#getPageQuestion_Question()
	 * @model required="true"
	 * @generated
	 */
	Question getQuestion();

	/**
	 * Sets the value of the '{@link mm2.PageQuestion#getQuestion <em>Question</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' reference.
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(Question value);

	/**
	 * Returns the value of the '<em><b>Bouton Suivant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bouton Suivant</em>' reference.
	 * @see #setBoutonSuivant(BoutonSuivant)
	 * @see mm2.Mm2Package#getPageQuestion_BoutonSuivant()
	 * @model required="true"
	 * @generated
	 */
	BoutonSuivant getBoutonSuivant();

	/**
	 * Sets the value of the '{@link mm2.PageQuestion#getBoutonSuivant <em>Bouton Suivant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bouton Suivant</em>' reference.
	 * @see #getBoutonSuivant()
	 * @generated
	 */
	void setBoutonSuivant(BoutonSuivant value);

	/**
	 * Returns the value of the '<em><b>Bouton Retour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bouton Retour</em>' reference.
	 * @see #setBoutonRetour(BoutonRetour)
	 * @see mm2.Mm2Package#getPageQuestion_BoutonRetour()
	 * @model
	 * @generated
	 */
	BoutonRetour getBoutonRetour();

	/**
	 * Sets the value of the '{@link mm2.PageQuestion#getBoutonRetour <em>Bouton Retour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bouton Retour</em>' reference.
	 * @see #getBoutonRetour()
	 * @generated
	 */
	void setBoutonRetour(BoutonRetour value);

} // PageQuestion
