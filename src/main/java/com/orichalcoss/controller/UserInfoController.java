package com.orichalcoss.controller;

import com.orichalcoss.model.User;
import com.orichalcoss.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@RestController
@RequestMapping("/userInfo")
public class UserInfoController {

    private static final Logger logger = LoggerFactory.getLogger(UserInfoController.class);

    @Autowired
    private UserInfoService userInfoService;


    @RequestMapping("/getUserInfoById")
    public User getUserById(@RequestParam int id){
        logger.info("enter UserInfoController.getUserById,param is id",id);
        return userInfoService.getUserInfoById(id);
    }

    @RequestMapping("/getUserInfoByIds")
    public List<User> getUserByIds(@RequestParam String ids){
        logger.info("enter UserInfoController.getUserById,param is id",ids);
        return userInfoService.getUserInfoByIds(ids);
    };
}
