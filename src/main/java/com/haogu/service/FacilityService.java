package com.haogu.service;

import com.haogu.pojo.Facility;

import java.util.List;


public interface FacilityService extends BaseService<Facility> {
    List<Facility> selectByName(String name);
}
