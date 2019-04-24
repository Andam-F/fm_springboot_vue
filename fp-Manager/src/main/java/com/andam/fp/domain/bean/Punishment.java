package com.andam.fp.domain.bean;

import java.util.Date;

public class Punishment {
    private Integer punishmentId;

    private Integer planResultId;

    private Integer userId;

    private String punishment;

    private Date punishmentTime;

    private byte[] punishmentState;

    public Integer getPunishmentId() {
        return punishmentId;
    }

    public void setPunishmentId(Integer punishmentId) {
        this.punishmentId = punishmentId;
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

    public String getPunishment() {
        return punishment;
    }

    public void setPunishment(String punishment) {
        this.punishment = punishment == null ? null : punishment.trim();
    }

    public Date getPunishmentTime() {
        return punishmentTime;
    }

    public void setPunishmentTime(Date punishmentTime) {
        this.punishmentTime = punishmentTime;
    }

    public byte[] getPunishmentState() {
        return punishmentState;
    }

    public void setPunishmentState(byte[] punishmentState) {
        this.punishmentState = punishmentState;
    }
}