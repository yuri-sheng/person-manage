package com.shengyu.controller;

import com.shengyu.model.ApiResponse;
import com.shengyu.model.UserProfile;
import com.shengyu.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping("/loginByMobiles")
    public ApiResponse loginByMobile() {
        logger.info("enter LoginController.loginByMobile,param is null");
        return new ApiResponse();
    }
}
