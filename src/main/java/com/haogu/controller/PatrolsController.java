package com.haogu.controller;

import com.haogu.pojo.Patrols;
import com.haogu.pojo.Result;
import com.haogu.service.PatrolsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patrols")
public class PatrolsController {
    @Autowired
    private PatrolsService patrolsService;

    @GetMapping("/selectAll")
    public Result selectAll() {
        return Result.success(patrolsService.selectAll());
    }

    @GetMapping("/selectByName")
    public Result selectByName(String name) {
        return Result.success(patrolsService.selectByName(name));
    }
    @PostMapping("/insert")
    public Result insert(@RequestBody Patrols patrols) {
        return Result.success(patrolsService.insert(patrols));
    }
    @DeleteMapping("/deleteById/{id}")
    public Result deleteById(@PathVariable Integer id) {
        return Result.success(patrolsService.deleteById(id));
    }
    @DeleteMapping("/deleteBatch/{ids}")
    public Result deleteBatch(@PathVariable Integer[] ids) {
        return Result.success(patrolsService.deleteBatch(ids));
    }
    @PutMapping("/update")
    public Result update(@RequestBody Patrols patrols) {
        return Result.success(patrolsService.update(patrols));
    }

}
