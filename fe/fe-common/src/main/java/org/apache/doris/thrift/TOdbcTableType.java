/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-06-20")
public enum TOdbcTableType implements org.apache.thrift.TEnum {
  MYSQL(0),
  ORACLE(1),
  POSTGRESQL(2),
  SQLSERVER(3),
  REDIS(4),
  MONGODB(5),
  CLICKHOUSE(6),
  SAP_HANA(7),
  TRINO(8),
  PRESTO(9),
  OCEANBASE(10),
  OCEANBASE_ORACLE(11),
  NEBULA(12);

  private final int value;

  private TOdbcTableType(int value) {
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
  public static TOdbcTableType findByValue(int value) { 
    switch (value) {
      case 0:
        return MYSQL;
      case 1:
        return ORACLE;
      case 2:
        return POSTGRESQL;
      case 3:
        return SQLSERVER;
      case 4:
        return REDIS;
      case 5:
        return MONGODB;
      case 6:
        return CLICKHOUSE;
      case 7:
        return SAP_HANA;
      case 8:
        return TRINO;
      case 9:
        return PRESTO;
      case 10:
        return OCEANBASE;
      case 11:
        return OCEANBASE_ORACLE;
      case 12:
        return NEBULA;
      default:
        return null;
    }
  }
}
