package com.dubbo.service.business.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by xiaona on 2016/11/3.
 */
@Data
@NoArgsConstructor
public class BusinessDto implements Serializable {
  private Integer id;
  private String name;
  private Integer age;

  public BusinessDto(Integer id, String name, Integer age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }
}
