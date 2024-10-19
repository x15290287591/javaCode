package com.haogu.mapper;

import com.haogu.pojo.Card;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface CardMapper extends BaseMapper<Card> {
    List<Card> selectByStatus(@Param("status") String status,
                              @Param("monthcard") String monthcard);

}




