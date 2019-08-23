package com.zhilutec.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {

    @Test
    public void demo1(){
        UserService userService=new UserServiceImpl();
        userService.addUser();
    }


    @Test
    public void demo2(){
        //获取容器
        String xmlPath= "com/zhilutec/ioc/beans.xml";
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext(xmlPath);
        //获得内容,创建对象不需要自己new
        UserService userService= (UserService) applicationContext.getBean("userServiceId");
        userService.addUser();
    }


}
