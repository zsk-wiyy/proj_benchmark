/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2021-10-26")
public class UserFull implements org.apache.thrift.TBase<UserFull, UserFull._Fields>, java.io.Serializable, Cloneable, Comparable<UserFull> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UserFull");

  private static final org.apache.thrift.protocol.TField UUID_FIELD_DESC = new org.apache.thrift.protocol.TField("uuid", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SEX_FIELD_DESC = new org.apache.thrift.protocol.TField("sex", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField EMAIL_FIELD_DESC = new org.apache.thrift.protocol.TField("email", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField MOBILE_FIELD_DESC = new org.apache.thrift.protocol.TField("mobile", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField PROFILE_FIELD_DESC = new org.apache.thrift.protocol.TField("profile", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I32, (short)7);
  private static final org.apache.thrift.protocol.TField PERMISSIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("permissions", org.apache.thrift.protocol.TType.LIST, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new UserFullStandardSchemeFactory());
    schemes.put(TupleScheme.class, new UserFullTupleSchemeFactory());
  }

  public long uuid; // required
  public String name; // required
  public int sex; // required
  public String email; // required
  public String mobile; // required
  public String profile; // required
  public int status; // required
  public List<Long> permissions; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    UUID((short)1, "uuid"),
    NAME((short)2, "name"),
    SEX((short)3, "sex"),
    EMAIL((short)4, "email"),
    MOBILE((short)5, "mobile"),
    PROFILE((short)6, "profile"),
    STATUS((short)7, "status"),
    PERMISSIONS((short)8, "permissions");

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
        case 1: // UUID
          return UUID;
        case 2: // NAME
          return NAME;
        case 3: // SEX
          return SEX;
        case 4: // EMAIL
          return EMAIL;
        case 5: // MOBILE
          return MOBILE;
        case 6: // PROFILE
          return PROFILE;
        case 7: // STATUS
          return STATUS;
        case 8: // PERMISSIONS
          return PERMISSIONS;
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
  private static final int __UUID_ISSET_ID = 0;
  private static final int __SEX_ISSET_ID = 1;
  private static final int __STATUS_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.UUID, new org.apache.thrift.meta_data.FieldMetaData("uuid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SEX, new org.apache.thrift.meta_data.FieldMetaData("sex", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.EMAIL, new org.apache.thrift.meta_data.FieldMetaData("email", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MOBILE, new org.apache.thrift.meta_data.FieldMetaData("mobile", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PROFILE, new org.apache.thrift.meta_data.FieldMetaData("profile", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PERMISSIONS, new org.apache.thrift.meta_data.FieldMetaData("permissions", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UserFull.class, metaDataMap);
  }

  public UserFull() {
  }

  public UserFull(
    long uuid,
    String name,
    int sex,
    String email,
    String mobile,
    String profile,
    int status,
    List<Long> permissions)
  {
    this();
    this.uuid = uuid;
    setUuidIsSet(true);
    this.name = name;
    this.sex = sex;
    setSexIsSet(true);
    this.email = email;
    this.mobile = mobile;
    this.profile = profile;
    this.status = status;
    setStatusIsSet(true);
    this.permissions = permissions;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UserFull(UserFull other) {
    __isset_bitfield = other.__isset_bitfield;
    this.uuid = other.uuid;
    if (other.isSetName()) {
      this.name = other.name;
    }
    this.sex = other.sex;
    if (other.isSetEmail()) {
      this.email = other.email;
    }
    if (other.isSetMobile()) {
      this.mobile = other.mobile;
    }
    if (other.isSetProfile()) {
      this.profile = other.profile;
    }
    this.status = other.status;
    if (other.isSetPermissions()) {
      List<Long> __this__permissions = new ArrayList<Long>(other.permissions);
      this.permissions = __this__permissions;
    }
  }

  public UserFull deepCopy() {
    return new UserFull(this);
  }

  @Override
  public void clear() {
    setUuidIsSet(false);
    this.uuid = 0;
    this.name = null;
    setSexIsSet(false);
    this.sex = 0;
    this.email = null;
    this.mobile = null;
    this.profile = null;
    setStatusIsSet(false);
    this.status = 0;
    this.permissions = null;
  }

  public long getUuid() {
    return this.uuid;
  }

  public UserFull setUuid(long uuid) {
    this.uuid = uuid;
    setUuidIsSet(true);
    return this;
  }

  public void unsetUuid() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __UUID_ISSET_ID);
  }

  /** Returns true if field uuid is set (has been assigned a value) and false otherwise */
  public boolean isSetUuid() {
    return EncodingUtils.testBit(__isset_bitfield, __UUID_ISSET_ID);
  }

  public void setUuidIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __UUID_ISSET_ID, value);
  }

  public String getName() {
    return this.name;
  }

  public UserFull setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public int getSex() {
    return this.sex;
  }

  public UserFull setSex(int sex) {
    this.sex = sex;
    setSexIsSet(true);
    return this;
  }

  public void unsetSex() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SEX_ISSET_ID);
  }

  /** Returns true if field sex is set (has been assigned a value) and false otherwise */
  public boolean isSetSex() {
    return EncodingUtils.testBit(__isset_bitfield, __SEX_ISSET_ID);
  }

  public void setSexIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SEX_ISSET_ID, value);
  }

  public String getEmail() {
    return this.email;
  }

  public UserFull setEmail(String email) {
    this.email = email;
    return this;
  }

  public void unsetEmail() {
    this.email = null;
  }

  /** Returns true if field email is set (has been assigned a value) and false otherwise */
  public boolean isSetEmail() {
    return this.email != null;
  }

  public void setEmailIsSet(boolean value) {
    if (!value) {
      this.email = null;
    }
  }

  public String getMobile() {
    return this.mobile;
  }

  public UserFull setMobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

  public void unsetMobile() {
    this.mobile = null;
  }

  /** Returns true if field mobile is set (has been assigned a value) and false otherwise */
  public boolean isSetMobile() {
    return this.mobile != null;
  }

  public void setMobileIsSet(boolean value) {
    if (!value) {
      this.mobile = null;
    }
  }

  public String getProfile() {
    return this.profile;
  }

  public UserFull setProfile(String profile) {
    this.profile = profile;
    return this;
  }

  public void unsetProfile() {
    this.profile = null;
  }

  /** Returns true if field profile is set (has been assigned a value) and false otherwise */
  public boolean isSetProfile() {
    return this.profile != null;
  }

  public void setProfileIsSet(boolean value) {
    if (!value) {
      this.profile = null;
    }
  }

  public int getStatus() {
    return this.status;
  }

  public UserFull setStatus(int status) {
    this.status = status;
    setStatusIsSet(true);
    return this;
  }

  public void unsetStatus() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STATUS_ISSET_ID);
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return EncodingUtils.testBit(__isset_bitfield, __STATUS_ISSET_ID);
  }

  public void setStatusIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STATUS_ISSET_ID, value);
  }

  public int getPermissionsSize() {
    return (this.permissions == null) ? 0 : this.permissions.size();
  }

  public java.util.Iterator<Long> getPermissionsIterator() {
    return (this.permissions == null) ? null : this.permissions.iterator();
  }

  public void addToPermissions(long elem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<Long>();
    }
    this.permissions.add(elem);
  }

  public List<Long> getPermissions() {
    return this.permissions;
  }

  public UserFull setPermissions(List<Long> permissions) {
    this.permissions = permissions;
    return this;
  }

  public void unsetPermissions() {
    this.permissions = null;
  }

  /** Returns true if field permissions is set (has been assigned a value) and false otherwise */
  public boolean isSetPermissions() {
    return this.permissions != null;
  }

  public void setPermissionsIsSet(boolean value) {
    if (!value) {
      this.permissions = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case UUID:
      if (value == null) {
        unsetUuid();
      } else {
        setUuid((Long)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case SEX:
      if (value == null) {
        unsetSex();
      } else {
        setSex((Integer)value);
      }
      break;

    case EMAIL:
      if (value == null) {
        unsetEmail();
      } else {
        setEmail((String)value);
      }
      break;

    case MOBILE:
      if (value == null) {
        unsetMobile();
      } else {
        setMobile((String)value);
      }
      break;

    case PROFILE:
      if (value == null) {
        unsetProfile();
      } else {
        setProfile((String)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((Integer)value);
      }
      break;

    case PERMISSIONS:
      if (value == null) {
        unsetPermissions();
      } else {
        setPermissions((List<Long>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case UUID:
      return getUuid();

    case NAME:
      return getName();

    case SEX:
      return getSex();

    case EMAIL:
      return getEmail();

    case MOBILE:
      return getMobile();

    case PROFILE:
      return getProfile();

    case STATUS:
      return getStatus();

    case PERMISSIONS:
      return getPermissions();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case UUID:
      return isSetUuid();
    case NAME:
      return isSetName();
    case SEX:
      return isSetSex();
    case EMAIL:
      return isSetEmail();
    case MOBILE:
      return isSetMobile();
    case PROFILE:
      return isSetProfile();
    case STATUS:
      return isSetStatus();
    case PERMISSIONS:
      return isSetPermissions();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof UserFull)
      return this.equals((UserFull)that);
    return false;
  }

  public boolean equals(UserFull that) {
    if (that == null)
      return false;

    boolean this_present_uuid = true;
    boolean that_present_uuid = true;
    if (this_present_uuid || that_present_uuid) {
      if (!(this_present_uuid && that_present_uuid))
        return false;
      if (this.uuid != that.uuid)
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_sex = true;
    boolean that_present_sex = true;
    if (this_present_sex || that_present_sex) {
      if (!(this_present_sex && that_present_sex))
        return false;
      if (this.sex != that.sex)
        return false;
    }

    boolean this_present_email = true && this.isSetEmail();
    boolean that_present_email = true && that.isSetEmail();
    if (this_present_email || that_present_email) {
      if (!(this_present_email && that_present_email))
        return false;
      if (!this.email.equals(that.email))
        return false;
    }

    boolean this_present_mobile = true && this.isSetMobile();
    boolean that_present_mobile = true && that.isSetMobile();
    if (this_present_mobile || that_present_mobile) {
      if (!(this_present_mobile && that_present_mobile))
        return false;
      if (!this.mobile.equals(that.mobile))
        return false;
    }

    boolean this_present_profile = true && this.isSetProfile();
    boolean that_present_profile = true && that.isSetProfile();
    if (this_present_profile || that_present_profile) {
      if (!(this_present_profile && that_present_profile))
        return false;
      if (!this.profile.equals(that.profile))
        return false;
    }

    boolean this_present_status = true;
    boolean that_present_status = true;
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (this.status != that.status)
        return false;
    }

    boolean this_present_permissions = true && this.isSetPermissions();
    boolean that_present_permissions = true && that.isSetPermissions();
    if (this_present_permissions || that_present_permissions) {
      if (!(this_present_permissions && that_present_permissions))
        return false;
      if (!this.permissions.equals(that.permissions))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_uuid = true;
    list.add(present_uuid);
    if (present_uuid)
      list.add(uuid);

    boolean present_name = true && (isSetName());
    list.add(present_name);
    if (present_name)
      list.add(name);

    boolean present_sex = true;
    list.add(present_sex);
    if (present_sex)
      list.add(sex);

    boolean present_email = true && (isSetEmail());
    list.add(present_email);
    if (present_email)
      list.add(email);

    boolean present_mobile = true && (isSetMobile());
    list.add(present_mobile);
    if (present_mobile)
      list.add(mobile);

    boolean present_profile = true && (isSetProfile());
    list.add(present_profile);
    if (present_profile)
      list.add(profile);

    boolean present_status = true;
    list.add(present_status);
    if (present_status)
      list.add(status);

    boolean present_permissions = true && (isSetPermissions());
    list.add(present_permissions);
    if (present_permissions)
      list.add(permissions);

    return list.hashCode();
  }

  @Override
  public int compareTo(UserFull other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUuid()).compareTo(other.isSetUuid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUuid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.uuid, other.uuid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSex()).compareTo(other.isSetSex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sex, other.sex);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEmail()).compareTo(other.isSetEmail());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEmail()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.email, other.email);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMobile()).compareTo(other.isSetMobile());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMobile()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mobile, other.mobile);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetProfile()).compareTo(other.isSetProfile());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProfile()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.profile, other.profile);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPermissions()).compareTo(other.isSetPermissions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPermissions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.permissions, other.permissions);
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
    StringBuilder sb = new StringBuilder("UserFull(");
    boolean first = true;

    sb.append("uuid:");
    sb.append(this.uuid);
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sex:");
    sb.append(this.sex);
    first = false;
    if (!first) sb.append(", ");
    sb.append("email:");
    if (this.email == null) {
      sb.append("null");
    } else {
      sb.append(this.email);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("mobile:");
    if (this.mobile == null) {
      sb.append("null");
    } else {
      sb.append(this.mobile);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("profile:");
    if (this.profile == null) {
      sb.append("null");
    } else {
      sb.append(this.profile);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("status:");
    sb.append(this.status);
    first = false;
    if (!first) sb.append(", ");
    sb.append("permissions:");
    if (this.permissions == null) {
      sb.append("null");
    } else {
      sb.append(this.permissions);
    }
    first = false;
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class UserFullStandardSchemeFactory implements SchemeFactory {
    public UserFullStandardScheme getScheme() {
      return new UserFullStandardScheme();
    }
  }

  private static class UserFullStandardScheme extends StandardScheme<UserFull> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UserFull struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // UUID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.uuid = iprot.readI64();
              struct.setUuidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SEX
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.sex = iprot.readI32();
              struct.setSexIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // EMAIL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.email = iprot.readString();
              struct.setEmailIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // MOBILE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.mobile = iprot.readString();
              struct.setMobileIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // PROFILE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.profile = iprot.readString();
              struct.setProfileIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.status = iprot.readI32();
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // PERMISSIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.permissions = new ArrayList<Long>(_list0.size);
                long _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readI64();
                  struct.permissions.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setPermissionsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, UserFull struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(UUID_FIELD_DESC);
      oprot.writeI64(struct.uuid);
      oprot.writeFieldEnd();
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SEX_FIELD_DESC);
      oprot.writeI32(struct.sex);
      oprot.writeFieldEnd();
      if (struct.email != null) {
        oprot.writeFieldBegin(EMAIL_FIELD_DESC);
        oprot.writeString(struct.email);
        oprot.writeFieldEnd();
      }
      if (struct.mobile != null) {
        oprot.writeFieldBegin(MOBILE_FIELD_DESC);
        oprot.writeString(struct.mobile);
        oprot.writeFieldEnd();
      }
      if (struct.profile != null) {
        oprot.writeFieldBegin(PROFILE_FIELD_DESC);
        oprot.writeString(struct.profile);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(STATUS_FIELD_DESC);
      oprot.writeI32(struct.status);
      oprot.writeFieldEnd();
      if (struct.permissions != null) {
        oprot.writeFieldBegin(PERMISSIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, struct.permissions.size()));
          for (long _iter3 : struct.permissions)
          {
            oprot.writeI64(_iter3);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UserFullTupleSchemeFactory implements SchemeFactory {
    public UserFullTupleScheme getScheme() {
      return new UserFullTupleScheme();
    }
  }

  private static class UserFullTupleScheme extends TupleScheme<UserFull> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, UserFull struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUuid()) {
        optionals.set(0);
      }
      if (struct.isSetName()) {
        optionals.set(1);
      }
      if (struct.isSetSex()) {
        optionals.set(2);
      }
      if (struct.isSetEmail()) {
        optionals.set(3);
      }
      if (struct.isSetMobile()) {
        optionals.set(4);
      }
      if (struct.isSetProfile()) {
        optionals.set(5);
      }
      if (struct.isSetStatus()) {
        optionals.set(6);
      }
      if (struct.isSetPermissions()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetUuid()) {
        oprot.writeI64(struct.uuid);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetSex()) {
        oprot.writeI32(struct.sex);
      }
      if (struct.isSetEmail()) {
        oprot.writeString(struct.email);
      }
      if (struct.isSetMobile()) {
        oprot.writeString(struct.mobile);
      }
      if (struct.isSetProfile()) {
        oprot.writeString(struct.profile);
      }
      if (struct.isSetStatus()) {
        oprot.writeI32(struct.status);
      }
      if (struct.isSetPermissions()) {
        {
          oprot.writeI32(struct.permissions.size());
          for (long _iter4 : struct.permissions)
          {
            oprot.writeI64(_iter4);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, UserFull struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.uuid = iprot.readI64();
        struct.setUuidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.sex = iprot.readI32();
        struct.setSexIsSet(true);
      }
      if (incoming.get(3)) {
        struct.email = iprot.readString();
        struct.setEmailIsSet(true);
      }
      if (incoming.get(4)) {
        struct.mobile = iprot.readString();
        struct.setMobileIsSet(true);
      }
      if (incoming.get(5)) {
        struct.profile = iprot.readString();
        struct.setProfileIsSet(true);
      }
      if (incoming.get(6)) {
        struct.status = iprot.readI32();
        struct.setStatusIsSet(true);
      }
      if (incoming.get(7)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, iprot.readI32());
          struct.permissions = new ArrayList<Long>(_list5.size);
          long _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = iprot.readI64();
            struct.permissions.add(_elem6);
          }
        }
        struct.setPermissionsIsSet(true);
      }
    }
  }

}

