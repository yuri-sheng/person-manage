package com.shengyu.authentication.service;

import com.shengyu.authentication.model.ApiResponse;
import com.shengyu.authentication.model.UserProfile;

public interface RegisterService {
    ApiResponse registerByMobile(UserProfile userProfile);
}
