package com.haogu.service.impl;


import com.github.pagehelper.PageHelper;
import com.haogu.mapper.LeaseMapper;
import com.haogu.mapper.LfacilityMapper;
import com.haogu.pojo.Lease;
import com.haogu.pojo.Lfacility;
import com.haogu.pojo.PageVo;
import com.haogu.service.LeaseService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class LeaseServiceImpl implements LeaseService {
    @Autowired
    private LeaseMapper leaseMapper;
    @Autowired
    private LfacilityMapper lfacilityMapper;

    @Override
    public List<Lease> selectAll() {
        return leaseMapper.selectAll();
    }

    @Override
    public int insert(Lease lease) {
        if (lease == null) {
            throw new RuntimeException("参数为空");
        }
        int result = leaseMapper.insert(lease);
        if (result == 0) {
            throw new RuntimeException("添加失败");
        }
        lfacilityMapper.insert(lease.getId(), lease.getFacilityIds());
        return result;
    }

    @Override
    public int deleteById(Integer id) {
        if (id == null) {
            throw new RuntimeException("id为空");
        }
        if (leaseMapper.deleteById(id) == 0) {
            throw new RuntimeException("删除失败");
        }
        lfacilityMapper.deleteById(id);
        return leaseMapper.deleteById(id);
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        if (ids == null) {
            throw new RuntimeException("id为空");
        }
        if (leaseMapper.deleteBatch(ids) == 0) {
            throw new RuntimeException("删除失败");
        }
        return leaseMapper.deleteBatch(ids);
    }

    @Override
    public int update(Lease lease) {
        if (leaseMapper.update(lease) == 0) {
            throw new RuntimeException("修改失败");
        }
        lfacilityMapper.deleteById(lease.getId());
        log.info("修改id为{}的 facilityIds", lease.getId());
        log.info(" facilityIds{}", lease.getFacilityIds());
        lfacilityMapper.insert(lease.getId(), lease.getFacilityIds());
        return leaseMapper.update(lease);
    }

    @Override
    public List<Lease> selectBySearch(String houseMsg, String houseStatus) {
        return leaseMapper.selectBySearch(houseMsg, houseStatus);
    }

    @Override
    public List<Lease> selectByPage(PageVo pageVo) {
        PageHelper.startPage(pageVo);
        return leaseMapper.selectAll();
    }

    @Override
    public List<Lease> selectById(Integer id) {
        return leaseMapper.selectById(id);
    }
}




