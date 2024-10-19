package com.haogu.service;

import com.haogu.pojo.Device;

import java.util.List;

public interface DeviceService extends BaseService<Device> {
    List<Device> selectByName(String name, String classify, String serial);
}
