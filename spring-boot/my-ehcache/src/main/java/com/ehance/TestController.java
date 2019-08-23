package com.ehance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    UserService userService;

    @RequestMapping("/get")
    public User get() {
        String id = "id1";
        User user = userService.selectUserById(id);

        //读取缓存
        EhcacheUtil ehcacheUtil = EhcacheUtil.getInstance();
        Object obj = ehcacheUtil.get("users", id);
        System.out.println(obj);
        return user;
    }

}
