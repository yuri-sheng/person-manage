package com.shengyu.service;

import com.shengyu.model.ApiResponse;
import com.shengyu.model.UserProfile;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {
    ApiResponse login( UserProfile userProfile);
}
