/**
 */
package mm2.impl;

import mm2.Bouton;
import mm2.BoutonRetour;
import mm2.BoutonSoumettre;
import mm2.BoutonSuivant;
import mm2.Etiquette;
import mm2.Mm2Factory;
import mm2.Mm2Package;
import mm2.Navigable;
import mm2.Page;
import mm2.PageQuestion;
import mm2.PageResultat;
import mm2.PageSoumission;
import mm2.Question;
import mm2.Questionnaire;
import mm2.Reponse;

import mm2.util.Mm2Validator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Mm2PackageImpl extends EPackageImpl implements Mm2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionnaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boutonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageQuestionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageSoumissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageResultatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boutonSoumettreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boutonSuivantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boutonRetourEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etiquetteEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see mm2.Mm2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Mm2PackageImpl() {
		super(eNS_URI, Mm2Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Mm2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Mm2Package init() {
		if (isInited)
			return (Mm2Package) EPackage.Registry.INSTANCE.getEPackage(Mm2Package.eNS_URI);

		// Obtain or create and register package
		Object registeredMm2Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Mm2PackageImpl theMm2Package = registeredMm2Package instanceof Mm2PackageImpl
				? (Mm2PackageImpl) registeredMm2Package
				: new Mm2PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMm2Package.createPackageContents();

		// Initialize created meta-data
		theMm2Package.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theMm2Package, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return Mm2Validator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theMm2Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Mm2Package.eNS_URI, theMm2Package);
		return theMm2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuestionnaire() {
		return questionnaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuestionnaire_Page() {
		return (EReference) questionnaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuestionnaire_Nom() {
		return (EAttribute) questionnaireEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuestionnaire_RetourAutorise() {
		return (EAttribute) questionnaireEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getQuestionnaire__BoutonRetourInterdit__DiagnosticChain_Map() {
		return questionnaireEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getQuestionnaire__AuMoinsUneSoumission__DiagnosticChain_Map() {
		return questionnaireEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getQuestionnaire__AuMoinsUneResult__DiagnosticChain_Map() {
		return questionnaireEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getQuestionnaire__AuMoinsUneQuestion__DiagnosticChain_Map() {
		return questionnaireEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getQuestionnaire__QuestionPrecedente__DiagnosticChain_Map() {
		return questionnaireEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPage_Titre() {
		return (EAttribute) pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBouton() {
		return boutonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNavigable() {
		return navigableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNavigable_PageSuivante() {
		return (EReference) navigableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNavigable_PagePrecedente() {
		return (EReference) navigableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPageQuestion() {
		return pageQuestionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPageQuestion_BoutonSuivant() {
		return (EReference) pageQuestionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPageQuestion_BoutonRetour() {
		return (EReference) pageQuestionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPageQuestion_Question() {
		return (EReference) pageQuestionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPageQuestion__BoutonRetourInterdit__DiagnosticChain_Map() {
		return pageQuestionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPageQuestion__VisibiliteBtnSuivant__DiagnosticChain_Map() {
		return pageQuestionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPageSoumission() {
		return pageSoumissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPageSoumission_BoutonSoumettre() {
		return (EReference) pageSoumissionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPageSoumission_Question() {
		return (EReference) pageSoumissionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPageSoumission__SuivantImpossible__DiagnosticChain_Map() {
		return pageSoumissionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPageResultat() {
		return pageResultatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuestion() {
		return questionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuestion_Reponse() {
		return (EReference) questionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuestion_Ennonce() {
		return (EAttribute) questionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuestion_Difficulte() {
		return (EAttribute) questionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuestion_ReponsesMultiples() {
		return (EAttribute) questionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuestion_Etiquette() {
		return (EReference) questionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getQuestion__EnnoncePasVide__DiagnosticChain_Map() {
		return questionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReponse() {
		return reponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReponse_Texte() {
		return (EAttribute) reponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReponse_EstVraie() {
		return (EAttribute) reponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoutonSoumettre() {
		return boutonSoumettreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoutonSuivant() {
		return boutonSuivantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoutonRetour() {
		return boutonRetourEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEtiquette() {
		return etiquetteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEtiquette_Nom() {
		return (EAttribute) etiquetteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mm2Factory getMm2Factory() {
		return (Mm2Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		questionnaireEClass = createEClass(QUESTIONNAIRE);
		createEReference(questionnaireEClass, QUESTIONNAIRE__PAGE);
		createEAttribute(questionnaireEClass, QUESTIONNAIRE__NOM);
		createEAttribute(questionnaireEClass, QUESTIONNAIRE__RETOUR_AUTORISE);
		createEOperation(questionnaireEClass, QUESTIONNAIRE___BOUTON_RETOUR_INTERDIT__DIAGNOSTICCHAIN_MAP);
		createEOperation(questionnaireEClass, QUESTIONNAIRE___AU_MOINS_UNE_SOUMISSION__DIAGNOSTICCHAIN_MAP);
		createEOperation(questionnaireEClass, QUESTIONNAIRE___AU_MOINS_UNE_RESULT__DIAGNOSTICCHAIN_MAP);
		createEOperation(questionnaireEClass, QUESTIONNAIRE___AU_MOINS_UNE_QUESTION__DIAGNOSTICCHAIN_MAP);
		createEOperation(questionnaireEClass, QUESTIONNAIRE___QUESTION_PRECEDENTE__DIAGNOSTICCHAIN_MAP);

		pageEClass = createEClass(PAGE);
		createEAttribute(pageEClass, PAGE__TITRE);

		boutonEClass = createEClass(BOUTON);

		navigableEClass = createEClass(NAVIGABLE);
		createEReference(navigableEClass, NAVIGABLE__PAGE_SUIVANTE);
		createEReference(navigableEClass, NAVIGABLE__PAGE_PRECEDENTE);

		pageQuestionEClass = createEClass(PAGE_QUESTION);
		createEReference(pageQuestionEClass, PAGE_QUESTION__BOUTON_SUIVANT);
		createEReference(pageQuestionEClass, PAGE_QUESTION__BOUTON_RETOUR);
		createEReference(pageQuestionEClass, PAGE_QUESTION__QUESTION);
		createEOperation(pageQuestionEClass, PAGE_QUESTION___BOUTON_RETOUR_INTERDIT__DIAGNOSTICCHAIN_MAP);
		createEOperation(pageQuestionEClass, PAGE_QUESTION___VISIBILITE_BTN_SUIVANT__DIAGNOSTICCHAIN_MAP);

		pageSoumissionEClass = createEClass(PAGE_SOUMISSION);
		createEReference(pageSoumissionEClass, PAGE_SOUMISSION__BOUTON_SOUMETTRE);
		createEReference(pageSoumissionEClass, PAGE_SOUMISSION__QUESTION);
		createEOperation(pageSoumissionEClass, PAGE_SOUMISSION___SUIVANT_IMPOSSIBLE__DIAGNOSTICCHAIN_MAP);

		pageResultatEClass = createEClass(PAGE_RESULTAT);

		questionEClass = createEClass(QUESTION);
		createEReference(questionEClass, QUESTION__REPONSE);
		createEAttribute(questionEClass, QUESTION__ENNONCE);
		createEAttribute(questionEClass, QUESTION__DIFFICULTE);
		createEAttribute(questionEClass, QUESTION__REPONSES_MULTIPLES);
		createEReference(questionEClass, QUESTION__ETIQUETTE);
		createEOperation(questionEClass, QUESTION___ENNONCE_PAS_VIDE__DIAGNOSTICCHAIN_MAP);

		reponseEClass = createEClass(REPONSE);
		createEAttribute(reponseEClass, REPONSE__TEXTE);
		createEAttribute(reponseEClass, REPONSE__EST_VRAIE);

		boutonSoumettreEClass = createEClass(BOUTON_SOUMETTRE);

		boutonSuivantEClass = createEClass(BOUTON_SUIVANT);

		boutonRetourEClass = createEClass(BOUTON_RETOUR);

		etiquetteEClass = createEClass(ETIQUETTE);
		createEAttribute(etiquetteEClass, ETIQUETTE__NOM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pageQuestionEClass.getESuperTypes().add(this.getNavigable());
		pageQuestionEClass.getESuperTypes().add(this.getPage());
		pageSoumissionEClass.getESuperTypes().add(this.getNavigable());
		pageSoumissionEClass.getESuperTypes().add(this.getPage());
		pageResultatEClass.getESuperTypes().add(this.getPage());
		boutonSoumettreEClass.getESuperTypes().add(this.getBouton());
		boutonSuivantEClass.getESuperTypes().add(this.getBouton());
		boutonRetourEClass.getESuperTypes().add(this.getBouton());

		// Initialize classes, features, and operations; add parameters
		initEClass(questionnaireEClass, Questionnaire.class, "Questionnaire", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuestionnaire_Page(), this.getPage(), null, "page", null, 1, -1, Questionnaire.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestionnaire_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Questionnaire.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestionnaire_RetourAutorise(), ecorePackage.getEBoolean(), "retourAutorise", "true", 1, 1,
				Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getQuestionnaire__BoutonRetourInterdit__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "boutonRetourInterdit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getQuestionnaire__AuMoinsUneSoumission__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"auMoinsUneSoumission", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getQuestionnaire__AuMoinsUneResult__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"auMoinsUneResult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getQuestionnaire__AuMoinsUneQuestion__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"auMoinsUneQuestion", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getQuestionnaire__QuestionPrecedente__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"questionPrecedente", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pageEClass, Page.class, "Page", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPage_Titre(), ecorePackage.getEString(), "titre", null, 0, 1, Page.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boutonEClass, Bouton.class, "Bouton", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(navigableEClass, Navigable.class, "Navigable", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNavigable_PageSuivante(), this.getPage(), null, "pageSuivante", null, 0, 1, Navigable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNavigable_PagePrecedente(), this.getPage(), null, "pagePrecedente", null, 0, 1,
				Navigable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageQuestionEClass, PageQuestion.class, "PageQuestion", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPageQuestion_BoutonSuivant(), this.getBoutonSuivant(), null, "boutonSuivant", null, 1, 1,
				PageQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPageQuestion_BoutonRetour(), this.getBoutonRetour(), null, "boutonRetour", null, 0, 1,
				PageQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPageQuestion_Question(), this.getQuestion(), null, "question", null, 1, 1, PageQuestion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPageQuestion__BoutonRetourInterdit__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"boutonRetourInterdit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPageQuestion__VisibiliteBtnSuivant__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"visibiliteBtnSuivant", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pageSoumissionEClass, PageSoumission.class, "PageSoumission", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPageSoumission_BoutonSoumettre(), this.getBoutonSoumettre(), null, "boutonSoumettre", null, 1,
				1, PageSoumission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPageSoumission_Question(), this.getQuestion(), null, "question", null, 1, -1,
				PageSoumission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPageSoumission__SuivantImpossible__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"suivantImpossible", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pageResultatEClass, PageResultat.class, "PageResultat", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(questionEClass, Question.class, "Question", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuestion_Reponse(), this.getReponse(), null, "reponse", null, 2, -1, Question.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_Ennonce(), ecorePackage.getEString(), "ennonce", null, 0, 1, Question.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_Difficulte(), ecorePackage.getEInt(), "difficulte", null, 1, 1, Question.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_ReponsesMultiples(), ecorePackage.getEBoolean(), "reponsesMultiples", null, 1, 1,
				Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getQuestion_Etiquette(), this.getEtiquette(), null, "etiquette", null, 0, -1, Question.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getQuestion__EnnoncePasVide__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"ennoncePasVide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(reponseEClass, Reponse.class, "Reponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReponse_Texte(), ecorePackage.getEString(), "texte", null, 0, 1, Reponse.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReponse_EstVraie(), ecorePackage.getEBoolean(), "estVraie", null, 1, 1, Reponse.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boutonSoumettreEClass, BoutonSoumettre.class, "BoutonSoumettre", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(boutonSuivantEClass, BoutonSuivant.class, "BoutonSuivant", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(boutonRetourEClass, BoutonRetour.class, "BoutonRetour", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(etiquetteEClass, Etiquette.class, "Etiquette", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEtiquette_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Etiquette.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source, new String[] {});
		addAnnotation(questionnaireEClass, source, new String[] { "constraints", "questionPrecedente" });
		addAnnotation(pageQuestionEClass, source, new String[] { "constraints", "visibiliteBtnSuivant" });
		addAnnotation(pageSoumissionEClass, source, new String[] { "constraints", "suivantImpossible" });
		addAnnotation(questionEClass, source, new String[] { "constraints", "ennoncePasVide" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(getQuestionnaire__BoutonRetourInterdit__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t    self.retourAutorise = false implies \n\t    self.page->forAll(p |\n\t        p.oclIsTypeOf(PageQuestion) implies p.oclAsType(PageQuestion).boutonRetour->isEmpty()\n\t    )" });
		addAnnotation(getQuestionnaire__AuMoinsUneSoumission__DiagnosticChain_Map(), source,
				new String[] { "body", "page->exists(p | p.oclIsTypeOf(PageSoumission))" });
		addAnnotation(getQuestionnaire__AuMoinsUneResult__DiagnosticChain_Map(), source,
				new String[] { "body", "page->exists(p | p.oclIsTypeOf(PageResultat))" });
		addAnnotation(getQuestionnaire__AuMoinsUneQuestion__DiagnosticChain_Map(), source,
				new String[] { "body", "page->exists(p | p.oclIsTypeOf(PageQuestion))" });
		addAnnotation(getQuestionnaire__QuestionPrecedente__DiagnosticChain_Map(), source, new String[] { "body",
				"self.page->forAll(p | \n        (p.oclIsTypeOf(PageQuestion) and not self.retourAutorise) \n        implies \n        (p.oclIsKindOf(Navigable) and p.oclAsType(Navigable).pagePrecedente->isEmpty()))" });
		addAnnotation(getPageQuestion__BoutonRetourInterdit__DiagnosticChain_Map(), source, new String[] { "body",
				"if (self->oclAsType(Page).Questionnaire.retourAutorise) then self.boutonRetour->notEmpty() else self.boutonRetour->isEmpty() endif" });
		addAnnotation(getPageQuestion__VisibiliteBtnSuivant__DiagnosticChain_Map(), source, new String[] { "body",
				"if(self->oclAsType(Navigable).pageSuivante->notEmpty()) then self.boutonSuivant->isEmpty() else self.boutonSuivant->notEmpty() endif" });
		addAnnotation(getPageSoumission__SuivantImpossible__DiagnosticChain_Map(), source,
				new String[] { "body", "self.pageSuivante->isEmpty()" });
		addAnnotation(getQuestion__EnnoncePasVide__DiagnosticChain_Map(), source,
				new String[] { "body", "ennonce->notEmpty()" });
	}

} //Mm2PackageImpl
