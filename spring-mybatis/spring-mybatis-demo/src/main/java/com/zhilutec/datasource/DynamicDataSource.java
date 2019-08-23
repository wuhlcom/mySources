package com.zhilutec.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;


public class DynamicDataSource extends AbstractRoutingDataSource {
    // private final Logger logger = LoggerFactory.getLogger(this.getClass());

    //获取@DS注解信息来切换数据源
    @Override
    protected Object determineCurrentLookupKey() {
        // logger.debug("当前数据源为{}", DataSourceContextHolder.getDS());
        System.out.println("当前数据源为"+DataSourceContextHolder.getDS());
        return DataSourceContextHolder.getDS();

    }
}