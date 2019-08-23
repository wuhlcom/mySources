package com.ehance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class MyEhanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyEhanceApplication.class, args);
	}

}
