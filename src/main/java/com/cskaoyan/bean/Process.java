package com.cskaoyan.bean;

public class Process {
    int processId;
    int sequence;
    int quota;
    int technologyPlanId;

    @Override
    public String toString() {
        return "Process{" +
                "processId=" + processId +
                ", sequence=" + sequence +
                ", quota=" + quota +
                ", technologyPlanId=" + technologyPlanId +
                '}';
    }

    public int getProcessId() {
        return processId;
    }

    public void setProcessId(int processId) {
        this.processId = processId;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    public int getTechnologyPlanId() {
        return technologyPlanId;
    }

    public void setTechnologyPlanId(int technologyPlanId) {
        this.technologyPlanId = technologyPlanId;
    }
}
