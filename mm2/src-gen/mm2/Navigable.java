/**
 */
package mm2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mm2.Navigable#getPageSuivante <em>Page Suivante</em>}</li>
 *   <li>{@link mm2.Navigable#getPagePrecedente <em>Page Precedente</em>}</li>
 * </ul>
 *
 * @see mm2.Mm2Package#getNavigable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Navigable extends EObject {
	/**
	 * Returns the value of the '<em><b>Page Suivante</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mm2.Navigable#getPagePrecedente <em>Page Precedente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Suivante</em>' reference.
	 * @see #setPageSuivante(Navigable)
	 * @see mm2.Mm2Package#getNavigable_PageSuivante()
	 * @see mm2.Navigable#getPagePrecedente
	 * @model opposite="pagePrecedente"
	 * @generated
	 */
	Navigable getPageSuivante();

	/**
	 * Sets the value of the '{@link mm2.Navigable#getPageSuivante <em>Page Suivante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Suivante</em>' reference.
	 * @see #getPageSuivante()
	 * @generated
	 */
	void setPageSuivante(Navigable value);

	/**
	 * Returns the value of the '<em><b>Page Precedente</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mm2.Navigable#getPageSuivante <em>Page Suivante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Precedente</em>' reference.
	 * @see #setPagePrecedente(Navigable)
	 * @see mm2.Mm2Package#getNavigable_PagePrecedente()
	 * @see mm2.Navigable#getPageSuivante
	 * @model opposite="pageSuivante"
	 * @generated
	 */
	Navigable getPagePrecedente();

	/**
	 * Sets the value of the '{@link mm2.Navigable#getPagePrecedente <em>Page Precedente</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Precedente</em>' reference.
	 * @see #getPagePrecedente()
	 * @generated
	 */
	void setPagePrecedente(Navigable value);

} // Navigable
