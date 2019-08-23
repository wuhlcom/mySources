package com.ann.log;

import java.lang.annotation.*;

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface OperatorLog {

    String title() default "";

    String value() default "";


    String id() default  "";

    //class类型
    Class<?> testCase() default Void.class;
}
