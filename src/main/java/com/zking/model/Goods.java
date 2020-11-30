package com.zking.model;

import java.math.BigDecimal;
import java.util.Date;

public class Goods {
    private Long goodsId;

    private String goodsName;

    private BigDecimal goodPrice;

    private String goodsIcon;

    private String goodsPref;

    private Long goodsRepertory;

    private Long goodsCount;

    private Date goodsTime;

    private Long goodsStatus;

    private Long goodsClassId;

    public Goods(Long goodsId, String goodsName, BigDecimal goodPrice, String goodsIcon, String goodsPref, Long goodsRepertory, Long goodsCount, Date goodsTime, Long goodsStatus, Long goodsClassId) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodPrice = goodPrice;
        this.goodsIcon = goodsIcon;
        this.goodsPref = goodsPref;
        this.goodsRepertory = goodsRepertory;
        this.goodsCount = goodsCount;
        this.goodsTime = goodsTime;
        this.goodsStatus = goodsStatus;
        this.goodsClassId = goodsClassId;
    }

    public Goods() {
        super();
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public BigDecimal getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(BigDecimal goodPrice) {
        this.goodPrice = goodPrice;
    }

    public String getGoodsIcon() {
        return goodsIcon;
    }

    public void setGoodsIcon(String goodsIcon) {
        this.goodsIcon = goodsIcon;
    }

    public String getGoodsPref() {
        return goodsPref;
    }

    public void setGoodsPref(String goodsPref) {
        this.goodsPref = goodsPref;
    }

    public Long getGoodsRepertory() {
        return goodsRepertory;
    }

    public void setGoodsRepertory(Long goodsRepertory) {
        this.goodsRepertory = goodsRepertory;
    }

    public Long getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Long goodsCount) {
        this.goodsCount = goodsCount;
    }

    public Date getGoodsTime() {
        return goodsTime;
    }

    public void setGoodsTime(Date goodsTime) {
        this.goodsTime = goodsTime;
    }

    public Long getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(Long goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public Long getGoodsClassId() {
        return goodsClassId;
    }

    public void setGoodsClassId(Long goodsClassId) {
        this.goodsClassId = goodsClassId;
    }
}