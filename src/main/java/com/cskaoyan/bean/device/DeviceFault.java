package com.cskaoyan.bean.device;

import org.springframework.stereotype.Component;

@Component
public class DeviceFault {
    private String deviceFaultId;
    private String deviceName;
    private String deviceFaultDate;
    private String deviceFaultCause;
    private String deviceFaultMaintenance;
    private String deviceFaultDetail;
    private String deviceId;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceFaultId() {
        return deviceFaultId;
    }

    public void setDeviceFaultId(String deviceFaultId) {
        this.deviceFaultId = deviceFaultId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceFaultDate() {
        return deviceFaultDate;
    }

    public void setDeviceFaultDate(String deviceFaultDate) {
        this.deviceFaultDate = deviceFaultDate;
    }

    public String getDeviceFaultCause() {
        return deviceFaultCause;
    }

    public void setDeviceFaultCause(String deviceFaultCause) {
        this.deviceFaultCause = deviceFaultCause;
    }

    public String getDeviceFaultMaintenance() {
        return deviceFaultMaintenance;
    }

    public void setDeviceFaultMaintenance(String deviceFaultMaintenance) {
        this.deviceFaultMaintenance = deviceFaultMaintenance;
    }

    public String getDeviceFaultDetail() {
        return deviceFaultDetail;
    }

    public void setDeviceFaultDetail(String deviceFaultDetail) {
        this.deviceFaultDetail = deviceFaultDetail;
    }

    @Override
    public String toString() {
        return "DeviceFault{" +
                "deviceFaultId='" + deviceFaultId + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", deviceFaultDate='" + deviceFaultDate + '\'' +
                ", deviceFaultCause='" + deviceFaultCause + '\'' +
                ", deviceFaultMaintenance='" + deviceFaultMaintenance + '\'' +
                ", deviceFaultDetail='" + deviceFaultDetail + '\'' +
                ", deviceId='" + deviceId + '\'' +
                '}';
    }
}
