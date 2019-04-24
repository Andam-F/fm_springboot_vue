package com.andam.fp.domain.bean;

import java.util.Date;

public class Dream {
    private Integer dreamId;

    private Integer userId;

    private String dreamName;

    private String dream;

    private Date createTime;

    public Integer getDreamId() {
        return dreamId;
    }

    public void setDreamId(Integer dreamId) {
        this.dreamId = dreamId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getDreamName() {
        return dreamName;
    }

    public void setDreamName(String dreamName) {
        this.dreamName = dreamName == null ? null : dreamName.trim();
    }

    public String getDream() {
        return dream;
    }

    public void setDream(String dream) {
        this.dream = dream == null ? null : dream.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}