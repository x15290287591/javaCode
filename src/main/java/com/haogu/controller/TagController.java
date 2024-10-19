package com.haogu.controller;

import com.haogu.pojo.PageVo;
import com.haogu.pojo.Result;
import com.haogu.pojo.Tag;
import com.haogu.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("tag")
public class TagController {
    @Autowired
    private TagService tagService;
    @GetMapping("selectAll")
    public Result selectAll(){
        return Result.success(tagService.selectAll());
    }
    @GetMapping("selectByPage")
    public Result selectByPage(PageVo pageVo){
        return Result.success(tagService.selectByPage(pageVo));
    }
    @PostMapping("insert")
    public Result insert(@RequestBody Tag tag){
        return Result.success(tagService.insert(tag));
    }
    @DeleteMapping("deleteById/{id}")
    public Result deleteById(@PathVariable Integer id){
        return Result.success(tagService.deleteById(id));
    }
    @DeleteMapping("deleteBatch/{ids}")
    public Result deleteBatch(@PathVariable Integer[] ids){
        return Result.success(tagService.deleteBatch(ids));
    }
    @PutMapping("update")
    public Result update(@RequestBody Tag tag){
        return Result.success(tagService.update(tag));
    }
    @GetMapping("selectByName")
    public Result selectById(String  name){
        return Result.success(tagService.selectByName(name));
    }
}
