package com.haogu.mapper;


import org.apache.ibatis.annotations.Param;

public interface LfacilityMapper {
    int insert(@Param("leaseId") Integer leaseId,
               @Param("facilityIds") Integer[] facilityIds);
    int deleteById(Integer id);
}
