/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-06-29")
public enum TAlterTabletType implements org.apache.thrift.TEnum {
  SCHEMA_CHANGE(1),
  ROLLUP(2),
  MIGRATION(3);

  private final int value;

  private TAlterTabletType(int value) {
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
  public static TAlterTabletType findByValue(int value) { 
    switch (value) {
      case 1:
        return SCHEMA_CHANGE;
      case 2:
        return ROLLUP;
      case 3:
        return MIGRATION;
      default:
        return null;
    }
  }
}
