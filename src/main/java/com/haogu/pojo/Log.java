package com.haogu.pojo;

import lombok.Data;

import java.io.Serializable;
@Data
public class Log implements Serializable {
    private static final long serialVersionUID = -2013717798239420813L;
    private Integer id;
    private String time;
    private String name;
    private String module;
    private String content;
}
