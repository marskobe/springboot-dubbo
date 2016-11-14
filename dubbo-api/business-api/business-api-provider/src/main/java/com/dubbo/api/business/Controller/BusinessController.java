package com.dubbo.api.business.Controller;

import com.dubbo.api.business.BusinessVo;
import com.dubbo.api.business.util.BeanSolver;
import com.dubbo.service.business.BusinessConstants;
import com.dubbo.service.business.dto.BusinessDto;
import com.dubbo.service.business.service.BusinessService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wzp on 16/11/14.
 */
@RestController
@Slf4j
@RequestMapping(value = BusinessConstants.BUSINESSES_PATH)
public class BusinessController {

  @Autowired
  BusinessService businessService;

  @RequestMapping(value = BusinessConstants.ID_PATH)
  public BusinessVo findById(@PathVariable("id") Integer id) {
    BusinessDto dto = businessService.findById(id);
    BusinessVo vo = new BusinessVo();
    if (dto != null) {
      try {
        BeanSolver.copyProperties(vo, dto);
      } catch (Exception e) {
        log.error(e.getMessage(), e);
      }
    }
    return vo;
  }
}
