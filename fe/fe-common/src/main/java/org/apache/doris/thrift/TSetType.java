/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-08-29")
public enum TSetType implements org.apache.thrift.TEnum {
  OPT_DEFAULT(0),
  OPT_GLOBAL(1),
  OPT_SESSION(2);

  private final int value;

  private TSetType(int value) {
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
  public static TSetType findByValue(int value) { 
    switch (value) {
      case 0:
        return OPT_DEFAULT;
      case 1:
        return OPT_GLOBAL;
      case 2:
        return OPT_SESSION;
      default:
        return null;
    }
  }
}
