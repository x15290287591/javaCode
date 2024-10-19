package com.haogu.service;

import com.haogu.pojo.PageVo;

import java.util.List;

public interface BaseService<T> {
    int update(T t);
    int insert(T t);
    int deleteById(Integer id);
    int deleteBatch(Integer[] ids);
    List<T> selectAll();
    List<T> selectByPage(PageVo pageVo);
}
