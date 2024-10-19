package com.haogu.mapper;

import com.haogu.pojo.UserTag;
import org.apache.ibatis.annotations.Param;

public interface UserTagMapper {
    int insert(@Param("userId") Integer UserId,
               @Param("tagIds") Integer[] tagIds);
    int deleteById(Integer id);
}
