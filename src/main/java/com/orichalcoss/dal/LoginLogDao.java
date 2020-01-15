package com.orichalcoss.dal;

import com.orichalcoss.model.LoginTime;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginLogDao {
    void loginTime(LoginTime loginTime);
}
