package com.haogu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.haogu.mapper")
public class CommunityManageApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommunityManageApplication.class, args);
    }
}
