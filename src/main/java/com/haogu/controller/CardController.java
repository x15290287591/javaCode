package com.haogu.controller;

import com.haogu.pojo.Card;
import com.haogu.pojo.PageVo;
import com.haogu.pojo.Result;
import com.haogu.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("card")
public class CardController {
    @Autowired
    private CardService cardService;

    @GetMapping("selectAll")
    public Result selectAll() {
        return Result.success("查询成功",cardService.selectAll());
    }

    @GetMapping("selectByPage")
    public Result selectByPage(PageVo pageVo) {
        return Result.success("查询成功",cardService.selectByPage(pageVo));
    }

    @PostMapping("insert")
    public Result insert(@RequestBody Card card) {
        return Result.success("添加成功",cardService.insert(card));
    }

    @DeleteMapping("deleteById/{id}")
    public Result deleteById(@PathVariable Integer id) {
        return Result.success("删除成功",cardService.deleteById(id));
    }

    @DeleteMapping("deleteBatch/{ids}")
    public Result deleteBatch(@PathVariable Integer[] ids) {
        return Result.success("删除成功",cardService.deleteBatch(ids));
    }

    @PutMapping("update")
    public Result update(@RequestBody Card card) {
        return Result.success("修改成功",cardService.update(card));
    }
    @GetMapping("selectByStatus")
    public Result selectByStatus(String status,String monthcard){
        return Result.success("查询成功",cardService.selectByStatus(status,monthcard));
    }
}
