package com.whl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.whl.generator.dao.*")
public class MybatisPlusGeneratorApp {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusGeneratorApp.class, args);
    }
}
