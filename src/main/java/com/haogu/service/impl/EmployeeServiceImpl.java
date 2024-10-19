package com.haogu.service.impl;

import com.haogu.mapper.EmployeeCommunityMapper;
import com.haogu.mapper.EmployeeRoleMapper;
import com.haogu.pojo.Employee;
import com.haogu.pojo.PageVo;
import com.haogu.service.EmployeeService;
import com.haogu.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private EmployeeRoleMapper employeeRoleMapper;
    @Autowired
    private EmployeeCommunityMapper employeeCommunityMapper;

    @Override
    public int update(Employee employee) {
        int result = employeeMapper.update(employee);
        if (result == 0) {
            throw new RuntimeException("修改失败");
        }
        employeeRoleMapper.deleteById(employee.getId());
        employeeRoleMapper.insert(employee.getId(), employee.getRoleIds());
        employeeCommunityMapper.deleteById(employee.getId());
        employeeCommunityMapper.insert(employee.getId(), employee.getCommunityIds());
        return result;
    }

    @Override
    public int insert(Employee employee) {
        int result = employeeMapper.insert(employee);
        if (result == 0) {
            throw new RuntimeException("添加失败");
        }
        employeeRoleMapper.insert(employee.getId(), employee.getRoleIds());
        employeeCommunityMapper.insert(employee.getId(), employee.getCommunityIds());
        return result;
    }

    @Override
    public int deleteById(Integer id) {
        int result = employeeMapper.deleteById(id);
        employeeRoleMapper.deleteById(id);
        employeeCommunityMapper.deleteById(id);
        return result;
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        int result = employeeMapper.deleteBatch(ids);
        employeeRoleMapper.deleteBatch(ids);
        employeeCommunityMapper.deleteBatch(ids);
        return result;
    }

    @Override
    public List<Employee> selectAll() {
        return employeeMapper.selectAll();
    }


    @Override
    public List<Employee> selectByPage(PageVo pageVo) {

        return employeeMapper.selectByPage((pageVo.getPageNum() - 1)
                        * pageVo.getPageSize(), pageVo.getPageSize());
    }

    @Override
    public List<Employee> selectById(Integer id) {
        return employeeMapper.selectById(id);
    }

    @Override
    public List<Employee> selectByName(String name) {
        return employeeMapper.selectByName(name);
    }
}




