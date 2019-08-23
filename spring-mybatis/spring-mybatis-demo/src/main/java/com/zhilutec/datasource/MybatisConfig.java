package com.zhilutec.datasource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

// Mybatis配置类
@Configuration
@MapperScan(basePackages = DSConfig.BASE_PACKAGES)
public class MybatisConfig implements DSConfig {

    // //初始化多个数据源连接对象
    // @Primary
    @Bean
    public DynamicDataSource dynamicDataSource(@Qualifier(DB_MASTER) DataSource master, @Qualifier(DB_SLAVE) DataSource slave) {
        Map<Object, Object> dsMap = new HashMap<>();
        dsMap.put(DB_MASTER, master);
        dsMap.put(DB_MASTER, slave);
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        dynamicDataSource.setDefaultTargetDataSource(master);
        dynamicDataSource.setTargetDataSources(dsMap);
        return dynamicDataSource;
    }

    //开启事务
    @Bean
    public PlatformTransactionManager transactionManager(DynamicDataSource dynamicDataSource) {
        return new DataSourceTransactionManager(dynamicDataSource);

    }

    //mapper映射
    @Bean
    public SqlSessionFactory sqlSessionFactory(DynamicDataSource dynamicDataSource) throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dynamicDataSource);
        // sessionFactory.setMapperLocations(((ResourcePatternResolver) new PathMatchingResourcePatternResolver()).getResources(DSConfig.MAPPER_LOCATIONS));
        return sessionFactory.getObject();
    }
}