package com.haogu.mapper;

import com.haogu.pojo.PageVo;
import com.haogu.pojo.Tag;

import java.util.List;

public interface TagMapper extends BaseMapper<Tag> {
    List<Tag> selectByPage(PageVo pageVo);
    List<Tag> selectByName(String name);
}




