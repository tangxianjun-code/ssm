package com.zking.mapper;

import com.zking.model.user;

public interface userMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(user record);

    int insertSelective(user record);

    user selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(user record);

    int updateByPrimaryKey(user record);


}