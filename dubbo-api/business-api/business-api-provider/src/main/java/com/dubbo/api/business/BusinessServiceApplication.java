package com.dubbo.api.business;

import com.alibaba.dubbo.container.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by wzp on 15/11/22.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.dubbo.api.business")
@ImportResource("classpath:dubbo-consumer.xml")
public class BusinessServiceApplication {
  public static void main(String[] args) {
    SpringApplication.run(BusinessServiceApplication.class,args);
  }
}
