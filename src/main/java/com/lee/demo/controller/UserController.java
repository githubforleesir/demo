package com.lee.demo.controller;

import com.lee.demo.common.entity.Result;
import com.lee.demo.pojo.User;
import com.lee.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/findAll")
    public Result findAll() {
        List<User> userList = userService.findAll();
        return new Result(true, 2000, "查询成功结果如下", userList);
    }

}
