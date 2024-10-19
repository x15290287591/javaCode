package com.haogu.service;

import com.haogu.pojo.Repair;

import java.util.List;

public interface RepairService extends BaseService<Repair> {
    List<Repair> selectByName(String name,String serial,String model);
}
