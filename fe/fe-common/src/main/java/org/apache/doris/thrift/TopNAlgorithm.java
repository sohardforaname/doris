/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-06-20")
public enum TopNAlgorithm implements org.apache.thrift.TEnum {
  RANK(0),
  DENSE_RANK(1),
  ROW_NUMBER(2);

  private final int value;

  private TopNAlgorithm(int value) {
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
  public static TopNAlgorithm findByValue(int value) { 
    switch (value) {
      case 0:
        return RANK;
      case 1:
        return DENSE_RANK;
      case 2:
        return ROW_NUMBER;
      default:
        return null;
    }
  }
}
