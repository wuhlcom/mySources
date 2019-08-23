package com.zhilutec;

import brave.sampler.Sampler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SpringCloudHiZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudHiZipkinApplication.class, args);
	}

	// @Value("${server.port}")
	// String port;
    //
	// @RequestMapping("/hi")
	// public String home(@RequestParam(value = "name", defaultValue = "zhilutec") String name) {
	// 	return "Hi " + name + " ,I am from port:" + port;
	// }

	private static final Logger LOG = Logger.getLogger(SpringCloudHiZipkinApplication.class.getName());

	@Autowired
	private RestTemplate restTemplate;

	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

	@RequestMapping("/hi")
	public String callHome(){
		LOG.log(Level.INFO, "calling trace service-hi  ");
		return restTemplate.getForObject("http://localhost:5509/miya", String.class);
	}

	@RequestMapping("/info")
	public String info(){
		LOG.log(Level.INFO, "calling trace service-hi ");

		return "i'm service-hi";

	}

	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}

}

