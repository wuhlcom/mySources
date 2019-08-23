package com.zhilutec.service.impl;

import com.zhilutec.dao.student.StudentDao;
import com.zhilutec.entity.Student;
import com.zhilutec.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    StudentDao studentDao;

    @Override
    public Student getById(String stuId){
        return studentDao.getByStuId(stuId);
    }

    @Override
    public List<Student> getByName(String name){
        return studentDao.getByName(name);
    }
}
