package com.haogu.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Driveway implements Serializable {
    private static final long serialVersionUID = 4403056990029213956L;
    private Integer id;
    private String region;
    private String number;
    private Integer area;
    private String floor;
    private String type;
    private String status;
    private String remark;
    private String audit;
    private Integer communityId;
    private Integer userId;
    private Integer regionId;
}
