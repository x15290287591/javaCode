package com.haogu.mapper;

import com.haogu.pojo.Employee;
import org.apache.ibatis.annotations.Select;

public interface LoginMapper {
    @Select("select * from sys_employee where phone=#{phone}")
    Employee getPasswordByPhone(String phone);
}
