/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.parquet.format;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-06-29")
public enum PageType implements org.apache.thrift.TEnum {
  DATA_PAGE(0),
  INDEX_PAGE(1),
  DICTIONARY_PAGE(2),
  DATA_PAGE_V2(3);

  private final int value;

  private PageType(int value) {
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
  public static PageType findByValue(int value) { 
    switch (value) {
      case 0:
        return DATA_PAGE;
      case 1:
        return INDEX_PAGE;
      case 2:
        return DICTIONARY_PAGE;
      case 3:
        return DATA_PAGE_V2;
      default:
        return null;
    }
  }
}
