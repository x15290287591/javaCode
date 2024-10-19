package com.haogu.service.impl;

import com.haogu.pojo.PageVo;
import com.haogu.pojo.Role;
import com.haogu.service.RoleService;
import com.haogu.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RoleServiceImpl implements RoleService{
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public int update(Role role) {
        return roleMapper.update(role);
    }

    @Override
    public int insert(Role role) {
        return roleMapper.insert(role);
    }

    @Override
    public int deleteById(Integer id) {
        int result = roleMapper.deleteById(id);
        if (result == 0) {
            throw new RuntimeException("删除失败");
        }
        return result;
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        int result = roleMapper.deleteBatch(ids);
        if (result == 0) {
            throw new RuntimeException("删除失败");
        }
        return result;
    }

    @Override
    public List<Role> selectAll() {
        return roleMapper.selectAll();
    }

    @Override
    public List<Role> selectByPage(PageVo pageVo) {
        return null;
    }

    @Override
    public List<Role> selectByName(String name) {
        return roleMapper.selectByName(name);
    }
}




