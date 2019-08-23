package com.mycode;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.mycode.mapper")
public class MybatisPlusApp {
    private static final Logger logger = LoggerFactory.getLogger(MybatisPlusApp.class);

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusApp.class, args);
        logger.info("========================启动完毕========================");
    }

}