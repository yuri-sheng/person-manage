package com.shengyu.dal;

import com.shengyu.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserInfoDao {
    UserInfo getUserInfoById(int id);
    List<UserInfo> getUserInfoByIds(List<Integer> ids);
}
