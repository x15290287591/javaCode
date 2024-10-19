package com.haogu.service;

import com.haogu.pojo.Floor;
import com.haogu.pojo.PageVo;

import java.util.List;

public interface FloorService {
    List<Floor> selectAll();
    int insert(Floor floor);
    int update(Floor floor);
    int deleteById(Integer id);
    List<Floor> selectByUse(String houseUse);
    List<Floor> selectByName(String name);
    int deleteBatch(Integer[] ids);
    List<Floor> selectByPage(PageVo pageVo);
}
