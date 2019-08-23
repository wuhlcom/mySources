package com.zhilutec.dao.user;

import com.zhilutec.entity.User;
import com.zhilutec.mapper.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @Autowired
    UserMapper userMapper;


    public User getUser(Long id) {
        // DatabaseContextHolder.setDatabaseType(DatabaseType.first);
        return userMapper.getById(id);
    }

    public User getUser(String userName) {
        // DatabaseContextHolder.setDatabaseType(DatabaseType.first);
        return userMapper.getByUserName(userName);
    }
}
