package com.andam.fp.domain.bean;

import java.util.Date;

public class Award {
    private Integer awardId;

    private Integer planResultId;

    private Integer userId;

    private String awards;

    private Date awardTime;

    private byte[] awardState;

    public Integer getAwardId() {
        return awardId;
    }

    public void setAwardId(Integer awardId) {
        this.awardId = awardId;
    }

    public Integer getPlanResultId() {
        return planResultId;
    }

    public void setPlanResultId(Integer planResultId) {
        this.planResultId = planResultId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards == null ? null : awards.trim();
    }

    public Date getAwardTime() {
        return awardTime;
    }

    public void setAwardTime(Date awardTime) {
        this.awardTime = awardTime;
    }

    public byte[] getAwardState() {
        return awardState;
    }

    public void setAwardState(byte[] awardState) {
        this.awardState = awardState;
    }
}