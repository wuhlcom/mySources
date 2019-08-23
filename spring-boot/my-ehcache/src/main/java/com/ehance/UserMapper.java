package com.ehance;

import org.springframework.stereotype.Service;


public interface UserMapper {

    User selectUserById(String id);
}
