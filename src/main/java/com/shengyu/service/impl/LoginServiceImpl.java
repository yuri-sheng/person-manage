package com.shengyu.service.impl;

import com.shengyu.dao.LoginLogDao;
import com.shengyu.dao.UserProfileDao;
import com.shengyu.model.ApiResponse;
import com.shengyu.model.LoginTime;
import com.shengyu.model.UserProfile;
import com.shengyu.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class LoginServiceImpl implements LoginService {
    private static final Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);

    @Autowired
    UserProfileDao userProfileDao;

    @Autowired
    LoginLogDao loginLogDao;

    @Override
    public ApiResponse login(UserProfile userProfileReq) {
        logger.info("enter LoginServiceImpl.login,param is {}", userProfileReq.getId());
        String mobile = userProfileReq.getMobile();
        if(userProfileReq == null || userProfileReq.getMobile() == null) {
            logger.info("enter LoginServiceImpl.login,param is error");
            return ApiResponse.newInstance(400,"参数异常，请重新输入！");
        }
        if (userProfileReq.getPassword() == null || userProfileReq.getPassword().length() <= 6 ) {
            logger.info("enter LoginServiceImpl.login,password is error");
            return ApiResponse.newInstance(400,"密码格式不正确，请重新输入！");
        }
        UserProfile userProfile = userProfileDao.getUserProfileByMobile(mobile);
        if (userProfile == null) {
            logger.info("enter LoginServiceImpl.login,account is error");
            return ApiResponse.newInstance(400,"账号不存在，请重新输入！");
        }
        if (!userProfile.getPassword().equals(userProfileReq.getPassword())) {
            logger.info("enter LoginServiceImpl.login,account is incorrect");
            return ApiResponse.newInstance(400,"密码不正确，请重新输入！");
        }
        //记录登录日志
        loginLogDao.loginTime(new LoginTime(userProfile.getId(), new Date()));
        logger.info("enter LoginServiceImpl.login,log success,log time is", new Date());
        return ApiResponse.newInstance(200,"登录成功");
    }
}
