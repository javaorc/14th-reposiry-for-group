package com.cskaoyan.service;

import com.cskaoyan.bean.*;

import java.util.List;

public interface CheckService {
    public List<UnqualifyApply> selectUnqualifyApply(int page,int rows);
    public int selectunqualifyNum();
    public List selectUnqualifyApply1(int num);

    void updateUnqualifyApply(UnqualifyApply unqualifyApply);

    List selectDepartment();

    Product selectProductById(int prodcutId);

    Employee selectEmployeeById(int empId);

    List<FinalMeasureCheck> selectFinalMeasureCheck(int page, int rows);

    Order selectOrderById(int oId);

    List selectProduct();

    List selectEmployee();

    void unqualifyInsert(UnqualifyApply unqualifyApply);

    void unqualifyDeleteBatch(int[] ids);

    List selectCustom();

    List selectOrders();

    void finalmeasurecheckInsert(FinalMeasureCheck finalMeasureCheck);

    void measureupdateall(FinalMeasureCheck finalMeasureCheck);

    void measuredeleteBatch(int[] ids);

    List<FinalCountCheck> selectFinalCountCheck(int page, int rows);

    void finalcountcheckInsert(FinalCountCheck finalCountCheck);

    void fcountcheckupdateall(FinalCountCheck finalCountCheck);

    void fcountcheckdeleteBatch(int[] ids);

    List<ProcessMeasureCheck> selectpmeasureCheck(int page, int rows);

    void pmeasurecheckInsert(ProcessMeasureCheck processMeasureCheck);

    List selecttechnology();

    List selectprocess();

    void fmeasurecheckupdateall(ProcessMeasureCheck processMeasureCheck);

    void pmeasurecheckdeleteBatch(int[] ids);

    List<ProcessCountCkeck> selectpcountCheck(int page, int rows);

    void pcountcheckInsert(ProcessCountCkeck processCountCkeck);

    void pcountcheckupdateall(ProcessCountCkeck processCountCkeck);

    void pcountcheckdeleteBatch(int[] ids);
}
