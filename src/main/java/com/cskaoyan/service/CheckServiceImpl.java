package com.cskaoyan.service;

import com.cskaoyan.bean.*;
import com.cskaoyan.mapper.CheckMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckServiceImpl implements CheckService {
    @Autowired
    CheckMapper checkMapper;
    @Override
    public List<UnqualifyApply> selectUnqualifyApply(int page,int rows) {
     List<UnqualifyApply> unqualifyApplies=checkMapper.selectUnqualifyApply(page,rows);
        return unqualifyApplies;
    }

    @Override
    public int selectunqualifyNum() {
        return checkMapper.getTotalRecordNum();
    }

    @Override
    public List selectUnqualifyApply1(int num) {

        return checkMapper.selectUnqualifyApply1();
    }

    @Override
    public void updateUnqualifyApply(UnqualifyApply unqualifyApply) {
        checkMapper.updateUnqualifyApply(unqualifyApply);
    }

    @Override
    public List selectDepartment() {
        return checkMapper.selectDepartment();
    }

    @Override
    public Product selectProductById(int prodcutId) {
        return checkMapper.selectProductById(prodcutId);
    }

    @Override
    public Employee selectEmployeeById(int empId) {
        return checkMapper.selectEmployeeById(empId);
    }

    @Override
    public List<FinalMeasureCheck> selectFinalMeasureCheck(int page, int rows) {
        return checkMapper.selectFinalMeasureCheck(page,rows);
    }

    @Override
    public Order selectOrderById(int oId) {
        return checkMapper.selectOrderById(oId);
    }

    @Override
    public List selectProduct() {
        return checkMapper.selectProduct();
    }

    @Override
    public List selectEmployee() {
        return checkMapper.selectEmployee();
    }

    @Override
    public void unqualifyInsert(UnqualifyApply unqualifyApply) {
        checkMapper.unqualifyInsert(unqualifyApply);
    }

    @Override
    public void unqualifyDeleteBatch(int[] ids) {
        checkMapper.unqualifyDeleteBatch(ids);
    }

    @Override
    public List selectCustom() {
        return checkMapper.selectCustom();
    }

    @Override
    public List selectOrders() {
        return checkMapper.selectOrders();
    }

    @Override
    public void finalmeasurecheckInsert(FinalMeasureCheck finalMeasureCheck) {
        checkMapper.finalmeasurecheckInsert(finalMeasureCheck);
    }

    @Override
    public void measureupdateall(FinalMeasureCheck finalMeasureCheck) {
        checkMapper.measureupdateall(finalMeasureCheck);
    }

    @Override
    public void measuredeleteBatch(int[] ids) {
        checkMapper.measuredeleteBatch(ids);
    }

    @Override
    public List<FinalCountCheck> selectFinalCountCheck(int page, int rows) {
        return checkMapper.selectFinalCountCheck(page,rows);
    }

    @Override
    public void finalcountcheckInsert(FinalCountCheck finalCountCheck) {
            checkMapper.finalcountcheckInsert(finalCountCheck);
    }

    @Override
    public void fcountcheckupdateall(FinalCountCheck finalCountCheck) {
        checkMapper.fcountcheckupdateall(finalCountCheck);
    }

    @Override
    public void fcountcheckdeleteBatch(int[] ids) {
        checkMapper.fcountcheckdeleteBatch(ids);
    }

    @Override
    public List<ProcessMeasureCheck> selectpmeasureCheck(int page, int rows) {
        return checkMapper.selectpmeasureCheck(page,rows);
    }

    @Override
    public void pmeasurecheckInsert(ProcessMeasureCheck processMeasureCheck) {
       checkMapper.pmeasurecheckInsert(processMeasureCheck);
    }

    @Override
    public List selecttechnology() {
        return checkMapper.selecttechnology();
    }

    @Override
    public List selectprocess() {
        return checkMapper.selectprocess();
    }

    @Override
    public void fmeasurecheckupdateall(ProcessMeasureCheck processMeasureCheck) {
        checkMapper.fmeasurecheckupdateall(processMeasureCheck);
    }

    @Override
    public void pmeasurecheckdeleteBatch(int[] ids) {
        checkMapper.pmeasurecheckdeleteBatch(ids);
    }

    @Override
    public List<ProcessCountCkeck> selectpcountCheck(int page, int rows) {
        return checkMapper.selectpcountCheck(page,rows);
    }

    @Override
    public void pcountcheckInsert(ProcessCountCkeck processCountCkeck) {
        checkMapper.pcountcheckInsert(processCountCkeck);
    }

    public CheckMapper getCheckMapper() {
        return checkMapper;
    }

    public void setCheckMapper(CheckMapper checkMapper) {
        this.checkMapper = checkMapper;
    }

    @Override
    public void pcountcheckupdateall(ProcessCountCkeck processCountCkeck) {
        checkMapper.pcountcheckupdateall(processCountCkeck);
    }

    @Override
    public void pcountcheckdeleteBatch(int[] ids) {
        checkMapper.pcountcheckdeleteBatch(ids);
    }
}
