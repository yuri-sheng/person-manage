package com.shengyu.authentication.dao;

import com.shengyu.authentication.model.LoginTime;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginLogDao {
    void loginTime(LoginTime loginTime);
}
