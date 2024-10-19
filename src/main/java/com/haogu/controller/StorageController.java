package com.haogu.controller;

import com.haogu.pojo.Storage;
import com.haogu.pojo.Result;
import com.haogu.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("storage")
public class StorageController {
    @Autowired
    private StorageService StorageService;
    @PostMapping("insert")
    public Result insert(@RequestBody Storage storage){
        return Result.success(StorageService.insert(storage));
    }
    @GetMapping("selectAll")
    public Result selectAll(){
        return Result.success(StorageService.selectAll());
    }
    @GetMapping("selectByNum")
    public Result selectByUse(String storageNum){
        return Result.success(StorageService.selectByNum(storageNum));
    }

    @DeleteMapping("deleteById/{id}")
    public Result deleteById(@PathVariable Integer id){
        return Result.success(StorageService.deleteById(id));
    }
    @DeleteMapping("deleteBatch/{ids}")
    public Result deleteBatch(@PathVariable Integer[] ids){
        return Result.success(StorageService.deleteBatch(ids));
    }
    @PutMapping("update")
    public Result update(@RequestBody Storage storage){
        return Result.success(StorageService.update(storage));
    }
    @GetMapping("selectByPage")
    public Result selectByPage(Integer pageNum, Integer pageSize){
        if (pageNum == null){
            pageNum = 1;
        }
        if (pageSize == null){
            pageSize = 10;
        }
        return Result.success(StorageService.selectByPage(pageNum, pageSize));
    }
}
