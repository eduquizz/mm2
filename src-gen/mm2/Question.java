/**
 */
package mm2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mm2.Question#getReponse <em>Reponse</em>}</li>
 *   <li>{@link mm2.Question#getEnnonce <em>Ennonce</em>}</li>
 *   <li>{@link mm2.Question#getDifficulte <em>Difficulte</em>}</li>
 *   <li>{@link mm2.Question#isReponsesMultiples <em>Reponses Multiples</em>}</li>
 *   <li>{@link mm2.Question#getEtiquette <em>Etiquette</em>}</li>
 * </ul>
 *
 * @see mm2.Mm2Package#getQuestion()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ennoncePasVide'"
 * @generated
 */
public interface Question extends EObject {
	/**
	 * Returns the value of the '<em><b>Reponse</b></em>' containment reference list.
	 * The list contents are of type {@link mm2.Reponse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reponse</em>' containment reference list.
	 * @see mm2.Mm2Package#getQuestion_Reponse()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Reponse> getReponse();

	/**
	 * Returns the value of the '<em><b>Ennonce</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ennonce</em>' attribute.
	 * @see #setEnnonce(String)
	 * @see mm2.Mm2Package#getQuestion_Ennonce()
	 * @model
	 * @generated
	 */
	String getEnnonce();

	/**
	 * Sets the value of the '{@link mm2.Question#getEnnonce <em>Ennonce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ennonce</em>' attribute.
	 * @see #getEnnonce()
	 * @generated
	 */
	void setEnnonce(String value);

	/**
	 * Returns the value of the '<em><b>Difficulte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Difficulte</em>' attribute.
	 * @see #setDifficulte(int)
	 * @see mm2.Mm2Package#getQuestion_Difficulte()
	 * @model required="true"
	 * @generated
	 */
	int getDifficulte();

	/**
	 * Sets the value of the '{@link mm2.Question#getDifficulte <em>Difficulte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Difficulte</em>' attribute.
	 * @see #getDifficulte()
	 * @generated
	 */
	void setDifficulte(int value);

	/**
	 * Returns the value of the '<em><b>Reponses Multiples</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reponses Multiples</em>' attribute.
	 * @see #setReponsesMultiples(boolean)
	 * @see mm2.Mm2Package#getQuestion_ReponsesMultiples()
	 * @model required="true"
	 * @generated
	 */
	boolean isReponsesMultiples();

	/**
	 * Sets the value of the '{@link mm2.Question#isReponsesMultiples <em>Reponses Multiples</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reponses Multiples</em>' attribute.
	 * @see #isReponsesMultiples()
	 * @generated
	 */
	void setReponsesMultiples(boolean value);

	/**
	 * Returns the value of the '<em><b>Etiquette</b></em>' containment reference list.
	 * The list contents are of type {@link mm2.Etiquette}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiquette</em>' containment reference list.
	 * @see mm2.Mm2Package#getQuestion_Etiquette()
	 * @model containment="true"
	 * @generated
	 */
	EList<Etiquette> getEtiquette();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='ennonce-&gt;notEmpty()'"
	 * @generated
	 */
	boolean ennoncePasVide(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Question
