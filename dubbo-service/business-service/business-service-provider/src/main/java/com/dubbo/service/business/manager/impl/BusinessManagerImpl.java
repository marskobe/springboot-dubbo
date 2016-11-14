package com.dubbo.service.business.manager.impl;


import com.dubbo.service.business.dao.BusinessMapper;
import com.dubbo.service.business.entity.Business;
import com.dubbo.service.business.manager.BusinessManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wzp on 16/11/4.
 */
@Slf4j
@Service
public class BusinessManagerImpl implements BusinessManager {

  @Autowired
  BusinessMapper businessMapper;

  @Override
  public Business findById(Integer id) {
    return businessMapper.findById(id);
  }

  @Override
  public List<Business> findAll(Business entity) {
    return businessMapper.findAll();
  }

  @Override
  public Integer save(Business entity) {
    return businessMapper.save(entity);
  }

}
