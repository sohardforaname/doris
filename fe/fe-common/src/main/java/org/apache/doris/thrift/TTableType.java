/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-05-18")
public enum TTableType implements org.apache.thrift.TEnum {
  MYSQL_TABLE(0),
  OLAP_TABLE(1),
  SCHEMA_TABLE(2),
  KUDU_TABLE(3),
  BROKER_TABLE(4),
  ES_TABLE(5),
  ODBC_TABLE(6),
  HIVE_TABLE(7),
  ICEBERG_TABLE(8),
  HUDI_TABLE(9),
  JDBC_TABLE(10),
  TEST_EXTERNAL_TABLE(11),
  MAX_COMPUTE_TABLE(12);

  private final int value;

  private TTableType(int value) {
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
  public static TTableType findByValue(int value) { 
    switch (value) {
      case 0:
        return MYSQL_TABLE;
      case 1:
        return OLAP_TABLE;
      case 2:
        return SCHEMA_TABLE;
      case 3:
        return KUDU_TABLE;
      case 4:
        return BROKER_TABLE;
      case 5:
        return ES_TABLE;
      case 6:
        return ODBC_TABLE;
      case 7:
        return HIVE_TABLE;
      case 8:
        return ICEBERG_TABLE;
      case 9:
        return HUDI_TABLE;
      case 10:
        return JDBC_TABLE;
      case 11:
        return TEST_EXTERNAL_TABLE;
      case 12:
        return MAX_COMPUTE_TABLE;
      default:
        return null;
    }
  }
}
