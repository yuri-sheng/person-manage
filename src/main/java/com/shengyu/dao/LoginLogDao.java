package com.shengyu.dao;

import com.shengyu.model.LoginTime;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginLogDao {
    void loginTime(LoginTime loginTime);
}
