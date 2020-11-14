package com.shengyu.dal;

import com.shengyu.model.UserProfile;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserProfileDao {
    UserProfile getUserProfileByMobile(String mobile);
    int registerByMobile(UserProfile UserProfile);
}
