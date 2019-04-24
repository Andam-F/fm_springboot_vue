package com.andam.fp.domain.bean;

import java.util.Date;

public class InitivatriveStudy {
    private Integer initiativeStudyId;

    private Integer userId;

    private String initiativeStudyName;

    private Date initiativeStudyStartTime;

    private Date initiativeStudyEndTime;

    private Date initiativeStudyTime;

    private byte[] initiativeStudyType;

    public Integer getInitiativeStudyId() {
        return initiativeStudyId;
    }

    public void setInitiativeStudyId(Integer initiativeStudyId) {
        this.initiativeStudyId = initiativeStudyId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getInitiativeStudyName() {
        return initiativeStudyName;
    }

    public void setInitiativeStudyName(String initiativeStudyName) {
        this.initiativeStudyName = initiativeStudyName == null ? null : initiativeStudyName.trim();
    }

    public Date getInitiativeStudyStartTime() {
        return initiativeStudyStartTime;
    }

    public void setInitiativeStudyStartTime(Date initiativeStudyStartTime) {
        this.initiativeStudyStartTime = initiativeStudyStartTime;
    }

    public Date getInitiativeStudyEndTime() {
        return initiativeStudyEndTime;
    }

    public void setInitiativeStudyEndTime(Date initiativeStudyEndTime) {
        this.initiativeStudyEndTime = initiativeStudyEndTime;
    }

    public Date getInitiativeStudyTime() {
        return initiativeStudyTime;
    }

    public void setInitiativeStudyTime(Date initiativeStudyTime) {
        this.initiativeStudyTime = initiativeStudyTime;
    }

    public byte[] getInitiativeStudyType() {
        return initiativeStudyType;
    }

    public void setInitiativeStudyType(byte[] initiativeStudyType) {
        this.initiativeStudyType = initiativeStudyType;
    }
}