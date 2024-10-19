package com.haogu.pojo;

import lombok.Data;

import java.io.Serializable;
@Data
public class Tag implements Serializable {
    private static final long serialVersionUID = 758465595079362067L;
    private Integer id;
    private String name;
    private String status;
    private Integer communityId;
    private Boolean check;
}
