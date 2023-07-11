/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-11")
public enum TAggregationOp implements org.apache.thrift.TEnum {
  INVALID(0),
  COUNT(1),
  MAX(2),
  DISTINCT_PC(3),
  DISTINCT_PCSA(4),
  MIN(5),
  SUM(6),
  GROUP_CONCAT(7),
  HLL(8),
  COUNT_DISTINCT(9),
  SUM_DISTINCT(10),
  LEAD(11),
  FIRST_VALUE(12),
  LAST_VALUE(13),
  RANK(14),
  DENSE_RANK(15),
  ROW_NUMBER(16),
  LAG(17),
  HLL_C(18),
  BITMAP_UNION(19),
  NTILE(20);

  private final int value;

  private TAggregationOp(int value) {
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
  public static TAggregationOp findByValue(int value) { 
    switch (value) {
      case 0:
        return INVALID;
      case 1:
        return COUNT;
      case 2:
        return MAX;
      case 3:
        return DISTINCT_PC;
      case 4:
        return DISTINCT_PCSA;
      case 5:
        return MIN;
      case 6:
        return SUM;
      case 7:
        return GROUP_CONCAT;
      case 8:
        return HLL;
      case 9:
        return COUNT_DISTINCT;
      case 10:
        return SUM_DISTINCT;
      case 11:
        return LEAD;
      case 12:
        return FIRST_VALUE;
      case 13:
        return LAST_VALUE;
      case 14:
        return RANK;
      case 15:
        return DENSE_RANK;
      case 16:
        return ROW_NUMBER;
      case 17:
        return LAG;
      case 18:
        return HLL_C;
      case 19:
        return BITMAP_UNION;
      case 20:
        return NTILE;
      default:
        return null;
    }
  }
}
