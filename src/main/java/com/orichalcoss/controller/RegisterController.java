package com.orichalcoss.controller;

import com.orichalcoss.model.ApiResponse;
import com.orichalcoss.model.UserProfile;
import com.orichalcoss.service.RegisterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class RegisterController {
    private static final Logger logger = LoggerFactory.getLogger(RegisterController.class);
    @Autowired
    RegisterService registerService;

    @RequestMapping("/registerByMobile")
    public ApiResponse register(@RequestBody UserProfile userProfile){
        logger.info("enter RegisterController.registerByMobile,param is {}",userProfile.getId());
        return registerService.registerByMobile(userProfile);
    }

}
