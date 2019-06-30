package com.cskaoyan.bean.employee;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    private String birthday;
    private String degree;
    private String education;
    private String educationForm;
    private String empId;
    private String empName;
    private String graduateSchool;
    private String idCode;
    private String joinDate;
    private String major;
    private  char sex;
    private String status;
    Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getEducationForm() {
        return educationForm;
    }

    public void setEducationForm(String educationForm) {
        this.educationForm = educationForm;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getGraduateSchool() {
        return graduateSchool;
    }

    public void setGraduateSchool(String graduateSchool) {
        this.graduateSchool = graduateSchool;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "birthday='" + birthday + '\'' +
                ", degree='" + degree + '\'' +
                ", education='" + education + '\'' +
                ", educationForm='" + educationForm + '\'' +
                ", empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", graduateSchool='" + graduateSchool + '\'' +
                ", idCode='" + idCode + '\'' +
                ", joinDate='" + joinDate + '\'' +
                ", major='" + major + '\'' +
                ", sex=" + sex +
                ", status='" + status + '\'' +
                ", department=" + department +
                '}';
    }
}
