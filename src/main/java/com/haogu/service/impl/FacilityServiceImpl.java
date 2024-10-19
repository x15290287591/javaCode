package com.haogu.service.impl;

import com.github.pagehelper.PageHelper;
import com.haogu.pojo.Facility;
import com.haogu.pojo.PageVo;
import com.haogu.service.FacilityService;
import com.haogu.mapper.FacilityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FacilityServiceImpl implements FacilityService{
    @Autowired
    private  FacilityMapper facilityMapper;

    @Override
    public int update(Facility facility) {
        return facilityMapper.update(facility);
    }

    @Override
    public int insert(Facility facility) {
        return facilityMapper.insert(facility);
    }

    @Override
    public int deleteById(Integer id) {
        if (facilityMapper.deleteById(id) == 0) {
            throw new RuntimeException("删除失败");
        }
        return facilityMapper.deleteById(id);
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        if (facilityMapper.deleteBatch(ids) == 0) {
            throw new RuntimeException("删除失败");
        }
        return facilityMapper.deleteBatch(ids);
    }

    @Override
    public List<Facility> selectAll() {
        return facilityMapper.selectAll();
    }

    @Override
    public List<Facility> selectByPage(PageVo pageVo) {
        PageHelper.startPage(pageVo);
        return facilityMapper.selectAll();
    }

    @Override
    public List<Facility> selectByName(String name) {
        return facilityMapper.selectByName(name);
    }
}




