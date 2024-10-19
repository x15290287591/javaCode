package com.haogu.pojo;

import lombok.Data;

import java.io.Serializable;
@Data
public class UserTag implements Serializable {
    private static final long serialVersionUID = -2693759997893355116L;
    private Integer id;
    private Integer userId;
    private Integer tagId;
}
