/**
 */
package mm2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mm2.Mm2Factory
 * @model kind="package"
 * @generated
 */
public interface Mm2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mm2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/mm2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mm2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Mm2Package eINSTANCE = mm2.impl.Mm2PackageImpl.init();

	/**
	 * The meta object id for the '{@link mm2.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm2.impl.QuestionnaireImpl
	 * @see mm2.impl.Mm2PackageImpl#getQuestionnaire()
	 * @generated
	 */
	int QUESTIONNAIRE = 0;

	/**
	 * The feature id for the '<em><b>Page</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__PAGE = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__NOM = 1;

	/**
	 * The feature id for the '<em><b>Retour Autorise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__RETOUR_AUTORISE = 2;

	/**
	 * The number of structural features of the '<em>Questionnaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Questionnaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mm2.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm2.impl.PageImpl
	 * @see mm2.impl.Mm2PackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 1;

	/**
	 * The feature id for the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TITRE = 0;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mm2.impl.BoutonImpl <em>Bouton</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm2.impl.BoutonImpl
	 * @see mm2.impl.Mm2PackageImpl#getBouton()
	 * @generated
	 */
	int BOUTON = 2;

	/**
	 * The number of structural features of the '<em>Bouton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTON_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Bouton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mm2.Navigable <em>Navigable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm2.Navigable
	 * @see mm2.impl.Mm2PackageImpl#getNavigable()
	 * @generated
	 */
	int NAVIGABLE = 3;

	/**
	 * The feature id for the '<em><b>Page Suivante</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGABLE__PAGE_SUIVANTE = 0;

	/**
	 * The feature id for the '<em><b>Page Precedente</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGABLE__PAGE_PRECEDENTE = 1;

	/**
	 * The number of structural features of the '<em>Navigable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Navigable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mm2.impl.PageQuestionImpl <em>Page Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm2.impl.PageQuestionImpl
	 * @see mm2.impl.Mm2PackageImpl#getPageQuestion()
	 * @generated
	 */
	int PAGE_QUESTION = 4;

	/**
	 * The feature id for the '<em><b>Page Suivante</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_QUESTION__PAGE_SUIVANTE = NAVIGABLE__PAGE_SUIVANTE;

	/**
	 * The feature id for the '<em><b>Page Precedente</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_QUESTION__PAGE_PRECEDENTE = NAVIGABLE__PAGE_PRECEDENTE;

	/**
	 * The feature id for the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_QUESTION__TITRE = NAVIGABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bouton Suivant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_QUESTION__BOUTON_SUIVANT = NAVIGABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bouton Retour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_QUESTION__BOUTON_RETOUR = NAVIGABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_QUESTION__QUESTION = NAVIGABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Page Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_QUESTION_FEATURE_COUNT = NAVIGABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Page Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_QUESTION_OPERATION_COUNT = NAVIGABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mm2.impl.PageSoumissionImpl <em>Page Soumission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm2.impl.PageSoumissionImpl
	 * @see mm2.impl.Mm2PackageImpl#getPageSoumission()
	 * @generated
	 */
	int PAGE_SOUMISSION = 5;

	/**
	 * The feature id for the '<em><b>Page Suivante</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_SOUMISSION__PAGE_SUIVANTE = NAVIGABLE__PAGE_SUIVANTE;

	/**
	 * The feature id for the '<em><b>Page Precedente</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_SOUMISSION__PAGE_PRECEDENTE = NAVIGABLE__PAGE_PRECEDENTE;

	/**
	 * The feature id for the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_SOUMISSION__TITRE = NAVIGABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bouton Soumettre</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_SOUMISSION__BOUTON_SOUMETTRE = NAVIGABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Question</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_SOUMISSION__QUESTION = NAVIGABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Page Soumission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_SOUMISSION_FEATURE_COUNT = NAVIGABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Page Soumission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_SOUMISSION_OPERATION_COUNT = NAVIGABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mm2.impl.PageResultatImpl <em>Page Resultat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm2.impl.PageResultatImpl
	 * @see mm2.impl.Mm2PackageImpl#getPageResultat()
	 * @generated
	 */
	int PAGE_RESULTAT = 6;

	/**
	 * The feature id for the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_RESULTAT__TITRE = PAGE__TITRE;

	/**
	 * The number of structural features of the '<em>Page Resultat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_RESULTAT_FEATURE_COUNT = PAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Page Resultat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_RESULTAT_OPERATION_COUNT = PAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mm2.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm2.impl.QuestionImpl
	 * @see mm2.impl.Mm2PackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 7;

	/**
	 * The feature id for the '<em><b>Reponse</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__REPONSE = 0;

	/**
	 * The feature id for the '<em><b>Ennonce</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__ENNONCE = 1;

	/**
	 * The feature id for the '<em><b>Difficulte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__DIFFICULTE = 2;

	/**
	 * The feature id for the '<em><b>Reponses Multiples</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__REPONSES_MULTIPLES = 3;

	/**
	 * The feature id for the '<em><b>Etiquette</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__ETIQUETTE = 4;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mm2.impl.ReponseImpl <em>Reponse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm2.impl.ReponseImpl
	 * @see mm2.impl.Mm2PackageImpl#getReponse()
	 * @generated
	 */
	int REPONSE = 8;

	/**
	 * The feature id for the '<em><b>Texte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE__TEXTE = 0;

	/**
	 * The feature id for the '<em><b>Est Vraie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE__EST_VRAIE = 1;

	/**
	 * The number of structural features of the '<em>Reponse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Reponse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mm2.impl.BoutonSoumettreImpl <em>Bouton Soumettre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm2.impl.BoutonSoumettreImpl
	 * @see mm2.impl.Mm2PackageImpl#getBoutonSoumettre()
	 * @generated
	 */
	int BOUTON_SOUMETTRE = 9;

	/**
	 * The number of structural features of the '<em>Bouton Soumettre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTON_SOUMETTRE_FEATURE_COUNT = BOUTON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bouton Soumettre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTON_SOUMETTRE_OPERATION_COUNT = BOUTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mm2.impl.BoutonSuivantImpl <em>Bouton Suivant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm2.impl.BoutonSuivantImpl
	 * @see mm2.impl.Mm2PackageImpl#getBoutonSuivant()
	 * @generated
	 */
	int BOUTON_SUIVANT = 10;

	/**
	 * The number of structural features of the '<em>Bouton Suivant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTON_SUIVANT_FEATURE_COUNT = BOUTON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bouton Suivant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTON_SUIVANT_OPERATION_COUNT = BOUTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mm2.impl.BoutonRetourImpl <em>Bouton Retour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm2.impl.BoutonRetourImpl
	 * @see mm2.impl.Mm2PackageImpl#getBoutonRetour()
	 * @generated
	 */
	int BOUTON_RETOUR = 11;

	/**
	 * The number of structural features of the '<em>Bouton Retour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTON_RETOUR_FEATURE_COUNT = BOUTON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bouton Retour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTON_RETOUR_OPERATION_COUNT = BOUTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mm2.impl.EtiquetteImpl <em>Etiquette</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm2.impl.EtiquetteImpl
	 * @see mm2.impl.Mm2PackageImpl#getEtiquette()
	 * @generated
	 */
	int ETIQUETTE = 12;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETIQUETTE__NOM = 0;

	/**
	 * The number of structural features of the '<em>Etiquette</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETIQUETTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Etiquette</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETIQUETTE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link mm2.Questionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Questionnaire</em>'.
	 * @see mm2.Questionnaire
	 * @generated
	 */
	EClass getQuestionnaire();

	/**
	 * Returns the meta object for the containment reference list '{@link mm2.Questionnaire#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Page</em>'.
	 * @see mm2.Questionnaire#getPage()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EReference getQuestionnaire_Page();

	/**
	 * Returns the meta object for the attribute '{@link mm2.Questionnaire#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see mm2.Questionnaire#getNom()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EAttribute getQuestionnaire_Nom();

	/**
	 * Returns the meta object for the attribute '{@link mm2.Questionnaire#isRetourAutorise <em>Retour Autorise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retour Autorise</em>'.
	 * @see mm2.Questionnaire#isRetourAutorise()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EAttribute getQuestionnaire_RetourAutorise();

	/**
	 * Returns the meta object for class '{@link mm2.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see mm2.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the attribute '{@link mm2.Page#getTitre <em>Titre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titre</em>'.
	 * @see mm2.Page#getTitre()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Titre();

	/**
	 * Returns the meta object for class '{@link mm2.Bouton <em>Bouton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bouton</em>'.
	 * @see mm2.Bouton
	 * @generated
	 */
	EClass getBouton();

	/**
	 * Returns the meta object for class '{@link mm2.Navigable <em>Navigable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigable</em>'.
	 * @see mm2.Navigable
	 * @generated
	 */
	EClass getNavigable();

	/**
	 * Returns the meta object for the reference '{@link mm2.Navigable#getPageSuivante <em>Page Suivante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Page Suivante</em>'.
	 * @see mm2.Navigable#getPageSuivante()
	 * @see #getNavigable()
	 * @generated
	 */
	EReference getNavigable_PageSuivante();

	/**
	 * Returns the meta object for the reference '{@link mm2.Navigable#getPagePrecedente <em>Page Precedente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Page Precedente</em>'.
	 * @see mm2.Navigable#getPagePrecedente()
	 * @see #getNavigable()
	 * @generated
	 */
	EReference getNavigable_PagePrecedente();

	/**
	 * Returns the meta object for class '{@link mm2.PageQuestion <em>Page Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Question</em>'.
	 * @see mm2.PageQuestion
	 * @generated
	 */
	EClass getPageQuestion();

	/**
	 * Returns the meta object for the reference '{@link mm2.PageQuestion#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Question</em>'.
	 * @see mm2.PageQuestion#getQuestion()
	 * @see #getPageQuestion()
	 * @generated
	 */
	EReference getPageQuestion_Question();

	/**
	 * Returns the meta object for the reference '{@link mm2.PageQuestion#getBoutonSuivant <em>Bouton Suivant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bouton Suivant</em>'.
	 * @see mm2.PageQuestion#getBoutonSuivant()
	 * @see #getPageQuestion()
	 * @generated
	 */
	EReference getPageQuestion_BoutonSuivant();

	/**
	 * Returns the meta object for the reference '{@link mm2.PageQuestion#getBoutonRetour <em>Bouton Retour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bouton Retour</em>'.
	 * @see mm2.PageQuestion#getBoutonRetour()
	 * @see #getPageQuestion()
	 * @generated
	 */
	EReference getPageQuestion_BoutonRetour();

	/**
	 * Returns the meta object for class '{@link mm2.PageSoumission <em>Page Soumission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Soumission</em>'.
	 * @see mm2.PageSoumission
	 * @generated
	 */
	EClass getPageSoumission();

	/**
	 * Returns the meta object for the reference '{@link mm2.PageSoumission#getBoutonSoumettre <em>Bouton Soumettre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bouton Soumettre</em>'.
	 * @see mm2.PageSoumission#getBoutonSoumettre()
	 * @see #getPageSoumission()
	 * @generated
	 */
	EReference getPageSoumission_BoutonSoumettre();

	/**
	 * Returns the meta object for the containment reference list '{@link mm2.PageSoumission#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Question</em>'.
	 * @see mm2.PageSoumission#getQuestion()
	 * @see #getPageSoumission()
	 * @generated
	 */
	EReference getPageSoumission_Question();

	/**
	 * Returns the meta object for class '{@link mm2.PageResultat <em>Page Resultat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Resultat</em>'.
	 * @see mm2.PageResultat
	 * @generated
	 */
	EClass getPageResultat();

	/**
	 * Returns the meta object for class '{@link mm2.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see mm2.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the containment reference list '{@link mm2.Question#getReponse <em>Reponse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reponse</em>'.
	 * @see mm2.Question#getReponse()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Reponse();

	/**
	 * Returns the meta object for the attribute '{@link mm2.Question#getEnnonce <em>Ennonce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ennonce</em>'.
	 * @see mm2.Question#getEnnonce()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Ennonce();

	/**
	 * Returns the meta object for the attribute '{@link mm2.Question#getDifficulte <em>Difficulte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Difficulte</em>'.
	 * @see mm2.Question#getDifficulte()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Difficulte();

	/**
	 * Returns the meta object for the attribute '{@link mm2.Question#isReponsesMultiples <em>Reponses Multiples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reponses Multiples</em>'.
	 * @see mm2.Question#isReponsesMultiples()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_ReponsesMultiples();

	/**
	 * Returns the meta object for the containment reference list '{@link mm2.Question#getEtiquette <em>Etiquette</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Etiquette</em>'.
	 * @see mm2.Question#getEtiquette()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Etiquette();

	/**
	 * Returns the meta object for class '{@link mm2.Reponse <em>Reponse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reponse</em>'.
	 * @see mm2.Reponse
	 * @generated
	 */
	EClass getReponse();

	/**
	 * Returns the meta object for the attribute '{@link mm2.Reponse#getTexte <em>Texte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texte</em>'.
	 * @see mm2.Reponse#getTexte()
	 * @see #getReponse()
	 * @generated
	 */
	EAttribute getReponse_Texte();

	/**
	 * Returns the meta object for the attribute '{@link mm2.Reponse#isEstVraie <em>Est Vraie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Est Vraie</em>'.
	 * @see mm2.Reponse#isEstVraie()
	 * @see #getReponse()
	 * @generated
	 */
	EAttribute getReponse_EstVraie();

	/**
	 * Returns the meta object for class '{@link mm2.BoutonSoumettre <em>Bouton Soumettre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bouton Soumettre</em>'.
	 * @see mm2.BoutonSoumettre
	 * @generated
	 */
	EClass getBoutonSoumettre();

	/**
	 * Returns the meta object for class '{@link mm2.BoutonSuivant <em>Bouton Suivant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bouton Suivant</em>'.
	 * @see mm2.BoutonSuivant
	 * @generated
	 */
	EClass getBoutonSuivant();

	/**
	 * Returns the meta object for class '{@link mm2.BoutonRetour <em>Bouton Retour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bouton Retour</em>'.
	 * @see mm2.BoutonRetour
	 * @generated
	 */
	EClass getBoutonRetour();

	/**
	 * Returns the meta object for class '{@link mm2.Etiquette <em>Etiquette</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Etiquette</em>'.
	 * @see mm2.Etiquette
	 * @generated
	 */
	EClass getEtiquette();

	/**
	 * Returns the meta object for the attribute '{@link mm2.Etiquette#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see mm2.Etiquette#getNom()
	 * @see #getEtiquette()
	 * @generated
	 */
	EAttribute getEtiquette_Nom();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Mm2Factory getMm2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mm2.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm2.impl.QuestionnaireImpl
		 * @see mm2.impl.Mm2PackageImpl#getQuestionnaire()
		 * @generated
		 */
		EClass QUESTIONNAIRE = eINSTANCE.getQuestionnaire();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONNAIRE__PAGE = eINSTANCE.getQuestionnaire_Page();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONNAIRE__NOM = eINSTANCE.getQuestionnaire_Nom();

		/**
		 * The meta object literal for the '<em><b>Retour Autorise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONNAIRE__RETOUR_AUTORISE = eINSTANCE.getQuestionnaire_RetourAutorise();

		/**
		 * The meta object literal for the '{@link mm2.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm2.impl.PageImpl
		 * @see mm2.impl.Mm2PackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Titre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__TITRE = eINSTANCE.getPage_Titre();

		/**
		 * The meta object literal for the '{@link mm2.impl.BoutonImpl <em>Bouton</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm2.impl.BoutonImpl
		 * @see mm2.impl.Mm2PackageImpl#getBouton()
		 * @generated
		 */
		EClass BOUTON = eINSTANCE.getBouton();

		/**
		 * The meta object literal for the '{@link mm2.Navigable <em>Navigable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm2.Navigable
		 * @see mm2.impl.Mm2PackageImpl#getNavigable()
		 * @generated
		 */
		EClass NAVIGABLE = eINSTANCE.getNavigable();

		/**
		 * The meta object literal for the '<em><b>Page Suivante</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGABLE__PAGE_SUIVANTE = eINSTANCE.getNavigable_PageSuivante();

		/**
		 * The meta object literal for the '<em><b>Page Precedente</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGABLE__PAGE_PRECEDENTE = eINSTANCE.getNavigable_PagePrecedente();

		/**
		 * The meta object literal for the '{@link mm2.impl.PageQuestionImpl <em>Page Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm2.impl.PageQuestionImpl
		 * @see mm2.impl.Mm2PackageImpl#getPageQuestion()
		 * @generated
		 */
		EClass PAGE_QUESTION = eINSTANCE.getPageQuestion();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_QUESTION__QUESTION = eINSTANCE.getPageQuestion_Question();

		/**
		 * The meta object literal for the '<em><b>Bouton Suivant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_QUESTION__BOUTON_SUIVANT = eINSTANCE.getPageQuestion_BoutonSuivant();

		/**
		 * The meta object literal for the '<em><b>Bouton Retour</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_QUESTION__BOUTON_RETOUR = eINSTANCE.getPageQuestion_BoutonRetour();

		/**
		 * The meta object literal for the '{@link mm2.impl.PageSoumissionImpl <em>Page Soumission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm2.impl.PageSoumissionImpl
		 * @see mm2.impl.Mm2PackageImpl#getPageSoumission()
		 * @generated
		 */
		EClass PAGE_SOUMISSION = eINSTANCE.getPageSoumission();

		/**
		 * The meta object literal for the '<em><b>Bouton Soumettre</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_SOUMISSION__BOUTON_SOUMETTRE = eINSTANCE.getPageSoumission_BoutonSoumettre();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_SOUMISSION__QUESTION = eINSTANCE.getPageSoumission_Question();

		/**
		 * The meta object literal for the '{@link mm2.impl.PageResultatImpl <em>Page Resultat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm2.impl.PageResultatImpl
		 * @see mm2.impl.Mm2PackageImpl#getPageResultat()
		 * @generated
		 */
		EClass PAGE_RESULTAT = eINSTANCE.getPageResultat();

		/**
		 * The meta object literal for the '{@link mm2.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm2.impl.QuestionImpl
		 * @see mm2.impl.Mm2PackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Reponse</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__REPONSE = eINSTANCE.getQuestion_Reponse();

		/**
		 * The meta object literal for the '<em><b>Ennonce</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__ENNONCE = eINSTANCE.getQuestion_Ennonce();

		/**
		 * The meta object literal for the '<em><b>Difficulte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__DIFFICULTE = eINSTANCE.getQuestion_Difficulte();

		/**
		 * The meta object literal for the '<em><b>Reponses Multiples</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__REPONSES_MULTIPLES = eINSTANCE.getQuestion_ReponsesMultiples();

		/**
		 * The meta object literal for the '<em><b>Etiquette</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__ETIQUETTE = eINSTANCE.getQuestion_Etiquette();

		/**
		 * The meta object literal for the '{@link mm2.impl.ReponseImpl <em>Reponse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm2.impl.ReponseImpl
		 * @see mm2.impl.Mm2PackageImpl#getReponse()
		 * @generated
		 */
		EClass REPONSE = eINSTANCE.getReponse();

		/**
		 * The meta object literal for the '<em><b>Texte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPONSE__TEXTE = eINSTANCE.getReponse_Texte();

		/**
		 * The meta object literal for the '<em><b>Est Vraie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPONSE__EST_VRAIE = eINSTANCE.getReponse_EstVraie();

		/**
		 * The meta object literal for the '{@link mm2.impl.BoutonSoumettreImpl <em>Bouton Soumettre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm2.impl.BoutonSoumettreImpl
		 * @see mm2.impl.Mm2PackageImpl#getBoutonSoumettre()
		 * @generated
		 */
		EClass BOUTON_SOUMETTRE = eINSTANCE.getBoutonSoumettre();

		/**
		 * The meta object literal for the '{@link mm2.impl.BoutonSuivantImpl <em>Bouton Suivant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm2.impl.BoutonSuivantImpl
		 * @see mm2.impl.Mm2PackageImpl#getBoutonSuivant()
		 * @generated
		 */
		EClass BOUTON_SUIVANT = eINSTANCE.getBoutonSuivant();

		/**
		 * The meta object literal for the '{@link mm2.impl.BoutonRetourImpl <em>Bouton Retour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm2.impl.BoutonRetourImpl
		 * @see mm2.impl.Mm2PackageImpl#getBoutonRetour()
		 * @generated
		 */
		EClass BOUTON_RETOUR = eINSTANCE.getBoutonRetour();

		/**
		 * The meta object literal for the '{@link mm2.impl.EtiquetteImpl <em>Etiquette</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm2.impl.EtiquetteImpl
		 * @see mm2.impl.Mm2PackageImpl#getEtiquette()
		 * @generated
		 */
		EClass ETIQUETTE = eINSTANCE.getEtiquette();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETIQUETTE__NOM = eINSTANCE.getEtiquette_Nom();

	}

} //Mm2Package
