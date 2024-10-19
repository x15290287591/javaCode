package com.haogu.controller;

import com.haogu.pojo.Community;
import com.haogu.pojo.Result;
import com.haogu.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("community")
public class CommunityController {
    @Autowired
    private CommunityService communityService;

    @PostMapping("insert")
    public Result insert(@RequestBody Community community) {
        communityService.insert(community);
        return Result.success("添加成功");
    }
    @DeleteMapping("delete")
    public Result delete(Integer id) {
        communityService.deleteById(id);
        return Result.success("删除成功");
    }
    @PutMapping("update")
    public Result update(@RequestBody Community community) {
        communityService.update(community);
        return Result.success("修改成功");
    }
    @GetMapping("selectByEmployee")
    public Result select() {
        return Result.success(communityService.selectByEmployee());
    }
    @GetMapping("selectByTree")
    public Result selectTree(Integer id) {
        return Result.success(communityService.selectByTree(id));
    }
}
