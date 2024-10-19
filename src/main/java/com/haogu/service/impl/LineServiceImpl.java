package com.haogu.service.impl;


import com.haogu.mapper.PatrolsLineMapper;
import com.haogu.pojo.Line;
import com.haogu.pojo.PageVo;
import com.haogu.service.BaseService;
import com.haogu.service.LineService;
import com.haogu.mapper.LineMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LineServiceImpl implements LineService{
    @Autowired
    private LineMapper lineMapper;
    @Autowired
    private PatrolsLineMapper patrolsLineMapper;

    @Override
    public int update(Line line) {
        int result = lineMapper.update(line);
        if (result == 0) {
            throw new RuntimeException("修改失败");
        }
        patrolsLineMapper.deleteById(line.getId());
        patrolsLineMapper.insert(line.getId(), line.getPatrolsIds());
        return result;
    }

    @Override
    public int insert(Line line) {
        int result = lineMapper.insert(line);
        if (result == 0) {
            throw new RuntimeException("添加失败");
        }
        patrolsLineMapper.insert(line.getId(), line.getPatrolsIds());
        return result;
    }

    @Override
    public int deleteById(Integer id) {
        int result = lineMapper.deleteById(id);
        if (result == 0) {
            throw new RuntimeException("删除失败");
        }
        return result;
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        int result = lineMapper.deleteBatch(ids);
        if (result == 0) {
            throw new RuntimeException("删除失败");
        }
        return result;
    }

    @Override
    public List<Line> selectAll() {
        return lineMapper.selectAll();
    }

    @Override
    public List<Line> selectByPage(PageVo pageVo) {
        return null;
    }

    @Override
    public List<Line> selectByName(String name) {
        return lineMapper.selectByName(name);
    }
}




