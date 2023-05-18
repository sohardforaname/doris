/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-05-18")
public enum TStatusCode implements org.apache.thrift.TEnum {
  OK(0),
  CANCELLED(1),
  ANALYSIS_ERROR(2),
  NOT_IMPLEMENTED_ERROR(3),
  RUNTIME_ERROR(4),
  MEM_LIMIT_EXCEEDED(5),
  INTERNAL_ERROR(6),
  THRIFT_RPC_ERROR(7),
  TIMEOUT(8),
  KUDU_NOT_ENABLED(9),
  KUDU_NOT_SUPPORTED_ON_OS(10),
  MEM_ALLOC_FAILED(11),
  BUFFER_ALLOCATION_FAILED(12),
  MINIMUM_RESERVATION_UNAVAILABLE(13),
  PUBLISH_TIMEOUT(14),
  LABEL_ALREADY_EXISTS(15),
  TOO_MANY_TASKS(16),
  ES_INTERNAL_ERROR(17),
  ES_INDEX_NOT_FOUND(18),
  ES_SHARD_NOT_FOUND(19),
  ES_INVALID_CONTEXTID(20),
  ES_INVALID_OFFSET(21),
  ES_REQUEST_ERROR(22),
  END_OF_FILE(30),
  NOT_FOUND(31),
  CORRUPTION(32),
  INVALID_ARGUMENT(33),
  IO_ERROR(34),
  ALREADY_EXIST(35),
  NETWORK_ERROR(36),
  ILLEGAL_STATE(37),
  NOT_AUTHORIZED(38),
  ABORTED(39),
  REMOTE_ERROR(40),
  SERVICE_UNAVAILABLE(41),
  UNINITIALIZED(42),
  CONFIGURATION_ERROR(43),
  INCOMPLETE(44),
  OLAP_ERR_VERSION_ALREADY_MERGED(45),
  DATA_QUALITY_ERROR(46),
  VEC_EXCEPTION(50),
  VEC_LOGIC_ERROR(51),
  VEC_ILLEGAL_DIVISION(52),
  VEC_BAD_CAST(53),
  VEC_CANNOT_ALLOCATE_MEMORY(54),
  VEC_CANNOT_MUNMAP(55),
  VEC_CANNOT_MREMAP(56),
  VEC_BAD_ARGUMENTS(57);

  private final int value;

  private TStatusCode(int value) {
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
  public static TStatusCode findByValue(int value) { 
    switch (value) {
      case 0:
        return OK;
      case 1:
        return CANCELLED;
      case 2:
        return ANALYSIS_ERROR;
      case 3:
        return NOT_IMPLEMENTED_ERROR;
      case 4:
        return RUNTIME_ERROR;
      case 5:
        return MEM_LIMIT_EXCEEDED;
      case 6:
        return INTERNAL_ERROR;
      case 7:
        return THRIFT_RPC_ERROR;
      case 8:
        return TIMEOUT;
      case 9:
        return KUDU_NOT_ENABLED;
      case 10:
        return KUDU_NOT_SUPPORTED_ON_OS;
      case 11:
        return MEM_ALLOC_FAILED;
      case 12:
        return BUFFER_ALLOCATION_FAILED;
      case 13:
        return MINIMUM_RESERVATION_UNAVAILABLE;
      case 14:
        return PUBLISH_TIMEOUT;
      case 15:
        return LABEL_ALREADY_EXISTS;
      case 16:
        return TOO_MANY_TASKS;
      case 17:
        return ES_INTERNAL_ERROR;
      case 18:
        return ES_INDEX_NOT_FOUND;
      case 19:
        return ES_SHARD_NOT_FOUND;
      case 20:
        return ES_INVALID_CONTEXTID;
      case 21:
        return ES_INVALID_OFFSET;
      case 22:
        return ES_REQUEST_ERROR;
      case 30:
        return END_OF_FILE;
      case 31:
        return NOT_FOUND;
      case 32:
        return CORRUPTION;
      case 33:
        return INVALID_ARGUMENT;
      case 34:
        return IO_ERROR;
      case 35:
        return ALREADY_EXIST;
      case 36:
        return NETWORK_ERROR;
      case 37:
        return ILLEGAL_STATE;
      case 38:
        return NOT_AUTHORIZED;
      case 39:
        return ABORTED;
      case 40:
        return REMOTE_ERROR;
      case 41:
        return SERVICE_UNAVAILABLE;
      case 42:
        return UNINITIALIZED;
      case 43:
        return CONFIGURATION_ERROR;
      case 44:
        return INCOMPLETE;
      case 45:
        return OLAP_ERR_VERSION_ALREADY_MERGED;
      case 46:
        return DATA_QUALITY_ERROR;
      case 50:
        return VEC_EXCEPTION;
      case 51:
        return VEC_LOGIC_ERROR;
      case 52:
        return VEC_ILLEGAL_DIVISION;
      case 53:
        return VEC_BAD_CAST;
      case 54:
        return VEC_CANNOT_ALLOCATE_MEMORY;
      case 55:
        return VEC_CANNOT_MUNMAP;
      case 56:
        return VEC_CANNOT_MREMAP;
      case 57:
        return VEC_BAD_ARGUMENTS;
      default:
        return null;
    }
  }
}
