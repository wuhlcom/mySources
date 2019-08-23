package com.zhilutec.service;

import com.zhilutec.entity.User;

import java.util.List;

public interface IUserService {
    User getOne(Long id);

    List<User> getOne(String userName);
}
