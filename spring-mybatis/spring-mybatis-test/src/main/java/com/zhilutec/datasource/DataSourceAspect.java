package com.zhilutec.datasource;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(0) //@Order(0) 注解表示在执行sql前就切换数据源
public class DataSourceAspect {

    @Pointcut("execution(* com.zhilutec.dao.user..*.*(..))")
    public void pointCut1() {
    }

    @Pointcut("execution(* com.zhilutec.dao.student..*.*(..))")
    public void pointCut2() {
    }

    @Before(value = "pointCut1()")
    public void setFirstDB(JoinPoint jp) {
        DatabaseContextHolder.setDatabaseType(DatabaseType.first);
    }

    @Before(value = "pointCut2()")
    public void setSecondDB(JoinPoint jp) {
        DatabaseContextHolder.setDatabaseType(DatabaseType.second);
    }

}