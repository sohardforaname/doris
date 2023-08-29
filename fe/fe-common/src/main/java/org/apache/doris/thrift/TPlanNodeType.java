/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-08-29")
public enum TPlanNodeType implements org.apache.thrift.TEnum {
  OLAP_SCAN_NODE(0),
  MYSQL_SCAN_NODE(1),
  CSV_SCAN_NODE(2),
  SCHEMA_SCAN_NODE(3),
  HASH_JOIN_NODE(4),
  MERGE_JOIN_NODE(5),
  AGGREGATION_NODE(6),
  PRE_AGGREGATION_NODE(7),
  SORT_NODE(8),
  EXCHANGE_NODE(9),
  MERGE_NODE(10),
  SELECT_NODE(11),
  CROSS_JOIN_NODE(12),
  META_SCAN_NODE(13),
  ANALYTIC_EVAL_NODE(14),
  OLAP_REWRITE_NODE(15),
  KUDU_SCAN_NODE(16),
  BROKER_SCAN_NODE(17),
  EMPTY_SET_NODE(18),
  UNION_NODE(19),
  ES_SCAN_NODE(20),
  ES_HTTP_SCAN_NODE(21),
  REPEAT_NODE(22),
  ASSERT_NUM_ROWS_NODE(23),
  INTERSECT_NODE(24),
  EXCEPT_NODE(25),
  ODBC_SCAN_NODE(26),
  TABLE_FUNCTION_NODE(27),
  DATA_GEN_SCAN_NODE(28),
  FILE_SCAN_NODE(29),
  JDBC_SCAN_NODE(30),
  TEST_EXTERNAL_SCAN_NODE(31),
  PARTITION_SORT_NODE(32);

  private final int value;

  private TPlanNodeType(int value) {
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
  public static TPlanNodeType findByValue(int value) { 
    switch (value) {
      case 0:
        return OLAP_SCAN_NODE;
      case 1:
        return MYSQL_SCAN_NODE;
      case 2:
        return CSV_SCAN_NODE;
      case 3:
        return SCHEMA_SCAN_NODE;
      case 4:
        return HASH_JOIN_NODE;
      case 5:
        return MERGE_JOIN_NODE;
      case 6:
        return AGGREGATION_NODE;
      case 7:
        return PRE_AGGREGATION_NODE;
      case 8:
        return SORT_NODE;
      case 9:
        return EXCHANGE_NODE;
      case 10:
        return MERGE_NODE;
      case 11:
        return SELECT_NODE;
      case 12:
        return CROSS_JOIN_NODE;
      case 13:
        return META_SCAN_NODE;
      case 14:
        return ANALYTIC_EVAL_NODE;
      case 15:
        return OLAP_REWRITE_NODE;
      case 16:
        return KUDU_SCAN_NODE;
      case 17:
        return BROKER_SCAN_NODE;
      case 18:
        return EMPTY_SET_NODE;
      case 19:
        return UNION_NODE;
      case 20:
        return ES_SCAN_NODE;
      case 21:
        return ES_HTTP_SCAN_NODE;
      case 22:
        return REPEAT_NODE;
      case 23:
        return ASSERT_NUM_ROWS_NODE;
      case 24:
        return INTERSECT_NODE;
      case 25:
        return EXCEPT_NODE;
      case 26:
        return ODBC_SCAN_NODE;
      case 27:
        return TABLE_FUNCTION_NODE;
      case 28:
        return DATA_GEN_SCAN_NODE;
      case 29:
        return FILE_SCAN_NODE;
      case 30:
        return JDBC_SCAN_NODE;
      case 31:
        return TEST_EXTERNAL_SCAN_NODE;
      case 32:
        return PARTITION_SORT_NODE;
      default:
        return null;
    }
  }
}
