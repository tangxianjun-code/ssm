package com.zking.mapper;

import com.zking.model.OrderLine;

public interface OrderLineMapper {
    int deleteByPrimaryKey(Long orderlineId);

    int insert(OrderLine record);

    int insertSelective(OrderLine record);

    OrderLine selectByPrimaryKey(Long orderlineId);

    int updateByPrimaryKeySelective(OrderLine record);

    int updateByPrimaryKey(OrderLine record);
}