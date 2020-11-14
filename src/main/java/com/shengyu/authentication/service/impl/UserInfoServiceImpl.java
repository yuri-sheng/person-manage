package com.shengyu.service.impl;

import com.shengyu.dao.UserInfoDao;
import com.shengyu.model.UserInfo;
import com.shengyu.service.UserInfoService;
import com.shengyu.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    private static final Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);

    @Autowired
    UserInfoDao userInfoDao;

    @Override
    public UserInfo getUserInfoById(int id) {
        logger.info("enter UserInfoServiceImpl.getUserInfoById id={}",id);
        return userInfoDao.getUserInfoById(id);
    }

    public List<UserInfo> getUserInfoByIds(String ids) {
        logger.info("enter UserInfoServiceImpl.getUserInfoByIds id={}", ids);
        List<Integer> list  = StringUtils.transform(Arrays.asList(ids.split(",")));
        return userInfoDao.getUserInfoByIds(list);
    }
}