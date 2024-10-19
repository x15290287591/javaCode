package com.haogu.service.impl;


import com.haogu.mapper.PrpatrolsMapper;
import com.haogu.pojo.PageVo;
import com.haogu.pojo.Patrols;
import com.haogu.service.PatrolsService;
import com.haogu.mapper.PatrolsMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class PatrolsServiceImpl implements PatrolsService {
    @Autowired
    private PatrolsMapper patrolsMapper;
    @Autowired
    private PrpatrolsMapper prpatrolsMapper;

    @Override
    public int update(Patrols patrols) {
        int result = patrolsMapper.update(patrols);
        if (result == 0) {
            throw new RuntimeException("修改失败");
        }
        prpatrolsMapper.deleteById(patrols.getId());
        prpatrolsMapper.insert(patrols.getId(), patrols.getProjectIds());
        return result;
    }

    @Override
    public int insert(Patrols patrols) {
        int result = patrolsMapper.insert(patrols);
        if (result == 0) {
            throw new RuntimeException("添加失败");
        }
        log.info("patrolsId:{}",patrols.getId());
        prpatrolsMapper.insert(patrols.getId(), patrols.getProjectIds());

        return result;
    }

    @Override
    public int deleteById(Integer id) {
        int result = patrolsMapper.deleteById(id);
        if (result == 0) {
            throw new RuntimeException("删除失败");
        }
        return result;
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        return patrolsMapper.deleteBatch(ids);
    }

    @Override
    public List<Patrols> selectAll() {
        return patrolsMapper.selectAll();
    }

    @Override
    public List<Patrols> selectByPage(PageVo pageVo) {
        return null;
    }

    @Override
    public List<Patrols> selectByName(String name) {
        return patrolsMapper.selectByName(name);
    }
}




