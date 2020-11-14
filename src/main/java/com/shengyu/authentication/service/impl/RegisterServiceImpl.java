package com.shengyu.service.impl;

import com.shengyu.dao.UserProfileDao;
import com.shengyu.model.ApiResponse;
import com.shengyu.model.UserProfile;
import com.shengyu.service.RegisterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {
    private static final Logger logger = LoggerFactory.getLogger(RegisterServiceImpl.class);

    @Autowired

    private UserProfileDao userProfileDao;

    @Override
    public ApiResponse registerByMobile(UserProfile userProfile) {
        logger.info("enter RegisterServiceImpl.registerByMobile id={}", userProfile.getId());
        try {
            UserProfile userProfilersp = userProfileDao.getUserProfileByMobile(userProfile.getMobile());
            if (userProfilersp != null) {
                return ApiResponse.newInstance(400,"该账号已存在");
            }
            int record = userProfileDao.registerByMobile(userProfile);
            if (record >= 1) {
                logger.info("registerByMobile error");
                return ApiResponse.newInstance(200,"注册成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        logger.info("registerByMobile error");
        return ApiResponse.newInstance(400,"注册失败");
    }
}
