/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-11")
public enum TPushType implements org.apache.thrift.TEnum {
  LOAD(0),
  DELETE(1),
  LOAD_DELETE(2),
  LOAD_V2(3);

  private final int value;

  private TPushType(int value) {
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
  public static TPushType findByValue(int value) { 
    switch (value) {
      case 0:
        return LOAD;
      case 1:
        return DELETE;
      case 2:
        return LOAD_DELETE;
      case 3:
        return LOAD_V2;
      default:
        return null;
    }
  }
}
