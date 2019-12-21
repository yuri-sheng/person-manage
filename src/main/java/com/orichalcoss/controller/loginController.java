package com.orichalcoss.controller;

import com.orichalcoss.model.ApiResponse;
import com.orichalcoss.model.UserProfile;
import com.orichalcoss.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class loginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/loginByMobile")
    public ApiResponse loginByMobile(@RequestBody UserProfile userProfile){
        return loginService.login(userProfile);
    }

}
