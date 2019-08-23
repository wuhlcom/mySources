package com.zhilutec.service.impl;


import com.zhilutec.dao.user.UserDao;
import com.zhilutec.entity.User;

import com.zhilutec.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserDao userDao;

    @Override
    public User getOne(Long id) {
        return userDao.getUser(id);
    }


    @Override
    public User getOne(String userName) {
        return userDao.getUser(userName);
    }
}
