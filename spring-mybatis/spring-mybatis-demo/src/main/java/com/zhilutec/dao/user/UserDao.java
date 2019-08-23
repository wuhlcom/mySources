package com.zhilutec.dao.user;

import com.zhilutec.datasource.DS;
import com.zhilutec.datasource.DSConfig;
import com.zhilutec.entity.User;
import com.zhilutec.mapper.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao {

    @Autowired
    UserMapper userMapper;


    @DS(DSConfig.DB_MASTER)
    public User getUser(Long id) {
        return userMapper.getById(id);
    }

    @DS(DSConfig.DB_MASTER)
    public List<User> getUser(String userName) {
        return userMapper.getByName(userName);
    }
}
