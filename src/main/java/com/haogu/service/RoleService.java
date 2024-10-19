package com.haogu.service;

import com.haogu.pojo.Role;

import java.util.List;


public interface RoleService extends BaseService<Role> {
    List<Role> selectByName(String name);
}
