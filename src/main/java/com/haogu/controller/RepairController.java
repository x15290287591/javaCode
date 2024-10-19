package com.haogu.controller;

import com.haogu.pojo.Repair;
import com.haogu.pojo.Result;
import com.haogu.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/repair")
public class RepairController {
    @Autowired
    private RepairService repairService;
    @GetMapping("/selectAll")
    public Result selectAll(){
        return Result.success(repairService.selectAll());
    }
    @PostMapping("/insert")
    public Result insert(@RequestBody Repair repair){
        return Result.success(repairService.insert(repair));
    }
    @DeleteMapping("/deleteById/{id}")
    public Result deleteById(@PathVariable Integer id){
        return Result.success(repairService.deleteById(id));
    }
    @DeleteMapping("/deleteBatch/{ids}")
    public Result deleteBatch(@PathVariable Integer[] ids){
        return Result.success(repairService.deleteBatch(ids));
    }
    @PutMapping("/update")
    public Result update(@RequestBody Repair repair){
        return Result.success(repairService.update(repair));
    }
    @GetMapping("/selectByName")
    public Result selectByName(String name,String serial,String model){
        return Result.success(repairService.selectByName(name,serial,model));
    }

}
