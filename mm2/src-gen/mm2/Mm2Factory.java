/**
 */
package mm2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mm2.Mm2Package
 * @generated
 */
public interface Mm2Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Mm2Factory eINSTANCE = mm2.impl.Mm2FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Questionnaire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire</em>'.
	 * @generated
	 */
	Questionnaire createQuestionnaire();

	/**
	 * Returns a new object of class '<em>Page Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page Question</em>'.
	 * @generated
	 */
	PageQuestion createPageQuestion();

	/**
	 * Returns a new object of class '<em>Page Soumission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page Soumission</em>'.
	 * @generated
	 */
	PageSoumission createPageSoumission();

	/**
	 * Returns a new object of class '<em>Page Resultat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page Resultat</em>'.
	 * @generated
	 */
	PageResultat createPageResultat();

	/**
	 * Returns a new object of class '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question</em>'.
	 * @generated
	 */
	Question createQuestion();

	/**
	 * Returns a new object of class '<em>Reponse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reponse</em>'.
	 * @generated
	 */
	Reponse createReponse();

	/**
	 * Returns a new object of class '<em>Bouton Soumettre</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bouton Soumettre</em>'.
	 * @generated
	 */
	BoutonSoumettre createBoutonSoumettre();

	/**
	 * Returns a new object of class '<em>Bouton Suivant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bouton Suivant</em>'.
	 * @generated
	 */
	BoutonSuivant createBoutonSuivant();

	/**
	 * Returns a new object of class '<em>Bouton Retour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bouton Retour</em>'.
	 * @generated
	 */
	BoutonRetour createBoutonRetour();

	/**
	 * Returns a new object of class '<em>Etiquette</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Etiquette</em>'.
	 * @generated
	 */
	Etiquette createEtiquette();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Mm2Package getMm2Package();

} //Mm2Factory
