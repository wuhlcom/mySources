package com.zhilutec.controller;


import com.zhilutec.common.utils.ConstantUtil;
import com.zhilutec.services.IRedisService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/redis")
@EnableAutoConfiguration
public class RedisController {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    IRedisService redisService;


    @RequestMapping(value = "/get", method = {RequestMethod.GET}, produces = "application/json;charset=UTF-8")
    public String coordinates() {
        logger.info("=====RequestBody:");
        try {
            return redisService.hashGet(ConstantUtil.GW_KEY_PRE, "fastdfs").toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "failed";
        }
    }


}
