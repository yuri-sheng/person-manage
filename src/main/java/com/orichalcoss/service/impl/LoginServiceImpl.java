package com.orichalcoss.service.impl;

import com.orichalcoss.dal.UserProfileDao;
import com.orichalcoss.model.ApiResponse;
import com.orichalcoss.model.UserProfile;
import com.orichalcoss.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    UserProfileDao userProfileDao;

    @Override
    public ApiResponse login(UserProfile userProfileReq) {
        String mobile = userProfileReq.getMobile();
        if(userProfileReq == null || userProfileReq.getMobile() == null){
            return ApiResponse.newInstance(400,"参数异常，请重新输入！");
        }
        if(userProfileReq.getPassword() == null || userProfileReq.getPassword().length() <= 6 ){
            return ApiResponse.newInstance(400,"密码格式不正确，请重新输入！");
        }
        UserProfile userProfile = userProfileDao.getUserProfileByMobile(mobile);
        if(userProfile == null){
            return ApiResponse.newInstance(400,"账号不存在，请重新输入！");
        }
        if(!userProfile.getPassword().equals(userProfileReq.getPassword())){
            return ApiResponse.newInstance(400,"密码不正确，请重新输入！");
        }
        return ApiResponse.newInstance(200,"登录成功");
    }
}
