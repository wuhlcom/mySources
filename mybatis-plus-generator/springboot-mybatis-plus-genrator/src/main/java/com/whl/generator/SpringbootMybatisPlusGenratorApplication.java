package com.whl.generator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.whl.generator.dao.*")
public class SpringbootMybatisPlusGenratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisPlusGenratorApplication.class, args);
    }
}
