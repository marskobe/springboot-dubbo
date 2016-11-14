package com.dubbo.service.business.service;


import com.dubbo.service.business.BusinessConstants;
import com.dubbo.service.business.dto.BusinessDto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by xiaona on 2016/11/3.
 */
public interface BusinessService {
  BusinessDto findById(Integer id);

  List<BusinessDto> findBy(BusinessDto entity);
}
