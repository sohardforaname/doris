/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-11")
public class TPlanFragment implements org.apache.thrift.TBase<TPlanFragment, TPlanFragment._Fields>, java.io.Serializable, Cloneable, Comparable<TPlanFragment> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TPlanFragment");

  private static final org.apache.thrift.protocol.TField PLAN_FIELD_DESC = new org.apache.thrift.protocol.TField("plan", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField OUTPUT_EXPRS_FIELD_DESC = new org.apache.thrift.protocol.TField("output_exprs", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField OUTPUT_SINK_FIELD_DESC = new org.apache.thrift.protocol.TField("output_sink", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField PARTITION_FIELD_DESC = new org.apache.thrift.protocol.TField("partition", org.apache.thrift.protocol.TType.STRUCT, (short)6);
  private static final org.apache.thrift.protocol.TField MIN_RESERVATION_BYTES_FIELD_DESC = new org.apache.thrift.protocol.TField("min_reservation_bytes", org.apache.thrift.protocol.TType.I64, (short)7);
  private static final org.apache.thrift.protocol.TField INITIAL_RESERVATION_TOTAL_CLAIMS_FIELD_DESC = new org.apache.thrift.protocol.TField("initial_reservation_total_claims", org.apache.thrift.protocol.TType.I64, (short)8);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TPlanFragmentStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TPlanFragmentTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TPlan plan; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<org.apache.doris.thrift.TExpr> output_exprs; // optional
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TDataSink output_sink; // optional
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TDataPartition partition; // required
  public long min_reservation_bytes; // optional
  public long initial_reservation_total_claims; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PLAN((short)2, "plan"),
    OUTPUT_EXPRS((short)4, "output_exprs"),
    OUTPUT_SINK((short)5, "output_sink"),
    PARTITION((short)6, "partition"),
    MIN_RESERVATION_BYTES((short)7, "min_reservation_bytes"),
    INITIAL_RESERVATION_TOTAL_CLAIMS((short)8, "initial_reservation_total_claims");

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
        case 2: // PLAN
          return PLAN;
        case 4: // OUTPUT_EXPRS
          return OUTPUT_EXPRS;
        case 5: // OUTPUT_SINK
          return OUTPUT_SINK;
        case 6: // PARTITION
          return PARTITION;
        case 7: // MIN_RESERVATION_BYTES
          return MIN_RESERVATION_BYTES;
        case 8: // INITIAL_RESERVATION_TOTAL_CLAIMS
          return INITIAL_RESERVATION_TOTAL_CLAIMS;
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
  private static final int __MIN_RESERVATION_BYTES_ISSET_ID = 0;
  private static final int __INITIAL_RESERVATION_TOTAL_CLAIMS_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.PLAN,_Fields.OUTPUT_EXPRS,_Fields.OUTPUT_SINK,_Fields.MIN_RESERVATION_BYTES,_Fields.INITIAL_RESERVATION_TOTAL_CLAIMS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PLAN, new org.apache.thrift.meta_data.FieldMetaData("plan", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TPlan.class)));
    tmpMap.put(_Fields.OUTPUT_EXPRS, new org.apache.thrift.meta_data.FieldMetaData("output_exprs", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TExpr.class))));
    tmpMap.put(_Fields.OUTPUT_SINK, new org.apache.thrift.meta_data.FieldMetaData("output_sink", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TDataSink.class)));
    tmpMap.put(_Fields.PARTITION, new org.apache.thrift.meta_data.FieldMetaData("partition", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TDataPartition.class)));
    tmpMap.put(_Fields.MIN_RESERVATION_BYTES, new org.apache.thrift.meta_data.FieldMetaData("min_reservation_bytes", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.INITIAL_RESERVATION_TOTAL_CLAIMS, new org.apache.thrift.meta_data.FieldMetaData("initial_reservation_total_claims", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TPlanFragment.class, metaDataMap);
  }

  public TPlanFragment() {
  }

  public TPlanFragment(
    org.apache.doris.thrift.TDataPartition partition)
  {
    this();
    this.partition = partition;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TPlanFragment(TPlanFragment other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetPlan()) {
      this.plan = new org.apache.doris.thrift.TPlan(other.plan);
    }
    if (other.isSetOutputExprs()) {
      java.util.List<org.apache.doris.thrift.TExpr> __this__output_exprs = new java.util.ArrayList<org.apache.doris.thrift.TExpr>(other.output_exprs.size());
      for (org.apache.doris.thrift.TExpr other_element : other.output_exprs) {
        __this__output_exprs.add(new org.apache.doris.thrift.TExpr(other_element));
      }
      this.output_exprs = __this__output_exprs;
    }
    if (other.isSetOutputSink()) {
      this.output_sink = new org.apache.doris.thrift.TDataSink(other.output_sink);
    }
    if (other.isSetPartition()) {
      this.partition = new org.apache.doris.thrift.TDataPartition(other.partition);
    }
    this.min_reservation_bytes = other.min_reservation_bytes;
    this.initial_reservation_total_claims = other.initial_reservation_total_claims;
  }

  @Override
  public TPlanFragment deepCopy() {
    return new TPlanFragment(this);
  }

  @Override
  public void clear() {
    this.plan = null;
    this.output_exprs = null;
    this.output_sink = null;
    this.partition = null;
    setMinReservationBytesIsSet(false);
    this.min_reservation_bytes = 0;
    setInitialReservationTotalClaimsIsSet(false);
    this.initial_reservation_total_claims = 0;
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TPlan getPlan() {
    return this.plan;
  }

  public TPlanFragment setPlan(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TPlan plan) {
    this.plan = plan;
    return this;
  }

  public void unsetPlan() {
    this.plan = null;
  }

  /** Returns true if field plan is set (has been assigned a value) and false otherwise */
  public boolean isSetPlan() {
    return this.plan != null;
  }

  public void setPlanIsSet(boolean value) {
    if (!value) {
      this.plan = null;
    }
  }

  public int getOutputExprsSize() {
    return (this.output_exprs == null) ? 0 : this.output_exprs.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<org.apache.doris.thrift.TExpr> getOutputExprsIterator() {
    return (this.output_exprs == null) ? null : this.output_exprs.iterator();
  }

  public void addToOutputExprs(org.apache.doris.thrift.TExpr elem) {
    if (this.output_exprs == null) {
      this.output_exprs = new java.util.ArrayList<org.apache.doris.thrift.TExpr>();
    }
    this.output_exprs.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<org.apache.doris.thrift.TExpr> getOutputExprs() {
    return this.output_exprs;
  }

  public TPlanFragment setOutputExprs(@org.apache.thrift.annotation.Nullable java.util.List<org.apache.doris.thrift.TExpr> output_exprs) {
    this.output_exprs = output_exprs;
    return this;
  }

  public void unsetOutputExprs() {
    this.output_exprs = null;
  }

  /** Returns true if field output_exprs is set (has been assigned a value) and false otherwise */
  public boolean isSetOutputExprs() {
    return this.output_exprs != null;
  }

  public void setOutputExprsIsSet(boolean value) {
    if (!value) {
      this.output_exprs = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TDataSink getOutputSink() {
    return this.output_sink;
  }

  public TPlanFragment setOutputSink(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TDataSink output_sink) {
    this.output_sink = output_sink;
    return this;
  }

  public void unsetOutputSink() {
    this.output_sink = null;
  }

  /** Returns true if field output_sink is set (has been assigned a value) and false otherwise */
  public boolean isSetOutputSink() {
    return this.output_sink != null;
  }

  public void setOutputSinkIsSet(boolean value) {
    if (!value) {
      this.output_sink = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TDataPartition getPartition() {
    return this.partition;
  }

  public TPlanFragment setPartition(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TDataPartition partition) {
    this.partition = partition;
    return this;
  }

  public void unsetPartition() {
    this.partition = null;
  }

  /** Returns true if field partition is set (has been assigned a value) and false otherwise */
  public boolean isSetPartition() {
    return this.partition != null;
  }

  public void setPartitionIsSet(boolean value) {
    if (!value) {
      this.partition = null;
    }
  }

  public long getMinReservationBytes() {
    return this.min_reservation_bytes;
  }

  public TPlanFragment setMinReservationBytes(long min_reservation_bytes) {
    this.min_reservation_bytes = min_reservation_bytes;
    setMinReservationBytesIsSet(true);
    return this;
  }

  public void unsetMinReservationBytes() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MIN_RESERVATION_BYTES_ISSET_ID);
  }

  /** Returns true if field min_reservation_bytes is set (has been assigned a value) and false otherwise */
  public boolean isSetMinReservationBytes() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MIN_RESERVATION_BYTES_ISSET_ID);
  }

  public void setMinReservationBytesIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MIN_RESERVATION_BYTES_ISSET_ID, value);
  }

  public long getInitialReservationTotalClaims() {
    return this.initial_reservation_total_claims;
  }

  public TPlanFragment setInitialReservationTotalClaims(long initial_reservation_total_claims) {
    this.initial_reservation_total_claims = initial_reservation_total_claims;
    setInitialReservationTotalClaimsIsSet(true);
    return this;
  }

  public void unsetInitialReservationTotalClaims() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __INITIAL_RESERVATION_TOTAL_CLAIMS_ISSET_ID);
  }

  /** Returns true if field initial_reservation_total_claims is set (has been assigned a value) and false otherwise */
  public boolean isSetInitialReservationTotalClaims() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __INITIAL_RESERVATION_TOTAL_CLAIMS_ISSET_ID);
  }

  public void setInitialReservationTotalClaimsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __INITIAL_RESERVATION_TOTAL_CLAIMS_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case PLAN:
      if (value == null) {
        unsetPlan();
      } else {
        setPlan((org.apache.doris.thrift.TPlan)value);
      }
      break;

    case OUTPUT_EXPRS:
      if (value == null) {
        unsetOutputExprs();
      } else {
        setOutputExprs((java.util.List<org.apache.doris.thrift.TExpr>)value);
      }
      break;

    case OUTPUT_SINK:
      if (value == null) {
        unsetOutputSink();
      } else {
        setOutputSink((org.apache.doris.thrift.TDataSink)value);
      }
      break;

    case PARTITION:
      if (value == null) {
        unsetPartition();
      } else {
        setPartition((org.apache.doris.thrift.TDataPartition)value);
      }
      break;

    case MIN_RESERVATION_BYTES:
      if (value == null) {
        unsetMinReservationBytes();
      } else {
        setMinReservationBytes((java.lang.Long)value);
      }
      break;

    case INITIAL_RESERVATION_TOTAL_CLAIMS:
      if (value == null) {
        unsetInitialReservationTotalClaims();
      } else {
        setInitialReservationTotalClaims((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PLAN:
      return getPlan();

    case OUTPUT_EXPRS:
      return getOutputExprs();

    case OUTPUT_SINK:
      return getOutputSink();

    case PARTITION:
      return getPartition();

    case MIN_RESERVATION_BYTES:
      return getMinReservationBytes();

    case INITIAL_RESERVATION_TOTAL_CLAIMS:
      return getInitialReservationTotalClaims();

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
    case PLAN:
      return isSetPlan();
    case OUTPUT_EXPRS:
      return isSetOutputExprs();
    case OUTPUT_SINK:
      return isSetOutputSink();
    case PARTITION:
      return isSetPartition();
    case MIN_RESERVATION_BYTES:
      return isSetMinReservationBytes();
    case INITIAL_RESERVATION_TOTAL_CLAIMS:
      return isSetInitialReservationTotalClaims();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TPlanFragment)
      return this.equals((TPlanFragment)that);
    return false;
  }

  public boolean equals(TPlanFragment that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_plan = true && this.isSetPlan();
    boolean that_present_plan = true && that.isSetPlan();
    if (this_present_plan || that_present_plan) {
      if (!(this_present_plan && that_present_plan))
        return false;
      if (!this.plan.equals(that.plan))
        return false;
    }

    boolean this_present_output_exprs = true && this.isSetOutputExprs();
    boolean that_present_output_exprs = true && that.isSetOutputExprs();
    if (this_present_output_exprs || that_present_output_exprs) {
      if (!(this_present_output_exprs && that_present_output_exprs))
        return false;
      if (!this.output_exprs.equals(that.output_exprs))
        return false;
    }

    boolean this_present_output_sink = true && this.isSetOutputSink();
    boolean that_present_output_sink = true && that.isSetOutputSink();
    if (this_present_output_sink || that_present_output_sink) {
      if (!(this_present_output_sink && that_present_output_sink))
        return false;
      if (!this.output_sink.equals(that.output_sink))
        return false;
    }

    boolean this_present_partition = true && this.isSetPartition();
    boolean that_present_partition = true && that.isSetPartition();
    if (this_present_partition || that_present_partition) {
      if (!(this_present_partition && that_present_partition))
        return false;
      if (!this.partition.equals(that.partition))
        return false;
    }

    boolean this_present_min_reservation_bytes = true && this.isSetMinReservationBytes();
    boolean that_present_min_reservation_bytes = true && that.isSetMinReservationBytes();
    if (this_present_min_reservation_bytes || that_present_min_reservation_bytes) {
      if (!(this_present_min_reservation_bytes && that_present_min_reservation_bytes))
        return false;
      if (this.min_reservation_bytes != that.min_reservation_bytes)
        return false;
    }

    boolean this_present_initial_reservation_total_claims = true && this.isSetInitialReservationTotalClaims();
    boolean that_present_initial_reservation_total_claims = true && that.isSetInitialReservationTotalClaims();
    if (this_present_initial_reservation_total_claims || that_present_initial_reservation_total_claims) {
      if (!(this_present_initial_reservation_total_claims && that_present_initial_reservation_total_claims))
        return false;
      if (this.initial_reservation_total_claims != that.initial_reservation_total_claims)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetPlan()) ? 131071 : 524287);
    if (isSetPlan())
      hashCode = hashCode * 8191 + plan.hashCode();

    hashCode = hashCode * 8191 + ((isSetOutputExprs()) ? 131071 : 524287);
    if (isSetOutputExprs())
      hashCode = hashCode * 8191 + output_exprs.hashCode();

    hashCode = hashCode * 8191 + ((isSetOutputSink()) ? 131071 : 524287);
    if (isSetOutputSink())
      hashCode = hashCode * 8191 + output_sink.hashCode();

    hashCode = hashCode * 8191 + ((isSetPartition()) ? 131071 : 524287);
    if (isSetPartition())
      hashCode = hashCode * 8191 + partition.hashCode();

    hashCode = hashCode * 8191 + ((isSetMinReservationBytes()) ? 131071 : 524287);
    if (isSetMinReservationBytes())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(min_reservation_bytes);

    hashCode = hashCode * 8191 + ((isSetInitialReservationTotalClaims()) ? 131071 : 524287);
    if (isSetInitialReservationTotalClaims())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(initial_reservation_total_claims);

    return hashCode;
  }

  @Override
  public int compareTo(TPlanFragment other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetPlan(), other.isSetPlan());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPlan()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.plan, other.plan);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetOutputExprs(), other.isSetOutputExprs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOutputExprs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.output_exprs, other.output_exprs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetOutputSink(), other.isSetOutputSink());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOutputSink()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.output_sink, other.output_sink);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetPartition(), other.isSetPartition());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartition()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partition, other.partition);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetMinReservationBytes(), other.isSetMinReservationBytes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMinReservationBytes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.min_reservation_bytes, other.min_reservation_bytes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetInitialReservationTotalClaims(), other.isSetInitialReservationTotalClaims());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInitialReservationTotalClaims()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.initial_reservation_total_claims, other.initial_reservation_total_claims);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TPlanFragment(");
    boolean first = true;

    if (isSetPlan()) {
      sb.append("plan:");
      if (this.plan == null) {
        sb.append("null");
      } else {
        sb.append(this.plan);
      }
      first = false;
    }
    if (isSetOutputExprs()) {
      if (!first) sb.append(", ");
      sb.append("output_exprs:");
      if (this.output_exprs == null) {
        sb.append("null");
      } else {
        sb.append(this.output_exprs);
      }
      first = false;
    }
    if (isSetOutputSink()) {
      if (!first) sb.append(", ");
      sb.append("output_sink:");
      if (this.output_sink == null) {
        sb.append("null");
      } else {
        sb.append(this.output_sink);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("partition:");
    if (this.partition == null) {
      sb.append("null");
    } else {
      sb.append(this.partition);
    }
    first = false;
    if (isSetMinReservationBytes()) {
      if (!first) sb.append(", ");
      sb.append("min_reservation_bytes:");
      sb.append(this.min_reservation_bytes);
      first = false;
    }
    if (isSetInitialReservationTotalClaims()) {
      if (!first) sb.append(", ");
      sb.append("initial_reservation_total_claims:");
      sb.append(this.initial_reservation_total_claims);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (partition == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'partition' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (plan != null) {
      plan.validate();
    }
    if (output_sink != null) {
      output_sink.validate();
    }
    if (partition != null) {
      partition.validate();
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

  private static class TPlanFragmentStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TPlanFragmentStandardScheme getScheme() {
      return new TPlanFragmentStandardScheme();
    }
  }

  private static class TPlanFragmentStandardScheme extends org.apache.thrift.scheme.StandardScheme<TPlanFragment> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TPlanFragment struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 2: // PLAN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.plan = new org.apache.doris.thrift.TPlan();
              struct.plan.read(iprot);
              struct.setPlanIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // OUTPUT_EXPRS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.output_exprs = new java.util.ArrayList<org.apache.doris.thrift.TExpr>(_list0.size);
                @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TExpr _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new org.apache.doris.thrift.TExpr();
                  _elem1.read(iprot);
                  struct.output_exprs.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setOutputExprsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // OUTPUT_SINK
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.output_sink = new org.apache.doris.thrift.TDataSink();
              struct.output_sink.read(iprot);
              struct.setOutputSinkIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // PARTITION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.partition = new org.apache.doris.thrift.TDataPartition();
              struct.partition.read(iprot);
              struct.setPartitionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // MIN_RESERVATION_BYTES
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.min_reservation_bytes = iprot.readI64();
              struct.setMinReservationBytesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // INITIAL_RESERVATION_TOTAL_CLAIMS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.initial_reservation_total_claims = iprot.readI64();
              struct.setInitialReservationTotalClaimsIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TPlanFragment struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.plan != null) {
        if (struct.isSetPlan()) {
          oprot.writeFieldBegin(PLAN_FIELD_DESC);
          struct.plan.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.output_exprs != null) {
        if (struct.isSetOutputExprs()) {
          oprot.writeFieldBegin(OUTPUT_EXPRS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.output_exprs.size()));
            for (org.apache.doris.thrift.TExpr _iter3 : struct.output_exprs)
            {
              _iter3.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.output_sink != null) {
        if (struct.isSetOutputSink()) {
          oprot.writeFieldBegin(OUTPUT_SINK_FIELD_DESC);
          struct.output_sink.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.partition != null) {
        oprot.writeFieldBegin(PARTITION_FIELD_DESC);
        struct.partition.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.isSetMinReservationBytes()) {
        oprot.writeFieldBegin(MIN_RESERVATION_BYTES_FIELD_DESC);
        oprot.writeI64(struct.min_reservation_bytes);
        oprot.writeFieldEnd();
      }
      if (struct.isSetInitialReservationTotalClaims()) {
        oprot.writeFieldBegin(INITIAL_RESERVATION_TOTAL_CLAIMS_FIELD_DESC);
        oprot.writeI64(struct.initial_reservation_total_claims);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TPlanFragmentTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TPlanFragmentTupleScheme getScheme() {
      return new TPlanFragmentTupleScheme();
    }
  }

  private static class TPlanFragmentTupleScheme extends org.apache.thrift.scheme.TupleScheme<TPlanFragment> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TPlanFragment struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.partition.write(oprot);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetPlan()) {
        optionals.set(0);
      }
      if (struct.isSetOutputExprs()) {
        optionals.set(1);
      }
      if (struct.isSetOutputSink()) {
        optionals.set(2);
      }
      if (struct.isSetMinReservationBytes()) {
        optionals.set(3);
      }
      if (struct.isSetInitialReservationTotalClaims()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetPlan()) {
        struct.plan.write(oprot);
      }
      if (struct.isSetOutputExprs()) {
        {
          oprot.writeI32(struct.output_exprs.size());
          for (org.apache.doris.thrift.TExpr _iter4 : struct.output_exprs)
          {
            _iter4.write(oprot);
          }
        }
      }
      if (struct.isSetOutputSink()) {
        struct.output_sink.write(oprot);
      }
      if (struct.isSetMinReservationBytes()) {
        oprot.writeI64(struct.min_reservation_bytes);
      }
      if (struct.isSetInitialReservationTotalClaims()) {
        oprot.writeI64(struct.initial_reservation_total_claims);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TPlanFragment struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.partition = new org.apache.doris.thrift.TDataPartition();
      struct.partition.read(iprot);
      struct.setPartitionIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.plan = new org.apache.doris.thrift.TPlan();
        struct.plan.read(iprot);
        struct.setPlanIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list5 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.output_exprs = new java.util.ArrayList<org.apache.doris.thrift.TExpr>(_list5.size);
          @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TExpr _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = new org.apache.doris.thrift.TExpr();
            _elem6.read(iprot);
            struct.output_exprs.add(_elem6);
          }
        }
        struct.setOutputExprsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.output_sink = new org.apache.doris.thrift.TDataSink();
        struct.output_sink.read(iprot);
        struct.setOutputSinkIsSet(true);
      }
      if (incoming.get(3)) {
        struct.min_reservation_bytes = iprot.readI64();
        struct.setMinReservationBytesIsSet(true);
      }
      if (incoming.get(4)) {
        struct.initial_reservation_total_claims = iprot.readI64();
        struct.setInitialReservationTotalClaimsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

