package com.andam.fp.domain.bean;

public class CountDown {
    private Integer countDownId;

    private Integer userId;

    private String countDown;

    public Integer getCountDownId() {
        return countDownId;
    }

    public void setCountDownId(Integer countDownId) {
        this.countDownId = countDownId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCountDown() {
        return countDown;
    }

    public void setCountDown(String countDown) {
        this.countDown = countDown == null ? null : countDown.trim();
    }
}