package com.zking.model;

import java.util.Date;

public class Collect {
    private Long collectId;

    private Long collectUserId;

    private Long collectGoodsId;

    private Date collectTime;

    public Collect(Long collectId, Long collectUserId, Long collectGoodsId, Date collectTime) {
        this.collectId = collectId;
        this.collectUserId = collectUserId;
        this.collectGoodsId = collectGoodsId;
        this.collectTime = collectTime;
    }

    public Collect() {
        super();
    }

    public Long getCollectId() {
        return collectId;
    }

    public void setCollectId(Long collectId) {
        this.collectId = collectId;
    }

    public Long getCollectUserId() {
        return collectUserId;
    }

    public void setCollectUserId(Long collectUserId) {
        this.collectUserId = collectUserId;
    }

    public Long getCollectGoodsId() {
        return collectGoodsId;
    }

    public void setCollectGoodsId(Long collectGoodsId) {
        this.collectGoodsId = collectGoodsId;
    }

    public Date getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Date collectTime) {
        this.collectTime = collectTime;
    }
}