package com.haogu.controller;

import com.haogu.pojo.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

@RestController
@RequestMapping("file")
public class FileController {

    @PostMapping("upload")
    public Result upload(MultipartFile file){
        if(file == null || file.isEmpty()){
            return Result.failed("上传文件为空");
        }
        if(file.getSize() > 1024L * 1024 * 10){
            return Result.failed("上传文件大小超过10MB");
        }
        String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") + 1, file.getOriginalFilename().length());
        if (!"jpg,jpeg,png".toUpperCase().contains(suffix.toUpperCase())) {
            return Result.failed("请选择jpg、jpeg、png 格式的图片！");
        }
        String path = "E:\\javaCode\\nginx-1.12.2\\nginx-1.12.2\\html\\img\\";
        String fileName = "" ;
        try {
            // 随机字符串
            fileName += UUID.randomUUID().toString().replace("-","");
            fileName += System.currentTimeMillis();
            fileName += "."+suffix;
            file.transferTo(new File(path + fileName));
        }catch (Exception e){
            e.printStackTrace();
        }
        return Result.success("http://192.168.60.23/img/" + fileName);
    }

}
