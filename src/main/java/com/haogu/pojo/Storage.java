package com.haogu.pojo;

import lombok.Data;

import java.io.Serializable;
@Data
public class Storage implements Serializable {
    private static final long serialVersionUID = -895844806506785569L;
    private Integer id;
    private String floorName;
    private String unit;
    private String storageNum;
    private Integer area;
    private Integer pooledArea;
    private Integer realArea;
    private String remark;
    private Integer communityId;
    private Integer floorId;
    private Integer houseId;

    private Community community;
    private Floor floor;
    private House house;
}
