package com.shengyu.authentication.proxy;

import com.shengyu.authentication.model.UserInfo;

public interface UserInfoProxyService {
    UserInfo getUserInfoById(Integer id);
}