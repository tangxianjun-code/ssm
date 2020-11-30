package com.zking.mapper;

import com.zking.model.Cart;

public interface CartMapper {
    int deleteByPrimaryKey(Long cartId);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Long cartId);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);
}