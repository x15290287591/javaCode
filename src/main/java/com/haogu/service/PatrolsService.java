package com.haogu.service;

import com.haogu.pojo.Patrols;

import java.util.List;


public interface PatrolsService extends BaseService<Patrols> {
    List<Patrols> selectByName(String name);
}
