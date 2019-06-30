package com.cskaoyan.bean.device;

public class Device {
    private String deviceId; //设备编号
    private String deviceName;  //设备名称
    private String deviceStatusId; //设备状态
    private String deviceTypeId;  //设备类别id
    private String devicePurchaseDate; //购买日期
    private double devicePurchasePrice; //购买价格
    private String deviceManufactureDate; //出场日期
    private String deviceServiceLife; //使用年限
    private String note; //设备介绍
    private String deviceTypeName;
    private String deviceKeeperId;
    private String deviceStatus;
    private String deviceKeeper;

    public String getDeviceKeeper() {
        return deviceKeeper;
    }

    public void setDeviceKeeper(String deviceKeeper) {
        this.deviceKeeper = deviceKeeper;
    }

    public String getDeviceKeeperId() {
        return deviceKeeperId;
    }

    public void setDeviceKeeperId(String deviceKeeperId) {
        this.deviceKeeperId = deviceKeeperId;
    }

    public String getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public String getDeviceTypeId() {
        return deviceTypeId;
    }

    public void setDeviceTypeId(String deviceTypeId) {
        this.deviceTypeId = deviceTypeId;
    }

    public String getDeviceTypeName() {
        return deviceTypeName;
    }

    public void setDeviceTypeName(String deviceTypeName) {
        this.deviceTypeName = deviceTypeName;
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


    public String getDeviceStatusId() {
        return deviceStatusId;
    }

    public void setDeviceStatusId(String deviceStatusId) {
        this.deviceStatusId = deviceStatusId;
    }

    public String getDevicePurchaseDate() {
        return devicePurchaseDate;
    }

    public void setDevicePurchaseDate(String devicePurchaseDate) {
        this.devicePurchaseDate = devicePurchaseDate;
    }

    public double getDevicePurchasePrice() {
        return devicePurchasePrice;
    }

    public void setDevicePurchasePrice(double devicePurchasePrice) {
        this.devicePurchasePrice = devicePurchasePrice;
    }

    public String getDeviceManufactureDate() {
        return deviceManufactureDate;
    }

    public void setDeviceManufactureDate(String deviceManufactureDate) {
        this.deviceManufactureDate = deviceManufactureDate;
    }

    public String getDeviceServiceLife() {
        return deviceServiceLife;
    }

    public void setDeviceServiceLife(String deviceServiceLife) {
        this.deviceServiceLife = deviceServiceLife;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Device{" +
                "deviceId='" + deviceId + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", deviceStatusId='" + deviceStatusId + '\'' +
                ", deviceTypeId='" + deviceTypeId + '\'' +
                ", devicePurchaseDate='" + devicePurchaseDate + '\'' +
                ", devicePurchasePrice=" + devicePurchasePrice +
                ", deviceManufactureDate='" + deviceManufactureDate + '\'' +
                ", deviceServiceLife='" + deviceServiceLife + '\'' +
                ", note='" + note + '\'' +
                ", deviceTypeName='" + deviceTypeName + '\'' +
                ", deviceKeeperId='" + deviceKeeperId + '\'' +
                ", deviceStatus='" + deviceStatus + '\'' +
                ", deviceKeeper='" + deviceKeeper + '\'' +
                '}';
    }
}
