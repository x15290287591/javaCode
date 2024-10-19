package com.haogu.service;

import com.haogu.pojo.Employee;
import com.haogu.pojo.PageVo;

import java.util.List;

public interface EmployeeService extends BaseService<Employee> {
    List<Employee> selectByName(String name);
    List<Employee> selectByPage(PageVo pageVo);
    List<Employee> selectById(Integer id);
}
