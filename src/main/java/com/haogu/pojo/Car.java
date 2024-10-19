package com.haogu.pojo;

import lombok.Data;

import java.io.Serializable;
@Data
public class Car implements Serializable {
    private static final long serialVersionUID = 6941203627025460584L;
    private Integer id;
    private String carNum;
    private String brand;
    private String model;
    private String color;
    private String carImg;
    private String userName;
    private String remark;
    private String status;
    private Integer userId;
}
