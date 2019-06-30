package com.cskaoyan.bean.device;

import org.springframework.stereotype.Component;

@Component
public class DeviceCheck {
    //设备例检
    private String deviceCheckId;
    private String deviceId;
    private String deviceName;
    private String deviceCheckEmpId;
    private String deviceCheckDate;
    private String deviceCheckResult;
    private String deviceCheckFaultId;
    private String deviceCheckEmp;

    public String getDeviceCheckEmp() {
        return deviceCheckEmp;
    }

    public void setDeviceCheckEmp(String deviceCheckEmp) {
        this.deviceCheckEmp = deviceCheckEmp;
    }

    public String getDeviceCheckId() {
        return deviceCheckId;
    }

    public void setDeviceCheckId(String deviceCheckId) {
        this.deviceCheckId = deviceCheckId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceCheckEmpId() {
        return deviceCheckEmpId;
    }

    public void setDeviceCheckEmpId(String deviceCheckEmpId) {
        this.deviceCheckEmpId = deviceCheckEmpId;
    }

    public String getDeviceCheckDate() {
        return deviceCheckDate;
    }

    public void setDeviceCheckDate(String deviceCheckDate) {
        this.deviceCheckDate = deviceCheckDate;
    }

    public String getDeviceCheckResult() {
        return deviceCheckResult;
    }

    public void setDeviceCheckResult(String deviceCheckResult) {
        this.deviceCheckResult = deviceCheckResult;
    }

    public String getDeviceCheckFaultId() {
        return deviceCheckFaultId;
    }

    public void setDeviceCheckFaultId(String deviceCheckFaultId) {
        this.deviceCheckFaultId = deviceCheckFaultId;
    }

    @Override
    public String toString() {
        return "DeviceCheck{" +
                "deviceCheckId='" + deviceCheckId + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", deviceCheckEmpId='" + deviceCheckEmpId + '\'' +
                ", deviceCheckDate='" + deviceCheckDate + '\'' +
                ", deviceCheckResult='" + deviceCheckResult + '\'' +
                ", deviceCheckFaultId='" + deviceCheckFaultId + '\'' +
                ", deviceCheckEmp='" + deviceCheckEmp + '\'' +
                '}';
    }
}
