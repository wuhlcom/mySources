package com.zhilutec.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration("master")
@ConfigurationProperties(prefix="spring.datasource")
@PropertySource("classpath:config/master.properties")
public class DruidMasterProperties extends DruidPublicProperties {
}
