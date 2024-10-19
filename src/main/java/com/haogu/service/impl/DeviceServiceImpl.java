package com.haogu.service.impl;

import com.haogu.pojo.Device;
import com.haogu.pojo.PageVo;
import com.haogu.service.DeviceService;
import com.haogu.mapper.DeviceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DeviceServiceImpl implements DeviceService{
    @Autowired
    private DeviceMapper deviceMapper;

    @Override
    public int update(Device device) {
        return deviceMapper.update(device);
    }

    @Override
    public int insert(Device device) {
        return deviceMapper.insert(device);
    }

    @Override
    public int deleteById(Integer id) {
        return deviceMapper.deleteById(id);
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        return deviceMapper.deleteBatch(ids);
    }

    @Override
    public List<Device> selectAll() {
        return deviceMapper.selectAll();
    }

    @Override
    public List<Device> selectByPage(PageVo pageVo) {
        return null;
    }

    @Override
    public List<Device> selectByName(String name, String classify, String serial) {
        return deviceMapper.selectByName(name, classify, serial);
    }
}




