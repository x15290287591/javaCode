package com.haogu.service.impl;

import com.haogu.mapper.LoginMapper;
import com.haogu.pojo.Employee;
import com.haogu.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.UUID;
import java.util.concurrent.TimeUnit;
@Slf4j
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper loginMapper;
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public String login(Employee employee) {
        if (!StringUtils.hasText(employee.getPhone())) {
            throw new RuntimeException("手机号不能为空");
        }
        if (!StringUtils.hasText(employee.getPassword())) {
            throw new RuntimeException("密码不能为空");
        }
        Employee employee1 = loginMapper.getPasswordByPhone(employee.getPhone());
        if (employee1 == null) {
            throw new RuntimeException("账户不存在");
        }
        if (!employee.getPassword().equals(employee1.getPassword())) {
            throw new RuntimeException("密码错误");
        }
        String token = UUID.randomUUID().toString().replace("-", "");
        redisTemplate.opsForValue().set(token, employee.getId());
        redisTemplate.expire(token, 2, TimeUnit.HOURS);
//        log.info("token:{}", token);
        return token;
    }
}
