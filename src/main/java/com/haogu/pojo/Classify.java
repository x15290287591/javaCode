package com.haogu.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Classify implements Serializable {
    private static final long serialVersionUID = -2528469034896749622L;
    private Integer id;
    private String name;
    private String status;
    private Integer communityId;
}
