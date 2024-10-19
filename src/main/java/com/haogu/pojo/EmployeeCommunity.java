package com.haogu.pojo;

import lombok.Data;

import java.io.Serializable;
@Data
public class EmployeeCommunity implements Serializable {
    private static final long serialVersionUID = 4072071258230028240L;
    private Integer id;
    private Integer employeeId;
    private Integer communityId;
}
