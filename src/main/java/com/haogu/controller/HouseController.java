package com.haogu.controller;

import com.haogu.pojo.House;
import com.haogu.pojo.PageVo;
import com.haogu.pojo.Result;
import com.haogu.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("house")
public class HouseController {
    @Autowired
    private HouseService houseService;
    @PostMapping("insert")
    public Result insert(@RequestBody House house){
        return Result.success(houseService.insert(house));
    }
    @GetMapping("selectAll")
    public Result selectAll(){
        return Result.success(houseService.selectAll());
    }
    @GetMapping("selectByUse")
    public Result selectByUse(String houseUse){
        return Result.success(houseService.selectByUse(houseUse));
    }
    @GetMapping("selectByName")
    public Result selectByName(String name){
        return Result.success(houseService.selectByName(name));
    }
    @DeleteMapping("deleteById/{id}")
    public Result deleteById(@PathVariable Integer id){
        return Result.success(houseService.deleteById(id));
    }
    @DeleteMapping("deleteBatch/{ids}")
    public Result deleteBatch(@PathVariable Integer[] ids){
        return Result.success(houseService.deleteBatch(ids));
    }
    @PutMapping("update")
    public Result update(@RequestBody House house){
        return Result.success(houseService.update(house));
    }
    @GetMapping("selectByPage")
    public Result selectByPage(PageVo pageVo){

        return Result.success(houseService.selectByPage(pageVo));
    }
}
