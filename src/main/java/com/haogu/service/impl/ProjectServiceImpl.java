package com.haogu.service.impl;


import com.haogu.pojo.PageVo;
import com.haogu.pojo.Project;
import com.haogu.service.ProjectService;
import com.haogu.mapper.ProjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProjectServiceImpl implements ProjectService{
    @Autowired
    private ProjectMapper projectMapper;

    @Override
    public int update(Project project) {
        return projectMapper.update(project);
    }

    @Override
    public int insert(Project project) {
        return projectMapper.insert(project);
    }

    @Override
    public int deleteById(Integer id) {
        if (projectMapper.deleteById(id) == 0) {
            throw new RuntimeException("删除失败");
        }
        return projectMapper.deleteById(id);
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        if (ids == null) {
            throw new RuntimeException("id为空");
        }
        if (projectMapper.deleteBatch(ids) == 0) {
            throw new RuntimeException("删除失败");
        }
        return projectMapper.deleteBatch(ids);
    }

    @Override
    public List<Project> selectAll() {
        return projectMapper.selectAll();
    }

    @Override
    public List<Project> selectByPage(PageVo pageVo) {
        return null;
    }

    @Override
    public List<Project> selectByName(String name) {
        return projectMapper.selectByName(name);
    }
}




