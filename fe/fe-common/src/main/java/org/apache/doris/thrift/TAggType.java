/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-08-29")
public enum TAggType implements org.apache.thrift.TEnum {
  AGG_SUM(0),
  AGG_MIN(1),
  AGG_MAX(2),
  AGG_REPLACE(3);

  private final int value;

  private TAggType(int value) {
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
  public static TAggType findByValue(int value) { 
    switch (value) {
      case 0:
        return AGG_SUM;
      case 1:
        return AGG_MIN;
      case 2:
        return AGG_MAX;
      case 3:
        return AGG_REPLACE;
      default:
        return null;
    }
  }
}
