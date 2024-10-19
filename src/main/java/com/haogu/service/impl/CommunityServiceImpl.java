package com.haogu.service.impl;

import com.haogu.mapper.CommunityMapper;
import com.haogu.pojo.Community;
import com.haogu.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class CommunityServiceImpl implements CommunityService {
    @Autowired
    private CommunityMapper communityMapper;
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private HttpServletRequest request;
    @Override
    public int insert(Community community) {
        return communityMapper.insert(community);
    }

    @Override
    public int deleteById(Integer id) {
        if (id==null){
            throw new RuntimeException("id为空");
        }
        if (communityMapper.deleteById(id)==0){
            throw new RuntimeException("删除失败");
        }
        return communityMapper.deleteById(id);
    }

    @Override
    public int update(Community community) {
        return communityMapper.update(community);
    }

    @Override
    public List<Community> selectByEmployee() {
        Integer employeeId = (Integer) redisTemplate.opsForValue().get(request.getHeader("token"));
        return communityMapper.selectByEmployee(employeeId);
    }

    @Override
    public List<Community> selectByTree(Integer id) {
        return communityMapper.selectByTree(id);
    }
}
