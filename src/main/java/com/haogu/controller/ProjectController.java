package com.haogu.controller;

import com.haogu.pojo.Project;
import com.haogu.pojo.Result;
import com.haogu.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    private ProjectService projectService;
    @GetMapping("/selectAll")
    public Result selectAll(){
        return Result.success(projectService.selectAll());
    }
    @GetMapping("/selectByName")
    public Result selectByName(String name){
        return Result.success(projectService.selectByName(name));
    }
    @PostMapping("/insert")
    public Result insert(@RequestBody Project project){
        return Result.success(projectService.insert(project));
    }
    @DeleteMapping("/deleteById/{id}")
    public Result deleteById(@PathVariable Integer id){
        return Result.success(projectService.deleteById(id));
    }
    @DeleteMapping("/deleteBatch/{ids}")
    public Result deleteBatch(@PathVariable Integer[] ids){
        return Result.success(projectService.deleteBatch(ids));
    }
    @PutMapping("/update")
    public Result update(@RequestBody Project project){
        return Result.success(projectService.update(project));
    }

}
