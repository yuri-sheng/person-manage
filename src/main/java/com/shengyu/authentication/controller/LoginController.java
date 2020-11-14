package com.shengyu.authentication.controller;

import com.shengyu.authentication.model.ApiResponse;
import com.shengyu.authentication.model.UserProfile;
import com.shengyu.authentication.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*",allowCredentials="true",allowedHeaders = "",methods = {})
@RestController
@RequestMapping("/login")
public class LoginController {
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private LoginService loginService;

    @RequestMapping("/loginByMobile")
    public ApiResponse loginByMobile(@RequestBody UserProfile userProfile) {
        logger.info("enter LoginController.loginByMobile,param is id", userProfile.getId());
        return loginService.login(userProfile);
    }
}
