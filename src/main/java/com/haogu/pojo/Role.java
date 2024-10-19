package com.haogu.pojo;

import lombok.Data;

import java.io.Serializable;
@Data
public class Role implements Serializable {
    private static final long serialVersionUID = -2207436315428138954L;
    private Integer id;
    private String name;
    private String description;
    private Integer roleNum;
    private String status;
    private String remark;
    private Boolean check;
}
