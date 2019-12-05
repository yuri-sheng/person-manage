package com.orichalcoss.dal;

import com.orichalcoss.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoDao {
    User getUserInfoById(int id);
}
