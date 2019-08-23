package com.mycode.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author whl
 * @since 2019-04-10
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String user_id;

    private String user_name;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    @Override
    public String toString() {
        return "User{" +
        "user_id=" + user_id +
        ", user_name=" + user_name +
        "}";
    }
}
