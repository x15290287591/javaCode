package com.haogu.service.impl;

import com.haogu.pojo.PageVo;
import com.haogu.pojo.Repair;
import com.haogu.service.RepairService;
import com.haogu.mapper.RepairMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepairServiceImpl implements RepairService{
    @Autowired
    private RepairMapper repairMapper;

    @Override
    public int update(Repair repair) {
        return repairMapper.update(repair);
    }

    @Override
    public int insert(Repair repair) {
        return repairMapper.insert(repair);
    }

    @Override
    public int deleteById(Integer id) {
        if (repairMapper.deleteById(id) == 0) {
            throw new RuntimeException("删除失败");
        }
        return repairMapper.deleteById(id);
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        if (repairMapper.deleteBatch(ids) == 0) {
            throw new RuntimeException("删除失败");
        }
        return repairMapper.deleteBatch(ids);
    }

    @Override
    public List<Repair> selectAll() {
        return repairMapper.selectAll();
    }

    @Override
    public List<Repair> selectByPage(PageVo pageVo) {
        return null;
    }

    @Override
    public List<Repair> selectByName(String name, String serial, String model) {
        return repairMapper.selectByName(name,serial,model);
    }
}




