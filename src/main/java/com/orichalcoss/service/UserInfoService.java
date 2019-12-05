package com.orichalcoss.service;

import com.orichalcoss.model.User;

import java.util.List;

public interface UserInfoService {
    User getUserInfoById(int id);
    List<User> getUserInfoByIds(String ids);
}
