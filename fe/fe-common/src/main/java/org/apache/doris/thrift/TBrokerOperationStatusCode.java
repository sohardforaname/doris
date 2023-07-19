/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-19")
public enum TBrokerOperationStatusCode implements org.apache.thrift.TEnum {
  OK(0),
  END_OF_FILE(301),
  NOT_AUTHORIZED(401),
  DUPLICATE_REQUEST(402),
  INVALID_INPUT_OFFSET(403),
  INVALID_INPUT_FILE_PATH(404),
  INVALID_ARGUMENT(405),
  FILE_NOT_FOUND(501),
  TARGET_STORAGE_SERVICE_ERROR(502),
  OPERATION_NOT_SUPPORTED(503);

  private final int value;

  private TBrokerOperationStatusCode(int value) {
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
  public static TBrokerOperationStatusCode findByValue(int value) { 
    switch (value) {
      case 0:
        return OK;
      case 301:
        return END_OF_FILE;
      case 401:
        return NOT_AUTHORIZED;
      case 402:
        return DUPLICATE_REQUEST;
      case 403:
        return INVALID_INPUT_OFFSET;
      case 404:
        return INVALID_INPUT_FILE_PATH;
      case 405:
        return INVALID_ARGUMENT;
      case 501:
        return FILE_NOT_FOUND;
      case 502:
        return TARGET_STORAGE_SERVICE_ERROR;
      case 503:
        return OPERATION_NOT_SUPPORTED;
      default:
        return null;
    }
  }
}
