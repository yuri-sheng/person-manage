package com.shengyu.service;

import com.shengyu.model.ApiResponse;
import com.shengyu.model.UserProfile;

public interface RegisterService {
    ApiResponse registerByMobile(UserProfile userProfile);
}
