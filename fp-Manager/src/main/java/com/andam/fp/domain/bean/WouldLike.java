package com.andam.fp.domain.bean;

public class WouldLike {
    private Integer wouldLikeId;

    private Integer userId;

    private String wouldLikeName;

    private byte[] wouldLikeDegree;

    public Integer getWouldLikeId() {
        return wouldLikeId;
    }

    public void setWouldLikeId(Integer wouldLikeId) {
        this.wouldLikeId = wouldLikeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getWouldLikeName() {
        return wouldLikeName;
    }

    public void setWouldLikeName(String wouldLikeName) {
        this.wouldLikeName = wouldLikeName == null ? null : wouldLikeName.trim();
    }

    public byte[] getWouldLikeDegree() {
        return wouldLikeDegree;
    }

    public void setWouldLikeDegree(byte[] wouldLikeDegree) {
        this.wouldLikeDegree = wouldLikeDegree;
    }
}