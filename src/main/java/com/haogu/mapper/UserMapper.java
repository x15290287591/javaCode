package com.haogu.mapper;

import com.haogu.pojo.PageVo;
import com.haogu.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

public interface UserMapper {
    int insert(User user);

    int deleteById(Integer id);

    int deleteBatch(Integer[] ids);

    int update(User user);

    @Select("select * from sys_user")
    List<User> selectAll();

    List<User> selectBySearch(PageVo pageVo);

    List<User> selectByRoomNum(String roomNum);

    List<User> selectById(Integer id);
    boolean selectByCheck(@Param("userId") Integer userId,
                          @Param("tagId") Integer tagId);
}
