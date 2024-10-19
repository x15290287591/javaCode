package com.haogu.mapper;

import com.haogu.pojo.Community;

import java.util.List;

public interface CommunityMapper {
    int insert(Community community);
    int deleteById(Integer id);
    int update(Community community);
    List<Community> selectByEmployee(Integer EmployeeId);
    List<Community> selectByTree(Integer id);
}
