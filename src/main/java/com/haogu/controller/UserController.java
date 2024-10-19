package com.haogu.controller;

import com.haogu.mapper.UserMapper;
import com.haogu.pojo.PageVo;
import com.haogu.pojo.Result;
import com.haogu.pojo.User;
import com.haogu.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.sql.Timestamp;

@Slf4j
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserMapper userMapper;

    @PostMapping("insert")
    public Result insert(@RequestBody User user) {
        return Result.success(userService.insert(user));
    }

    @DeleteMapping("deleteById/{id}")
    public Result deleteById(@PathVariable Integer id) {
        return Result.success(userService.deleteById(id));
    }

    @DeleteMapping("deleteBatch/{ids}")
    public Result deleteBatch(@PathVariable Integer[] ids) {
        return Result.success(userService.deleteBatch(ids));
    }

    @PutMapping("update")
    public Result update(@RequestBody User user) {
        return Result.success(userService.update(user));
    }

    @GetMapping("selectAll")
    public Result selectAll() {
        return Result.success(userService.selectAll());
    }

    @GetMapping("selectBySearch")
    public Result selectBySearch(PageVo pageVo) {

        return Result.success(userService.selectBySearch(pageVo));
    }

    @GetMapping("selectByRoomNum")
    public Result selectByRoomNum(String roomNum) {
        return Result.success(userService.selectByRoomNum(roomNum));
    }
    @GetMapping("selectById")
    public Result selectById(Integer id) {
        return Result.success(userService.selectById(id));
    }
}
