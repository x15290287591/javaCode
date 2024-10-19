package com.haogu.controller;

import com.haogu.pojo.Result;
import com.haogu.pojo.Role;
import com.haogu.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @GetMapping("selectAll")
    public Result selectAll() {
        return Result.success("查询成功",roleService.selectAll());
    }
    @PostMapping("insert")
    public Result insert(@RequestBody Role role) {
        return Result.success("添加成功",roleService.insert(role));
    }
    @DeleteMapping("deleteBatch/{ids}")
    public Result deleteBatch(@PathVariable Integer[] ids) {
        return Result.success("删除成功",roleService.deleteBatch(ids));
    }
    @DeleteMapping("deleteById/{id}")
    public Result deleteById(@PathVariable Integer id) {
        return Result.success("删除成功",roleService.deleteById(id));
    }
    @PutMapping("update")
    public Result update(@RequestBody Role role) {
        return Result.success("修改成功",roleService.update(role));
    }
    @GetMapping("selectByName")
    public Result selectByName(String name) {
        return Result.success("查询成功",roleService.selectByName(name));
    }

}
