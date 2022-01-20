/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.freeb.thrift.Accounts;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2022-01-20")
public class AccountsInfo implements org.apache.thrift.TBase<AccountsInfo, AccountsInfo._Fields>, java.io.Serializable, Cloneable, Comparable<AccountsInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AccountsInfo");

  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField USER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("userName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField USER_PASSWD_FIELD_DESC = new org.apache.thrift.protocol.TField("userPasswd", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField USER_DESCRIPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("userDescription", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField USER_TAG_FIELD_DESC = new org.apache.thrift.protocol.TField("userTag", org.apache.thrift.protocol.TType.MAP, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AccountsInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AccountsInfoTupleSchemeFactory());
  }

  public long userId; // optional
  public String userName; // required
  public String userPasswd; // required
  public String userDescription; // optional
  public Map<Integer,Double> userTag; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER_ID((short)1, "userId"),
    USER_NAME((short)2, "userName"),
    USER_PASSWD((short)3, "userPasswd"),
    USER_DESCRIPTION((short)4, "userDescription"),
    USER_TAG((short)5, "userTag");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // USER_ID
          return USER_ID;
        case 2: // USER_NAME
          return USER_NAME;
        case 3: // USER_PASSWD
          return USER_PASSWD;
        case 4: // USER_DESCRIPTION
          return USER_DESCRIPTION;
        case 5: // USER_TAG
          return USER_TAG;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __USERID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.USER_ID,_Fields.USER_DESCRIPTION,_Fields.USER_TAG};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("userId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.USER_NAME, new org.apache.thrift.meta_data.FieldMetaData("userName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USER_PASSWD, new org.apache.thrift.meta_data.FieldMetaData("userPasswd", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USER_DESCRIPTION, new org.apache.thrift.meta_data.FieldMetaData("userDescription", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USER_TAG, new org.apache.thrift.meta_data.FieldMetaData("userTag", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AccountsInfo.class, metaDataMap);
  }

  public AccountsInfo() {
  }

  public AccountsInfo(
    String userName,
    String userPasswd)
  {
    this();
    this.userName = userName;
    this.userPasswd = userPasswd;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AccountsInfo(AccountsInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.userId = other.userId;
    if (other.isSetUserName()) {
      this.userName = other.userName;
    }
    if (other.isSetUserPasswd()) {
      this.userPasswd = other.userPasswd;
    }
    if (other.isSetUserDescription()) {
      this.userDescription = other.userDescription;
    }
    if (other.isSetUserTag()) {
      Map<Integer,Double> __this__userTag = new HashMap<Integer,Double>(other.userTag);
      this.userTag = __this__userTag;
    }
  }

  public AccountsInfo deepCopy() {
    return new AccountsInfo(this);
  }

  @Override
  public void clear() {
    setUserIdIsSet(false);
    this.userId = 0;
    this.userName = null;
    this.userPasswd = null;
    this.userDescription = null;
    this.userTag = null;
  }

  public long getUserId() {
    return this.userId;
  }

  public AccountsInfo setUserId(long userId) {
    this.userId = userId;
    setUserIdIsSet(true);
    return this;
  }

  public void unsetUserId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __USERID_ISSET_ID);
  }

  /** Returns true if field userId is set (has been assigned a value) and false otherwise */
  public boolean isSetUserId() {
    return EncodingUtils.testBit(__isset_bitfield, __USERID_ISSET_ID);
  }

  public void setUserIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __USERID_ISSET_ID, value);
  }

  public String getUserName() {
    return this.userName;
  }

  public AccountsInfo setUserName(String userName) {
    this.userName = userName;
    return this;
  }

  public void unsetUserName() {
    this.userName = null;
  }

  /** Returns true if field userName is set (has been assigned a value) and false otherwise */
  public boolean isSetUserName() {
    return this.userName != null;
  }

  public void setUserNameIsSet(boolean value) {
    if (!value) {
      this.userName = null;
    }
  }

  public String getUserPasswd() {
    return this.userPasswd;
  }

  public AccountsInfo setUserPasswd(String userPasswd) {
    this.userPasswd = userPasswd;
    return this;
  }

  public void unsetUserPasswd() {
    this.userPasswd = null;
  }

  /** Returns true if field userPasswd is set (has been assigned a value) and false otherwise */
  public boolean isSetUserPasswd() {
    return this.userPasswd != null;
  }

  public void setUserPasswdIsSet(boolean value) {
    if (!value) {
      this.userPasswd = null;
    }
  }

  public String getUserDescription() {
    return this.userDescription;
  }

  public AccountsInfo setUserDescription(String userDescription) {
    this.userDescription = userDescription;
    return this;
  }

  public void unsetUserDescription() {
    this.userDescription = null;
  }

  /** Returns true if field userDescription is set (has been assigned a value) and false otherwise */
  public boolean isSetUserDescription() {
    return this.userDescription != null;
  }

  public void setUserDescriptionIsSet(boolean value) {
    if (!value) {
      this.userDescription = null;
    }
  }

  public int getUserTagSize() {
    return (this.userTag == null) ? 0 : this.userTag.size();
  }

  public void putToUserTag(int key, double val) {
    if (this.userTag == null) {
      this.userTag = new HashMap<Integer,Double>();
    }
    this.userTag.put(key, val);
  }

  public Map<Integer,Double> getUserTag() {
    return this.userTag;
  }

  public AccountsInfo setUserTag(Map<Integer,Double> userTag) {
    this.userTag = userTag;
    return this;
  }

  public void unsetUserTag() {
    this.userTag = null;
  }

  /** Returns true if field userTag is set (has been assigned a value) and false otherwise */
  public boolean isSetUserTag() {
    return this.userTag != null;
  }

  public void setUserTagIsSet(boolean value) {
    if (!value) {
      this.userTag = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case USER_ID:
      if (value == null) {
        unsetUserId();
      } else {
        setUserId((Long)value);
      }
      break;

    case USER_NAME:
      if (value == null) {
        unsetUserName();
      } else {
        setUserName((String)value);
      }
      break;

    case USER_PASSWD:
      if (value == null) {
        unsetUserPasswd();
      } else {
        setUserPasswd((String)value);
      }
      break;

    case USER_DESCRIPTION:
      if (value == null) {
        unsetUserDescription();
      } else {
        setUserDescription((String)value);
      }
      break;

    case USER_TAG:
      if (value == null) {
        unsetUserTag();
      } else {
        setUserTag((Map<Integer,Double>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USER_ID:
      return getUserId();

    case USER_NAME:
      return getUserName();

    case USER_PASSWD:
      return getUserPasswd();

    case USER_DESCRIPTION:
      return getUserDescription();

    case USER_TAG:
      return getUserTag();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case USER_ID:
      return isSetUserId();
    case USER_NAME:
      return isSetUserName();
    case USER_PASSWD:
      return isSetUserPasswd();
    case USER_DESCRIPTION:
      return isSetUserDescription();
    case USER_TAG:
      return isSetUserTag();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AccountsInfo)
      return this.equals((AccountsInfo)that);
    return false;
  }

  public boolean equals(AccountsInfo that) {
    if (that == null)
      return false;

    boolean this_present_userId = true && this.isSetUserId();
    boolean that_present_userId = true && that.isSetUserId();
    if (this_present_userId || that_present_userId) {
      if (!(this_present_userId && that_present_userId))
        return false;
      if (this.userId != that.userId)
        return false;
    }

    boolean this_present_userName = true && this.isSetUserName();
    boolean that_present_userName = true && that.isSetUserName();
    if (this_present_userName || that_present_userName) {
      if (!(this_present_userName && that_present_userName))
        return false;
      if (!this.userName.equals(that.userName))
        return false;
    }

    boolean this_present_userPasswd = true && this.isSetUserPasswd();
    boolean that_present_userPasswd = true && that.isSetUserPasswd();
    if (this_present_userPasswd || that_present_userPasswd) {
      if (!(this_present_userPasswd && that_present_userPasswd))
        return false;
      if (!this.userPasswd.equals(that.userPasswd))
        return false;
    }

    boolean this_present_userDescription = true && this.isSetUserDescription();
    boolean that_present_userDescription = true && that.isSetUserDescription();
    if (this_present_userDescription || that_present_userDescription) {
      if (!(this_present_userDescription && that_present_userDescription))
        return false;
      if (!this.userDescription.equals(that.userDescription))
        return false;
    }

    boolean this_present_userTag = true && this.isSetUserTag();
    boolean that_present_userTag = true && that.isSetUserTag();
    if (this_present_userTag || that_present_userTag) {
      if (!(this_present_userTag && that_present_userTag))
        return false;
      if (!this.userTag.equals(that.userTag))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_userId = true && (isSetUserId());
    list.add(present_userId);
    if (present_userId)
      list.add(userId);

    boolean present_userName = true && (isSetUserName());
    list.add(present_userName);
    if (present_userName)
      list.add(userName);

    boolean present_userPasswd = true && (isSetUserPasswd());
    list.add(present_userPasswd);
    if (present_userPasswd)
      list.add(userPasswd);

    boolean present_userDescription = true && (isSetUserDescription());
    list.add(present_userDescription);
    if (present_userDescription)
      list.add(userDescription);

    boolean present_userTag = true && (isSetUserTag());
    list.add(present_userTag);
    if (present_userTag)
      list.add(userTag);

    return list.hashCode();
  }

  @Override
  public int compareTo(AccountsInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUserId()).compareTo(other.isSetUserId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userId, other.userId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUserName()).compareTo(other.isSetUserName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userName, other.userName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUserPasswd()).compareTo(other.isSetUserPasswd());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserPasswd()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userPasswd, other.userPasswd);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUserDescription()).compareTo(other.isSetUserDescription());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserDescription()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userDescription, other.userDescription);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUserTag()).compareTo(other.isSetUserTag());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserTag()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userTag, other.userTag);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("AccountsInfo(");
    boolean first = true;

    if (isSetUserId()) {
      sb.append("userId:");
      sb.append(this.userId);
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("userName:");
    if (this.userName == null) {
      sb.append("null");
    } else {
      sb.append(this.userName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("userPasswd:");
    if (this.userPasswd == null) {
      sb.append("null");
    } else {
      sb.append(this.userPasswd);
    }
    first = false;
    if (isSetUserDescription()) {
      if (!first) sb.append(", ");
      sb.append("userDescription:");
      if (this.userDescription == null) {
        sb.append("null");
      } else {
        sb.append(this.userDescription);
      }
      first = false;
    }
    if (isSetUserTag()) {
      if (!first) sb.append(", ");
      sb.append("userTag:");
      if (this.userTag == null) {
        sb.append("null");
      } else {
        sb.append(this.userTag);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (userName == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'userName' was not present! Struct: " + toString());
    }
    if (userPasswd == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'userPasswd' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AccountsInfoStandardSchemeFactory implements SchemeFactory {
    public AccountsInfoStandardScheme getScheme() {
      return new AccountsInfoStandardScheme();
    }
  }

  private static class AccountsInfoStandardScheme extends StandardScheme<AccountsInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AccountsInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.userId = iprot.readI64();
              struct.setUserIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userName = iprot.readString();
              struct.setUserNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // USER_PASSWD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userPasswd = iprot.readString();
              struct.setUserPasswdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // USER_DESCRIPTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userDescription = iprot.readString();
              struct.setUserDescriptionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // USER_TAG
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.userTag = new HashMap<Integer,Double>(2*_map0.size);
                int _key1;
                double _val2;
                for (int _i3 = 0; _i3 < _map0.size; ++_i3)
                {
                  _key1 = iprot.readI32();
                  _val2 = iprot.readDouble();
                  struct.userTag.put(_key1, _val2);
                }
                iprot.readMapEnd();
              }
              struct.setUserTagIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, AccountsInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetUserId()) {
        oprot.writeFieldBegin(USER_ID_FIELD_DESC);
        oprot.writeI64(struct.userId);
        oprot.writeFieldEnd();
      }
      if (struct.userName != null) {
        oprot.writeFieldBegin(USER_NAME_FIELD_DESC);
        oprot.writeString(struct.userName);
        oprot.writeFieldEnd();
      }
      if (struct.userPasswd != null) {
        oprot.writeFieldBegin(USER_PASSWD_FIELD_DESC);
        oprot.writeString(struct.userPasswd);
        oprot.writeFieldEnd();
      }
      if (struct.userDescription != null) {
        if (struct.isSetUserDescription()) {
          oprot.writeFieldBegin(USER_DESCRIPTION_FIELD_DESC);
          oprot.writeString(struct.userDescription);
          oprot.writeFieldEnd();
        }
      }
      if (struct.userTag != null) {
        if (struct.isSetUserTag()) {
          oprot.writeFieldBegin(USER_TAG_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.DOUBLE, struct.userTag.size()));
            for (Map.Entry<Integer, Double> _iter4 : struct.userTag.entrySet())
            {
              oprot.writeI32(_iter4.getKey());
              oprot.writeDouble(_iter4.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AccountsInfoTupleSchemeFactory implements SchemeFactory {
    public AccountsInfoTupleScheme getScheme() {
      return new AccountsInfoTupleScheme();
    }
  }

  private static class AccountsInfoTupleScheme extends TupleScheme<AccountsInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AccountsInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.userName);
      oprot.writeString(struct.userPasswd);
      BitSet optionals = new BitSet();
      if (struct.isSetUserId()) {
        optionals.set(0);
      }
      if (struct.isSetUserDescription()) {
        optionals.set(1);
      }
      if (struct.isSetUserTag()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetUserId()) {
        oprot.writeI64(struct.userId);
      }
      if (struct.isSetUserDescription()) {
        oprot.writeString(struct.userDescription);
      }
      if (struct.isSetUserTag()) {
        {
          oprot.writeI32(struct.userTag.size());
          for (Map.Entry<Integer, Double> _iter5 : struct.userTag.entrySet())
          {
            oprot.writeI32(_iter5.getKey());
            oprot.writeDouble(_iter5.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AccountsInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.userName = iprot.readString();
      struct.setUserNameIsSet(true);
      struct.userPasswd = iprot.readString();
      struct.setUserPasswdIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.userId = iprot.readI64();
        struct.setUserIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.userDescription = iprot.readString();
        struct.setUserDescriptionIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map6 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.DOUBLE, iprot.readI32());
          struct.userTag = new HashMap<Integer,Double>(2*_map6.size);
          int _key7;
          double _val8;
          for (int _i9 = 0; _i9 < _map6.size; ++_i9)
          {
            _key7 = iprot.readI32();
            _val8 = iprot.readDouble();
            struct.userTag.put(_key7, _val8);
          }
        }
        struct.setUserTagIsSet(true);
      }
    }
  }

}

