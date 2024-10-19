package com.haogu.mapper;

import com.haogu.pojo.Storage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StorageMapper {
    int insert(Storage storage);
    int deleteById(Integer id);
    int update(Storage storage);
    int deleteBatch(Integer[] ids);
    List<Storage> selectAll();
    List<Storage> selectByNum(String num);
    List<Storage> selectByPage(@Param("pageNum") Integer pageNum,
                             @Param("pageSize") Integer pageSize);
}
