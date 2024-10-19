package com.haogu.service;

import com.haogu.pojo.Line;

import java.util.List;


public interface LineService extends BaseService<Line> {
    List<Line> selectByName(String name);
}
