package com.haogu.service.impl;

import com.github.pagehelper.PageHelper;
import com.haogu.pojo.Car;
import com.haogu.pojo.PageVo;
import com.haogu.service.CarService;
import com.haogu.mapper.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    @Autowired
    private CarMapper carMapper;

    @Override
    public int update(Car car) {
        return carMapper.update(car);
    }

    @Override
    public int insert(Car car) {
        return carMapper.insert(car);
    }

    @Override
    public int deleteById(Integer id) {
        if (carMapper.deleteById(id) == 0) {
            throw new RuntimeException("删除失败");
        }
        return carMapper.deleteById(id);
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        if (carMapper.deleteBatch(ids) == 0) {
            throw new RuntimeException("删除失败");
        }
        return carMapper.deleteBatch(ids);
    }

    @Override
    public List<Car> selectAll() {
        return carMapper.selectAll();
    }


    @Override
    public List<Car> selectByPage(PageVo pageVo) {
        PageHelper.startPage(pageVo);
        return carMapper.selectAll();
    }

    @Override
    public List<Car> selectByStatus(String status, String carNum) {
        return carMapper.selectByStatus(status, carNum);
    }
}




