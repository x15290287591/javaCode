package com.haogu.service;

import com.haogu.pojo.PageVo;
import com.haogu.pojo.Region;

import java.util.List;

public interface RegionService {
    List<Region> selectAll();
    int deleteById(Integer id);
    int deleteBatch(Integer[] ids);
    int insert(Region region);
    int update(Region region);
    List<Region> selectByName(String name,String number);
    List<Region> selectByPage(PageVo pageVo);
}
