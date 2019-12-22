package com.orichalcoss.service.impl;

import com.orichalcoss.dal.UserProfileDao;
import com.orichalcoss.model.ApiResponse;
import com.orichalcoss.model.UserProfile;
import com.orichalcoss.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private UserProfileDao userProfileDao;

    @Override
    public ApiResponse registerByMobile(UserProfile userProfile) {
        try {

            UserProfile userProfilersp = userProfileDao.getUserProfileByMobile(userProfile.getMobile());
            if(userProfilersp != null){
                return ApiResponse.newInstance(400,"该账号已存在");
            }
            int record = userProfileDao.registerByMobile(userProfile);
            if(record >= 1){
                return ApiResponse.newInstance(200,"注册成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ApiResponse.newInstance(400,"注册失败");
    }
}
