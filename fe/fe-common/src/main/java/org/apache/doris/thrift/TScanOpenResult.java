/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-08-29")
public class TScanOpenResult implements org.apache.thrift.TBase<TScanOpenResult, TScanOpenResult._Fields>, java.io.Serializable, Cloneable, Comparable<TScanOpenResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TScanOpenResult");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField CONTEXT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("context_id", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SELECTED_COLUMNS_FIELD_DESC = new org.apache.thrift.protocol.TField("selected_columns", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TScanOpenResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TScanOpenResultTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TStatus status; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String context_id; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<TScanColumnDesc> selected_columns; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short)1, "status"),
    CONTEXT_ID((short)2, "context_id"),
    SELECTED_COLUMNS((short)3, "selected_columns");

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
        case 2: // CONTEXT_ID
          return CONTEXT_ID;
        case 3: // SELECTED_COLUMNS
          return SELECTED_COLUMNS;
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
  private static final _Fields optionals[] = {_Fields.CONTEXT_ID,_Fields.SELECTED_COLUMNS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TStatus.class)));
    tmpMap.put(_Fields.CONTEXT_ID, new org.apache.thrift.meta_data.FieldMetaData("context_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SELECTED_COLUMNS, new org.apache.thrift.meta_data.FieldMetaData("selected_columns", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TScanColumnDesc.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TScanOpenResult.class, metaDataMap);
  }

  public TScanOpenResult() {
  }

  public TScanOpenResult(
    org.apache.doris.thrift.TStatus status)
  {
    this();
    this.status = status;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TScanOpenResult(TScanOpenResult other) {
    if (other.isSetStatus()) {
      this.status = new org.apache.doris.thrift.TStatus(other.status);
    }
    if (other.isSetContextId()) {
      this.context_id = other.context_id;
    }
    if (other.isSetSelectedColumns()) {
      java.util.List<TScanColumnDesc> __this__selected_columns = new java.util.ArrayList<TScanColumnDesc>(other.selected_columns.size());
      for (TScanColumnDesc other_element : other.selected_columns) {
        __this__selected_columns.add(new TScanColumnDesc(other_element));
      }
      this.selected_columns = __this__selected_columns;
    }
  }

  @Override
  public TScanOpenResult deepCopy() {
    return new TScanOpenResult(this);
  }

  @Override
  public void clear() {
    this.status = null;
    this.context_id = null;
    this.selected_columns = null;
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TStatus getStatus() {
    return this.status;
  }

  public TScanOpenResult setStatus(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TStatus status) {
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

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getContextId() {
    return this.context_id;
  }

  public TScanOpenResult setContextId(@org.apache.thrift.annotation.Nullable java.lang.String context_id) {
    this.context_id = context_id;
    return this;
  }

  public void unsetContextId() {
    this.context_id = null;
  }

  /** Returns true if field context_id is set (has been assigned a value) and false otherwise */
  public boolean isSetContextId() {
    return this.context_id != null;
  }

  public void setContextIdIsSet(boolean value) {
    if (!value) {
      this.context_id = null;
    }
  }

  public int getSelectedColumnsSize() {
    return (this.selected_columns == null) ? 0 : this.selected_columns.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TScanColumnDesc> getSelectedColumnsIterator() {
    return (this.selected_columns == null) ? null : this.selected_columns.iterator();
  }

  public void addToSelectedColumns(TScanColumnDesc elem) {
    if (this.selected_columns == null) {
      this.selected_columns = new java.util.ArrayList<TScanColumnDesc>();
    }
    this.selected_columns.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TScanColumnDesc> getSelectedColumns() {
    return this.selected_columns;
  }

  public TScanOpenResult setSelectedColumns(@org.apache.thrift.annotation.Nullable java.util.List<TScanColumnDesc> selected_columns) {
    this.selected_columns = selected_columns;
    return this;
  }

  public void unsetSelectedColumns() {
    this.selected_columns = null;
  }

  /** Returns true if field selected_columns is set (has been assigned a value) and false otherwise */
  public boolean isSetSelectedColumns() {
    return this.selected_columns != null;
  }

  public void setSelectedColumnsIsSet(boolean value) {
    if (!value) {
      this.selected_columns = null;
    }
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

    case CONTEXT_ID:
      if (value == null) {
        unsetContextId();
      } else {
        setContextId((java.lang.String)value);
      }
      break;

    case SELECTED_COLUMNS:
      if (value == null) {
        unsetSelectedColumns();
      } else {
        setSelectedColumns((java.util.List<TScanColumnDesc>)value);
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

    case CONTEXT_ID:
      return getContextId();

    case SELECTED_COLUMNS:
      return getSelectedColumns();

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
    case CONTEXT_ID:
      return isSetContextId();
    case SELECTED_COLUMNS:
      return isSetSelectedColumns();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TScanOpenResult)
      return this.equals((TScanOpenResult)that);
    return false;
  }

  public boolean equals(TScanOpenResult that) {
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

    boolean this_present_context_id = true && this.isSetContextId();
    boolean that_present_context_id = true && that.isSetContextId();
    if (this_present_context_id || that_present_context_id) {
      if (!(this_present_context_id && that_present_context_id))
        return false;
      if (!this.context_id.equals(that.context_id))
        return false;
    }

    boolean this_present_selected_columns = true && this.isSetSelectedColumns();
    boolean that_present_selected_columns = true && that.isSetSelectedColumns();
    if (this_present_selected_columns || that_present_selected_columns) {
      if (!(this_present_selected_columns && that_present_selected_columns))
        return false;
      if (!this.selected_columns.equals(that.selected_columns))
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

    hashCode = hashCode * 8191 + ((isSetContextId()) ? 131071 : 524287);
    if (isSetContextId())
      hashCode = hashCode * 8191 + context_id.hashCode();

    hashCode = hashCode * 8191 + ((isSetSelectedColumns()) ? 131071 : 524287);
    if (isSetSelectedColumns())
      hashCode = hashCode * 8191 + selected_columns.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TScanOpenResult other) {
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
    lastComparison = java.lang.Boolean.compare(isSetContextId(), other.isSetContextId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContextId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.context_id, other.context_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSelectedColumns(), other.isSetSelectedColumns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSelectedColumns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.selected_columns, other.selected_columns);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TScanOpenResult(");
    boolean first = true;

    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (isSetContextId()) {
      if (!first) sb.append(", ");
      sb.append("context_id:");
      if (this.context_id == null) {
        sb.append("null");
      } else {
        sb.append(this.context_id);
      }
      first = false;
    }
    if (isSetSelectedColumns()) {
      if (!first) sb.append(", ");
      sb.append("selected_columns:");
      if (this.selected_columns == null) {
        sb.append("null");
      } else {
        sb.append(this.selected_columns);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (status == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'status' was not present! Struct: " + toString());
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TScanOpenResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TScanOpenResultStandardScheme getScheme() {
      return new TScanOpenResultStandardScheme();
    }
  }

  private static class TScanOpenResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<TScanOpenResult> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TScanOpenResult struct) throws org.apache.thrift.TException {
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
          case 2: // CONTEXT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.context_id = iprot.readString();
              struct.setContextIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SELECTED_COLUMNS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list18 = iprot.readListBegin();
                struct.selected_columns = new java.util.ArrayList<TScanColumnDesc>(_list18.size);
                @org.apache.thrift.annotation.Nullable TScanColumnDesc _elem19;
                for (int _i20 = 0; _i20 < _list18.size; ++_i20)
                {
                  _elem19 = new TScanColumnDesc();
                  _elem19.read(iprot);
                  struct.selected_columns.add(_elem19);
                }
                iprot.readListEnd();
              }
              struct.setSelectedColumnsIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TScanOpenResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        struct.status.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.context_id != null) {
        if (struct.isSetContextId()) {
          oprot.writeFieldBegin(CONTEXT_ID_FIELD_DESC);
          oprot.writeString(struct.context_id);
          oprot.writeFieldEnd();
        }
      }
      if (struct.selected_columns != null) {
        if (struct.isSetSelectedColumns()) {
          oprot.writeFieldBegin(SELECTED_COLUMNS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.selected_columns.size()));
            for (TScanColumnDesc _iter21 : struct.selected_columns)
            {
              _iter21.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TScanOpenResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TScanOpenResultTupleScheme getScheme() {
      return new TScanOpenResultTupleScheme();
    }
  }

  private static class TScanOpenResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<TScanOpenResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TScanOpenResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.status.write(oprot);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetContextId()) {
        optionals.set(0);
      }
      if (struct.isSetSelectedColumns()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetContextId()) {
        oprot.writeString(struct.context_id);
      }
      if (struct.isSetSelectedColumns()) {
        {
          oprot.writeI32(struct.selected_columns.size());
          for (TScanColumnDesc _iter22 : struct.selected_columns)
          {
            _iter22.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TScanOpenResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.status = new org.apache.doris.thrift.TStatus();
      struct.status.read(iprot);
      struct.setStatusIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.context_id = iprot.readString();
        struct.setContextIdIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list23 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.selected_columns = new java.util.ArrayList<TScanColumnDesc>(_list23.size);
          @org.apache.thrift.annotation.Nullable TScanColumnDesc _elem24;
          for (int _i25 = 0; _i25 < _list23.size; ++_i25)
          {
            _elem24 = new TScanColumnDesc();
            _elem24.read(iprot);
            struct.selected_columns.add(_elem24);
          }
        }
        struct.setSelectedColumnsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

