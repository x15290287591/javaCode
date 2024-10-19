package com.haogu.mapper;

import com.haogu.pojo.Floor;
import com.haogu.pojo.PageVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FloorMapper {
    int insert(Floor floor);
    int deleteById(Integer id);
    int update(Floor floor);
    List<Floor> selectByName(String name);
    List<Floor> selectAll();
    List<Floor> selectByUse(String houseUse);
    //批量删除
    int deleteBatch(Integer[] ids);
    List<Floor> selectByPage(PageVo pageVo);
}
