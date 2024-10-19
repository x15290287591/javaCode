package com.haogu.controller;

import com.haogu.pojo.Floor;
import com.haogu.pojo.PageVo;
import com.haogu.pojo.Result;
import com.haogu.service.FloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("floor")
public class FloorController {
    @Autowired
    private FloorService floorService;
    @GetMapping("selectAll")
    public Result selectAll(){
        return Result.success("查询成功", floorService.selectAll());
    }

    @PostMapping("insert")
    public Result insert(@RequestBody Floor floor){
        floorService.insert(floor);
        return Result.success("添加成功");
    }
    @PutMapping("update")
    public Result update(@RequestBody Floor floor){
        floorService.update(floor);
        return Result.success("修改成功");
    }
    @DeleteMapping("deleteById/{id}")
    public Result deleteById(@PathVariable Integer id){
        floorService.deleteById(id);
        return Result.success("删除成功");
    }
    //根据用途查询
    @GetMapping("selectByUse")
    public Result selectByUse(String houseUse){
        return Result.success("查询成功", floorService.selectByUse(houseUse));
    }

    //根据楼座名称查询
    @GetMapping("selectByName")
    public Result selectByName(String name){
        return Result.success("查询成功", floorService.selectByName(name));
    }

    //批量删除
    @DeleteMapping("deleteBatch/{ids}")
    public Result deleteBatch(@PathVariable Integer[] ids){
        floorService.deleteBatch(ids);
        return Result.success("删除成功");
    }

    //分页
    @GetMapping("selectByPage")
    public Result selectByPage(PageVo pageVo){
        return Result.success("查询成功",floorService.selectByPage(pageVo));
    }

}
