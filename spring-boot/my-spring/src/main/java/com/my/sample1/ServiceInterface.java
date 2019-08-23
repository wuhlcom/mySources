package com.my.sample1;

//一个接口多个实现类怎么根据需要动态实例化其中一个类
public interface ServiceInterface {
    public void method();
    public  ServiceType getType();
}