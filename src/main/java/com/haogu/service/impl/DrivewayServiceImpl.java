package com.haogu.service.impl;

import com.github.pagehelper.PageHelper;
import com.haogu.pojo.Driveway;
import com.haogu.pojo.PageVo;
import com.haogu.service.DrivewayService;
import com.haogu.mapper.DrivewayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DrivewayServiceImpl implements DrivewayService{
    @Autowired
    private DrivewayMapper drivewayMapper;

    @Override
    public int update(Driveway driveway) {
        return drivewayMapper.update(driveway);
    }

    @Override
    public int insert(Driveway driveway) {
        return drivewayMapper.insert(driveway);
    }

    @Override
    public int deleteById(Integer id) {
        if (drivewayMapper.deleteById(id) == 0) {
            throw new RuntimeException("删除失败");
        }
        return drivewayMapper.deleteById(id);
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        if (ids == null) {
            throw new RuntimeException("id为空");
        }
        if (drivewayMapper.deleteBatch(ids) == 0) {
            throw new RuntimeException("删除失败");
        }
        return drivewayMapper.deleteBatch(ids);
    }

    @Override
    public List<Driveway> selectAll() {
        return drivewayMapper.selectAll();
    }

    @Override
    public List<Driveway> selectByPage(PageVo pageVo) {
        PageHelper.startPage(pageVo);
        return drivewayMapper.selectAll();
    }

    @Override
    public List<Driveway> selectByStatus(String audit, String number) {
        return drivewayMapper.selectByStatus(audit, number);
    }
}




