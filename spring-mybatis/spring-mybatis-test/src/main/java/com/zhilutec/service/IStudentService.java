package com.zhilutec.service;

import com.zhilutec.entity.Student;

public interface IStudentService {

    Student getById(String stuId);

    Student getByName(String name);
}
