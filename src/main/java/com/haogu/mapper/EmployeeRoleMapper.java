package com.haogu.mapper;

import com.haogu.pojo.EmployeeRole;


public interface EmployeeRoleMapper {
    int insert(Integer employeeId, Integer[] roleIds);
    int deleteById(Integer id);
    int deleteBatch(Integer[] ids);
}




