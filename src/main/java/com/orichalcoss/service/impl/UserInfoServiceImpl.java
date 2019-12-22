package com.orichalcoss.service.impl;

import com.orichalcoss.dal.UserInfoDao;
import com.orichalcoss.model.UserInfo;
import com.orichalcoss.service.UserInfoService;
import com.orichalcoss.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoDao userInfoDao;

    @Override
    public UserInfo getUserInfoById(int id){
        return userInfoDao.getUserInfoById(id);
    }
    public List<UserInfo> getUserInfoByIds(String ids){
        List<Integer> list  = StringUtils.transform( Arrays.asList(ids.split(",")));
        return userInfoDao.getUserInfoByIds(list);
    }
}
