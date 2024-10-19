package com.haogu.service;

import com.haogu.pojo.Floor;
import com.haogu.pojo.House;
import com.haogu.pojo.PageVo;

import java.util.List;

public interface HouseService {
    int insert(House house);
    int deleteById(Integer id);
    int update(House house);
    int deleteBatch(Integer[] ids);
    List<House> selectAll();
    List<House> selectByUse(String houseUse);
    List<House> selectByName(String name);
    List<House> selectByPage(PageVo pageVo);
}
