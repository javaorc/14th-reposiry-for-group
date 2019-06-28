package com.cskaoyan.bean.planModelBean;

import java.util.Date;

public class Manufacture {
    private String  manufactureSn;

    private Integer launchQuantity;

    private Date    beginDate;

    private Date    endDate;

    private Order cOrder;

    private Technology technology;

    public Manufacture() {
    }

    public Manufacture(String manufactureSn, Integer launchQuantity, Date beginDate, Date endDate, Order order, Technology technology) {
        this.manufactureSn = manufactureSn;
        this.launchQuantity = launchQuantity;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.cOrder = order;
        this.technology = technology;
    }

    public String getManufactureSn() {
        return manufactureSn;
    }

    public void setManufactureSn(String manufactureSn) {
        this.manufactureSn = manufactureSn;
    }

    public Integer getLaunchQuantity() {
        return launchQuantity;
    }

    public void setLaunchQuantity(Integer launchQuantity) {
        this.launchQuantity = launchQuantity;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Order getcOrder() {
        return cOrder;
    }

    public void setcOrder(Order cOrder) {
        this.cOrder = cOrder;
    }

    public Technology getTechnology() {
        return technology;
    }

    public void setTechnology(Technology technology) {
        this.technology = technology;
    }

    @Override
    public String toString() {
        return "Manufacture{" +
                "manufactureSn='" + manufactureSn + '\'' +
                ", launchQuantity=" + launchQuantity +
                ", beginDate=" + beginDate +
                ", endDate=" + endDate +
                ", cOrder=" + cOrder +
                ", technology=" + technology +
                '}';
    }
}