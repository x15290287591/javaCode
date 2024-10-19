package com.haogu.mapper;

import com.haogu.pojo.Role;

import java.util.List;

public interface RoleMapper extends BaseMapper<Role> {
    List<Role> selectByName(String name);
}




