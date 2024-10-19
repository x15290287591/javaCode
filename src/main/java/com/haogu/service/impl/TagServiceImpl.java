package com.haogu.service.impl;

import com.github.pagehelper.PageHelper;
import com.haogu.pojo.PageVo;
import com.haogu.pojo.Tag;
import com.haogu.service.TagService;
import com.haogu.mapper.TagMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl implements TagService{
    @Autowired
    private TagMapper tagMapper;

    @Override
    public int update(Tag tag) {
        return tagMapper.update(tag);
    }

    @Override
    public int insert(Tag tag) {
        return tagMapper.insert(tag);
    }

    @Override
    public int deleteById(Integer id) {
        int result = tagMapper.deleteById(id);
        if (result == 0) {
            throw new RuntimeException("删除失败");
        }
        return result;
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        int result = tagMapper.deleteBatch(ids);
        if (result == 0) {
            throw new RuntimeException("删除失败");
        }
        return result;
    }

    @Override
    public List<Tag> selectAll() {
        return tagMapper.selectAll();
    }

    @Override
    public List<Tag> selectByPage(PageVo pageVo) {
        PageHelper.startPage(pageVo);
        return tagMapper.selectByPage(pageVo);
    }

    @Override
    public List<Tag> selectByName(String name) {
        return tagMapper.selectByName(name);
    }
}




