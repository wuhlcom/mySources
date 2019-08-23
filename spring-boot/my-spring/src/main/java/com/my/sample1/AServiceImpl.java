package com.my.sample1;

import org.springframework.stereotype.Service;

// 具体两个实现类
@Service("aService")
public class AServiceImpl implements ServiceInterface {

    @Override
    public void method() {
        System.out.println("the impl is A");
    }
    @Override
    public ServiceType getType(){
        return ServiceType.A;
    }

    @Override
    public String toString() {
        return "A";
    }
}