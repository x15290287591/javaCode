package com.haogu.controller;

import com.haogu.pojo.Car;
import com.haogu.pojo.PageVo;
import com.haogu.pojo.Result;
import com.haogu.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("car")
public class CarController {
    @Autowired
    private CarService carService;
    @PostMapping("insert")
    public Result insert(@RequestBody Car car) {
        return Result.success("添加成功",carService.insert(car));
    }
    @GetMapping("selectAll")
    public Result selectAll() {
        return Result.success("查询成功",carService.selectAll());
    }
    @PutMapping("update")
    public Result update(@RequestBody Car car) {
        return Result.success("更新成功",carService.update(car));
    }
    @DeleteMapping("deleteById/{id}")
    public Result deleteById(@PathVariable Integer id) {
        return Result.success("删除成功",carService.deleteById(id));
    }

    @DeleteMapping("deleteBatch/{ids}")
    public Result deleteBatch(@PathVariable Integer[] ids) {
        return Result.success("删除成功",carService.deleteBatch(ids));
    }
    @GetMapping("selectByPage")
    public Result selectByPage(PageVo pageVo) {
        return Result.success("查询成功",carService.selectByPage(pageVo));
    }
    @GetMapping("selectByStatus")
    public Result selectByStatus(String status,String carNum) {
        return Result.success("查询成功",carService.selectByStatus(status,carNum));
    }
}
