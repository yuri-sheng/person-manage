package com.orichalcoss.controller;

import com.orichalcoss.model.ApiResponse;
import com.orichalcoss.model.UserProfile;
import com.orichalcoss.service.LoginService;
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
    public ApiResponse loginByMobile(@RequestBody UserProfile userProfile){
        logger.info("enter LoginController.loginByMobile,param is id",userProfile.getId());
        return loginService.login(userProfile);
    }

}
