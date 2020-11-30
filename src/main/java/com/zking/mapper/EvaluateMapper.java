package com.zking.mapper;

import com.zking.model.Evaluate;

public interface EvaluateMapper {
    int deleteByPrimaryKey(Long evaluateId);

    int insert(Evaluate record);

    int insertSelective(Evaluate record);

    Evaluate selectByPrimaryKey(Long evaluateId);

    int updateByPrimaryKeySelective(Evaluate record);

    int updateByPrimaryKey(Evaluate record);
}