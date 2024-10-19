package com.haogu.controller;

import com.haogu.pojo.Employee;
import com.haogu.pojo.PageVo;
import com.haogu.pojo.Result;
import com.haogu.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("selectAll")
    public Result selectAll(){
        return Result.success("查询成功",employeeService.selectAll());
    }
    @PostMapping("insert")
    public Result insert(@RequestBody Employee employee){
        return Result.success("添加成功",employeeService.insert(employee));
    }
    @PutMapping("update")
    public Result update(@RequestBody Employee employee){
        return Result.success("修改成功",employeeService.update(employee));
    }
    @DeleteMapping("deleteById/{id}")
    public Result deleteById(@PathVariable Integer id){
        return Result.success("删除成功",employeeService.deleteById(id));
    }
    @DeleteMapping("deleteBatch/{ids}")
    public Result deleteBatch(@PathVariable Integer[] ids){
        return Result.success("批量删除成功",employeeService.deleteBatch(ids));
    }
    @GetMapping("selectByName")
    public Result selectByName(String name){
        return Result.success("查询成功",employeeService.selectByName(name));
    }
    @GetMapping("selectByPage")
    public Result selectByPage(PageVo pageVo){
        return Result.success("查询成功", employeeService.selectByPage(pageVo));
    }
    @GetMapping("selectById/{id}")
    public Result selectById(@PathVariable Integer id){
        return Result.success("查询成功",employeeService.selectById(id));
    }
}
