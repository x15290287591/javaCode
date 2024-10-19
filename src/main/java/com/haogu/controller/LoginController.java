package com.haogu.controller;

import com.haogu.pojo.Employee;
import com.haogu.pojo.Result;
import com.haogu.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class LoginController {
    @Autowired
    private LoginService loginService;
    @PostMapping
    public Result login(@RequestBody Employee employee){
        return Result.success("登录成功",loginService.login(employee));
    }
}
