package com.cskaoyan.bean;

public class TechnologyPlan {
    int technologyPlanId;
    int technologyId;
    int batchAmount;
    String startPlan;
    String endPlan;
    String commitPlan;
    String technologyPlanEnd;
    String technologyPlanStart;

    @Override
    public String toString() {
        return "TechnologyPlan{" +
                "technologyPlanId=" + technologyPlanId +
                ", technologyId=" + technologyId +
                ", batchAmount=" + batchAmount +
                ", startPlan='" + startPlan + '\'' +
                ", endPlan='" + endPlan + '\'' +
                ", commitPlan='" + commitPlan + '\'' +
                ", technologyPlanEnd='" + technologyPlanEnd + '\'' +
                ", technologyPlanStart='" + technologyPlanStart + '\'' +
                '}';
    }

    public int getTechnologyPlanId() {
        return technologyPlanId;
    }

    public void setTechnologyPlanId(int technologyPlanId) {
        this.technologyPlanId = technologyPlanId;
    }

    public int getTechnologyId() {
        return technologyId;
    }

    public void setTechnologyId(int technologyId) {
        this.technologyId = technologyId;
    }

    public int getBatchAmount() {
        return batchAmount;
    }

    public void setBatchAmount(int batchAmount) {
        this.batchAmount = batchAmount;
    }

    public String getStartPlan() {
        return startPlan;
    }

    public void setStartPlan(String startPlan) {
        this.startPlan = startPlan;
    }

    public String getEndPlan() {
        return endPlan;
    }

    public void setEndPlan(String endPlan) {
        this.endPlan = endPlan;
    }

    public String getCommitPlan() {
        return commitPlan;
    }

    public void setCommitPlan(String commitPlan) {
        this.commitPlan = commitPlan;
    }

    public String getTechnologyPlanEnd() {
        return technologyPlanEnd;
    }

    public void setTechnologyPlanEnd(String technologyPlanEnd) {
        this.technologyPlanEnd = technologyPlanEnd;
    }

    public String getTechnologyPlanStart() {
        return technologyPlanStart;
    }

    public void setTechnologyPlanStart(String technologyPlanStart) {
        this.technologyPlanStart = technologyPlanStart;
    }
}
