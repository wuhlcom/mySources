package com.zhilutec.controller;

import com.alibaba.druid.pool.DruidDataSource;
import com.zhilutec.util.SpringUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bean")
public class BeanController {

    @RequestMapping("/get")
    public Object get() {
        DruidDataSource druidDataSource =(DruidDataSource) SpringUtil.getBean("db-master");
        System.out.println(druidDataSource.getUrl());
        return druidDataSource;
    }
}
