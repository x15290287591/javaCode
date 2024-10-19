package com.haogu.controller;

import com.haogu.pojo.Line;
import com.haogu.pojo.Result;
import com.haogu.service.LineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/line")
public class LineController {
    @Autowired
    private LineService lineService;

    @GetMapping("/selectAll")
    public Result selectAll(){
        return Result.success(lineService.selectAll());
    }
    @PostMapping("/insert")
    public Result insert(@RequestBody Line line){
        return Result.success(lineService.insert(line));
    }
    @DeleteMapping("/deleteById/{id}")
    public Result deleteById(@PathVariable Integer id){
        return Result.success(lineService.deleteById(id));
    }
    @DeleteMapping("/deleteBatch/{ids}")
    public Result deleteBatch(@PathVariable Integer[] ids){
        return Result.success(lineService.deleteBatch(ids));
    }
    @PutMapping("/update")
    public Result update(@RequestBody Line line){
        return Result.success(lineService.update(line));
    }
    @GetMapping("/selectByName")
    public Result selectByPage(String name){
        return Result.success(lineService.selectByName(name));
    }

}
