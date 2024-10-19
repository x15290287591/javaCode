package com.haogu.mapper;

import com.haogu.pojo.Repair;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RepairMapper extends BaseMapper<Repair> {
List<Repair> selectByName(@Param("name") String name,
                          @Param("serial") String serial,
                          @Param("model") String model);
}




