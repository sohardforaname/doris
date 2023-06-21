/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-06-20")
public class TClientRequest implements org.apache.thrift.TBase<TClientRequest, TClientRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TClientRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TClientRequest");

  private static final org.apache.thrift.protocol.TField STMT_FIELD_DESC = new org.apache.thrift.protocol.TField("stmt", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField QUERY_OPTIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("queryOptions", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField SESSION_STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("sessionState", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TClientRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TClientRequestTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String stmt; // required
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TQueryOptions queryOptions; // required
  public @org.apache.thrift.annotation.Nullable TSessionState sessionState; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STMT((short)1, "stmt"),
    QUERY_OPTIONS((short)2, "queryOptions"),
    SESSION_STATE((short)3, "sessionState");

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
        case 1: // STMT
          return STMT;
        case 2: // QUERY_OPTIONS
          return QUERY_OPTIONS;
        case 3: // SESSION_STATE
          return SESSION_STATE;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STMT, new org.apache.thrift.meta_data.FieldMetaData("stmt", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.QUERY_OPTIONS, new org.apache.thrift.meta_data.FieldMetaData("queryOptions", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TQueryOptions.class)));
    tmpMap.put(_Fields.SESSION_STATE, new org.apache.thrift.meta_data.FieldMetaData("sessionState", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TSessionState.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TClientRequest.class, metaDataMap);
  }

  public TClientRequest() {
  }

  public TClientRequest(
    java.lang.String stmt,
    org.apache.doris.thrift.TQueryOptions queryOptions,
    TSessionState sessionState)
  {
    this();
    this.stmt = stmt;
    this.queryOptions = queryOptions;
    this.sessionState = sessionState;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TClientRequest(TClientRequest other) {
    if (other.isSetStmt()) {
      this.stmt = other.stmt;
    }
    if (other.isSetQueryOptions()) {
      this.queryOptions = new org.apache.doris.thrift.TQueryOptions(other.queryOptions);
    }
    if (other.isSetSessionState()) {
      this.sessionState = new TSessionState(other.sessionState);
    }
  }

  @Override
  public TClientRequest deepCopy() {
    return new TClientRequest(this);
  }

  @Override
  public void clear() {
    this.stmt = null;
    this.queryOptions = null;
    this.sessionState = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getStmt() {
    return this.stmt;
  }

  public TClientRequest setStmt(@org.apache.thrift.annotation.Nullable java.lang.String stmt) {
    this.stmt = stmt;
    return this;
  }

  public void unsetStmt() {
    this.stmt = null;
  }

  /** Returns true if field stmt is set (has been assigned a value) and false otherwise */
  public boolean isSetStmt() {
    return this.stmt != null;
  }

  public void setStmtIsSet(boolean value) {
    if (!value) {
      this.stmt = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TQueryOptions getQueryOptions() {
    return this.queryOptions;
  }

  public TClientRequest setQueryOptions(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TQueryOptions queryOptions) {
    this.queryOptions = queryOptions;
    return this;
  }

  public void unsetQueryOptions() {
    this.queryOptions = null;
  }

  /** Returns true if field queryOptions is set (has been assigned a value) and false otherwise */
  public boolean isSetQueryOptions() {
    return this.queryOptions != null;
  }

  public void setQueryOptionsIsSet(boolean value) {
    if (!value) {
      this.queryOptions = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public TSessionState getSessionState() {
    return this.sessionState;
  }

  public TClientRequest setSessionState(@org.apache.thrift.annotation.Nullable TSessionState sessionState) {
    this.sessionState = sessionState;
    return this;
  }

  public void unsetSessionState() {
    this.sessionState = null;
  }

  /** Returns true if field sessionState is set (has been assigned a value) and false otherwise */
  public boolean isSetSessionState() {
    return this.sessionState != null;
  }

  public void setSessionStateIsSet(boolean value) {
    if (!value) {
      this.sessionState = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case STMT:
      if (value == null) {
        unsetStmt();
      } else {
        setStmt((java.lang.String)value);
      }
      break;

    case QUERY_OPTIONS:
      if (value == null) {
        unsetQueryOptions();
      } else {
        setQueryOptions((org.apache.doris.thrift.TQueryOptions)value);
      }
      break;

    case SESSION_STATE:
      if (value == null) {
        unsetSessionState();
      } else {
        setSessionState((TSessionState)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STMT:
      return getStmt();

    case QUERY_OPTIONS:
      return getQueryOptions();

    case SESSION_STATE:
      return getSessionState();

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
    case STMT:
      return isSetStmt();
    case QUERY_OPTIONS:
      return isSetQueryOptions();
    case SESSION_STATE:
      return isSetSessionState();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TClientRequest)
      return this.equals((TClientRequest)that);
    return false;
  }

  public boolean equals(TClientRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_stmt = true && this.isSetStmt();
    boolean that_present_stmt = true && that.isSetStmt();
    if (this_present_stmt || that_present_stmt) {
      if (!(this_present_stmt && that_present_stmt))
        return false;
      if (!this.stmt.equals(that.stmt))
        return false;
    }

    boolean this_present_queryOptions = true && this.isSetQueryOptions();
    boolean that_present_queryOptions = true && that.isSetQueryOptions();
    if (this_present_queryOptions || that_present_queryOptions) {
      if (!(this_present_queryOptions && that_present_queryOptions))
        return false;
      if (!this.queryOptions.equals(that.queryOptions))
        return false;
    }

    boolean this_present_sessionState = true && this.isSetSessionState();
    boolean that_present_sessionState = true && that.isSetSessionState();
    if (this_present_sessionState || that_present_sessionState) {
      if (!(this_present_sessionState && that_present_sessionState))
        return false;
      if (!this.sessionState.equals(that.sessionState))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetStmt()) ? 131071 : 524287);
    if (isSetStmt())
      hashCode = hashCode * 8191 + stmt.hashCode();

    hashCode = hashCode * 8191 + ((isSetQueryOptions()) ? 131071 : 524287);
    if (isSetQueryOptions())
      hashCode = hashCode * 8191 + queryOptions.hashCode();

    hashCode = hashCode * 8191 + ((isSetSessionState()) ? 131071 : 524287);
    if (isSetSessionState())
      hashCode = hashCode * 8191 + sessionState.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TClientRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetStmt(), other.isSetStmt());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStmt()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stmt, other.stmt);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetQueryOptions(), other.isSetQueryOptions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueryOptions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.queryOptions, other.queryOptions);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSessionState(), other.isSetSessionState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSessionState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sessionState, other.sessionState);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TClientRequest(");
    boolean first = true;

    sb.append("stmt:");
    if (this.stmt == null) {
      sb.append("null");
    } else {
      sb.append(this.stmt);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("queryOptions:");
    if (this.queryOptions == null) {
      sb.append("null");
    } else {
      sb.append(this.queryOptions);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sessionState:");
    if (this.sessionState == null) {
      sb.append("null");
    } else {
      sb.append(this.sessionState);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (stmt == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'stmt' was not present! Struct: " + toString());
    }
    if (queryOptions == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'queryOptions' was not present! Struct: " + toString());
    }
    if (sessionState == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'sessionState' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (queryOptions != null) {
      queryOptions.validate();
    }
    if (sessionState != null) {
      sessionState.validate();
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

  private static class TClientRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TClientRequestStandardScheme getScheme() {
      return new TClientRequestStandardScheme();
    }
  }

  private static class TClientRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<TClientRequest> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TClientRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STMT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.stmt = iprot.readString();
              struct.setStmtIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // QUERY_OPTIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.queryOptions = new org.apache.doris.thrift.TQueryOptions();
              struct.queryOptions.read(iprot);
              struct.setQueryOptionsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SESSION_STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.sessionState = new TSessionState();
              struct.sessionState.read(iprot);
              struct.setSessionStateIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TClientRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.stmt != null) {
        oprot.writeFieldBegin(STMT_FIELD_DESC);
        oprot.writeString(struct.stmt);
        oprot.writeFieldEnd();
      }
      if (struct.queryOptions != null) {
        oprot.writeFieldBegin(QUERY_OPTIONS_FIELD_DESC);
        struct.queryOptions.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.sessionState != null) {
        oprot.writeFieldBegin(SESSION_STATE_FIELD_DESC);
        struct.sessionState.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TClientRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TClientRequestTupleScheme getScheme() {
      return new TClientRequestTupleScheme();
    }
  }

  private static class TClientRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<TClientRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TClientRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.stmt);
      struct.queryOptions.write(oprot);
      struct.sessionState.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TClientRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.stmt = iprot.readString();
      struct.setStmtIsSet(true);
      struct.queryOptions = new org.apache.doris.thrift.TQueryOptions();
      struct.queryOptions.read(iprot);
      struct.setQueryOptionsIsSet(true);
      struct.sessionState = new TSessionState();
      struct.sessionState.read(iprot);
      struct.setSessionStateIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

