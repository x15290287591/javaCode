package com.haogu.service;

import com.haogu.pojo.PageVo;
import com.haogu.pojo.User;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

public interface UserService {
    int insert(User user);

    int deleteById(Integer id);

    int deleteBatch(Integer[] ids);

    int update(User user);

    List<User> selectAll();

    List<User> selectBySearch(PageVo pageVo);

    List<User> selectByRoomNum(String roomNum);
    List<User> selectById(Integer id);
}
