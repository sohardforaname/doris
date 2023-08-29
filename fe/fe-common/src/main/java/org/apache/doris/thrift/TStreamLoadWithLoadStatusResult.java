/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-08-29")
public class TStreamLoadWithLoadStatusResult implements org.apache.thrift.TBase<TStreamLoadWithLoadStatusResult, TStreamLoadWithLoadStatusResult._Fields>, java.io.Serializable, Cloneable, Comparable<TStreamLoadWithLoadStatusResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TStreamLoadWithLoadStatusResult");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField TXN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("txn_id", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField TOTAL_ROWS_FIELD_DESC = new org.apache.thrift.protocol.TField("total_rows", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField LOADED_ROWS_FIELD_DESC = new org.apache.thrift.protocol.TField("loaded_rows", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField FILTERED_ROWS_FIELD_DESC = new org.apache.thrift.protocol.TField("filtered_rows", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField UNSELECTED_ROWS_FIELD_DESC = new org.apache.thrift.protocol.TField("unselected_rows", org.apache.thrift.protocol.TType.I64, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TStreamLoadWithLoadStatusResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TStreamLoadWithLoadStatusResultTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TStatus status; // optional
  public long txn_id; // optional
  public long total_rows; // optional
  public long loaded_rows; // optional
  public long filtered_rows; // optional
  public long unselected_rows; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short)1, "status"),
    TXN_ID((short)2, "txn_id"),
    TOTAL_ROWS((short)3, "total_rows"),
    LOADED_ROWS((short)4, "loaded_rows"),
    FILTERED_ROWS((short)5, "filtered_rows"),
    UNSELECTED_ROWS((short)6, "unselected_rows");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STATUS
          return STATUS;
        case 2: // TXN_ID
          return TXN_ID;
        case 3: // TOTAL_ROWS
          return TOTAL_ROWS;
        case 4: // LOADED_ROWS
          return LOADED_ROWS;
        case 5: // FILTERED_ROWS
          return FILTERED_ROWS;
        case 6: // UNSELECTED_ROWS
          return UNSELECTED_ROWS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    @Override
    public short getThriftFieldId() {
      return _thriftId;
    }

    @Override
    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TXN_ID_ISSET_ID = 0;
  private static final int __TOTAL_ROWS_ISSET_ID = 1;
  private static final int __LOADED_ROWS_ISSET_ID = 2;
  private static final int __FILTERED_ROWS_ISSET_ID = 3;
  private static final int __UNSELECTED_ROWS_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.STATUS,_Fields.TXN_ID,_Fields.TOTAL_ROWS,_Fields.LOADED_ROWS,_Fields.FILTERED_ROWS,_Fields.UNSELECTED_ROWS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TStatus.class)));
    tmpMap.put(_Fields.TXN_ID, new org.apache.thrift.meta_data.FieldMetaData("txn_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.TOTAL_ROWS, new org.apache.thrift.meta_data.FieldMetaData("total_rows", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.LOADED_ROWS, new org.apache.thrift.meta_data.FieldMetaData("loaded_rows", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.FILTERED_ROWS, new org.apache.thrift.meta_data.FieldMetaData("filtered_rows", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.UNSELECTED_ROWS, new org.apache.thrift.meta_data.FieldMetaData("unselected_rows", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TStreamLoadWithLoadStatusResult.class, metaDataMap);
  }

  public TStreamLoadWithLoadStatusResult() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TStreamLoadWithLoadStatusResult(TStreamLoadWithLoadStatusResult other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStatus()) {
      this.status = new org.apache.doris.thrift.TStatus(other.status);
    }
    this.txn_id = other.txn_id;
    this.total_rows = other.total_rows;
    this.loaded_rows = other.loaded_rows;
    this.filtered_rows = other.filtered_rows;
    this.unselected_rows = other.unselected_rows;
  }

  @Override
  public TStreamLoadWithLoadStatusResult deepCopy() {
    return new TStreamLoadWithLoadStatusResult(this);
  }

  @Override
  public void clear() {
    this.status = null;
    setTxnIdIsSet(false);
    this.txn_id = 0;
    setTotalRowsIsSet(false);
    this.total_rows = 0;
    setLoadedRowsIsSet(false);
    this.loaded_rows = 0;
    setFilteredRowsIsSet(false);
    this.filtered_rows = 0;
    setUnselectedRowsIsSet(false);
    this.unselected_rows = 0;
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TStatus getStatus() {
    return this.status;
  }

  public TStreamLoadWithLoadStatusResult setStatus(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TStatus status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public long getTxnId() {
    return this.txn_id;
  }

  public TStreamLoadWithLoadStatusResult setTxnId(long txn_id) {
    this.txn_id = txn_id;
    setTxnIdIsSet(true);
    return this;
  }

  public void unsetTxnId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TXN_ID_ISSET_ID);
  }

  /** Returns true if field txn_id is set (has been assigned a value) and false otherwise */
  public boolean isSetTxnId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TXN_ID_ISSET_ID);
  }

  public void setTxnIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TXN_ID_ISSET_ID, value);
  }

  public long getTotalRows() {
    return this.total_rows;
  }

  public TStreamLoadWithLoadStatusResult setTotalRows(long total_rows) {
    this.total_rows = total_rows;
    setTotalRowsIsSet(true);
    return this;
  }

  public void unsetTotalRows() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TOTAL_ROWS_ISSET_ID);
  }

  /** Returns true if field total_rows is set (has been assigned a value) and false otherwise */
  public boolean isSetTotalRows() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TOTAL_ROWS_ISSET_ID);
  }

  public void setTotalRowsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TOTAL_ROWS_ISSET_ID, value);
  }

  public long getLoadedRows() {
    return this.loaded_rows;
  }

  public TStreamLoadWithLoadStatusResult setLoadedRows(long loaded_rows) {
    this.loaded_rows = loaded_rows;
    setLoadedRowsIsSet(true);
    return this;
  }

  public void unsetLoadedRows() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LOADED_ROWS_ISSET_ID);
  }

  /** Returns true if field loaded_rows is set (has been assigned a value) and false otherwise */
  public boolean isSetLoadedRows() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LOADED_ROWS_ISSET_ID);
  }

  public void setLoadedRowsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LOADED_ROWS_ISSET_ID, value);
  }

  public long getFilteredRows() {
    return this.filtered_rows;
  }

  public TStreamLoadWithLoadStatusResult setFilteredRows(long filtered_rows) {
    this.filtered_rows = filtered_rows;
    setFilteredRowsIsSet(true);
    return this;
  }

  public void unsetFilteredRows() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __FILTERED_ROWS_ISSET_ID);
  }

  /** Returns true if field filtered_rows is set (has been assigned a value) and false otherwise */
  public boolean isSetFilteredRows() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __FILTERED_ROWS_ISSET_ID);
  }

  public void setFilteredRowsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __FILTERED_ROWS_ISSET_ID, value);
  }

  public long getUnselectedRows() {
    return this.unselected_rows;
  }

  public TStreamLoadWithLoadStatusResult setUnselectedRows(long unselected_rows) {
    this.unselected_rows = unselected_rows;
    setUnselectedRowsIsSet(true);
    return this;
  }

  public void unsetUnselectedRows() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __UNSELECTED_ROWS_ISSET_ID);
  }

  /** Returns true if field unselected_rows is set (has been assigned a value) and false otherwise */
  public boolean isSetUnselectedRows() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __UNSELECTED_ROWS_ISSET_ID);
  }

  public void setUnselectedRowsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __UNSELECTED_ROWS_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((org.apache.doris.thrift.TStatus)value);
      }
      break;

    case TXN_ID:
      if (value == null) {
        unsetTxnId();
      } else {
        setTxnId((java.lang.Long)value);
      }
      break;

    case TOTAL_ROWS:
      if (value == null) {
        unsetTotalRows();
      } else {
        setTotalRows((java.lang.Long)value);
      }
      break;

    case LOADED_ROWS:
      if (value == null) {
        unsetLoadedRows();
      } else {
        setLoadedRows((java.lang.Long)value);
      }
      break;

    case FILTERED_ROWS:
      if (value == null) {
        unsetFilteredRows();
      } else {
        setFilteredRows((java.lang.Long)value);
      }
      break;

    case UNSELECTED_ROWS:
      if (value == null) {
        unsetUnselectedRows();
      } else {
        setUnselectedRows((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case TXN_ID:
      return getTxnId();

    case TOTAL_ROWS:
      return getTotalRows();

    case LOADED_ROWS:
      return getLoadedRows();

    case FILTERED_ROWS:
      return getFilteredRows();

    case UNSELECTED_ROWS:
      return getUnselectedRows();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  @Override
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case STATUS:
      return isSetStatus();
    case TXN_ID:
      return isSetTxnId();
    case TOTAL_ROWS:
      return isSetTotalRows();
    case LOADED_ROWS:
      return isSetLoadedRows();
    case FILTERED_ROWS:
      return isSetFilteredRows();
    case UNSELECTED_ROWS:
      return isSetUnselectedRows();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TStreamLoadWithLoadStatusResult)
      return this.equals((TStreamLoadWithLoadStatusResult)that);
    return false;
  }

  public boolean equals(TStreamLoadWithLoadStatusResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_txn_id = true && this.isSetTxnId();
    boolean that_present_txn_id = true && that.isSetTxnId();
    if (this_present_txn_id || that_present_txn_id) {
      if (!(this_present_txn_id && that_present_txn_id))
        return false;
      if (this.txn_id != that.txn_id)
        return false;
    }

    boolean this_present_total_rows = true && this.isSetTotalRows();
    boolean that_present_total_rows = true && that.isSetTotalRows();
    if (this_present_total_rows || that_present_total_rows) {
      if (!(this_present_total_rows && that_present_total_rows))
        return false;
      if (this.total_rows != that.total_rows)
        return false;
    }

    boolean this_present_loaded_rows = true && this.isSetLoadedRows();
    boolean that_present_loaded_rows = true && that.isSetLoadedRows();
    if (this_present_loaded_rows || that_present_loaded_rows) {
      if (!(this_present_loaded_rows && that_present_loaded_rows))
        return false;
      if (this.loaded_rows != that.loaded_rows)
        return false;
    }

    boolean this_present_filtered_rows = true && this.isSetFilteredRows();
    boolean that_present_filtered_rows = true && that.isSetFilteredRows();
    if (this_present_filtered_rows || that_present_filtered_rows) {
      if (!(this_present_filtered_rows && that_present_filtered_rows))
        return false;
      if (this.filtered_rows != that.filtered_rows)
        return false;
    }

    boolean this_present_unselected_rows = true && this.isSetUnselectedRows();
    boolean that_present_unselected_rows = true && that.isSetUnselectedRows();
    if (this_present_unselected_rows || that_present_unselected_rows) {
      if (!(this_present_unselected_rows && that_present_unselected_rows))
        return false;
      if (this.unselected_rows != that.unselected_rows)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetStatus()) ? 131071 : 524287);
    if (isSetStatus())
      hashCode = hashCode * 8191 + status.hashCode();

    hashCode = hashCode * 8191 + ((isSetTxnId()) ? 131071 : 524287);
    if (isSetTxnId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(txn_id);

    hashCode = hashCode * 8191 + ((isSetTotalRows()) ? 131071 : 524287);
    if (isSetTotalRows())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(total_rows);

    hashCode = hashCode * 8191 + ((isSetLoadedRows()) ? 131071 : 524287);
    if (isSetLoadedRows())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(loaded_rows);

    hashCode = hashCode * 8191 + ((isSetFilteredRows()) ? 131071 : 524287);
    if (isSetFilteredRows())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(filtered_rows);

    hashCode = hashCode * 8191 + ((isSetUnselectedRows()) ? 131071 : 524287);
    if (isSetUnselectedRows())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(unselected_rows);

    return hashCode;
  }

  @Override
  public int compareTo(TStreamLoadWithLoadStatusResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetStatus(), other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTxnId(), other.isSetTxnId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTxnId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.txn_id, other.txn_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTotalRows(), other.isSetTotalRows());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotalRows()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.total_rows, other.total_rows);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetLoadedRows(), other.isSetLoadedRows());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLoadedRows()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.loaded_rows, other.loaded_rows);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetFilteredRows(), other.isSetFilteredRows());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFilteredRows()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.filtered_rows, other.filtered_rows);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetUnselectedRows(), other.isSetUnselectedRows());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUnselectedRows()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.unselected_rows, other.unselected_rows);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  @Override
  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  @Override
  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TStreamLoadWithLoadStatusResult(");
    boolean first = true;

    if (isSetStatus()) {
      sb.append("status:");
      if (this.status == null) {
        sb.append("null");
      } else {
        sb.append(this.status);
      }
      first = false;
    }
    if (isSetTxnId()) {
      if (!first) sb.append(", ");
      sb.append("txn_id:");
      sb.append(this.txn_id);
      first = false;
    }
    if (isSetTotalRows()) {
      if (!first) sb.append(", ");
      sb.append("total_rows:");
      sb.append(this.total_rows);
      first = false;
    }
    if (isSetLoadedRows()) {
      if (!first) sb.append(", ");
      sb.append("loaded_rows:");
      sb.append(this.loaded_rows);
      first = false;
    }
    if (isSetFilteredRows()) {
      if (!first) sb.append(", ");
      sb.append("filtered_rows:");
      sb.append(this.filtered_rows);
      first = false;
    }
    if (isSetUnselectedRows()) {
      if (!first) sb.append(", ");
      sb.append("unselected_rows:");
      sb.append(this.unselected_rows);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (status != null) {
      status.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TStreamLoadWithLoadStatusResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TStreamLoadWithLoadStatusResultStandardScheme getScheme() {
      return new TStreamLoadWithLoadStatusResultStandardScheme();
    }
  }

  private static class TStreamLoadWithLoadStatusResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<TStreamLoadWithLoadStatusResult> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TStreamLoadWithLoadStatusResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.status = new org.apache.doris.thrift.TStatus();
              struct.status.read(iprot);
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TXN_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.txn_id = iprot.readI64();
              struct.setTxnIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TOTAL_ROWS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.total_rows = iprot.readI64();
              struct.setTotalRowsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LOADED_ROWS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.loaded_rows = iprot.readI64();
              struct.setLoadedRowsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // FILTERED_ROWS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.filtered_rows = iprot.readI64();
              struct.setFilteredRowsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // UNSELECTED_ROWS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.unselected_rows = iprot.readI64();
              struct.setUnselectedRowsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, TStreamLoadWithLoadStatusResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        if (struct.isSetStatus()) {
          oprot.writeFieldBegin(STATUS_FIELD_DESC);
          struct.status.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetTxnId()) {
        oprot.writeFieldBegin(TXN_ID_FIELD_DESC);
        oprot.writeI64(struct.txn_id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTotalRows()) {
        oprot.writeFieldBegin(TOTAL_ROWS_FIELD_DESC);
        oprot.writeI64(struct.total_rows);
        oprot.writeFieldEnd();
      }
      if (struct.isSetLoadedRows()) {
        oprot.writeFieldBegin(LOADED_ROWS_FIELD_DESC);
        oprot.writeI64(struct.loaded_rows);
        oprot.writeFieldEnd();
      }
      if (struct.isSetFilteredRows()) {
        oprot.writeFieldBegin(FILTERED_ROWS_FIELD_DESC);
        oprot.writeI64(struct.filtered_rows);
        oprot.writeFieldEnd();
      }
      if (struct.isSetUnselectedRows()) {
        oprot.writeFieldBegin(UNSELECTED_ROWS_FIELD_DESC);
        oprot.writeI64(struct.unselected_rows);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TStreamLoadWithLoadStatusResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TStreamLoadWithLoadStatusResultTupleScheme getScheme() {
      return new TStreamLoadWithLoadStatusResultTupleScheme();
    }
  }

  private static class TStreamLoadWithLoadStatusResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<TStreamLoadWithLoadStatusResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TStreamLoadWithLoadStatusResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStatus()) {
        optionals.set(0);
      }
      if (struct.isSetTxnId()) {
        optionals.set(1);
      }
      if (struct.isSetTotalRows()) {
        optionals.set(2);
      }
      if (struct.isSetLoadedRows()) {
        optionals.set(3);
      }
      if (struct.isSetFilteredRows()) {
        optionals.set(4);
      }
      if (struct.isSetUnselectedRows()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetStatus()) {
        struct.status.write(oprot);
      }
      if (struct.isSetTxnId()) {
        oprot.writeI64(struct.txn_id);
      }
      if (struct.isSetTotalRows()) {
        oprot.writeI64(struct.total_rows);
      }
      if (struct.isSetLoadedRows()) {
        oprot.writeI64(struct.loaded_rows);
      }
      if (struct.isSetFilteredRows()) {
        oprot.writeI64(struct.filtered_rows);
      }
      if (struct.isSetUnselectedRows()) {
        oprot.writeI64(struct.unselected_rows);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TStreamLoadWithLoadStatusResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.status = new org.apache.doris.thrift.TStatus();
        struct.status.read(iprot);
        struct.setStatusIsSet(true);
      }
      if (incoming.get(1)) {
        struct.txn_id = iprot.readI64();
        struct.setTxnIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.total_rows = iprot.readI64();
        struct.setTotalRowsIsSet(true);
      }
      if (incoming.get(3)) {
        struct.loaded_rows = iprot.readI64();
        struct.setLoadedRowsIsSet(true);
      }
      if (incoming.get(4)) {
        struct.filtered_rows = iprot.readI64();
        struct.setFilteredRowsIsSet(true);
      }
      if (incoming.get(5)) {
        struct.unselected_rows = iprot.readI64();
        struct.setUnselectedRowsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

