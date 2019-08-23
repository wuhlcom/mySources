package com.zhilutec.mapper.student;

import com.zhilutec.entity.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;


public interface StudentMapper {
    @Select("SELECT * FROM student WHERE stu_id = #{stuId}")
    @Results(id = "stuMap",
       value = {
            @Result(column = "stu_id", property = "stuId",id = true),
            @Result(column = "name", property = "name"),
            @Result(column = "sex", property = "sex")
    })
    Student getById(@Param("stuId") String stuId);


    @ResultMap(value = "stuMap")
    @Select("SELECT * FROM student WHERE name LIKE CONCAT('%',#{name},'%')")
    List<Student> getByName(@Param("name") String name);
}
