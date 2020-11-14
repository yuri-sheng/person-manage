package com.shengyu.authentication.service;

import com.shengyu.authentication.model.UserInfo;

import java.util.List;

public interface UserInfoService {
    UserInfo getUserInfoById(int id);
    List<UserInfo> getUserInfoByIds(String ids);
}
