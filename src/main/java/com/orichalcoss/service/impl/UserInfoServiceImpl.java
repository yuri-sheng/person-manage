package com.orichalcoss.service.impl;

import com.orichalcoss.model.User;
import com.orichalcoss.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    private static final Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);

    @Override
    public User getUserInfoById(int id){
        logger.info("enter UserInfoServiceImpl.getUserById,param is id",id);
        return new User();
    }

}
