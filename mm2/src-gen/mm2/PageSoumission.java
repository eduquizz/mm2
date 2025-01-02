/**
 */
package mm2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Soumission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mm2.PageSoumission#getBoutonSoumettre <em>Bouton Soumettre</em>}</li>
 * </ul>
 *
 * @see mm2.Mm2Package#getPageSoumission()
 * @model
 * @generated
 */
public interface PageSoumission extends Navigable, Page {
	/**
	 * Returns the value of the '<em><b>Bouton Soumettre</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bouton Soumettre</em>' reference.
	 * @see #setBoutonSoumettre(BoutonSoumettre)
	 * @see mm2.Mm2Package#getPageSoumission_BoutonSoumettre()
	 * @model required="true"
	 * @generated
	 */
	BoutonSoumettre getBoutonSoumettre();

	/**
	 * Sets the value of the '{@link mm2.PageSoumission#getBoutonSoumettre <em>Bouton Soumettre</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bouton Soumettre</em>' reference.
	 * @see #getBoutonSoumettre()
	 * @generated
	 */
	void setBoutonSoumettre(BoutonSoumettre value);

} // PageSoumission
