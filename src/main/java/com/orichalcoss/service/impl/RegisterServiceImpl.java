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
            int record = userProfileDao.registerByMobile(userProfile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ApiResponse.newInstance();
    }
}
