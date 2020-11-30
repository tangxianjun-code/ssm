package com.zking.mapper;

import com.zking.model.Class;

public interface ClassMapper {
    int deleteByPrimaryKey(Long classId);

    int insert(Class record);

    int insertSelective(Class record);

    Class selectByPrimaryKey(Long classId);

    int updateByPrimaryKeySelective(Class record);

    int updateByPrimaryKey(Class record);
}