package com.cskaoyan.bean.device;

import org.springframework.stereotype.Component;

@Component
public class DeviceType {
    private String deviceTypeId;
    private String deviceTypeName; //设备名称
    private String deviceTypeModel; //设备种类
    private String deviceTypeSpec;  //型号
    private String deviceTypeSupplier; //供应商
    private String deviceTypeProducer; //生产商
    private int deviceTypeQuantity;  //台数
    private String deviceTypeWarranty; //保修期


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

    public String getDeviceTypeModel() {
        return deviceTypeModel;
    }

    public void setDeviceTypeModel(String deviceTypeModel) {
        this.deviceTypeModel = deviceTypeModel;
    }

    public String getDeviceTypeSpec() {
        return deviceTypeSpec;
    }

    public void setDeviceTypeSpec(String deviceTypeSpec) {
        this.deviceTypeSpec = deviceTypeSpec;
    }

    public String getDeviceTypeSupplier() {
        return deviceTypeSupplier;
    }

    public void setDeviceTypeSupplier(String deviceTypeSupplier) {
        this.deviceTypeSupplier = deviceTypeSupplier;
    }

    public String getDeviceTypeProducer() {
        return deviceTypeProducer;
    }

    public void setDeviceTypeProducer(String deviceTypeProducer) {
        this.deviceTypeProducer = deviceTypeProducer;
    }

    public int getDeviceTypeQuantity() {
        return deviceTypeQuantity;
    }

    public void setDeviceTypeQuantity(int deviceTypeQuantity) {
        this.deviceTypeQuantity = deviceTypeQuantity;
    }

    public String getDeviceTypeWarranty() {
        return deviceTypeWarranty;
    }

    public void setDeviceTypeWarranty(String deviceTypeWarranty) {
        this.deviceTypeWarranty = deviceTypeWarranty;
    }

    @Override
    public String toString() {
        return "DeviceType{" +
                "deviceTypeId=" + deviceTypeId +
                ", deviceTypeName='" + deviceTypeName + '\'' +
                ", deviceTypeModel='" + deviceTypeModel + '\'' +
                ", deviceTypeSpec='" + deviceTypeSpec + '\'' +
                ", deviceTypeSupplier='" + deviceTypeSupplier + '\'' +
                ", deviceTypeProducer='" + deviceTypeProducer + '\'' +
                ", deviceTypeQuantity=" + deviceTypeQuantity +
                ", deviceTypeWarranty='" + deviceTypeWarranty + '\'' +
                '}';
    }
}
