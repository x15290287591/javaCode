package com.haogu.pojo;

import lombok.Data;

import java.io.Serializable;
@Data
public class Project implements Serializable {
    private static final long serialVersionUID = -8303826220254548073L;
    private Integer id;
    private String name;
    private String standard;
    private String status;
}
