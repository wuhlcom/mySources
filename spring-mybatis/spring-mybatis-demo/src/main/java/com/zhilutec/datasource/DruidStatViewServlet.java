package com.zhilutec.datasource;

import com.alibaba.druid.support.http.StatViewServlet;

public class DruidStatViewServlet extends StatViewServlet {
    private static final long serialVersionUID = 1L;


    private String username;


    private String password;

    @Override
    public String getInitParameter(String name) {
        if ("loginUsername".equals(name)) {
            return username;
        }
        if ("loginPassword".equals(name)) {
            return password;
        }
        return super.getInitParameter(name);

    }

    public DruidStatViewServlet(String username, String password) {
        super();
        this.username = username;
        this.password = password;

    }

    public String getUsername() {
        return username;

    }

    public String getPassword() {
        return password;

    }
}