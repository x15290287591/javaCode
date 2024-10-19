package com.haogu.service.impl;


import com.haogu.mapper.StorageMapper;
import com.haogu.pojo.Storage;
import com.haogu.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StorageServiceImpl implements StorageService {
    @Autowired
    private StorageMapper storageMapper;

    @Override
    public int insert(Storage storage) {
        return storageMapper.insert(storage);
    }

    @Override
    public int deleteById(Integer id) {
        return storageMapper.deleteById(id);
    }

    @Override
    public int update(Storage storage) {
        return storageMapper.update(storage);
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        return storageMapper.deleteBatch(ids);
    }

    @Override
    public List<Storage> selectAll() {
        return storageMapper.selectAll();
    }

    @Override
    public List<Storage> selectByNum(String num) {
        return storageMapper.selectByNum(num);
    }


    @Override
    public List<Storage> selectByPage(Integer pageNum, Integer pageSize) {
        return storageMapper.selectByPage((pageNum-1)*pageSize, pageSize);
    }
}
