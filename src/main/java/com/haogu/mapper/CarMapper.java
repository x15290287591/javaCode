package com.haogu.mapper;

import com.haogu.pojo.Car;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CarMapper extends BaseMapper<Car> {
List<Car> selectByStatus(@Param("status") String status,
                         @Param("carNum") String carNum);
}




