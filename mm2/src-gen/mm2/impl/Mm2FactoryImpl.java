/**
 */
package mm2.impl;

import mm2.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Mm2FactoryImpl extends EFactoryImpl implements Mm2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Mm2Factory init() {
		try {
			Mm2Factory theMm2Factory = (Mm2Factory) EPackage.Registry.INSTANCE.getEFactory(Mm2Package.eNS_URI);
			if (theMm2Factory != null) {
				return theMm2Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Mm2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mm2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Mm2Package.QUESTIONNAIRE:
			return createQuestionnaire();
		case Mm2Package.PAGE_QUESTION:
			return createPageQuestion();
		case Mm2Package.PAGE_SOUMISSION:
			return createPageSoumission();
		case Mm2Package.PAGE_RESULTAT:
			return createPageResultat();
		case Mm2Package.QUESTION:
			return createQuestion();
		case Mm2Package.REPONSE:
			return createReponse();
		case Mm2Package.BOUTON_SOUMETTRE:
			return createBoutonSoumettre();
		case Mm2Package.BOUTON_SUIVANT:
			return createBoutonSuivant();
		case Mm2Package.BOUTON_RETOUR:
			return createBoutonRetour();
		case Mm2Package.ETIQUETTE:
			return createEtiquette();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Questionnaire createQuestionnaire() {
		QuestionnaireImpl questionnaire = new QuestionnaireImpl();
		return questionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PageQuestion createPageQuestion() {
		PageQuestionImpl pageQuestion = new PageQuestionImpl();
		return pageQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PageSoumission createPageSoumission() {
		PageSoumissionImpl pageSoumission = new PageSoumissionImpl();
		return pageSoumission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PageResultat createPageResultat() {
		PageResultatImpl pageResultat = new PageResultatImpl();
		return pageResultat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Question createQuestion() {
		QuestionImpl question = new QuestionImpl();
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reponse createReponse() {
		ReponseImpl reponse = new ReponseImpl();
		return reponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoutonSoumettre createBoutonSoumettre() {
		BoutonSoumettreImpl boutonSoumettre = new BoutonSoumettreImpl();
		return boutonSoumettre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoutonSuivant createBoutonSuivant() {
		BoutonSuivantImpl boutonSuivant = new BoutonSuivantImpl();
		return boutonSuivant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoutonRetour createBoutonRetour() {
		BoutonRetourImpl boutonRetour = new BoutonRetourImpl();
		return boutonRetour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Etiquette createEtiquette() {
		EtiquetteImpl etiquette = new EtiquetteImpl();
		return etiquette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mm2Package getMm2Package() {
		return (Mm2Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Mm2Package getPackage() {
		return Mm2Package.eINSTANCE;
	}

} //Mm2FactoryImpl
