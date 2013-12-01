/**
 */
package org.miniGobstones.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.miniGobstones.Direccion;
import org.miniGobstones.MiniGobstonesPackage;
import org.miniGobstones.Mover;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mover</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.miniGobstones.impl.MoverImpl#getDir <em>Dir</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MoverImpl extends CommandImpl implements Mover
{
  /**
   * The default value of the '{@link #getDir() <em>Dir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDir()
   * @generated
   * @ordered
   */
  protected static final Direccion DIR_EDEFAULT = Direccion.NORTE;

  /**
   * The cached value of the '{@link #getDir() <em>Dir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDir()
   * @generated
   * @ordered
   */
  protected Direccion dir = DIR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MoverImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MiniGobstonesPackage.Literals.MOVER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Direccion getDir()
  {
    return dir;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDir(Direccion newDir)
  {
    Direccion oldDir = dir;
    dir = newDir == null ? DIR_EDEFAULT : newDir;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniGobstonesPackage.MOVER__DIR, oldDir, dir));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MiniGobstonesPackage.MOVER__DIR:
        return getDir();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MiniGobstonesPackage.MOVER__DIR:
        setDir((Direccion)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MiniGobstonesPackage.MOVER__DIR:
        setDir(DIR_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MiniGobstonesPackage.MOVER__DIR:
        return dir != DIR_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (dir: ");
    result.append(dir);
    result.append(')');
    return result.toString();
  }

} //MoverImpl
