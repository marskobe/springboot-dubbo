package com.dubbo.service.business.manager;


import com.dubbo.service.business.entity.Business;

import java.util.List;

/**
 * Created by wzp on 16/11/4.
 */
public interface BusinessManager {

  Business findById(Integer id);

  List<Business> findAll(Business entity);

  Integer save(Business entity);

}
