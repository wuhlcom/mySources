package com.zhilutec.controller;

import com.zhilutec.entity.User;
import com.zhilutec.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    // "获取用户信息,测试多数据源"
    @RequestMapping(value = "/getById", method = RequestMethod.GET)
    public User getById(@RequestParam("id") Long id) {
        return userService.getOne(id);
    }

    @RequestMapping(value = "/getByName", method = RequestMethod.GET)
    public List<User> getByName(@RequestParam("userName") String userName) {
        return userService.getOne(userName);
    }

}