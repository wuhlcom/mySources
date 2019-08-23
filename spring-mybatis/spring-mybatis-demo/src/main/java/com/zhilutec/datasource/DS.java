package com.zhilutec.datasource;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
//用户在相关dao或service上使用此注解来切换数据源
public @interface DS {
    String value()  default DSConfig.DB_MASTER;
}
