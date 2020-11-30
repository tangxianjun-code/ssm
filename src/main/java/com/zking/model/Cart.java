package com.zking.model;

import java.util.Date;

public class Cart {
    private Long cartId;

    private Long cartGoodsId;

    private Long cartUserId;

    private Date cartTime;

    public Cart(Long cartId, Long cartGoodsId, Long cartUserId, Date cartTime) {
        this.cartId = cartId;
        this.cartGoodsId = cartGoodsId;
        this.cartUserId = cartUserId;
        this.cartTime = cartTime;
    }

    public Cart() {
        super();
    }

    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public Long getCartGoodsId() {
        return cartGoodsId;
    }

    public void setCartGoodsId(Long cartGoodsId) {
        this.cartGoodsId = cartGoodsId;
    }

    public Long getCartUserId() {
        return cartUserId;
    }

    public void setCartUserId(Long cartUserId) {
        this.cartUserId = cartUserId;
    }

    public Date getCartTime() {
        return cartTime;
    }

    public void setCartTime(Date cartTime) {
        this.cartTime = cartTime;
    }
}