package com.cskaoyan.bean;


public class FinalCountCheck {
    int orderId;
    String checkItem;
    int sample;
    int checkNumber;
    int unqualify;
    int fCountCheckId;
    double qualify;
    String cdate;
    int measureData;
    int empId;
    String empName;
    String result;
    String note;

    @Override
    public String toString() {
        return "FinalCountCheck{" +
                "orderId=" + orderId +
                ", checkItem='" + checkItem + '\'' +
                ", sample=" + sample +
                ", checkNumber=" + checkNumber +
                ", unqualify=" + unqualify +
                ", fCountCheckId=" + fCountCheckId +
                ", qualify=" + qualify +
                ", cdate='" + cdate + '\'' +
                ", measureData=" + measureData +
                ", empId=" + empId +
                ", empName='" + empName + '\'' +
                ", result='" + result + '\'' +
                ", note='" + note + '\'' +
                '}';
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCheckItem() {
        return checkItem;
    }

    public void setCheckItem(String checkItem) {
        this.checkItem = checkItem;
    }

    public int getSample() {
        return sample;
    }

    public void setSample(int sample) {
        this.sample = sample;
    }

    public int getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(int checkNumber) {
        this.checkNumber = checkNumber;
    }

    public int getUnqualify() {
        return unqualify;
    }

    public void setUnqualify(int unqualify) {
        this.unqualify = unqualify;
    }

    public int getfCountCheckId() {
        return fCountCheckId;
    }

    public void setfCountCheckId(int fCountCheckId) {
        this.fCountCheckId = fCountCheckId;
    }

    public double getQualify() {
        return qualify;
    }

    public void setQualify(double qualify) {
        this.qualify = qualify;
    }

    public String getCdate() {
        return cdate;
    }

    public void setCdate(String cdate) {
        this.cdate = cdate;
    }

    public int getMeasureData() {
        return measureData;
    }

    public void setMeasureData(int measureData) {
        this.measureData = measureData;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
