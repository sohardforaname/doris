/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-06-20")
public enum TDdlType implements org.apache.thrift.TEnum {
  USE(0),
  DESCRIBE(1),
  SET(2),
  EXPLAIN(3),
  KILL(4),
  COMMON(5);

  private final int value;

  private TDdlType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  @Override
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  @org.apache.thrift.annotation.Nullable
  public static TDdlType findByValue(int value) { 
    switch (value) {
      case 0:
        return USE;
      case 1:
        return DESCRIBE;
      case 2:
        return SET;
      case 3:
        return EXPLAIN;
      case 4:
        return KILL;
      case 5:
        return COMMON;
      default:
        return null;
    }
  }
}
