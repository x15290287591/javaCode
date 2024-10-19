package com.haogu.service;

import com.haogu.pojo.Project;

import java.util.List;

public interface ProjectService extends BaseService<Project> {
    List<Project> selectByName(String name);
}
