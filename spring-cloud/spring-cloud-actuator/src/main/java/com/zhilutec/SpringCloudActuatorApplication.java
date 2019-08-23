package com.zhilutec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.endpoint.condition.ConditionalOnEnabledEndpoint;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class SpringCloudActuatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudActuatorApplication.class, args);
	}


	// @Conditional注解，方便程序根据当前环境或者容器情况来动态注入bean
	// 继@Conditional注解后，又基于此注解推出了很多派生注解，
	// 比如@ConditionalOnBean、@ConditionalOnMissingBean、@ConditionalOnExpression、
	// @ConditionalOnClass......动态注入bean变得更方便了
	@Configuration
	static class MyEndpointConfiguration {
		@Bean
		@ConditionalOnMissingBean
		@ConditionalOnEnabledEndpoint
		public MyEndPoint myEndPoint() {
			return new MyEndPoint();
		}
	}

}

