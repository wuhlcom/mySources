package com.zhilutec.fc.module.pub.util.swagger;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER, ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiJsonObject {

    ApiJsonProperty[] value(); //对象属性值

    String name();  //对象名称

    String paramType() default "body";//对象类型
}

