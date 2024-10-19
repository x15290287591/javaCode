package com.haogu.service.impl;


import com.haogu.pojo.Classify;
import com.haogu.pojo.PageVo;
import com.haogu.service.ClassifyService;
import com.haogu.mapper.ClassifyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClassifyServiceImpl implements ClassifyService{
    @Autowired
    private ClassifyMapper classifyMapper;

    @Override
    public int update(Classify classify) {
        return classifyMapper.update(classify);
    }

    @Override
    public int insert(Classify classify) {
        return classifyMapper.insert(classify);
    }

    @Override
    public int deleteById(Integer id) {
        return classifyMapper.deleteById(id);
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        return classifyMapper.deleteBatch(ids);
    }

    @Override
    public List<Classify> selectAll() {
        return classifyMapper.selectAll();
    }

    @Override
    public List<Classify> selectByPage(PageVo pageVo) {
        return null;
    }
}




