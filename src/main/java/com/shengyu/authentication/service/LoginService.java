package com.shengyu.authentication.service;

import com.shengyu.authentication.model.ApiResponse;
import com.shengyu.authentication.model.UserProfile;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {
    ApiResponse login( UserProfile userProfile);
}
