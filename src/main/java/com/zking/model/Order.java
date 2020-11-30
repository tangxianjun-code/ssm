package com.zking.model;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private Long orderId;

    private Long orderUserId;

    private Date orderTime;

    private Long orderStatus;

    private BigDecimal orderAllPrice;

    public Order(Long orderId, Long orderUserId, Date orderTime, Long orderStatus, BigDecimal orderAllPrice) {
        this.orderId = orderId;
        this.orderUserId = orderUserId;
        this.orderTime = orderTime;
        this.orderStatus = orderStatus;
        this.orderAllPrice = orderAllPrice;
    }

    public Order() {
        super();
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderUserId() {
        return orderUserId;
    }

    public void setOrderUserId(Long orderUserId) {
        this.orderUserId = orderUserId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Long getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Long orderStatus) {
        this.orderStatus = orderStatus;
    }

    public BigDecimal getOrderAllPrice() {
        return orderAllPrice;
    }

    public void setOrderAllPrice(BigDecimal orderAllPrice) {
        this.orderAllPrice = orderAllPrice;
    }
}