package com.dubbo.service.business.dao;

import com.dubbo.service.business.entity.Business;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by wzp on 16/11/4.
 */
@Mapper
@CacheNamespace
public interface BusinessMapper {
  @Select("select * from business")
  @Results({
      @Result(id = true, property = "id", column = "id"),
      @Result(property = "name", column = "name"),
      @Result(property = "age", column = "age")
  })
  public List<Business> findAll();

  @Select("select * from business where id = #{id}")
  Business findById(@Param("id") Integer id);

  @Insert("insert into business (name, age) values (#{name},#{age})")
  Integer save(Business business);

}
