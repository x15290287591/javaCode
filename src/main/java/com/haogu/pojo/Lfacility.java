package com.haogu.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Lfacility implements Serializable {
    private static final long serialVersionUID = -2431638012058415717L;
    private Integer id;
    private Integer leaseId;
    private Integer facilityId;
}
