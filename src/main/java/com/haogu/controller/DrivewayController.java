package com.haogu.controller;

import com.haogu.pojo.Driveway;
import com.haogu.pojo.PageVo;
import com.haogu.pojo.Result;
import com.haogu.service.DrivewayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("driveway")
public class DrivewayController {
    @Autowired
    private DrivewayService drivewayService;

    @GetMapping("selectAll")
    public Result selectAll(){
        return Result.success(drivewayService.selectAll());
    }
    @GetMapping("selectByPage")
    public Result selectByPage(PageVo pageVo){
        return Result.success(drivewayService.selectByPage(pageVo));
    }
    @DeleteMapping("deleteBatch/{ids}")
    public Result deleteBatch(@PathVariable Integer[] ids){
        return Result.success(drivewayService.deleteBatch(ids));
    }
    @DeleteMapping("deleteById/{id}")
    public Result deleteById(@PathVariable Integer id){
        return Result.success(drivewayService.deleteById(id));
    }
    @PostMapping("insert")
    public Result insert(@RequestBody Driveway driveway){
        return Result.success(drivewayService.insert(driveway));
    }
    @PutMapping("update")
    public Result update(@RequestBody Driveway driveway){
        return Result.success(drivewayService.update(driveway));
    }
    @GetMapping("selectByStatus")
    public Result selectByStatus(String audit,String number){
        return Result.success(drivewayService.selectByStatus(audit,number));
    }
}
