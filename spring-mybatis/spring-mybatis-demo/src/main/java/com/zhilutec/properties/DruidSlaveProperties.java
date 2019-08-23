package com.zhilutec.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration("slave")
@ConfigurationProperties(prefix="spring.datasource")
@PropertySource("classpath:config/slave.properties")
public class DruidSlaveProperties extends DruidPublicProperties {
}
