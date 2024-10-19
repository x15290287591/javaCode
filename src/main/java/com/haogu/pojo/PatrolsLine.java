package com.haogu.pojo;

import lombok.Data;

import java.io.Serializable;
@Data
public class PatrolsLine implements Serializable {
    private static final long serialVersionUID = 2047582742733267325L;
    private Integer id;
    private Integer lineId;
    private Integer patrolsId;
}
