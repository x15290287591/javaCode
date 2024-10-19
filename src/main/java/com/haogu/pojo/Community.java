package com.haogu.pojo;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Data
public class Community implements Serializable {
    private static final long serialVersionUID = -8221468562880509070L;
    private String id;
    private String name;
    //小区编号
    private String number;
    //所属地区
    private String region;
    private String address;
    private Date completionTime;
    //房屋用途
    private String houseUse;
    private Integer area;
    private Integer floorNum;
    private Integer houseNum;
    //车位面积
    private Integer carNum;
    //车位数量
    private Integer parkNum;
    private String communityImg;
    private String remark;
    private String bossName;
    private String bossWei;
    private String bossPhone;
    private String bossQq;
    private String bossEmail;
    private Integer employeeId;

    List<Floor> floors;
    private Boolean check;
}
