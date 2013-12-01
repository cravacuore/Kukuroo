/**
 */
package org.miniGobstones.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.miniGobstones.Color;
import org.miniGobstones.Command;
import org.miniGobstones.Direccion;
import org.miniGobstones.MiniGobstonesFactory;
import org.miniGobstones.MiniGobstonesPackage;
import org.miniGobstones.Model;
import org.miniGobstones.Mover;
import org.miniGobstones.Poner;
import org.miniGobstones.Procedure;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MiniGobstonesPackageImpl extends EPackageImpl implements MiniGobstonesPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass procedureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ponerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moverEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum colorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum direccionEEnum = null;

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
   * @see org.miniGobstones.MiniGobstonesPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MiniGobstonesPackageImpl()
  {
    super(eNS_URI, MiniGobstonesFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link MiniGobstonesPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MiniGobstonesPackage init()
  {
    if (isInited) return (MiniGobstonesPackage)EPackage.Registry.INSTANCE.getEPackage(MiniGobstonesPackage.eNS_URI);

    // Obtain or create and register package
    MiniGobstonesPackageImpl theMiniGobstonesPackage = (MiniGobstonesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MiniGobstonesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MiniGobstonesPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMiniGobstonesPackage.createPackageContents();

    // Initialize created meta-data
    theMiniGobstonesPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMiniGobstonesPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MiniGobstonesPackage.eNS_URI, theMiniGobstonesPackage);
    return theMiniGobstonesPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Main()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcedure()
  {
    return procedureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcedure_Name()
  {
    return (EAttribute)procedureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcedure_Commands()
  {
    return (EReference)procedureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCommand()
  {
    return commandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPoner()
  {
    return ponerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPoner_Color()
  {
    return (EAttribute)ponerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMover()
  {
    return moverEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMover_Dir()
  {
    return (EAttribute)moverEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getColor()
  {
    return colorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDireccion()
  {
    return direccionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MiniGobstonesFactory getMiniGobstonesFactory()
  {
    return (MiniGobstonesFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__MAIN);

    procedureEClass = createEClass(PROCEDURE);
    createEAttribute(procedureEClass, PROCEDURE__NAME);
    createEReference(procedureEClass, PROCEDURE__COMMANDS);

    commandEClass = createEClass(COMMAND);

    ponerEClass = createEClass(PONER);
    createEAttribute(ponerEClass, PONER__COLOR);

    moverEClass = createEClass(MOVER);
    createEAttribute(moverEClass, MOVER__DIR);

    // Create enums
    colorEEnum = createEEnum(COLOR);
    direccionEEnum = createEEnum(DIRECCION);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    ponerEClass.getESuperTypes().add(this.getCommand());
    moverEClass.getESuperTypes().add(this.getCommand());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Main(), this.getProcedure(), null, "main", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(procedureEClass, Procedure.class, "Procedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProcedure_Name(), ecorePackage.getEString(), "name", null, 0, 1, Procedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcedure_Commands(), this.getCommand(), null, "commands", null, 0, -1, Procedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commandEClass, Command.class, "Command", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ponerEClass, Poner.class, "Poner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPoner_Color(), this.getColor(), "color", null, 0, 1, Poner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moverEClass, Mover.class, "Mover", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMover_Dir(), this.getDireccion(), "dir", null, 0, 1, Mover.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(colorEEnum, Color.class, "Color");
    addEEnumLiteral(colorEEnum, Color.VERDE);
    addEEnumLiteral(colorEEnum, Color.ROJO);
    addEEnumLiteral(colorEEnum, Color.AZUL);
    addEEnumLiteral(colorEEnum, Color.NEGRO);

    initEEnum(direccionEEnum, Direccion.class, "Direccion");
    addEEnumLiteral(direccionEEnum, Direccion.NORTE);
    addEEnumLiteral(direccionEEnum, Direccion.SUR);
    addEEnumLiteral(direccionEEnum, Direccion.ESTE);
    addEEnumLiteral(direccionEEnum, Direccion.OESTE);

    // Create resource
    createResource(eNS_URI);
  }

} //MiniGobstonesPackageImpl
