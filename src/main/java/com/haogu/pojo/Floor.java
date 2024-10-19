package com.haogu.pojo;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Data
public class Floor implements Serializable {
    private static final long serialVersionUID = -906797020892037954L;
    private String id;
    private String name;
    private Date completionTime;
    //房屋用途
    private String houseUse;
    private Integer area;
    private Integer unitNum;
    private Integer floorNum;
    private String lift;
    private String storage;
    private String remark;
    private Integer communityId;
    List<House> children;
}
