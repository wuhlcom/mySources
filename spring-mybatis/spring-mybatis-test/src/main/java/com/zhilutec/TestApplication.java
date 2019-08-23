package com.zhilutec;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

//去除默认的自动配置数据源
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan("com.zhilutec")
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}

