package com.haogu.pojo;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
public class Card implements Serializable {
    private static final long serialVersionUID = -4756483250786402130L;
    private Integer id;
    private String monthcard;
    private String name;
    private String phone;
    private String carNum;
    private String handler;
    private Timestamp startTime;
    private Timestamp endTime;
    private String money;
    private String moneyWay;
    private String remark;
    private String status;
    private Integer userId;
    private Integer carId;

}
