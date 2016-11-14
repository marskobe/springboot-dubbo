package com.dubbo.service.business;

import com.alibaba.dubbo.container.Main;
import org.mybatis.spring.annotation.MapperScan;
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
@ComponentScan(basePackages = "com.dubbo.service.business")
@MapperScan(basePackages = "com.dubbo.service.business.dao")
@ImportResource("classpath:dubbo-provider.xml")
public class BusinessServiceApplication {
  public static void main(String[] args) {
    ApplicationContext ctx = new SpringApplicationBuilder()
        .sources(BusinessServiceApplication.class)
        .web(false)
        .run(args);
    Main.main(args);
  }
}
