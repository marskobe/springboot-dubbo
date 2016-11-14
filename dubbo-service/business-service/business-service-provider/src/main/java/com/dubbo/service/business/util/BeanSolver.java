package com.dubbo.service.business.util;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.*;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

public class BeanSolver extends BeanUtils {
  private BeanSolver() {
  }

  public static void copyProperties(Object dest, Object orig) throws IllegalAccessException, InvocationTargetException {
    BeanUtils.copyProperties(dest, orig);
  }

  static {
    ConvertUtils.register(new SqlDateConverter((Object)null), Date.class);
    ConvertUtils.register(new SqlTimestampConverter((Object)null), Timestamp.class);
    ConvertUtils.register(new DateConverter((Object)null), java.util.Date.class);
    ConvertUtils.register(new LongConverter((Object)null), Long.class);
    ConvertUtils.register(new ShortConverter((Object)null), Short.class);
    ConvertUtils.register(new IntegerConverter((Object)null), Integer.class);
    ConvertUtils.register(new DoubleConverter((Object)null), Double.class);
    ConvertUtils.register(new BigDecimalConverter((Object)null), BigDecimal.class);
    ConvertUtils.register(new StringConverter((Object)null), String.class);
  }
}
