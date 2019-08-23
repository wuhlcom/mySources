package com.zhilutec.mapper.user;

import com.zhilutec.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;


public interface UserMapper {

    @Results(id = "userMap",
            value = {
            @Result(column = "id", property = "id",id = true),
            @Result(column = "user_name", property = "userName"),
            @Result(column = "age", property = "age")
       })
    @Select("SELECT * FROM users WHERE id = #{id}")
    User getById(@Param("id") Long id);

    // @Select("SELECT * FROM users WHERE user_name = #{userName}")
    @Select("SELECT * FROM users   WHERE user_name LIKE CONCAT('%',#{userName},'%')")
    @ResultMap("userMap")
    List<User> getByName(@Param("userName") String userName);
}
