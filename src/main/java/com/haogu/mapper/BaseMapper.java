package com.haogu.mapper;

import com.haogu.pojo.PageVo;

import java.util.List;

public interface BaseMapper<T> {
    int update(T t);
    int insert(T t);
    int deleteById(Integer id);
    int deleteBatch(Integer[] ids);
    List<T> selectAll();
}
