package com.andam.fp.domain.bean;

import java.util.Date;

public class Share {
    private Integer shareId;

    private Integer userId;

    private String picturePath;

    private String videoPath;

    private String audioPath;

    private String notSeeUserId;

    private Date shareTime;

    public Integer getShareId() {
        return shareId;
    }

    public void setShareId(Integer shareId) {
        this.shareId = shareId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath == null ? null : picturePath.trim();
    }

    public String getVideoPath() {
        return videoPath;
    }

    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath == null ? null : videoPath.trim();
    }

    public String getAudioPath() {
        return audioPath;
    }

    public void setAudioPath(String audioPath) {
        this.audioPath = audioPath == null ? null : audioPath.trim();
    }

    public String getNotSeeUserId() {
        return notSeeUserId;
    }

    public void setNotSeeUserId(String notSeeUserId) {
        this.notSeeUserId = notSeeUserId == null ? null : notSeeUserId.trim();
    }

    public Date getShareTime() {
        return shareTime;
    }

    public void setShareTime(Date shareTime) {
        this.shareTime = shareTime;
    }
}