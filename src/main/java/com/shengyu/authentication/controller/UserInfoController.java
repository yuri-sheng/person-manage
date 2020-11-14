package com.shengyu.authentication.controller;

import com.shengyu.authentication.model.UserInfo;
import com.shengyu.authentication.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*",allowCredentials="true",allowedHeaders = "",methods = {})
@RestController
@RequestMapping("/userInfo")
public class UserInfoController {
    private static final Logger logger = LoggerFactory.getLogger(UserInfoController.class);

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/getUserInfoByIdTest")
    public UserInfo getUserById() {
        int id = 1;
        logger.info("enter UserInfoController.getUserById,param is {}", id);
        return userInfoService.getUserInfoById(id);
    }

    @RequestMapping("/getUserInfoById")
    public UserInfo getUserById(@RequestParam int id) {
        logger.info("enter UserInfoController.getUserById,param is {}", id);
        return userInfoService.getUserInfoById(id);
    }

    @RequestMapping("/getUserInfoByIds")
    public List<UserInfo> getUserByIds(@RequestParam String ids) {
        logger.info("enter UserInfoController.getUserById,param is {}", ids);
        return userInfoService.getUserInfoByIds(ids);
    }
}
