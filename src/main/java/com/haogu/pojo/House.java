package com.haogu.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class House implements Serializable {
    private static final long serialVersionUID = 6767410932805883082L;
    private Integer id;
    private String floorName;
    private String unit;
    private String roomNum;
    private String houseUse;
    private Integer area;
    private Integer pooledArea;
    private Integer realArea;
    private Integer shi;
    private Integer ting;
    private Integer chu;
    private Integer wei;
    //车位号
    private String parkNum;
    private String storageNum;
    private String roomStatus;
    private String remark;
    private Integer communityId;
    private Integer floorId;
    private List<House> children;
    private Floor floor;
}
