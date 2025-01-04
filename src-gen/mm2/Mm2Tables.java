/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /mm2/mm2/model/mm2.ecore
 * using:
 *   /mm2/mm2/model/mm2.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package mm2;

// import mm2.Mm2Package;
// import mm2.Mm2Tables;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.PropertyId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * Mm2Tables provides the dispatch tables for the mm2 for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class Mm2Tables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(Mm2Package.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_mm2 = IdManager.getNsURIPackageId("http://www.example.org/mm2", null, Mm2Package.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_BoutonRetour = Mm2Tables.PACKid_http_c_s_s_www_example_org_s_mm2.getClassId("BoutonRetour", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_BoutonSoumettre = Mm2Tables.PACKid_http_c_s_s_www_example_org_s_mm2.getClassId("BoutonSoumettre", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_BoutonSuivant = Mm2Tables.PACKid_http_c_s_s_www_example_org_s_mm2.getClassId("BoutonSuivant", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = Mm2Tables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Etiquette = Mm2Tables.PACKid_http_c_s_s_www_example_org_s_mm2.getClassId("Etiquette", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Navigable = Mm2Tables.PACKid_http_c_s_s_www_example_org_s_mm2.getClassId("Navigable", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Page = Mm2Tables.PACKid_http_c_s_s_www_example_org_s_mm2.getClassId("Page", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_PageQuestion = Mm2Tables.PACKid_http_c_s_s_www_example_org_s_mm2.getClassId("PageQuestion", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_PageResultat = Mm2Tables.PACKid_http_c_s_s_www_example_org_s_mm2.getClassId("PageResultat", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_PageSoumission = Mm2Tables.PACKid_http_c_s_s_www_example_org_s_mm2.getClassId("PageSoumission", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Question = Mm2Tables.PACKid_http_c_s_s_www_example_org_s_mm2.getClassId("Question", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Questionnaire = Mm2Tables.PACKid_http_c_s_s_www_example_org_s_mm2.getClassId("Questionnaire", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Reponse = Mm2Tables.PACKid_http_c_s_s_www_example_org_s_mm2.getClassId("Reponse", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = Mm2Tables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ CollectionTypeId SET_PRIMid_String = TypeId.SET.getSpecializedId(TypeId.STRING, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Navigable = TypeId.BAG.getSpecializedId(Mm2Tables.CLSSid_Navigable, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_PageQuestion = TypeId.BAG.getSpecializedId(Mm2Tables.CLSSid_PageQuestion, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_PageSoumission = TypeId.BAG.getSpecializedId(Mm2Tables.CLSSid_PageSoumission, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Etiquette = TypeId.ORDERED_SET.getSpecializedId(Mm2Tables.CLSSid_Etiquette, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Page = TypeId.ORDERED_SET.getSpecializedId(Mm2Tables.CLSSid_Page, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Question = TypeId.ORDERED_SET.getSpecializedId(Mm2Tables.CLSSid_Question, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Reponse = TypeId.ORDERED_SET.getSpecializedId(Mm2Tables.CLSSid_Reponse, true, ValueUtil.integerValueOf(2), ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ PropertyId PROPid_Questionnaire = Mm2Tables.CLSSid_Page.getPropertyId("Questionnaire");
	public static final /*@NonInvalid*/ PropertyId PROPid_page = Mm2Tables.CLSSid_Questionnaire.getPropertyId("page");
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_BoutonRetour = TypeId.SET.getSpecializedId(Mm2Tables.CLSSid_BoutonRetour, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_BoutonSuivant = TypeId.SET.getSpecializedId(Mm2Tables.CLSSid_BoutonSuivant, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Page = TypeId.SET.getSpecializedId(Mm2Tables.CLSSid_Page, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_PageQuestion = TypeId.SET.getSpecializedId(Mm2Tables.CLSSid_PageQuestion, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			Mm2Tables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Mm2Tables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Bouton = new EcoreExecutorType(Mm2Package.Literals.BOUTON, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _BoutonRetour = new EcoreExecutorType(Mm2Package.Literals.BOUTON_RETOUR, PACKAGE, 0);
		public static final EcoreExecutorType _BoutonSoumettre = new EcoreExecutorType(Mm2Package.Literals.BOUTON_SOUMETTRE, PACKAGE, 0);
		public static final EcoreExecutorType _BoutonSuivant = new EcoreExecutorType(Mm2Package.Literals.BOUTON_SUIVANT, PACKAGE, 0);
		public static final EcoreExecutorType _Etiquette = new EcoreExecutorType(Mm2Package.Literals.ETIQUETTE, PACKAGE, 0);
		public static final EcoreExecutorType _Navigable = new EcoreExecutorType(Mm2Package.Literals.NAVIGABLE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Page = new EcoreExecutorType(Mm2Package.Literals.PAGE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _PageQuestion = new EcoreExecutorType(Mm2Package.Literals.PAGE_QUESTION, PACKAGE, 0);
		public static final EcoreExecutorType _PageResultat = new EcoreExecutorType(Mm2Package.Literals.PAGE_RESULTAT, PACKAGE, 0);
		public static final EcoreExecutorType _PageSoumission = new EcoreExecutorType(Mm2Package.Literals.PAGE_SOUMISSION, PACKAGE, 0);
		public static final EcoreExecutorType _Question = new EcoreExecutorType(Mm2Package.Literals.QUESTION, PACKAGE, 0);
		public static final EcoreExecutorType _Questionnaire = new EcoreExecutorType(Mm2Package.Literals.QUESTIONNAIRE, PACKAGE, 0);
		public static final EcoreExecutorType _Reponse = new EcoreExecutorType(Mm2Package.Literals.REPONSE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Bouton,
			_BoutonRetour,
			_BoutonSoumettre,
			_BoutonSuivant,
			_Etiquette,
			_Navigable,
			_Page,
			_PageQuestion,
			_PageResultat,
			_PageSoumission,
			_Question,
			_Questionnaire,
			_Reponse
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Mm2Tables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Bouton__Bouton = new ExecutorFragment(Types._Bouton, Mm2Tables.Types._Bouton);
		private static final ExecutorFragment _Bouton__OclAny = new ExecutorFragment(Types._Bouton, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Bouton__OclElement = new ExecutorFragment(Types._Bouton, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _BoutonRetour__Bouton = new ExecutorFragment(Types._BoutonRetour, Mm2Tables.Types._Bouton);
		private static final ExecutorFragment _BoutonRetour__BoutonRetour = new ExecutorFragment(Types._BoutonRetour, Mm2Tables.Types._BoutonRetour);
		private static final ExecutorFragment _BoutonRetour__OclAny = new ExecutorFragment(Types._BoutonRetour, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _BoutonRetour__OclElement = new ExecutorFragment(Types._BoutonRetour, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _BoutonSoumettre__Bouton = new ExecutorFragment(Types._BoutonSoumettre, Mm2Tables.Types._Bouton);
		private static final ExecutorFragment _BoutonSoumettre__BoutonSoumettre = new ExecutorFragment(Types._BoutonSoumettre, Mm2Tables.Types._BoutonSoumettre);
		private static final ExecutorFragment _BoutonSoumettre__OclAny = new ExecutorFragment(Types._BoutonSoumettre, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _BoutonSoumettre__OclElement = new ExecutorFragment(Types._BoutonSoumettre, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _BoutonSuivant__Bouton = new ExecutorFragment(Types._BoutonSuivant, Mm2Tables.Types._Bouton);
		private static final ExecutorFragment _BoutonSuivant__BoutonSuivant = new ExecutorFragment(Types._BoutonSuivant, Mm2Tables.Types._BoutonSuivant);
		private static final ExecutorFragment _BoutonSuivant__OclAny = new ExecutorFragment(Types._BoutonSuivant, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _BoutonSuivant__OclElement = new ExecutorFragment(Types._BoutonSuivant, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Etiquette__Etiquette = new ExecutorFragment(Types._Etiquette, Mm2Tables.Types._Etiquette);
		private static final ExecutorFragment _Etiquette__OclAny = new ExecutorFragment(Types._Etiquette, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Etiquette__OclElement = new ExecutorFragment(Types._Etiquette, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Navigable__Navigable = new ExecutorFragment(Types._Navigable, Mm2Tables.Types._Navigable);
		private static final ExecutorFragment _Navigable__OclAny = new ExecutorFragment(Types._Navigable, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Navigable__OclElement = new ExecutorFragment(Types._Navigable, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Page__OclAny = new ExecutorFragment(Types._Page, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Page__OclElement = new ExecutorFragment(Types._Page, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Page__Page = new ExecutorFragment(Types._Page, Mm2Tables.Types._Page);

		private static final ExecutorFragment _PageQuestion__Navigable = new ExecutorFragment(Types._PageQuestion, Mm2Tables.Types._Navigable);
		private static final ExecutorFragment _PageQuestion__OclAny = new ExecutorFragment(Types._PageQuestion, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PageQuestion__OclElement = new ExecutorFragment(Types._PageQuestion, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PageQuestion__Page = new ExecutorFragment(Types._PageQuestion, Mm2Tables.Types._Page);
		private static final ExecutorFragment _PageQuestion__PageQuestion = new ExecutorFragment(Types._PageQuestion, Mm2Tables.Types._PageQuestion);

		private static final ExecutorFragment _PageResultat__OclAny = new ExecutorFragment(Types._PageResultat, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PageResultat__OclElement = new ExecutorFragment(Types._PageResultat, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PageResultat__Page = new ExecutorFragment(Types._PageResultat, Mm2Tables.Types._Page);
		private static final ExecutorFragment _PageResultat__PageResultat = new ExecutorFragment(Types._PageResultat, Mm2Tables.Types._PageResultat);

		private static final ExecutorFragment _PageSoumission__Navigable = new ExecutorFragment(Types._PageSoumission, Mm2Tables.Types._Navigable);
		private static final ExecutorFragment _PageSoumission__OclAny = new ExecutorFragment(Types._PageSoumission, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PageSoumission__OclElement = new ExecutorFragment(Types._PageSoumission, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PageSoumission__Page = new ExecutorFragment(Types._PageSoumission, Mm2Tables.Types._Page);
		private static final ExecutorFragment _PageSoumission__PageSoumission = new ExecutorFragment(Types._PageSoumission, Mm2Tables.Types._PageSoumission);

		private static final ExecutorFragment _Question__OclAny = new ExecutorFragment(Types._Question, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Question__OclElement = new ExecutorFragment(Types._Question, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Question__Question = new ExecutorFragment(Types._Question, Mm2Tables.Types._Question);

		private static final ExecutorFragment _Questionnaire__OclAny = new ExecutorFragment(Types._Questionnaire, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Questionnaire__OclElement = new ExecutorFragment(Types._Questionnaire, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Questionnaire__Questionnaire = new ExecutorFragment(Types._Questionnaire, Mm2Tables.Types._Questionnaire);

		private static final ExecutorFragment _Reponse__OclAny = new ExecutorFragment(Types._Reponse, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Reponse__OclElement = new ExecutorFragment(Types._Reponse, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Reponse__Reponse = new ExecutorFragment(Types._Reponse, Mm2Tables.Types._Reponse);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Mm2Tables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Mm2Tables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Mm2Tables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}


		public static final ExecutorProperty _BoutonRetour__PageQuestion__boutonRetour = new ExecutorPropertyWithImplementation("PageQuestion", Types._BoutonRetour, 0, new EcoreLibraryOppositeProperty(Mm2Package.Literals.PAGE_QUESTION__BOUTON_RETOUR));

		public static final ExecutorProperty _BoutonSoumettre__PageSoumission__boutonSoumettre = new ExecutorPropertyWithImplementation("PageSoumission", Types._BoutonSoumettre, 0, new EcoreLibraryOppositeProperty(Mm2Package.Literals.PAGE_SOUMISSION__BOUTON_SOUMETTRE));

		public static final ExecutorProperty _BoutonSuivant__PageQuestion__boutonSuivant = new ExecutorPropertyWithImplementation("PageQuestion", Types._BoutonSuivant, 0, new EcoreLibraryOppositeProperty(Mm2Package.Literals.PAGE_QUESTION__BOUTON_SUIVANT));

		public static final ExecutorProperty _Etiquette__nom = new EcoreExecutorProperty(Mm2Package.Literals.ETIQUETTE__NOM, Types._Etiquette, 0);
		public static final ExecutorProperty _Etiquette__Question__etiquette = new ExecutorPropertyWithImplementation("Question", Types._Etiquette, 1, new EcoreLibraryOppositeProperty(Mm2Package.Literals.QUESTION__ETIQUETTE));

		public static final ExecutorProperty _Navigable__pagePrecedente = new EcoreExecutorProperty(Mm2Package.Literals.NAVIGABLE__PAGE_PRECEDENTE, Types._Navigable, 0);
		public static final ExecutorProperty _Navigable__pageSuivante = new EcoreExecutorProperty(Mm2Package.Literals.NAVIGABLE__PAGE_SUIVANTE, Types._Navigable, 1);

		public static final ExecutorProperty _Page__titre = new EcoreExecutorProperty(Mm2Package.Literals.PAGE__TITRE, Types._Page, 0);
		public static final ExecutorProperty _Page__Navigable__pagePrecedente = new ExecutorPropertyWithImplementation("Navigable", Types._Page, 1, new EcoreLibraryOppositeProperty(Mm2Package.Literals.NAVIGABLE__PAGE_PRECEDENTE));
		public static final ExecutorProperty _Page__Navigable__pageSuivante = new ExecutorPropertyWithImplementation("Navigable", Types._Page, 2, new EcoreLibraryOppositeProperty(Mm2Package.Literals.NAVIGABLE__PAGE_SUIVANTE));
		public static final ExecutorProperty _Page__Questionnaire__page = new ExecutorPropertyWithImplementation("Questionnaire", Types._Page, 3, new EcoreLibraryOppositeProperty(Mm2Package.Literals.QUESTIONNAIRE__PAGE));

		public static final ExecutorProperty _PageQuestion__boutonRetour = new EcoreExecutorProperty(Mm2Package.Literals.PAGE_QUESTION__BOUTON_RETOUR, Types._PageQuestion, 0);
		public static final ExecutorProperty _PageQuestion__boutonSuivant = new EcoreExecutorProperty(Mm2Package.Literals.PAGE_QUESTION__BOUTON_SUIVANT, Types._PageQuestion, 1);
		public static final ExecutorProperty _PageQuestion__question = new EcoreExecutorProperty(Mm2Package.Literals.PAGE_QUESTION__QUESTION, Types._PageQuestion, 2);

		public static final ExecutorProperty _PageSoumission__boutonSoumettre = new EcoreExecutorProperty(Mm2Package.Literals.PAGE_SOUMISSION__BOUTON_SOUMETTRE, Types._PageSoumission, 0);
		public static final ExecutorProperty _PageSoumission__question = new EcoreExecutorProperty(Mm2Package.Literals.PAGE_SOUMISSION__QUESTION, Types._PageSoumission, 1);

		public static final ExecutorProperty _Question__difficulte = new EcoreExecutorProperty(Mm2Package.Literals.QUESTION__DIFFICULTE, Types._Question, 0);
		public static final ExecutorProperty _Question__ennonce = new EcoreExecutorProperty(Mm2Package.Literals.QUESTION__ENNONCE, Types._Question, 1);
		public static final ExecutorProperty _Question__etiquette = new EcoreExecutorProperty(Mm2Package.Literals.QUESTION__ETIQUETTE, Types._Question, 2);
		public static final ExecutorProperty _Question__reponse = new EcoreExecutorProperty(Mm2Package.Literals.QUESTION__REPONSE, Types._Question, 3);
		public static final ExecutorProperty _Question__reponsesMultiples = new EcoreExecutorProperty(Mm2Package.Literals.QUESTION__REPONSES_MULTIPLES, Types._Question, 4);
		public static final ExecutorProperty _Question__PageQuestion__question = new ExecutorPropertyWithImplementation("PageQuestion", Types._Question, 5, new EcoreLibraryOppositeProperty(Mm2Package.Literals.PAGE_QUESTION__QUESTION));
		public static final ExecutorProperty _Question__PageSoumission__question = new ExecutorPropertyWithImplementation("PageSoumission", Types._Question, 6, new EcoreLibraryOppositeProperty(Mm2Package.Literals.PAGE_SOUMISSION__QUESTION));

		public static final ExecutorProperty _Questionnaire__nom = new EcoreExecutorProperty(Mm2Package.Literals.QUESTIONNAIRE__NOM, Types._Questionnaire, 0);
		public static final ExecutorProperty _Questionnaire__page = new EcoreExecutorProperty(Mm2Package.Literals.QUESTIONNAIRE__PAGE, Types._Questionnaire, 1);
		public static final ExecutorProperty _Questionnaire__retourAutorise = new EcoreExecutorProperty(Mm2Package.Literals.QUESTIONNAIRE__RETOUR_AUTORISE, Types._Questionnaire, 2);

		public static final ExecutorProperty _Reponse__estVraie = new EcoreExecutorProperty(Mm2Package.Literals.REPONSE__EST_VRAIE, Types._Reponse, 0);
		public static final ExecutorProperty _Reponse__texte = new EcoreExecutorProperty(Mm2Package.Literals.REPONSE__TEXTE, Types._Reponse, 1);
		public static final ExecutorProperty _Reponse__Question__reponse = new ExecutorPropertyWithImplementation("Question", Types._Reponse, 2, new EcoreLibraryOppositeProperty(Mm2Package.Literals.QUESTION__REPONSE));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Mm2Tables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Bouton =
			{
				Fragments._Bouton__OclAny /* 0 */,
				Fragments._Bouton__OclElement /* 1 */,
				Fragments._Bouton__Bouton /* 2 */
			};
		private static final int /*@NonNull*/ [] __Bouton = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _BoutonRetour =
			{
				Fragments._BoutonRetour__OclAny /* 0 */,
				Fragments._BoutonRetour__OclElement /* 1 */,
				Fragments._BoutonRetour__Bouton /* 2 */,
				Fragments._BoutonRetour__BoutonRetour /* 3 */
			};
		private static final int /*@NonNull*/ [] __BoutonRetour = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _BoutonSoumettre =
			{
				Fragments._BoutonSoumettre__OclAny /* 0 */,
				Fragments._BoutonSoumettre__OclElement /* 1 */,
				Fragments._BoutonSoumettre__Bouton /* 2 */,
				Fragments._BoutonSoumettre__BoutonSoumettre /* 3 */
			};
		private static final int /*@NonNull*/ [] __BoutonSoumettre = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _BoutonSuivant =
			{
				Fragments._BoutonSuivant__OclAny /* 0 */,
				Fragments._BoutonSuivant__OclElement /* 1 */,
				Fragments._BoutonSuivant__Bouton /* 2 */,
				Fragments._BoutonSuivant__BoutonSuivant /* 3 */
			};
		private static final int /*@NonNull*/ [] __BoutonSuivant = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Etiquette =
			{
				Fragments._Etiquette__OclAny /* 0 */,
				Fragments._Etiquette__OclElement /* 1 */,
				Fragments._Etiquette__Etiquette /* 2 */
			};
		private static final int /*@NonNull*/ [] __Etiquette = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Navigable =
			{
				Fragments._Navigable__OclAny /* 0 */,
				Fragments._Navigable__OclElement /* 1 */,
				Fragments._Navigable__Navigable /* 2 */
			};
		private static final int /*@NonNull*/ [] __Navigable = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Page =
			{
				Fragments._Page__OclAny /* 0 */,
				Fragments._Page__OclElement /* 1 */,
				Fragments._Page__Page /* 2 */
			};
		private static final int /*@NonNull*/ [] __Page = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PageQuestion =
			{
				Fragments._PageQuestion__OclAny /* 0 */,
				Fragments._PageQuestion__OclElement /* 1 */,
				Fragments._PageQuestion__Navigable /* 2 */,
				Fragments._PageQuestion__Page /* 2 */,
				Fragments._PageQuestion__PageQuestion /* 3 */
			};
		private static final int /*@NonNull*/ [] __PageQuestion = { 1,1,2,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PageResultat =
			{
				Fragments._PageResultat__OclAny /* 0 */,
				Fragments._PageResultat__OclElement /* 1 */,
				Fragments._PageResultat__Page /* 2 */,
				Fragments._PageResultat__PageResultat /* 3 */
			};
		private static final int /*@NonNull*/ [] __PageResultat = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PageSoumission =
			{
				Fragments._PageSoumission__OclAny /* 0 */,
				Fragments._PageSoumission__OclElement /* 1 */,
				Fragments._PageSoumission__Navigable /* 2 */,
				Fragments._PageSoumission__Page /* 2 */,
				Fragments._PageSoumission__PageSoumission /* 3 */
			};
		private static final int /*@NonNull*/ [] __PageSoumission = { 1,1,2,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Question =
			{
				Fragments._Question__OclAny /* 0 */,
				Fragments._Question__OclElement /* 1 */,
				Fragments._Question__Question /* 2 */
			};
		private static final int /*@NonNull*/ [] __Question = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Questionnaire =
			{
				Fragments._Questionnaire__OclAny /* 0 */,
				Fragments._Questionnaire__OclElement /* 1 */,
				Fragments._Questionnaire__Questionnaire /* 2 */
			};
		private static final int /*@NonNull*/ [] __Questionnaire = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Reponse =
			{
				Fragments._Reponse__OclAny /* 0 */,
				Fragments._Reponse__OclElement /* 1 */,
				Fragments._Reponse__Reponse /* 2 */
			};
		private static final int /*@NonNull*/ [] __Reponse = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Bouton.initFragments(_Bouton, __Bouton);
			Types._BoutonRetour.initFragments(_BoutonRetour, __BoutonRetour);
			Types._BoutonSoumettre.initFragments(_BoutonSoumettre, __BoutonSoumettre);
			Types._BoutonSuivant.initFragments(_BoutonSuivant, __BoutonSuivant);
			Types._Etiquette.initFragments(_Etiquette, __Etiquette);
			Types._Navigable.initFragments(_Navigable, __Navigable);
			Types._Page.initFragments(_Page, __Page);
			Types._PageQuestion.initFragments(_PageQuestion, __PageQuestion);
			Types._PageResultat.initFragments(_PageResultat, __PageResultat);
			Types._PageSoumission.initFragments(_PageSoumission, __PageSoumission);
			Types._Question.initFragments(_Question, __Question);
			Types._Questionnaire.initFragments(_Questionnaire, __Questionnaire);
			Types._Reponse.initFragments(_Reponse, __Reponse);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Mm2Tables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Bouton__Bouton = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Bouton__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Bouton__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _BoutonRetour__BoutonRetour = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BoutonRetour__Bouton = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BoutonRetour__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BoutonRetour__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _BoutonSoumettre__BoutonSoumettre = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BoutonSoumettre__Bouton = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BoutonSoumettre__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BoutonSoumettre__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _BoutonSuivant__BoutonSuivant = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BoutonSuivant__Bouton = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BoutonSuivant__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BoutonSuivant__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Etiquette__Etiquette = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Etiquette__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Etiquette__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Navigable__Navigable = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Navigable__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Navigable__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Page__Page = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Page__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Page__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PageQuestion__PageQuestion = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PageQuestion__Navigable = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PageQuestion__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PageQuestion__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PageQuestion__Page = {};

		private static final ExecutorOperation /*@NonNull*/ [] _PageResultat__PageResultat = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PageResultat__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PageResultat__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PageResultat__Page = {};

		private static final ExecutorOperation /*@NonNull*/ [] _PageSoumission__PageSoumission = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PageSoumission__Navigable = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PageSoumission__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PageSoumission__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PageSoumission__Page = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Question__Question = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Question__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Question__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Questionnaire__Questionnaire = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Questionnaire__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Questionnaire__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Reponse__Reponse = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Reponse__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Reponse__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Bouton__Bouton.initOperations(_Bouton__Bouton);
			Fragments._Bouton__OclAny.initOperations(_Bouton__OclAny);
			Fragments._Bouton__OclElement.initOperations(_Bouton__OclElement);

			Fragments._BoutonRetour__Bouton.initOperations(_BoutonRetour__Bouton);
			Fragments._BoutonRetour__BoutonRetour.initOperations(_BoutonRetour__BoutonRetour);
			Fragments._BoutonRetour__OclAny.initOperations(_BoutonRetour__OclAny);
			Fragments._BoutonRetour__OclElement.initOperations(_BoutonRetour__OclElement);

			Fragments._BoutonSoumettre__Bouton.initOperations(_BoutonSoumettre__Bouton);
			Fragments._BoutonSoumettre__BoutonSoumettre.initOperations(_BoutonSoumettre__BoutonSoumettre);
			Fragments._BoutonSoumettre__OclAny.initOperations(_BoutonSoumettre__OclAny);
			Fragments._BoutonSoumettre__OclElement.initOperations(_BoutonSoumettre__OclElement);

			Fragments._BoutonSuivant__Bouton.initOperations(_BoutonSuivant__Bouton);
			Fragments._BoutonSuivant__BoutonSuivant.initOperations(_BoutonSuivant__BoutonSuivant);
			Fragments._BoutonSuivant__OclAny.initOperations(_BoutonSuivant__OclAny);
			Fragments._BoutonSuivant__OclElement.initOperations(_BoutonSuivant__OclElement);

			Fragments._Etiquette__Etiquette.initOperations(_Etiquette__Etiquette);
			Fragments._Etiquette__OclAny.initOperations(_Etiquette__OclAny);
			Fragments._Etiquette__OclElement.initOperations(_Etiquette__OclElement);

			Fragments._Navigable__Navigable.initOperations(_Navigable__Navigable);
			Fragments._Navigable__OclAny.initOperations(_Navigable__OclAny);
			Fragments._Navigable__OclElement.initOperations(_Navigable__OclElement);

			Fragments._Page__OclAny.initOperations(_Page__OclAny);
			Fragments._Page__OclElement.initOperations(_Page__OclElement);
			Fragments._Page__Page.initOperations(_Page__Page);

			Fragments._PageQuestion__Navigable.initOperations(_PageQuestion__Navigable);
			Fragments._PageQuestion__OclAny.initOperations(_PageQuestion__OclAny);
			Fragments._PageQuestion__OclElement.initOperations(_PageQuestion__OclElement);
			Fragments._PageQuestion__Page.initOperations(_PageQuestion__Page);
			Fragments._PageQuestion__PageQuestion.initOperations(_PageQuestion__PageQuestion);

			Fragments._PageResultat__OclAny.initOperations(_PageResultat__OclAny);
			Fragments._PageResultat__OclElement.initOperations(_PageResultat__OclElement);
			Fragments._PageResultat__Page.initOperations(_PageResultat__Page);
			Fragments._PageResultat__PageResultat.initOperations(_PageResultat__PageResultat);

			Fragments._PageSoumission__Navigable.initOperations(_PageSoumission__Navigable);
			Fragments._PageSoumission__OclAny.initOperations(_PageSoumission__OclAny);
			Fragments._PageSoumission__OclElement.initOperations(_PageSoumission__OclElement);
			Fragments._PageSoumission__Page.initOperations(_PageSoumission__Page);
			Fragments._PageSoumission__PageSoumission.initOperations(_PageSoumission__PageSoumission);

			Fragments._Question__OclAny.initOperations(_Question__OclAny);
			Fragments._Question__OclElement.initOperations(_Question__OclElement);
			Fragments._Question__Question.initOperations(_Question__Question);

			Fragments._Questionnaire__OclAny.initOperations(_Questionnaire__OclAny);
			Fragments._Questionnaire__OclElement.initOperations(_Questionnaire__OclElement);
			Fragments._Questionnaire__Questionnaire.initOperations(_Questionnaire__Questionnaire);

			Fragments._Reponse__OclAny.initOperations(_Reponse__OclAny);
			Fragments._Reponse__OclElement.initOperations(_Reponse__OclElement);
			Fragments._Reponse__Reponse.initOperations(_Reponse__Reponse);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Mm2Tables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Bouton = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _BoutonRetour = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _BoutonSoumettre = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _BoutonSuivant = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Etiquette = {
			Mm2Tables.Properties._Etiquette__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Navigable = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Mm2Tables.Properties._Navigable__pagePrecedente,
			Mm2Tables.Properties._Navigable__pageSuivante
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Page = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Mm2Tables.Properties._Page__titre
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PageQuestion = {
			Mm2Tables.Properties._PageQuestion__boutonRetour,
			Mm2Tables.Properties._PageQuestion__boutonSuivant,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Mm2Tables.Properties._Navigable__pagePrecedente,
			Mm2Tables.Properties._Navigable__pageSuivante,
			Mm2Tables.Properties._PageQuestion__question,
			Mm2Tables.Properties._Page__titre
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PageResultat = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Mm2Tables.Properties._Page__titre
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PageSoumission = {
			Mm2Tables.Properties._PageSoumission__boutonSoumettre,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Mm2Tables.Properties._Navigable__pagePrecedente,
			Mm2Tables.Properties._Navigable__pageSuivante,
			Mm2Tables.Properties._PageSoumission__question,
			Mm2Tables.Properties._Page__titre
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Question = {
			Mm2Tables.Properties._Question__difficulte,
			Mm2Tables.Properties._Question__ennonce,
			Mm2Tables.Properties._Question__etiquette,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Mm2Tables.Properties._Question__reponse,
			Mm2Tables.Properties._Question__reponsesMultiples
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Questionnaire = {
			Mm2Tables.Properties._Questionnaire__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Mm2Tables.Properties._Questionnaire__page,
			Mm2Tables.Properties._Questionnaire__retourAutorise
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Reponse = {
			Mm2Tables.Properties._Reponse__estVraie,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Mm2Tables.Properties._Reponse__texte
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Bouton__Bouton.initProperties(_Bouton);
			Fragments._BoutonRetour__BoutonRetour.initProperties(_BoutonRetour);
			Fragments._BoutonSoumettre__BoutonSoumettre.initProperties(_BoutonSoumettre);
			Fragments._BoutonSuivant__BoutonSuivant.initProperties(_BoutonSuivant);
			Fragments._Etiquette__Etiquette.initProperties(_Etiquette);
			Fragments._Navigable__Navigable.initProperties(_Navigable);
			Fragments._Page__Page.initProperties(_Page);
			Fragments._PageQuestion__PageQuestion.initProperties(_PageQuestion);
			Fragments._PageResultat__PageResultat.initProperties(_PageResultat);
			Fragments._PageSoumission__PageSoumission.initProperties(_PageSoumission);
			Fragments._Question__Question.initProperties(_Question);
			Fragments._Questionnaire__Questionnaire.initProperties(_Questionnaire);
			Fragments._Reponse__Reponse.initProperties(_Reponse);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Mm2Tables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Mm2Tables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new Mm2Tables();
	}

	private Mm2Tables() {
		super(Mm2Package.eNS_URI);
	}
}
