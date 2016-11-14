package com.dubbo.service.business.enums;

/**
 * DBException
 */
public class EnumException extends RuntimeException {

  public EnumException() {
  }

  public EnumException(String message) {
    super(message);
  }

  public EnumException(Throwable cause) {
    super(cause);
  }

  public EnumException(String message, Throwable cause) {
    super(message, cause);
  }
}