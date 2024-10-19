package com.haogu.mapper;

import com.haogu.pojo.Project;

import java.util.List;

public interface ProjectMapper extends BaseMapper<Project> {
    List<Project> selectByName(String name);
}




