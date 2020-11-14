package com.shengyu.authentication.proxy.impl;

import com.alibaba.fastjson.JSONObject;
import com.shengyu.authentication.utils.RedisUtils;
import com.shengyu.authentication.dao.UserInfoDao;
import com.shengyu.authentication.model.UserInfo;
import com.shengyu.authentication.proxy.UserInfoProxyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserInfoProxyServiceImpl implements UserInfoProxyService {

    @Autowired
    private RedisUtils redisUtils;

    @Resource
    UserInfoDao userInfoDao;

    private static String REDIS_USER_INFO = "user:info:";

    @Override
    public UserInfo getUserInfoById(Integer id) {
        String str = redisUtils.get(REDIS_USER_INFO + id);
        if (str != null) {
            UserInfo userInfo = JSONObject.parseObject(str, UserInfo.class);
            return userInfo;
        } else {
            UserInfo user = userInfoDao.getUserInfoById(id);
            redisUtils.set(REDIS_USER_INFO + id, JSONObject.toJSONString(user));
            return user;
        }
    }
}