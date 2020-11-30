package com.zking.model;

import java.math.BigDecimal;
import java.util.Date;

public class OrderLine {
    private Long orderlineId;

    private Long orderlineOrderId;

    private String orderlineGoodsName;

    private BigDecimal orderlinePrice;

    private String orderlineCount;

    private BigDecimal orderlineAllPrice;

    private Date orderlineTime;

    public OrderLine(Long orderlineId, Long orderlineOrderId, String orderlineGoodsName, BigDecimal orderlinePrice, String orderlineCount, BigDecimal orderlineAllPrice, Date orderlineTime) {
        this.orderlineId = orderlineId;
        this.orderlineOrderId = orderlineOrderId;
        this.orderlineGoodsName = orderlineGoodsName;
        this.orderlinePrice = orderlinePrice;
        this.orderlineCount = orderlineCount;
        this.orderlineAllPrice = orderlineAllPrice;
        this.orderlineTime = orderlineTime;
    }

    public OrderLine() {
        super();
    }

    public Long getOrderlineId() {
        return orderlineId;
    }

    public void setOrderlineId(Long orderlineId) {
        this.orderlineId = orderlineId;
    }

    public Long getOrderlineOrderId() {
        return orderlineOrderId;
    }

    public void setOrderlineOrderId(Long orderlineOrderId) {
        this.orderlineOrderId = orderlineOrderId;
    }

    public String getOrderlineGoodsName() {
        return orderlineGoodsName;
    }

    public void setOrderlineGoodsName(String orderlineGoodsName) {
        this.orderlineGoodsName = orderlineGoodsName;
    }

    public BigDecimal getOrderlinePrice() {
        return orderlinePrice;
    }

    public void setOrderlinePrice(BigDecimal orderlinePrice) {
        this.orderlinePrice = orderlinePrice;
    }

    public String getOrderlineCount() {
        return orderlineCount;
    }

    public void setOrderlineCount(String orderlineCount) {
        this.orderlineCount = orderlineCount;
    }

    public BigDecimal getOrderlineAllPrice() {
        return orderlineAllPrice;
    }

    public void setOrderlineAllPrice(BigDecimal orderlineAllPrice) {
        this.orderlineAllPrice = orderlineAllPrice;
    }

    public Date getOrderlineTime() {
        return orderlineTime;
    }

    public void setOrderlineTime(Date orderlineTime) {
        this.orderlineTime = orderlineTime;
    }
}