package com.cskaoyan.bean.planModelBean;

public class Task {
    private String  taskId;

    private Integer taskQuantity;

    private Long    workingHours;

    private String  manufactureSn;

    private String  workId;

    private Work work;

    private Manufacture manufacture;


    public String getManufactureSn() {
        return manufactureSn;
    }

    public void setManufactureSn(String manufactureSn) {
        this.manufactureSn = manufactureSn;
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public Task() {
    }

    public Task(String taskId, Integer taskQuantity, Long workingHours, Work work, Manufacture manufacture) {
        this.taskId = taskId;
        this.taskQuantity = taskQuantity;
        this.workingHours = workingHours;
        this.work = work;
        this.manufacture = manufacture;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public Integer getTaskQuantity() {
        return taskQuantity;
    }

    public void setTaskQuantity(Integer taskQuantity) {
        this.taskQuantity = taskQuantity;
    }

    public Long getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(Long workingHours) {
        this.workingHours = workingHours;
    }

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }

    public Manufacture getManufacture() {
        return manufacture;
    }

    public void setManufacture(Manufacture manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId='" + taskId + '\'' +
                ", taskQuantity=" + taskQuantity +
                ", workingHours=" + workingHours +
                ", work=" + work +
                ", manufacture=" + manufacture +
                '}';
    }
}