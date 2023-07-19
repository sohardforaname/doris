/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-19")
public class TInitExternalCtlMetaResult implements org.apache.thrift.TBase<TInitExternalCtlMetaResult, TInitExternalCtlMetaResult._Fields>, java.io.Serializable, Cloneable, Comparable<TInitExternalCtlMetaResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TInitExternalCtlMetaResult");

  private static final org.apache.thrift.protocol.TField MAX_JOURNAL_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("maxJournalId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TInitExternalCtlMetaResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TInitExternalCtlMetaResultTupleSchemeFactory();

  public long maxJournalId; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String status; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MAX_JOURNAL_ID((short)1, "maxJournalId"),
    STATUS((short)2, "status");

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
        case 1: // MAX_JOURNAL_ID
          return MAX_JOURNAL_ID;
        case 2: // STATUS
          return STATUS;
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
  private static final int __MAXJOURNALID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.MAX_JOURNAL_ID,_Fields.STATUS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MAX_JOURNAL_ID, new org.apache.thrift.meta_data.FieldMetaData("maxJournalId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TInitExternalCtlMetaResult.class, metaDataMap);
  }

  public TInitExternalCtlMetaResult() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TInitExternalCtlMetaResult(TInitExternalCtlMetaResult other) {
    __isset_bitfield = other.__isset_bitfield;
    this.maxJournalId = other.maxJournalId;
    if (other.isSetStatus()) {
      this.status = other.status;
    }
  }

  @Override
  public TInitExternalCtlMetaResult deepCopy() {
    return new TInitExternalCtlMetaResult(this);
  }

  @Override
  public void clear() {
    setMaxJournalIdIsSet(false);
    this.maxJournalId = 0;
    this.status = null;
  }

  public long getMaxJournalId() {
    return this.maxJournalId;
  }

  public TInitExternalCtlMetaResult setMaxJournalId(long maxJournalId) {
    this.maxJournalId = maxJournalId;
    setMaxJournalIdIsSet(true);
    return this;
  }

  public void unsetMaxJournalId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MAXJOURNALID_ISSET_ID);
  }

  /** Returns true if field maxJournalId is set (has been assigned a value) and false otherwise */
  public boolean isSetMaxJournalId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MAXJOURNALID_ISSET_ID);
  }

  public void setMaxJournalIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MAXJOURNALID_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getStatus() {
    return this.status;
  }

  public TInitExternalCtlMetaResult setStatus(@org.apache.thrift.annotation.Nullable java.lang.String status) {
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

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case MAX_JOURNAL_ID:
      if (value == null) {
        unsetMaxJournalId();
      } else {
        setMaxJournalId((java.lang.Long)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case MAX_JOURNAL_ID:
      return getMaxJournalId();

    case STATUS:
      return getStatus();

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
    case MAX_JOURNAL_ID:
      return isSetMaxJournalId();
    case STATUS:
      return isSetStatus();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TInitExternalCtlMetaResult)
      return this.equals((TInitExternalCtlMetaResult)that);
    return false;
  }

  public boolean equals(TInitExternalCtlMetaResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_maxJournalId = true && this.isSetMaxJournalId();
    boolean that_present_maxJournalId = true && that.isSetMaxJournalId();
    if (this_present_maxJournalId || that_present_maxJournalId) {
      if (!(this_present_maxJournalId && that_present_maxJournalId))
        return false;
      if (this.maxJournalId != that.maxJournalId)
        return false;
    }

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetMaxJournalId()) ? 131071 : 524287);
    if (isSetMaxJournalId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(maxJournalId);

    hashCode = hashCode * 8191 + ((isSetStatus()) ? 131071 : 524287);
    if (isSetStatus())
      hashCode = hashCode * 8191 + status.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TInitExternalCtlMetaResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetMaxJournalId(), other.isSetMaxJournalId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaxJournalId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.maxJournalId, other.maxJournalId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TInitExternalCtlMetaResult(");
    boolean first = true;

    if (isSetMaxJournalId()) {
      sb.append("maxJournalId:");
      sb.append(this.maxJournalId);
      first = false;
    }
    if (isSetStatus()) {
      if (!first) sb.append(", ");
      sb.append("status:");
      if (this.status == null) {
        sb.append("null");
      } else {
        sb.append(this.status);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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

  private static class TInitExternalCtlMetaResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TInitExternalCtlMetaResultStandardScheme getScheme() {
      return new TInitExternalCtlMetaResultStandardScheme();
    }
  }

  private static class TInitExternalCtlMetaResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<TInitExternalCtlMetaResult> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TInitExternalCtlMetaResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MAX_JOURNAL_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.maxJournalId = iprot.readI64();
              struct.setMaxJournalIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.status = iprot.readString();
              struct.setStatusIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TInitExternalCtlMetaResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetMaxJournalId()) {
        oprot.writeFieldBegin(MAX_JOURNAL_ID_FIELD_DESC);
        oprot.writeI64(struct.maxJournalId);
        oprot.writeFieldEnd();
      }
      if (struct.status != null) {
        if (struct.isSetStatus()) {
          oprot.writeFieldBegin(STATUS_FIELD_DESC);
          oprot.writeString(struct.status);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TInitExternalCtlMetaResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TInitExternalCtlMetaResultTupleScheme getScheme() {
      return new TInitExternalCtlMetaResultTupleScheme();
    }
  }

  private static class TInitExternalCtlMetaResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<TInitExternalCtlMetaResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TInitExternalCtlMetaResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetMaxJournalId()) {
        optionals.set(0);
      }
      if (struct.isSetStatus()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetMaxJournalId()) {
        oprot.writeI64(struct.maxJournalId);
      }
      if (struct.isSetStatus()) {
        oprot.writeString(struct.status);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TInitExternalCtlMetaResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.maxJournalId = iprot.readI64();
        struct.setMaxJournalIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.status = iprot.readString();
        struct.setStatusIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

