package com.haogu.service;

import com.haogu.pojo.Lease;
import com.haogu.pojo.PageVo;

import java.util.List;


public interface LeaseService {
    List<Lease> selectAll();
    int insert(Lease lease);
    int deleteById(Integer id);
    int deleteBatch(Integer[] ids);
    int update(Lease lease);
    List<Lease> selectBySearch(String houseMsg, String houseStatus);
    List<Lease> selectByPage(PageVo pageVo);
    List<Lease> selectById(Integer id);

}
