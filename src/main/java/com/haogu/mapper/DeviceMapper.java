package com.haogu.mapper;

import com.haogu.pojo.Device;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeviceMapper extends BaseMapper<Device> {
        List<Device> selectByName(@Param("name") String name,
                                  @Param("classify") String classify,
                                  @Param("serial") String serial);
}




