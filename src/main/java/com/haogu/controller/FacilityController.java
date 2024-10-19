package com.haogu.controller;

import com.haogu.pojo.Facility;
import com.haogu.pojo.PageVo;
import com.haogu.pojo.Result;
import com.haogu.service.FacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/facility")
public class FacilityController {
    @Autowired
    private FacilityService facilityService;
    @DeleteMapping("/deleteBatch/{ids}")
    public Result deleteBatch(@PathVariable Integer[] ids){
        return Result.success("删除成功",facilityService.deleteBatch(ids));
    }
    @DeleteMapping("/deleteById/{id}")
    public Result deleteById(@PathVariable Integer id){
        return Result.success("删除成功",facilityService.deleteById(id));
    }
    @PostMapping("/insert")
    public Result insert(@RequestBody Facility facility){
        return Result.success("添加成功",facilityService.insert(facility));
    }
    @GetMapping("/selectAll")
    public Result selectAll(){
        return Result.success("查询成功",facilityService.selectAll());
    }
    @GetMapping("/selectByPage")
    public Result selectByPage(PageVo pageVo){
        return Result.success("查询成功",facilityService.selectByPage(pageVo));
    }
    @PutMapping("/update")
    public Result update(@RequestBody Facility facility){
        return Result.success("修改成功",facilityService.update(facility));
    }
    @GetMapping("/selectByName")
    public Result selectByName(String name){
        return Result.success("查询成功",facilityService.selectByName(name));
    }
}
