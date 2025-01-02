/**
 */
package mm2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reponse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mm2.Reponse#getTexte <em>Texte</em>}</li>
 *   <li>{@link mm2.Reponse#isEstVraie <em>Est Vraie</em>}</li>
 * </ul>
 *
 * @see mm2.Mm2Package#getReponse()
 * @model
 * @generated
 */
public interface Reponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Texte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texte</em>' attribute.
	 * @see #setTexte(String)
	 * @see mm2.Mm2Package#getReponse_Texte()
	 * @model
	 * @generated
	 */
	String getTexte();

	/**
	 * Sets the value of the '{@link mm2.Reponse#getTexte <em>Texte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texte</em>' attribute.
	 * @see #getTexte()
	 * @generated
	 */
	void setTexte(String value);

	/**
	 * Returns the value of the '<em><b>Est Vraie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Vraie</em>' attribute.
	 * @see #setEstVraie(boolean)
	 * @see mm2.Mm2Package#getReponse_EstVraie()
	 * @model
	 * @generated
	 */
	boolean isEstVraie();

	/**
	 * Sets the value of the '{@link mm2.Reponse#isEstVraie <em>Est Vraie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Vraie</em>' attribute.
	 * @see #isEstVraie()
	 * @generated
	 */
	void setEstVraie(boolean value);

} // Reponse
