package com.haogu.mapper;

public interface PatrolsLineMapper {
    int insert(Integer lineId,Integer[] patrolsIds);
    int deleteById(Integer id);
}
