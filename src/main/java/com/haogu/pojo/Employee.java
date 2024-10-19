package com.haogu.pojo;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

@Data
public class Employee implements Serializable {
    private static final long serialVersionUID = -2733316941418289981L;
    private Integer id;
    private String name;
    private String phone;
    //照片
    private String avatar;
    private String password;
    private String wei;
    private String qq;
    private String email;
    private String introduce;
    private Integer[] roleIds;
    private List<Role> roles;
    private Integer[] communityIds;
    private List<Community> communities;
}
