package com.haogu.controller;

import com.haogu.pojo.Lease;
import com.haogu.pojo.PageVo;
import com.haogu.pojo.Result;
import com.haogu.service.LeaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("lease")
public class LeaseController {
    @Autowired
    private LeaseService leaseService;
    @GetMapping("selectAll")
    public Result selectAll(){
        return Result.success(leaseService.selectAll());
    }
    @PostMapping("insert")
    public Result insert(@RequestBody Lease lease){
        return Result.success(leaseService.insert(lease));
    }
    @DeleteMapping("deleteById/{id}")
    public Result deleteById(@PathVariable Integer id){
        return Result.success(leaseService.deleteById(id));
    }
    @DeleteMapping("deleteBatch/{ids}")
    public Result deleteBatch(@PathVariable Integer[] ids){
        return Result.success(leaseService.deleteBatch(ids));
    }
    @PutMapping("update")
    public Result update(@RequestBody Lease lease){
        return Result.success(leaseService.update(lease));
    }
    @GetMapping("selectBySearch")
    public Result selectBySearch(String houseMsg,String houseStatus){
        return Result.success(leaseService.selectBySearch(houseMsg,houseStatus));
    }
    @GetMapping("selectByPage")
    public Result selectByPage(PageVo pageVo){
        return Result.success(leaseService.selectByPage(pageVo));
    }
    @GetMapping("selectById/{id}")
    public Result selectById(@PathVariable Integer id){
        return Result.success(leaseService.selectById(id));
    }
}
