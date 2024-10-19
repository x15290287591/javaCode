package com.haogu.controller;

import com.haogu.pojo.PageVo;
import com.haogu.pojo.Region;
import com.haogu.pojo.Result;
import com.haogu.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("region")
public class RegionController {
    @Autowired
    private RegionService regionService;
    @GetMapping("selectAll")
    public Result selectAll() {
        return Result.success(regionService.selectAll());
    }
    @PostMapping("insert")
    public Result insert(@RequestBody Region region) {
        return Result.success(regionService.insert(region));
    }
    @PutMapping("update")
    public Result update(@RequestBody Region region) {
        return Result.success(regionService.update(region));
    }
    @DeleteMapping("deleteById/{id}")
    public Result deleteById(@PathVariable Integer id) {
        return Result.success(regionService.deleteById(id));
    }

    @DeleteMapping("deleteBatch/{ids}")
    public Result deleteBatch(@PathVariable Integer[] ids) {
        return Result.success(regionService.deleteBatch(ids));
    }
    @GetMapping("selectByName")
    public Result selectByName(String name,String number) {
        return Result.success(regionService.selectByName(name, number));
    }
    @GetMapping("selectByPage")
    public Result selectByPage(PageVo pageVo) {
        return Result.success(regionService.selectByPage(pageVo));
    }
}
