/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.freeb.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum SearchOrder implements TEnum {
  PRICE_DESC(0),
  PRICE_ASC(1),
  SIMILARITY(2),
  SALES(3),
  UPDATE_TIME(4);

  private final int value;

  private SearchOrder(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static SearchOrder findByValue(int value) { 
    switch (value) {
      case 0:
        return PRICE_DESC;
      case 1:
        return PRICE_ASC;
      case 2:
        return SIMILARITY;
      case 3:
        return SALES;
      case 4:
        return UPDATE_TIME;
      default:
        return null;
    }
  }
}
