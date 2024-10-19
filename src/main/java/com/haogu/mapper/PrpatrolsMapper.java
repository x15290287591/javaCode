package com.haogu.mapper;

public interface PrpatrolsMapper {
    int insert(Integer patrolsId,Integer[] projectIds);
    int deleteById(Integer id);
}
