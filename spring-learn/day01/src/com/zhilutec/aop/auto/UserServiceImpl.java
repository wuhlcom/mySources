package com.zhilutec.aop.auto;

public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("add user");
    }
}
