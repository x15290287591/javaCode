package com.haogu.mapper;

import com.haogu.pojo.Region;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RegionMapper{
    List<Region> selectAll();
    @Delete("delete from sys_region where id = #{id}")
    int deleteById(Integer id);
    int deleteBatch(Integer[] ids);
    int insert(Region region);
    int update(Region region);
    List<Region> selectByName(@Param("name") String name,
                              @Param("number") String number);
}




