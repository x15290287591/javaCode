package com.haogu.service;

import com.haogu.pojo.PageVo;
import com.haogu.pojo.Tag;

import java.util.List;

public interface TagService extends BaseService<Tag> {
    List<Tag> selectByPage(PageVo pageVo);
    List<Tag> selectByName(String name);

}
