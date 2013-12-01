/**
 */
package org.miniGobstones;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Poner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.miniGobstones.Poner#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.miniGobstones.MiniGobstonesPackage#getPoner()
 * @model
 * @generated
 */
public interface Poner extends Command
{
  /**
   * Returns the value of the '<em><b>Color</b></em>' attribute.
   * The literals are from the enumeration {@link org.miniGobstones.Color}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' attribute.
   * @see org.miniGobstones.Color
   * @see #setColor(Color)
   * @see org.miniGobstones.MiniGobstonesPackage#getPoner_Color()
   * @model
   * @generated
   */
  Color getColor();

  /**
   * Sets the value of the '{@link org.miniGobstones.Poner#getColor <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' attribute.
   * @see org.miniGobstones.Color
   * @see #getColor()
   * @generated
   */
  void setColor(Color value);

} // Poner
