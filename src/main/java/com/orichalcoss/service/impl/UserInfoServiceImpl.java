package com.orichalcoss.service.impl;

import com.orichalcoss.dal.UserInfoDao;
import com.orichalcoss.model.User;
import com.orichalcoss.proxy.UserInfoProxyService;
import com.orichalcoss.service.UserInfoService;
import com.orichalcoss.utils.RedisUtils;
import com.orichalcoss.utils.RestTemplateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    private static final Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);

    @Resource
    UserInfoDao userInfoDao;

    @Autowired
    RedisUtils redisUtils;

    @Autowired
    RestTemplateUtils restTemplateUtils;

    @Autowired
    UserInfoProxyService userInfoProxyService;
    @Override
    public User getUserInfoById(int id){
        logger.info("enter UserInfoServiceImpl.getUserById,param is id",id);
        User user = userInfoProxyService.getUserInfoById(id);
        return user;
    }

    @Override
    public List<User> getUserInfoByIds(String ids){
        logger.info("enter UserInfoServiceImpl.getUserById,param is id",ids);
        List<Integer> idList = fromString2List(ids);
        List<User> result = userInfoDao.getUserInfoByIds(idList);
        return result;
    }


    private List<Integer> fromString2List(String ids){
        List<Integer> result = new ArrayList<Integer>();
        if(StringUtils.isEmpty(ids)) return result;
        if(!ids.contains(",")) {
            result.add(Integer.parseInt(ids));
            return result;
        }
        String[] idArr = ids.split(",");
        for(int i=0;i<idArr.length;i++){
            result.add(Integer.parseInt(idArr[i]));
        }
        return result;
    }







}














