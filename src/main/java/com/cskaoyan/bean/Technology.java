package com.cskaoyan.bean;

import java.math.BigDecimal;

public class Technology {
    private String  technologyId;

    private String  technologyName;

    private BigDecimal price;

    private String  vitalProcessPeriod;

    private Integer standardCapacity;

    private Integer overtimeStandardCapacity;

    private Integer overtimeOverfulfilCapacity;

    private Integer doubleCapacity;

    private Integer overfulfilCapacity;

    public Technology() {
    }

    public Technology(String technologyId, String technologyName, BigDecimal price, String vitalProcessPeriod, Integer standardCapacity, Integer overtimeStandardCapacity, Integer overtimeOverfulfilCapacity, Integer doubleCapacity, Integer overfulfilCapacity) {
        this.technologyId = technologyId;
        this.technologyName = technologyName;
        this.price = price;
        this.vitalProcessPeriod = vitalProcessPeriod;
        this.standardCapacity = standardCapacity;
        this.overtimeStandardCapacity = overtimeStandardCapacity;
        this.overtimeOverfulfilCapacity = overtimeOverfulfilCapacity;
        this.doubleCapacity = doubleCapacity;
        this.overfulfilCapacity = overfulfilCapacity;
    }

    public String getTechnologyId() {
        return technologyId;
    }

    public void setTechnologyId(String technologyId) {
        this.technologyId = technologyId;
    }

    public String getTechnologyName() {
        return technologyName;
    }

    public void setTechnologyName(String technologyName) {
        this.technologyName = technologyName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getVitalProcessPeriod() {
        return vitalProcessPeriod;
    }

    public void setVitalProcessPeriod(String vitalProcessPeriod) {
        this.vitalProcessPeriod = vitalProcessPeriod;
    }

    public Integer getStandardCapacity() {
        return standardCapacity;
    }

    public void setStandardCapacity(Integer standardCapacity) {
        this.standardCapacity = standardCapacity;
    }

    public Integer getOvertimeStandardCapacity() {
        return overtimeStandardCapacity;
    }

    public void setOvertimeStandardCapacity(Integer overtimeStandardCapacity) {
        this.overtimeStandardCapacity = overtimeStandardCapacity;
    }

    public Integer getOvertimeOverfulfilCapacity() {
        return overtimeOverfulfilCapacity;
    }

    public void setOvertimeOverfulfilCapacity(Integer overtimeOverfulfilCapacity) {
        this.overtimeOverfulfilCapacity = overtimeOverfulfilCapacity;
    }

    public Integer getDoubleCapacity() {
        return doubleCapacity;
    }

    public void setDoubleCapacity(Integer doubleCapacity) {
        this.doubleCapacity = doubleCapacity;
    }

    public Integer getOverfulfilCapacity() {
        return overfulfilCapacity;
    }

    public void setOverfulfilCapacity(Integer overfulfilCapacity) {
        this.overfulfilCapacity = overfulfilCapacity;
    }

    @Override
    public String toString() {
        return "Technology{" +
                "technologyId='" + technologyId + '\'' +
                ", technologyName='" + technologyName + '\'' +
                ", price=" + price +
                ", vitalProcessPeriod='" + vitalProcessPeriod + '\'' +
                ", standardCapacity=" + standardCapacity +
                ", overtimeStandardCapacity=" + overtimeStandardCapacity +
                ", overtimeOverfulfilCapacity=" + overtimeOverfulfilCapacity +
                ", doubleCapacity=" + doubleCapacity +
                ", overfulfilCapacity=" + overfulfilCapacity +
                '}';
    }
}