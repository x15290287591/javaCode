package com.haogu.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Facility implements Serializable {
    private static final long serialVersionUID = -5369140201382362061L;
    private Integer id;
    private String name;
    private String status;
    private String addName;
    private String addTime;
    private Boolean checked;
}
