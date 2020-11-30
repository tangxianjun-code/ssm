package com.zking.model;

public class Integral {
    private Long integralId;

    private Long integralUserId;

    private Long integralCount;

    public Integral(Long integralId, Long integralUserId, Long integralCount) {
        this.integralId = integralId;
        this.integralUserId = integralUserId;
        this.integralCount = integralCount;
    }

    public Integral() {
        super();
    }

    public Long getIntegralId() {
        return integralId;
    }

    public void setIntegralId(Long integralId) {
        this.integralId = integralId;
    }

    public Long getIntegralUserId() {
        return integralUserId;
    }

    public void setIntegralUserId(Long integralUserId) {
        this.integralUserId = integralUserId;
    }

    public Long getIntegralCount() {
        return integralCount;
    }

    public void setIntegralCount(Long integralCount) {
        this.integralCount = integralCount;
    }
}