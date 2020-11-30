package com.zking.mapper;

import com.zking.model.Integral;

public interface IntegralMapper {
    int deleteByPrimaryKey(Long integralId);

    int insert(Integral record);

    int insertSelective(Integral record);

    Integral selectByPrimaryKey(Long integralId);

    int updateByPrimaryKeySelective(Integral record);

    int updateByPrimaryKey(Integral record);
}