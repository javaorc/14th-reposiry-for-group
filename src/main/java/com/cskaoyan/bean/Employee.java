package com.cskaoyan.bean;

import java.util.Date;

public class Employee {
    int empId;
    String empName;
    int sex;
    String idCode;
    Date birthday;
    Date joinDate;
    String status;
    String education;
    String degree;
    String major;
    String graduateSchool;
    String educatiomForm;
    Department department;

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

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGarduateSchool() {
        return graduateSchool;
    }

    public void setGarduateSchool(String graduateSchool) {
        this.graduateSchool = graduateSchool;
    }

    public String getEducatiomForm() {
        return educatiomForm;
    }

    public void setEducatiomForm(String educatiomForm) {
        this.educatiomForm = educatiomForm;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
