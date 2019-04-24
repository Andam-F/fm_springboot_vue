package com.andam.fp.domain.bean;

import java.util.Date;

public class DatePlay {
    private Integer datePlayId;

    private Integer userId;

    private String datePlayName;

    private String datePlayAddress;

    private Date datePlayTime;

    private String datePlayProject;

    public Integer getDataPlayId() {
        return datePlayId;
    }

    public void setDataPlayId(Integer datePlayId) {
        this.datePlayId = datePlayId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getDataPlayName() {
        return datePlayName;
    }

    public void setDataPlayName(String datePlayName) {
        this.datePlayName = datePlayName == null ? null : datePlayName.trim();
    }

    public String getDataPlayAddress() {
        return datePlayAddress;
    }

    public void setDataPlayAddress(String datePlayAddress) {
        this.datePlayAddress = datePlayAddress == null ? null : datePlayAddress.trim();
    }

    public Date getDataPlayTime() {
        return datePlayTime;
    }

    public void setDataPlayTime(Date datePlayTime) {
        this.datePlayTime = datePlayTime;
    }

    public String getDataPlayProject() {
        return datePlayProject;
    }

    public void setDataPlayProject(String datePlayProject) {
        this.datePlayProject = datePlayProject == null ? null : datePlayProject.trim();
    }
}