package com.andam.fp.domain.bean;

public class PlanResult {
    private Integer punishmentResultId;

    private Integer planId;

    private String completeDegree;

    private String planSummarize;

    public Integer getPunishmentResultId() {
        return punishmentResultId;
    }

    public void setPunishmentResultId(Integer punishmentResultId) {
        this.punishmentResultId = punishmentResultId;
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public String getCompleteDegree() {
        return completeDegree;
    }

    public void setCompleteDegree(String completeDegree) {
        this.completeDegree = completeDegree == null ? null : completeDegree.trim();
    }

    public String getPlanSummarize() {
        return planSummarize;
    }

    public void setPlanSummarize(String planSummarize) {
        this.planSummarize = planSummarize == null ? null : planSummarize.trim();
    }
}