package com.haogu.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Repair implements Serializable {
    private static final long serialVersionUID = 2031103693866717769L;
    private Integer id;
    private String name;
    private String serial;
    private String model;
    private String location;
    private Integer employeeId;
    private String description;
    private String result;
    private String remark;
    private Integer classifyId;
    private Integer communityId;
    private Integer deviceId;
    private List<Classify> classifyList;
    private List<Device> deviceList;
}
