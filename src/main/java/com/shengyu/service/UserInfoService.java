package com.shengyu.service;

import com.shengyu.model.UserInfo;

import java.util.List;

public interface UserInfoService {
    UserInfo getUserInfoById(int id);
    List<UserInfo> getUserInfoByIds(String ids);
}
