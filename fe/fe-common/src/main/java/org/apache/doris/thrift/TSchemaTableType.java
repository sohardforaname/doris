/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-19")
public enum TSchemaTableType implements org.apache.thrift.TEnum {
  SCH_AUTHORS(0),
  SCH_CHARSETS(1),
  SCH_COLLATIONS(2),
  SCH_COLLATION_CHARACTER_SET_APPLICABILITY(3),
  SCH_COLUMNS(4),
  SCH_COLUMN_PRIVILEGES(5),
  SCH_CREATE_TABLE(6),
  SCH_ENGINES(7),
  SCH_EVENTS(8),
  SCH_FILES(9),
  SCH_GLOBAL_STATUS(10),
  SCH_GLOBAL_VARIABLES(11),
  SCH_KEY_COLUMN_USAGE(12),
  SCH_OPEN_TABLES(13),
  SCH_PARTITIONS(14),
  SCH_PLUGINS(15),
  SCH_PROCESSLIST(16),
  SCH_PROFILES(17),
  SCH_REFERENTIAL_CONSTRAINTS(18),
  SCH_PROCEDURES(19),
  SCH_SCHEMATA(20),
  SCH_SCHEMA_PRIVILEGES(21),
  SCH_SESSION_STATUS(22),
  SCH_SESSION_VARIABLES(23),
  SCH_STATISTICS(24),
  SCH_STATUS(25),
  SCH_TABLES(26),
  SCH_TABLE_CONSTRAINTS(27),
  SCH_TABLE_NAMES(28),
  SCH_TABLE_PRIVILEGES(29),
  SCH_TRIGGERS(30),
  SCH_USER_PRIVILEGES(31),
  SCH_VARIABLES(32),
  SCH_VIEWS(33),
  SCH_INVALID(34),
  SCH_ROWSETS(35),
  SCH_BACKENDS(36),
  SCH_COLUMN_STATISTICS(37),
  SCH_PARAMETERS(38);

  private final int value;

  private TSchemaTableType(int value) {
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
  public static TSchemaTableType findByValue(int value) { 
    switch (value) {
      case 0:
        return SCH_AUTHORS;
      case 1:
        return SCH_CHARSETS;
      case 2:
        return SCH_COLLATIONS;
      case 3:
        return SCH_COLLATION_CHARACTER_SET_APPLICABILITY;
      case 4:
        return SCH_COLUMNS;
      case 5:
        return SCH_COLUMN_PRIVILEGES;
      case 6:
        return SCH_CREATE_TABLE;
      case 7:
        return SCH_ENGINES;
      case 8:
        return SCH_EVENTS;
      case 9:
        return SCH_FILES;
      case 10:
        return SCH_GLOBAL_STATUS;
      case 11:
        return SCH_GLOBAL_VARIABLES;
      case 12:
        return SCH_KEY_COLUMN_USAGE;
      case 13:
        return SCH_OPEN_TABLES;
      case 14:
        return SCH_PARTITIONS;
      case 15:
        return SCH_PLUGINS;
      case 16:
        return SCH_PROCESSLIST;
      case 17:
        return SCH_PROFILES;
      case 18:
        return SCH_REFERENTIAL_CONSTRAINTS;
      case 19:
        return SCH_PROCEDURES;
      case 20:
        return SCH_SCHEMATA;
      case 21:
        return SCH_SCHEMA_PRIVILEGES;
      case 22:
        return SCH_SESSION_STATUS;
      case 23:
        return SCH_SESSION_VARIABLES;
      case 24:
        return SCH_STATISTICS;
      case 25:
        return SCH_STATUS;
      case 26:
        return SCH_TABLES;
      case 27:
        return SCH_TABLE_CONSTRAINTS;
      case 28:
        return SCH_TABLE_NAMES;
      case 29:
        return SCH_TABLE_PRIVILEGES;
      case 30:
        return SCH_TRIGGERS;
      case 31:
        return SCH_USER_PRIVILEGES;
      case 32:
        return SCH_VARIABLES;
      case 33:
        return SCH_VIEWS;
      case 34:
        return SCH_INVALID;
      case 35:
        return SCH_ROWSETS;
      case 36:
        return SCH_BACKENDS;
      case 37:
        return SCH_COLUMN_STATISTICS;
      case 38:
        return SCH_PARAMETERS;
      default:
        return null;
    }
  }
}
