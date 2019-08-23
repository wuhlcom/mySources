package com.zhilutec;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
@EnableHystrixDashboard
@EnableCircuitBreaker
@EnableTurbine
public class SpringCloudTurbineApplication {
	// @Bean
	// public ServletRegistrationBean getServlet(){
	// 	HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
	// 	ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
	// 	registrationBean.setLoadOnStartup(1);
	// 	registrationBean.addUrlMappings("/actuator/hystrix.stream");
	// 	registrationBean.setName("HystrixMetricsStreamServlet");
	// 	return registrationBean;
	// }

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudTurbineApplication.class, args);
	}

}

