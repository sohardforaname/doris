/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-08-29")
public enum TFileCompressType implements org.apache.thrift.TEnum {
  UNKNOWN(0),
  PLAIN(1),
  GZ(2),
  LZO(3),
  BZ2(4),
  LZ4FRAME(5),
  DEFLATE(6),
  LZOP(7),
  LZ4BLOCK(8),
  SNAPPYBLOCK(9);

  private final int value;

  private TFileCompressType(int value) {
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
  public static TFileCompressType findByValue(int value) { 
    switch (value) {
      case 0:
        return UNKNOWN;
      case 1:
        return PLAIN;
      case 2:
        return GZ;
      case 3:
        return LZO;
      case 4:
        return BZ2;
      case 5:
        return LZ4FRAME;
      case 6:
        return DEFLATE;
      case 7:
        return LZOP;
      case 8:
        return LZ4BLOCK;
      case 9:
        return SNAPPYBLOCK;
      default:
        return null;
    }
  }
}
