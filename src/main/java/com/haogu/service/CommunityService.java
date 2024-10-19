package com.haogu.service;

import com.haogu.pojo.Community;

import java.util.List;

public interface CommunityService {
    int insert(Community community);
    int deleteById(Integer id);
    int update(Community community);
    List<Community> selectByEmployee();
    List<Community> selectByTree(Integer id);
}
