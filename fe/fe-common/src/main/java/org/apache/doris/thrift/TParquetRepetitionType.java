/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-05-18")
public enum TParquetRepetitionType implements org.apache.thrift.TEnum {
  REQUIRED(0),
  REPEATED(1),
  OPTIONAL(2);

  private final int value;

  private TParquetRepetitionType(int value) {
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
  public static TParquetRepetitionType findByValue(int value) { 
    switch (value) {
      case 0:
        return REQUIRED;
      case 1:
        return REPEATED;
      case 2:
        return OPTIONAL;
      default:
        return null;
    }
  }
}
