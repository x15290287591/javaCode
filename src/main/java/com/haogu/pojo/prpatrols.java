package com.haogu.pojo;

import lombok.Data;

import java.io.Serializable;
@Data
public class prpatrols implements Serializable {
    private static final long serialVersionUID = -2629445511996018861L;
    private Integer id;
    private Integer patrolsId;
    private Integer projectIds;
}
