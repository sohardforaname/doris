/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-11")
public enum TRuntimeFilterType implements org.apache.thrift.TEnum {
  IN(1),
  BLOOM(2),
  MIN_MAX(4),
  IN_OR_BLOOM(8),
  BITMAP(16);

  private final int value;

  private TRuntimeFilterType(int value) {
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
  public static TRuntimeFilterType findByValue(int value) { 
    switch (value) {
      case 1:
        return IN;
      case 2:
        return BLOOM;
      case 4:
        return MIN_MAX;
      case 8:
        return IN_OR_BLOOM;
      case 16:
        return BITMAP;
      default:
        return null;
    }
  }
}
