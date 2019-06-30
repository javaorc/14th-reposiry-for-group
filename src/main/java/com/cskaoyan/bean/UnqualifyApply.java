package com.cskaoyan.bean;

public class UnqualifyApply {
    int unqualifyApplyId;
   int productId;
   String productName;
   String unqualifyItem;
   int unqualifyCount;
   String assemblyDate;
    int empId;
    String empName;
   String applyDate;
   String note;

    @Override
    public String toString() {
        return "UnqualifyApply{" +
                "unqualifyApplyId=" + unqualifyApplyId +
                ", productId=" + productId +
                ", productName='" + productName + '\'' +
                ", unqualifyItem='" + unqualifyItem + '\'' +
                ", unqualifyCount=" + unqualifyCount +
                ", assemblyDate=" + assemblyDate +
                ", empId=" + empId +
                ", empName='" + empName + '\'' +
                ", applyDate=" + applyDate +
                ", note='" + note + '\'' +
                '}';
    }

    public int getUnqualifyApplyId() {
        return unqualifyApplyId;
    }

    public void setUnqualifyApplyId(int unqualifyApplyId) {
        this.unqualifyApplyId = unqualifyApplyId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getUnqualifyItem() {
        return unqualifyItem;
    }

    public void setUnqualifyItem(String unqualifyItem) {
        this.unqualifyItem = unqualifyItem;
    }

    public int getUnqualifyCount() {
        return unqualifyCount;
    }

    public void setUnqualifyCount(int unqualifyCount) {
        this.unqualifyCount = unqualifyCount;
    }

    public String getAssemblyDate() {
        return assemblyDate;
    }

    public void setAssemblyDate(String assemblyDate) {
        this.assemblyDate = assemblyDate;
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

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
