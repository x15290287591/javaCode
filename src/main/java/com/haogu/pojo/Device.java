package com.haogu.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Device implements Serializable {
    private static final long serialVersionUID = -2554307206831989960L;
    private Integer id;
    private String name;
    private String serial;
    private String model;
    private String location;
    private String status;
    private String remark;
    private Integer employeeId;
    private Integer communityId;
    private Integer classifyId;
    private List<Classify> classifyList;
}
