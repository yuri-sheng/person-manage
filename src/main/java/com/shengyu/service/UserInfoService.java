package com.orichalcoss.service;

import com.orichalcoss.model.UserInfo;

import java.util.List;

public interface UserInfoService {
    UserInfo getUserInfoById(int id);
    List<UserInfo> getUserInfoByIds(String ids);
}
