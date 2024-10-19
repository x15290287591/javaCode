package com.haogu.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        log.info("uri:{}",request.getRequestURI());
//        String token = request.getHeader("token");
//        if (!StringUtils.hasText(token)){
//            throw new RuntimeException("token不能为空");
//        }
//        Integer UserId = (Integer) redisTemplate.opsForValue().get(token);
//        if (UserId==null){
//            throw new RuntimeException("token无效");
//        }
        return true;
    }
}
