package com.ehance;

import org.springframework.stereotype.Service;

@Service
public class UserMapperImpl implements UserMapper {

    @Override
    public User selectUserById(String id) {
        User user = new User();
        user.setId(id);
        user.setName("abc");
        user.setAge(18);
        return user;
    }
}
