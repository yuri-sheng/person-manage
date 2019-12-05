package com.orichalcoss.service.impl;

import com.orichalcoss.dal.UserInfoDao;
import com.orichalcoss.model.User;
import com.orichalcoss.service.UserInfoService;
import com.orichalcoss.utils.RedisUtils;
import com.orichalcoss.utils.RestTemplateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    private static final Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);

    @Resource
    UserInfoDao userInfoDao;

    @Autowired
    RedisUtils redisUtils;

    @Autowired
    RestTemplateUtils restTemplateUtils;

    @Override
    public User getUserInfoById(int id){
        logger.info("enter UserInfoServiceImpl.getUserById,param is id",id);
        User user = userInfoDao.getUserInfoById(id);
//        String eamil = restTemplateUtils.get("https://www.baidu.com");
//        user.setEmail(eamil);
        return user;
    }

}
