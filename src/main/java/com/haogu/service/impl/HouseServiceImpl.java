package com.haogu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.haogu.mapper.HouseMapper;
import com.haogu.pojo.Floor;
import com.haogu.pojo.House;
import com.haogu.pojo.PageVo;
import com.haogu.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseServiceImpl implements HouseService {
    @Autowired
    private HouseMapper houseMapper;
    @Override
    public int insert(House house) {
        return houseMapper.insert(house);
    }

    @Override
    public int deleteById(Integer id) {
        if (id==null){
            throw new RuntimeException("id为空");
        }
        if (houseMapper.deleteById(id)==0){
            throw new RuntimeException("删除失败");
        }
        return houseMapper.deleteById(id);
    }

    @Override
    public int update(House house) {
        return houseMapper.update(house);
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        if (ids==null){
            throw new RuntimeException("id为空");
        }
        if (houseMapper.deleteBatch(ids)==0){
            throw new RuntimeException("删除失败");
        }
        return houseMapper.deleteBatch(ids);
    }

    @Override
    public List<House> selectAll() {
        return houseMapper.selectAll();
    }

    @Override
    public List<House> selectByUse(String houseUse) {
        return houseMapper.selectByUse(houseUse);
    }

    @Override
    public List<House> selectByName(String name) {
        return houseMapper.selectByName(name);
    }

    @Override
    public List<House> selectByPage(PageVo pageVo) {
        if (pageVo.getPageNum()==null||pageVo.getPageSize()==null){
            throw new RuntimeException("页码或页大小为空");
        }
        PageHelper.startPage(pageVo);
        return houseMapper.selectByPage(pageVo);
    }
}
