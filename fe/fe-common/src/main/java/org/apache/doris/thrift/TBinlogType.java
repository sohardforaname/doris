/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-06-29")
public enum TBinlogType implements org.apache.thrift.TEnum {
  UPSERT(0),
  ADD_PARTITION(1),
  CREATE_TABLE(2);

  private final int value;

  private TBinlogType(int value) {
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
  public static TBinlogType findByValue(int value) { 
    switch (value) {
      case 0:
        return UPSERT;
      case 1:
        return ADD_PARTITION;
      case 2:
        return CREATE_TABLE;
      default:
        return null;
    }
  }
}
