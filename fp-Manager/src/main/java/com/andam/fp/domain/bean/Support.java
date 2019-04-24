package com.andam.fp.domain.bean;

public class Support {
    private Integer supportId;

    private Integer wouldLikeId;

    private String conditions;

    private String cashTime;

    private byte[] supportState;

    public Integer getSupportId() {
        return supportId;
    }

    public void setSupportId(Integer supportId) {
        this.supportId = supportId;
    }

    public Integer getWouldLikeId() {
        return wouldLikeId;
    }

    public void setWouldLikeId(Integer wouldLikeId) {
        this.wouldLikeId = wouldLikeId;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions == null ? null : conditions.trim();
    }

    public String getCashTime() {
        return cashTime;
    }

    public void setCashTime(String cashTime) {
        this.cashTime = cashTime == null ? null : cashTime.trim();
    }

    public byte[] getSupportState() {
        return supportState;
    }

    public void setSupportState(byte[] supportState) {
        this.supportState = supportState;
    }
}