package com.haogu.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Region implements Serializable {
    private Integer id;
    private String name;
    private String number;
    private Integer area;
    private Integer parkingNum;
    private String remark;
    private Integer communityId;
}
