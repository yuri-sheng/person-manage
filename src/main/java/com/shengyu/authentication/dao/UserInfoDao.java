package com.shengyu.authentication.dao;

import com.shengyu.authentication.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserInfoDao {
    UserInfo getUserInfoById(int id);
    List<UserInfo> getUserInfoByIds(List<Integer> ids);
}
