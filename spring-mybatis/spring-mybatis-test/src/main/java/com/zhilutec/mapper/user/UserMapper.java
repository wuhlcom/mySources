package com.zhilutec.mapper.user;

import com.zhilutec.entity.User;
import org.apache.ibatis.annotations.*;


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
    @Select("SELECT * FROM users WHERE user_name LIKE CONCAT('%',#{userName},'%')")
    @ResultMap("userMap")
    User getByUserName(@Param("userName") String userName);
}
