package com.haogu.mapper;

import com.haogu.pojo.Patrols;

import java.util.List;

public interface PatrolsMapper extends BaseMapper<Patrols> {
    List<Patrols> selectByName(String name);
}




