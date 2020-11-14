package com.shengyu.authentication.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisUtils {
    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    public String get(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    public boolean set(String key,String value) {
        boolean result = false;
        try {
            redisTemplate.opsForValue().set(key,value);
            result = true;
        } catch(Exception e ) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean getAndSet(String key,String value){
        boolean result = false;
        try {
            redisTemplate.opsForValue().getAndSet(key,value);
            result = true;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean delete(String key) {
        boolean result = false;
        try {
            redisTemplate.delete(key);
            result = true;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
