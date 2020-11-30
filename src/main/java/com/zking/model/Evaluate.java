package com.zking.model;

import java.util.Date;

public class Evaluate {
    private Long evaluateId;

    private Long evaluateUserId;

    private Long evaluateGoodsId;

    private String evaluateContent;

    private Date evaluateTime;

    public Evaluate(Long evaluateId, Long evaluateUserId, Long evaluateGoodsId, String evaluateContent, Date evaluateTime) {
        this.evaluateId = evaluateId;
        this.evaluateUserId = evaluateUserId;
        this.evaluateGoodsId = evaluateGoodsId;
        this.evaluateContent = evaluateContent;
        this.evaluateTime = evaluateTime;
    }

    public Evaluate() {
        super();
    }

    public Long getEvaluateId() {
        return evaluateId;
    }

    public void setEvaluateId(Long evaluateId) {
        this.evaluateId = evaluateId;
    }

    public Long getEvaluateUserId() {
        return evaluateUserId;
    }

    public void setEvaluateUserId(Long evaluateUserId) {
        this.evaluateUserId = evaluateUserId;
    }

    public Long getEvaluateGoodsId() {
        return evaluateGoodsId;
    }

    public void setEvaluateGoodsId(Long evaluateGoodsId) {
        this.evaluateGoodsId = evaluateGoodsId;
    }

    public String getEvaluateContent() {
        return evaluateContent;
    }

    public void setEvaluateContent(String evaluateContent) {
        this.evaluateContent = evaluateContent;
    }

    public Date getEvaluateTime() {
        return evaluateTime;
    }

    public void setEvaluateTime(Date evaluateTime) {
        this.evaluateTime = evaluateTime;
    }
}