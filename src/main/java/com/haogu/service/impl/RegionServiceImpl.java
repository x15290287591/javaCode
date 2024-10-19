package com.haogu.service.impl;

import com.github.pagehelper.PageHelper;
import com.haogu.mapper.RegionMapper;
import com.haogu.pojo.PageVo;
import com.haogu.pojo.Region;
import com.haogu.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionServiceImpl implements RegionService {
    @Autowired
    private RegionMapper regionMapper;

    @Override
    public List<Region> selectAll() {
        return regionMapper.selectAll();
    }

    @Override
    public int deleteById(Integer id) {
        if (regionMapper.deleteById(id) == 0) {
            throw new RuntimeException("删除失败");
        }
        return regionMapper.deleteById(id);
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        if (ids == null) {
            throw new RuntimeException("id为空");
        }
        if (regionMapper.deleteBatch(ids) == 0) {
            throw new RuntimeException("删除失败");
        }
        return regionMapper.deleteBatch(ids);
    }

    @Override
    public int insert(Region region) {
        return regionMapper.insert(region);
    }

    @Override
    public int update(Region region) {
        return regionMapper.update(region);
    }

    @Override
    public List<Region> selectByName(String name, String number) {
        return regionMapper.selectByName(name, number);
    }

    @Override
    public List<Region> selectByPage(PageVo pageVo) {
        PageHelper.startPage(pageVo);
        return regionMapper.selectAll();
    }
}




