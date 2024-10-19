package com.haogu.mapper;

import com.haogu.pojo.Driveway;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface DrivewayMapper extends BaseMapper<Driveway> {
List<Driveway> selectByStatus(@Param("audit") String audit,
                              @Param("number") String number);
}




