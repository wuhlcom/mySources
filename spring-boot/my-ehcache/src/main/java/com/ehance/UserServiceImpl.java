package com.ehance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper usermapper;

    //缓存数据
    @Override
    @Cacheable(value="users",key="#id")
    public User selectUserById(String id) {
        User user=this.usermapper.selectUserById(id);
        return user;
    }

}
