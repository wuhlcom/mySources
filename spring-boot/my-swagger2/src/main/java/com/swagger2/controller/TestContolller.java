package com.swagger2.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value="用户controller",tags={"用户操作接口"})
@RestController
@RequestMapping("/test")
public class TestContolller {

    @ApiImplicitParam(name = "id", value = "用户id")
    // @HystrixCommand
    @ApiOperation(value = "feign远程服务调用测试", notes = "查询test")
    @GetMapping(value = "/{id}")
    public String getTest(@PathVariable("id") String id) {
        // RedisUtil.set("test", "123456");
        // log.info(">>>>>>>>>> redis 获取 test >>>>>>" + RedisUtil.get("test"));
        // Test test = testService.queryTest(id);
        // log.info("查询出来的test为： " + test);
        return "abc";
    }
}
