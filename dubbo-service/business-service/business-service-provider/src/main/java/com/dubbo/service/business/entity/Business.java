package com.dubbo.service.business.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by wzp on 16/11/4.
 */
@Data
@NoArgsConstructor
@Component
public class Business implements Serializable {
  private Integer id;
  private String name;
  private Integer age;

  public Business(Integer id, String name, Integer age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }
}
