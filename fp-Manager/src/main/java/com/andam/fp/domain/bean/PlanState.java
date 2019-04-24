package com.andam.fp.domain.bean;

public class PlanState {
    private Integer planStateId;

    private Integer planId;

    private Integer userId;

    private byte[] planSeeSate;

    public Integer getPlanStateId() {
        return planStateId;
    }

    public void setPlanStateId(Integer planStateId) {
        this.planStateId = planStateId;
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public byte[] getPlanSeeSate() {
        return planSeeSate;
    }

    public void setPlanSeeSate(byte[] planSeeSate) {
        this.planSeeSate = planSeeSate;
    }
}