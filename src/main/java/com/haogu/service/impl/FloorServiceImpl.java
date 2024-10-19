package com.haogu.service.impl;

import com.github.pagehelper.PageHelper;
import com.haogu.mapper.FloorMapper;
import com.haogu.pojo.Floor;
import com.haogu.pojo.PageVo;
import com.haogu.service.FloorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Slf4j
@Service
public class FloorServiceImpl implements FloorService {
    @Autowired
    private FloorMapper floorMapper;

    @Override
    public List<Floor> selectAll() {
        return floorMapper.selectAll();
    }

    @Override
    public int insert(Floor floor) {
        return floorMapper.insert(floor);
    }

    @Override
    public int update(Floor floor) {
        return floorMapper.update(floor);
    }

    @Override
    public int deleteById(Integer id) {
        if (id == null) {
            throw new RuntimeException("id为空");
        }
        if (floorMapper.deleteById(id) == 0) {
            throw new RuntimeException("删除失败");
        }
        return floorMapper.deleteById(id);
    }

    @Override
    public List<Floor> selectByUse(String houseUse) {
        return floorMapper.selectByUse(houseUse);
    }

    @Override
    public List<Floor> selectByName(String name) {
        return floorMapper.selectByName(name);
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        return floorMapper.deleteBatch(ids);
    }

    @Override
    public List<Floor> selectByPage(PageVo pageVo) {
        PageHelper.startPage(pageVo);
        log.info("pageVo:{}", pageVo);
        return floorMapper.selectByPage(pageVo);
    }


}
