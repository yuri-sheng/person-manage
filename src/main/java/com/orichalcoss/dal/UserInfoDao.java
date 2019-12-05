package com.orichalcoss.dal;

import com.orichalcoss.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserInfoDao {
    User getUserInfoById(int id);
    List<User> getUserInfoByIds(List<Integer> ids);
}
