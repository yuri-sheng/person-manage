package com.orichalcoss.service;

import com.orichalcoss.model.ApiResponse;
import com.orichalcoss.model.UserProfile;

public interface RegisterService {
    ApiResponse registerByMobile(UserProfile userProfile);
}
