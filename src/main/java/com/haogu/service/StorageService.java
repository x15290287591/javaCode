package com.haogu.service;

import com.haogu.pojo.Storage;

import java.util.List;

public interface StorageService {
    int insert(Storage storage);
    int deleteById(Integer id);
    int update(Storage storage);
    int deleteBatch(Integer[] ids);
    List<Storage> selectAll();
    List<Storage> selectByNum(String num);
    List<Storage> selectByPage(Integer pageNum, Integer pageSize);
}
