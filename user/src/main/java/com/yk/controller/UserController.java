package com.yk.controller;

import com.yk.pojo.User;
import com.yk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import util.Result;
import util.StatusCode;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    /**
     * 用户登陆
     *
     * @param name
     * @param password
     * @return
     */
    @RequestMapping(value = "/login/{name}/{password}", method = RequestMethod.GET)
    public Result login(@PathVariable String name, @PathVariable String password) {
        User user = userService.findByUsernameAndPassword(name, password);
        if (user != null) {
            return new Result(true, StatusCode.OK, "登陆成功");
        } else {
            return new Result(false, StatusCode.LOGINERROR, "用户名或者密码错误");
        }
    }
}