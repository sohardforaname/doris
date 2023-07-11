/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-11")
public enum TPrimitiveType implements org.apache.thrift.TEnum {
  INVALID_TYPE(0),
  NULL_TYPE(1),
  BOOLEAN(2),
  TINYINT(3),
  SMALLINT(4),
  INT(5),
  BIGINT(6),
  FLOAT(7),
  DOUBLE(8),
  DATE(9),
  DATETIME(10),
  BINARY(11),
  DECIMAL_DEPRACTED(12),
  CHAR(13),
  LARGEINT(14),
  VARCHAR(15),
  HLL(16),
  DECIMALV2(17),
  TIME(18),
  OBJECT(19),
  ARRAY(20),
  MAP(21),
  STRUCT(22),
  STRING(23),
  ALL(24),
  QUANTILE_STATE(25),
  DATEV2(26),
  DATETIMEV2(27),
  TIMEV2(28),
  DECIMAL32(29),
  DECIMAL64(30),
  DECIMAL128I(31),
  JSONB(32),
  UNSUPPORTED(33),
  VARIANT(34),
  LAMBDA_FUNCTION(35),
  AGG_STATE(36);

  private final int value;

  private TPrimitiveType(int value) {
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
  public static TPrimitiveType findByValue(int value) { 
    switch (value) {
      case 0:
        return INVALID_TYPE;
      case 1:
        return NULL_TYPE;
      case 2:
        return BOOLEAN;
      case 3:
        return TINYINT;
      case 4:
        return SMALLINT;
      case 5:
        return INT;
      case 6:
        return BIGINT;
      case 7:
        return FLOAT;
      case 8:
        return DOUBLE;
      case 9:
        return DATE;
      case 10:
        return DATETIME;
      case 11:
        return BINARY;
      case 12:
        return DECIMAL_DEPRACTED;
      case 13:
        return CHAR;
      case 14:
        return LARGEINT;
      case 15:
        return VARCHAR;
      case 16:
        return HLL;
      case 17:
        return DECIMALV2;
      case 18:
        return TIME;
      case 19:
        return OBJECT;
      case 20:
        return ARRAY;
      case 21:
        return MAP;
      case 22:
        return STRUCT;
      case 23:
        return STRING;
      case 24:
        return ALL;
      case 25:
        return QUANTILE_STATE;
      case 26:
        return DATEV2;
      case 27:
        return DATETIMEV2;
      case 28:
        return TIMEV2;
      case 29:
        return DECIMAL32;
      case 30:
        return DECIMAL64;
      case 31:
        return DECIMAL128I;
      case 32:
        return JSONB;
      case 33:
        return UNSUPPORTED;
      case 34:
        return VARIANT;
      case 35:
        return LAMBDA_FUNCTION;
      case 36:
        return AGG_STATE;
      default:
        return null;
    }
  }
}
