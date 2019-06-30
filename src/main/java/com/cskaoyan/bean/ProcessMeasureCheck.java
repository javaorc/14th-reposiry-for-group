package com.cskaoyan.bean;

public class ProcessMeasureCheck {
    int pMeasureCheckId;
    int processId;
    String checkItem;
    String cdate;
    String measureData;
    int empId;
    String empName;
    String result;
    String note;

    @Override
    public String toString() {
        return "ProcessMeasureCheck{" +
                "pMeasureCheckId=" + pMeasureCheckId +
                ", processId=" + processId +
                ", checkItem='" + checkItem + '\'' +
                ", cdate='" + cdate + '\'' +
                ", measureData='" + measureData + '\'' +
                ", empId=" + empId +
                ", empName='" + empName + '\'' +
                ", result='" + result + '\'' +
                ", note='" + note + '\'' +
                '}';
    }

    public int getpMeasureCheckId() {
        return pMeasureCheckId;
    }

    public void setpMeasureCheckId(int pMeasureCheckId) {
        this.pMeasureCheckId = pMeasureCheckId;
    }

    public int getProcessId() {
        return processId;
    }

    public void setProcessId(int processId) {
        this.processId = processId;
    }

    public String getCheckItem() {
        return checkItem;
    }

    public void setCheckItem(String checkItem) {
        this.checkItem = checkItem;
    }

    public String getCdate() {
        return cdate;
    }

    public void setCdate(String cdate) {
        this.cdate = cdate;
    }

    public String getMeasureData() {
        return measureData;
    }

    public void setMeasureData(String measureData) {
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
