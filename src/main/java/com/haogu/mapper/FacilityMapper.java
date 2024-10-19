package com.haogu.mapper;

import com.haogu.pojo.Facility;

import java.util.List;

public interface FacilityMapper extends BaseMapper<Facility> {
    List<Facility> selectByName(String name);
}




