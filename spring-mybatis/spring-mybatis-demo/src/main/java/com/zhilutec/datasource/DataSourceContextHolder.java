package com.zhilutec.datasource;

public class DataSourceContextHolder {
    public static final String DEFAULT_DS = DSConfig.DB_SLAVE;
    //多线程并发时使用线程私有变量
    private static final ThreadLocal<String> DS_HOLDER = new ThreadLocal<>();

    public static void setDS(String dbType) {
        DS_HOLDER.set(dbType);
    }

    public static String getDS() {
        return (DS_HOLDER.get());
    }

    public static void clearDS() {
        DS_HOLDER.remove();

    }
}