package com.haogu.service.impl;

import com.haogu.mapper.UserMapper;
import com.haogu.mapper.UserTagMapper;
import com.haogu.pojo.PageVo;
import com.haogu.pojo.User;
import com.haogu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserTagMapper userTagMapper;

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int deleteById(Integer id) {
        if (id == null) {
            throw new RuntimeException("id为空");
        }
        if (userMapper.deleteById(id) == 0) {
            throw new RuntimeException("删除失败");
        }
        return userMapper.deleteById(id);
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        if (ids == null) {
            throw new RuntimeException("id为空");
        }
        if (userMapper.deleteBatch(ids) == 0) {
            throw new RuntimeException("删除失败");
        }
        return userMapper.deleteBatch(ids);
    }

    @Override
    public int update(User user) {
        int result = userMapper.update(user);
        if (result == 0) {
            throw new RuntimeException("修改失败");
        }
        userTagMapper.deleteById(user.getId());
        userTagMapper.insert(user.getId(), user.getTagIds());
        return result;
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public List<User> selectBySearch(PageVo pageVo) {
        return userMapper.selectBySearch(pageVo);
    }


    @Override
    public List<User> selectByRoomNum(String roomNum) {
        return userMapper.selectByRoomNum(roomNum);
    }

    @Override
    public List<User> selectById(Integer id) {
        return userMapper.selectById(id);
    }


}
