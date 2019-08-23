package com.zhilutec.dao.student;

import com.zhilutec.entity.Student;
import com.zhilutec.mapper.student.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {

    @Autowired
    StudentMapper studentMapper;


    public Student getByStuId(String stuId) {
        //手动指定
        // DatabaseContextHolder.setDatabaseType(DatabaseType.second);
        return studentMapper.getById(stuId);
    }

    public Student getByName(String name) {
        // DatabaseContextHolder.setDatabaseType(DatabaseType.second);
        return studentMapper.getByName(name);
    }
}
