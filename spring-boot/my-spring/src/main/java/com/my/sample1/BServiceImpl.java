package com.my.sample1;

import org.springframework.stereotype.Service;

@Service("bService")
public class BServiceImpl implements ServiceInterface {

    @Override
    public void method() {
        System.out.println("the impl is B");
    }

    @Override
    public String toString() {
        return "B";
    }
    @Override
    public ServiceType getType(){
        return ServiceType.B;
    }

}