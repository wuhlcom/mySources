package com.zhilutec.datasource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;



/**
 * 动态数据源（需要继承AbstractRoutingDataSource）
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    protected final Logger logger= LoggerFactory.getLogger(this.getClass());
    protected Object determineCurrentLookupKey() {
        DatabaseType dbType = DatabaseContextHolder.getDatabaseType();
        logger.info("[当前数据库为:{}]",dbType.name());
        return dbType;
    }
}