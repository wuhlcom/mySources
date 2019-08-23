package com.zhilutec.service;

import com.zhilutec.entity.User;

public interface IUserService {
    User getOne(Long id);

    User getOne(String userName);
}
