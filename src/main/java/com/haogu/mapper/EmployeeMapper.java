package com.haogu.mapper;

import com.haogu.pojo.Employee;
import com.haogu.pojo.PageVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper extends BaseMapper<Employee> {
    List<Employee> selectByName(String name);
    List<Employee> selectByPage(Integer pageNum, Integer pageSize);
    List<Employee> selectById(Integer id);
    Boolean selectByCheck(@Param("employeeId") Integer employeeId,
                          @Param("roleId") Integer roleId);
    Boolean selectByCheckCommunity(@Param("employeeId") Integer employeeId,
                                   @Param("communityId") Integer communityId);
}




