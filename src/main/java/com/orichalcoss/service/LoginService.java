package com.orichalcoss.service;

import com.orichalcoss.model.ApiResponse;
import com.orichalcoss.model.UserProfile;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {
    ApiResponse login( UserProfile userProfile);

}
