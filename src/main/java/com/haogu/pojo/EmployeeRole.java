package com.haogu.pojo;

import lombok.Data;

import java.io.Serializable;
@Data
public class EmployeeRole implements Serializable {
    private static final long serialVersionUID = 2837560000375676637L;
    private Integer id;
    private Integer roleId;
    private Integer employeeId;
}
