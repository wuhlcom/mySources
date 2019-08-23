package com.zhilutec.datasource;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * 作用：
 * 1、保存一个线程安全的DatabaseType容器
 * 2、通过DatabaseContextHolder来改变DatabaseType
 */
public class DatabaseContextHolder {
    static final Logger logger = LoggerFactory.getLogger(DatabaseContextHolder.class);

    public static final String DEFAULT_DS = DSConfig.firstDb;

    private static final ThreadLocal<DatabaseType> contextHolder = new ThreadLocal<>();

    public static void setDatabaseType(DatabaseType type) {
        logger.info("【设置DB Type为:{}】",type.name());
        contextHolder.set(type);
    }

    public static DatabaseType getDatabaseType() {
        logger.info("【获取到DB Type为:{}】",contextHolder.get().name());
        return contextHolder.get();
    }

    public static void clearDataBaseTyep(){
        logger.info("【获取到DB Type为:{}】",contextHolder.get().name());
        contextHolder.remove();
    }
}