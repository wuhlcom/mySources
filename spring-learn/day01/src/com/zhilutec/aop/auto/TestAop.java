package com.zhilutec.aop.auto;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {


    @Test
    public void demo1(){
        //获取容器
        String xmlPath= "com/zhilutec/aop/auto/beans.xml";
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext(xmlPath);
        //获得内容,创建对象不需要自己new
        UserService userService= (UserService) applicationContext.getBean("userServiceId");
        userService.addUser();
    }


}
