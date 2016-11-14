package com.dubbo.api.business;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by wzp on 16/11/14.
 */
@Data
@NoArgsConstructor
public class BusinessVo {
  private Integer id;
  private String name;
  private Integer age;

  public BusinessVo(Integer id, String name, Integer age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }
}
