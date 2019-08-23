package com.zhilutec.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.WebStatFilter;
import com.zhilutec.properties.DruidMasterProperties;
import com.zhilutec.properties.DruidPublicProperties;
import com.zhilutec.properties.DruidSlaveProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;


import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collections;

// Druid连接池的自动配置类
@Configuration
// @Import({PropertiesConfig.class})
//@Configuration生效条件1，必须存在DruidDataSource类
@ConditionalOnClass(DruidDataSource.class)
//@Configuration生效条件2
//spring.datasource.active=druid
//配置文件中DSConfig.DS_PREFIX为前缀，DSConfig.DS_ACTIVE为value,其值为DSConfig.DRUID，
// 此条件返回true则@Configuration生效，这里的作用是是否启用alibaba的druid数据库连接池插件
@ConditionalOnProperty(prefix = DSConfig.DS_PREFIX, value = DSConfig.DS_ACTIVE, havingValue = DSConfig.DRUID)
public class DruidAutoConfig implements DSConfig {
    // Logger logger = LoggerFactory.getLogger(this.getClass());


    // @Bean(name = DB_MASTER)
    @Bean(name = DB_MASTER, initMethod = "init", destroyMethod = "close")
    public DataSource dataSourceMaster(DruidMasterProperties masterProperties) throws SQLException {
        // logger.debug("master properties: {}", masterProperties.toString());
        DruidDataSource dds = new DruidDataSource();
        dds.setDriverClassName(masterProperties.getDriverClassName());
        dds.setUrl(masterProperties.getUrl());
        dds.setUsername(masterProperties.getUsername());
        dds.setPassword(masterProperties.getPassword());
        // dds.setInitialSize(masterProperties.getInitialSize());
        // dds.setMinIdle(masterProperties.getMinIdle());
        // dds.setMaxActive(masterProperties.getMaxActive());
        // dds.setMaxWait(masterProperties.getMaxWait());
        // dds.setTimeBetweenEvictionRunsMillis(masterProperties.getTimeBetweenEvictionRunsMillis());
        // dds.setMinEvictableIdleTimeMillis(masterProperties.getMinEvictableIdleTimeMillis());
        // dds.setValidationQuery(masterProperties.getValidationQuery());
        // dds.setTestOnBorrow(masterProperties.getTestOnBorrow());
        // dds.setTestWhileIdle(masterProperties.getTestWhileIdle());
        // dds.setTestOnReturn(masterProperties.getTestOnReturn());
        // dds.setPoolPreparedStatements(masterProperties.getPoolPreparedStatements());
        // dds.setMaxPoolPreparedStatementPerConnectionSize(masterProperties.getMaxPoolPreparedStatementPerConnectionSize());
        dds.setFilters(masterProperties.getFilters());
        return dds;

    }

    @Bean(name = DB_SLAVE, initMethod = "init", destroyMethod = "close")
    // @Bean(name = DB_SLAVE)
    public DataSource dataSourceSlave(DruidSlaveProperties slaveProperties) throws SQLException {
        // logger.debug("slave properties: {}", slaveProperties.toString());
        DruidDataSource dds = new DruidDataSource();
        dds.setDriverClassName(slaveProperties.getDriverClassName());
        dds.setUrl(slaveProperties.getUrl());
        dds.setUsername(slaveProperties.getUsername());
        dds.setPassword(slaveProperties.getPassword());
        // dds.setInitialSize(slaveProperties.getInitialSize());
        // dds.setMinIdle(slaveProperties.getMinIdle());
        // dds.setMaxActive(slaveProperties.getMaxActive());
        // dds.setMaxWait(slaveProperties.getMaxWait());
        // dds.setTimeBetweenEvictionRunsMillis(slaveProperties.getTimeBetweenEvictionRunsMillis());
        // dds.setMinEvictableIdleTimeMillis(slaveProperties.getMinEvictableIdleTimeMillis());
        // dds.setValidationQuery(slaveProperties.getValidationQuery());
        // dds.setTestOnBorrow(slaveProperties.getTestOnBorrow());
        // dds.setTestWhileIdle(slaveProperties.getTestWhileIdle());
        // dds.setTestOnReturn(slaveProperties.getTestOnReturn());
        // dds.setPoolPreparedStatements(slaveProperties.getPoolPreparedStatements());
        // dds.setMaxPoolPreparedStatementPerConnectionSize(slaveProperties.getMaxPoolPreparedStatementPerConnectionSize());
        // dds.setFilters(slaveProperties.getFilters());
        return dds;

    }

    @Bean
    public ServletRegistrationBean
    druidServletRegistrationBean(Environment env) {
        // String username = env.getStringValue(DSConfig.DRUID_MONITOR_USERNAME);
        // String password = env.getStringValue(DSConfig.DRUID_MONITOR_PASSWORD);
        String username = env.getProperty(DSConfig.DRUID_MONITOR_USERNAME);
        String password = env.getProperty(DSConfig.DRUID_MONITOR_PASSWORD);
        return new ServletRegistrationBean(new DruidStatViewServlet(username, password), DSConfig.DRUID_MONITOR_URL);
    }

    @Bean
    public FilterRegistrationBean
    druidFilterRegistrationBean() {
        WebStatFilter wsf = new WebStatFilter();
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(wsf);
        filterRegistrationBean.setUrlPatterns(Arrays.asList(DSConfig.DRUID_FILTER_URL));
        filterRegistrationBean.setInitParameters(Collections.singletonMap("exclusions", DSConfig.DRUID_FILTER_EXCLUSIONS));
        return filterRegistrationBean;

    }
}