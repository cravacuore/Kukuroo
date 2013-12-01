/**
 */
package org.miniGobstones;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Color</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.miniGobstones.MiniGobstonesPackage#getColor()
 * @model
 * @generated
 */
public enum Color implements Enumerator
{
  /**
   * The '<em><b>Verde</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VERDE_VALUE
   * @generated
   * @ordered
   */
  VERDE(0, "Verde", "Verde"),

  /**
   * The '<em><b>Rojo</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROJO_VALUE
   * @generated
   * @ordered
   */
  ROJO(1, "Rojo", "Rojo"),

  /**
   * The '<em><b>Azul</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AZUL_VALUE
   * @generated
   * @ordered
   */
  AZUL(2, "Azul", "Azul"),

  /**
   * The '<em><b>Negro</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NEGRO_VALUE
   * @generated
   * @ordered
   */
  NEGRO(3, "Negro", "Negro");

  /**
   * The '<em><b>Verde</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Verde</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VERDE
   * @model name="Verde"
   * @generated
   * @ordered
   */
  public static final int VERDE_VALUE = 0;

  /**
   * The '<em><b>Rojo</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Rojo</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ROJO
   * @model name="Rojo"
   * @generated
   * @ordered
   */
  public static final int ROJO_VALUE = 1;

  /**
   * The '<em><b>Azul</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Azul</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AZUL
   * @model name="Azul"
   * @generated
   * @ordered
   */
  public static final int AZUL_VALUE = 2;

  /**
   * The '<em><b>Negro</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Negro</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NEGRO
   * @model name="Negro"
   * @generated
   * @ordered
   */
  public static final int NEGRO_VALUE = 3;

  /**
   * An array of all the '<em><b>Color</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Color[] VALUES_ARRAY =
    new Color[]
    {
      VERDE,
      ROJO,
      AZUL,
      NEGRO,
    };

  /**
   * A public read-only list of all the '<em><b>Color</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Color> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Color</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Color get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Color result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Color</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Color getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Color result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Color</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Color get(int value)
  {
    switch (value)
    {
      case VERDE_VALUE: return VERDE;
      case ROJO_VALUE: return ROJO;
      case AZUL_VALUE: return AZUL;
      case NEGRO_VALUE: return NEGRO;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Color(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Color
