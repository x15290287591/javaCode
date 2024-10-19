package com.haogu.mapper;

import com.haogu.pojo.Line;

import java.util.List;

public interface LineMapper extends BaseMapper<Line> {
    List<Line> selectByName(String name);
}




