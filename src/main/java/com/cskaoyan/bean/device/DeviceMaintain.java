package com.cskaoyan.bean.device;

import org.springframework.stereotype.Component;

@Component
public class DeviceMaintain {
    private String deviceMaintainId;
    private String deviceFaultId;
    private String deviceMaintainEmp;
    private String deviceMaintainDate;
    private String deviceMaintainResult;
    private String deviceMaintainCost;
    private String deviceMaintainEmpId;
    private String note;

    public String getDeviceMaintainEmpId() {
        return deviceMaintainEmpId;
    }

    public void setDeviceMaintainEmpId(String deviceMaintainEmpId) {
        this.deviceMaintainEmpId = deviceMaintainEmpId;
    }

    public String getDeviceMaintainId() {
        return deviceMaintainId;
    }

    public void setDeviceMaintainId(String deviceMaintainId) {
        this.deviceMaintainId = deviceMaintainId;
    }

    public String getDeviceFaultId() {
        return deviceFaultId;
    }

    public void setDeviceFaultId(String deviceFaultId) {
        this.deviceFaultId = deviceFaultId;
    }

    public String getDeviceMaintainEmp() {
        return deviceMaintainEmp;
    }

    public void setDeviceMaintainEmp(String deviceMaintainEmp) {
        this.deviceMaintainEmp = deviceMaintainEmp;
    }

    public String getDeviceMaintainDate() {
        return deviceMaintainDate;
    }

    public void setDeviceMaintainDate(String deviceMaintainDate) {
        this.deviceMaintainDate = deviceMaintainDate;
    }

    public String getDeviceMaintainResult() {
        return deviceMaintainResult;
    }

    public void setDeviceMaintainResult(String deviceMaintainResult) {
        this.deviceMaintainResult = deviceMaintainResult;
    }

    public String getDeviceMaintainCost() {
        return deviceMaintainCost;
    }

    public void setDeviceMaintainCost(String deviceMaintainCost) {
        this.deviceMaintainCost = deviceMaintainCost;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "DeviceMaintain{" +
                "deviceMaintainId='" + deviceMaintainId + '\'' +
                ", deviceFaultId='" + deviceFaultId + '\'' +
                ", deviceMaintainEmp='" + deviceMaintainEmp + '\'' +
                ", deviceMaintainDate='" + deviceMaintainDate + '\'' +
                ", deviceMaintainResult='" + deviceMaintainResult + '\'' +
                ", deviceMaintainCost='" + deviceMaintainCost + '\'' +
                ", deviceMaintainEmpId='" + deviceMaintainEmpId + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
