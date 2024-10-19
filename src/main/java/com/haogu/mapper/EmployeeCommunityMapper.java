package com.haogu.mapper;

import com.haogu.pojo.EmployeeCommunity;


public interface EmployeeCommunityMapper {
    int deleteBatch(Integer[] ids);

    int deleteById(Integer id);

    int insert(Integer employeeId, Integer[] communityIds);
}




