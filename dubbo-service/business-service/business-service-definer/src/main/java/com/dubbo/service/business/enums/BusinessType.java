package com.dubbo.service.business.enums;

/**
 * Created by wzp on 16/11/4.
 */
public enum BusinessType {
  USER(1), IP(2);

  private int id;

  private BusinessType(int id) {
    this.id = id;
  }

  public static BusinessType idOf(int id) {
    for (BusinessType businessType : values()) {
      if (businessType.getId() == id) {
        return businessType;
      }
    }

    throw new EnumException("Could not found this id.");
  }

  public static BusinessType nameOf(String name) {
    for (BusinessType businessType : values()) {
      if (businessType.getName().equalsIgnoreCase(name)) {
        return businessType;
      }
    }
    throw new EnumException("Could not found this name.");
  }

  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name();
  }
}
