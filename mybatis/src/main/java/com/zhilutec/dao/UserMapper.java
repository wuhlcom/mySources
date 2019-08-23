package com.zhilutec.dao;

import com.zhilutec.entity.User;

import java.util.List;

public interface UserMapper {
    User getUser(Integer id);
    List<User> getUsers(User user);
}
