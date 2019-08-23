package com.zhilutec.dao.student;


import com.zhilutec.datasource.DS;
import com.zhilutec.datasource.DSConfig;
import com.zhilutec.entity.Student;
import com.zhilutec.mapper.student.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDao {

    @Autowired
    StudentMapper studentMapper;


    @DS(DSConfig.DB_SLAVE)
    public Student getByStuId(String stuId) {
        //手动指定
        return studentMapper.getById(stuId);
    }

    @DS(DSConfig.DB_SLAVE)
    public List<Student> getByName(String name) {
        // DatabaseContextHolder.setDatabaseType(DatabaseType.second);
        return studentMapper.getByName(name);
    }
}
