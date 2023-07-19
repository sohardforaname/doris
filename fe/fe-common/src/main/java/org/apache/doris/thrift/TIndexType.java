/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-19")
public enum TIndexType implements org.apache.thrift.TEnum {
  BITMAP(0),
  INVERTED(1),
  BLOOMFILTER(2),
  NGRAM_BF(3);

  private final int value;

  private TIndexType(int value) {
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
  public static TIndexType findByValue(int value) { 
    switch (value) {
      case 0:
        return BITMAP;
      case 1:
        return INVERTED;
      case 2:
        return BLOOMFILTER;
      case 3:
        return NGRAM_BF;
      default:
        return null;
    }
  }
}
