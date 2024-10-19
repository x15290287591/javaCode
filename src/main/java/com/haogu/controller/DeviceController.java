package com.haogu.controller;

import com.haogu.pojo.Device;
import com.haogu.pojo.Result;
import com.haogu.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/device")
public class DeviceController {
    @Autowired
    private DeviceService deviceService;
    @GetMapping("/selectAll")
    public Result selectAll(){
        return Result.success(deviceService.selectAll());
    }
    @PostMapping("/insert")
    public Result insert(@RequestBody Device device){
        return Result.success(deviceService.insert(device));
    }
    @DeleteMapping("/deleteById/{id}")
    public Result deleteById(@PathVariable Integer id){
        return Result.success(deviceService.deleteById(id));
    }
    @DeleteMapping("/deleteBatch/{ids}")
    public Result deleteBatch(@PathVariable Integer[] ids){
        return Result.success(deviceService.deleteBatch(ids));
    }
    @PutMapping("/update")
    public Result update(@RequestBody Device device){
        return Result.success(deviceService.update(device));
    }
    @GetMapping("/selectByName")
    public Result selectByName(String name,String classify,String serial){
        return Result.success(deviceService.selectByName(name,classify,serial));
    }
}
