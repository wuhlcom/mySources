package com.zhilutec.service;

import com.zhilutec.entity.Student;

import java.util.List;

public interface IStudentService {

    Student getById(String stuId);

    List<Student> getByName(String name);
}
