/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-11")
public enum TTypeNodeType implements org.apache.thrift.TEnum {
  SCALAR(0),
  ARRAY(1),
  MAP(2),
  STRUCT(3),
  VARIANT(4);

  private final int value;

  private TTypeNodeType(int value) {
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
  public static TTypeNodeType findByValue(int value) { 
    switch (value) {
      case 0:
        return SCALAR;
      case 1:
        return ARRAY;
      case 2:
        return MAP;
      case 3:
        return STRUCT;
      case 4:
        return VARIANT;
      default:
        return null;
    }
  }
}
