package com.zhilutec.controller;

import com.zhilutec.entity.Student;
import com.zhilutec.service.IStudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/student")
public class StudentController {

    @Resource
    private IStudentService studentService;

    // "获取用户信息,测试多数据源"
    @RequestMapping(value = "/getById", method = RequestMethod.GET)
    public Student getById(@RequestParam("stuId") String stuId) {
        try {
            return studentService.getById(stuId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @RequestMapping(value = "/getByName", method = RequestMethod.GET)
    public Student getByName(@RequestParam("name") String name) {
        return studentService.getByName(name);
    }

}