package com.cskaoyan.controller;

import com.cskaoyan.bean.*;
import com.cskaoyan.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class Checkcontroller {
    @Autowired
    CheckService checkService;
    @RequestMapping("unqualify/find")
    public String unqualify(HttpServletRequest request){
         //List list=checkService.selectUnqualifyApply1(1);

         List sysPermissionList=new ArrayList();
         sysPermissionList.add("unqualify:add");
         sysPermissionList.add("unqualify:edit");
         sysPermissionList.add("unqualify:delete");

         request.getSession().setAttribute("sysPermissionList",sysPermissionList);
        return "unqualify_list";
    }
    @RequestMapping("unqualify/list")
    @ResponseBody
    public Map unqualifyList(int page,int rows){
        List<UnqualifyApply> unqualifyApplies = checkService.selectUnqualifyApply(page, rows);
        Map map=new HashMap();
        map.put("total",rows);
        map.put("rows",unqualifyApplies);
        return map;
    }
    @RequestMapping("department/get_data")
    @ResponseBody
    public List unqualifyGteDepartmentData(){
        List list=checkService.selectDepartment();
        return list;
    }
    @RequestMapping("product/get_data")
    @ResponseBody
    public List unqualifyGteProductData(){
        List list=checkService.selectProduct();
        return list;
    }

    @RequestMapping("employee/get_data")
    @ResponseBody
    public List unqualifyGteEmployeeData(){
        List list=checkService.selectEmployee();
        return list;
    }


    @RequestMapping("custom/get_data")
    @ResponseBody
    public List customGetData(){
        List list=checkService.selectCustom();
        return list;
    }

    @RequestMapping("order/get_data")
    @ResponseBody
    public List orderGetData(){
        List list=checkService.selectOrders();
        return list;
    }

    @RequestMapping("technologyPlan/get_data")
    @ResponseBody
    public List technologyGetData(){
        List list=checkService.selecttechnology();
        return list;
    }

    @RequestMapping("process/get_data")
    @ResponseBody
    public List processGetData(){
        List list=checkService.selectprocess();
        return list;
    }
    @RequestMapping("product/get/{productId}")
    @ResponseBody
    public Product productGet(@PathVariable("productId")int prodcutId){
        Product list=checkService.selectProductById(prodcutId);
        return list;
    }

    @RequestMapping("employee/get/{empId}")
    @ResponseBody
    public Employee employeeGet(@PathVariable("empId")int empId){
        Employee employee=checkService.selectEmployeeById(empId);
        return employee;
    }

    @RequestMapping("unqualify/add_judge")
    @ResponseBody
    public String unqualifyAddjudge(){

        return null;
    }

    @RequestMapping("fCountCheck/add_judge")
    @ResponseBody
    public String fCountCheckAddjudge(){

        return null;
    }
    @RequestMapping("unqualify/add")
    public String unqualifyAdd(){

        return "unqualify_add";
    }

    @RequestMapping("unqualify/edit_judge")
    @ResponseBody
    public String unqualifyUpdate(){

        return null;
    }


    @RequestMapping("fMeasureCheck/edit_judge")
    @ResponseBody
    public String fMeasureCheck_edit(){

        return null;
    }
    @RequestMapping("unqualify/edit")
    public String unqualifyEdit(UnqualifyApply unqualifyApply){
        //checkService.updateUnqualifyApply(unqualifyApply);
        return "unqualify_edit";
    }

    @RequestMapping("measure/edit")
    public String unqualifyEdit(FinalMeasureCheck finalMeasureCheck){
        //checkService.updateUnqualifyApply(finalMeasureCheck);
        return "measurement_edit";
    }

    @RequestMapping("unqualify/update_all")
    @ResponseBody
    public ResponseVo unqualifyEditall(UnqualifyApply unqualifyApply){
        checkService.updateUnqualifyApply(unqualifyApply);
        return new ResponseVo(200,"OK",null);
    }

    @RequestMapping("measure/update_all")
    @ResponseBody
    public ResponseVo measureupdateall(FinalMeasureCheck finalMeasureCheck){
        checkService.measureupdateall(finalMeasureCheck);
        return new ResponseVo(200,"OK",null);
    }
//    @RequestMapping("home")
//    public String home(){
//        return "home";
//    }
    @RequestMapping("unqualify/insert")
    @ResponseBody
    public ResponseVo unqualifyInsert(UnqualifyApply unqualifyApply){
        checkService.unqualifyInsert(unqualifyApply);
        return new ResponseVo(200,"OK",null);
    }

    @RequestMapping("unqualify/delete_judge")
    @ResponseBody
    public String unqualifyDELETEjUDGE(UnqualifyApply unqualifyApply){
       return null;
    }

    @RequestMapping("fMeasureCheck/delete_judge")
    @ResponseBody
    public String fMeasureCheckDelete(){
        return null;
    }

    @RequestMapping("unqualify/delete_batch")
    @ResponseBody
    public ResponseVo unqualifdeleteBatch(int[] ids){
        checkService.unqualifyDeleteBatch(ids);
        return new ResponseVo(200,"OK",null);
    }

    @RequestMapping("measure/delete_batch")
    @ResponseBody
    public ResponseVo measuredeleteBatch(int[] ids){
        checkService.measuredeleteBatch(ids);
        return new ResponseVo(200,"OK",null);
    }



    @RequestMapping("measure/find")
    public String meassure(HttpServletRequest request){
        List sysPermissionList=new ArrayList();
        sysPermissionList.add("fMeasureCheck:add");
        sysPermissionList.add("fMeasureCheck:edit");
        sysPermissionList.add("fMeasureCheck:delete");
        request.getSession().setAttribute("sysPermissionList",sysPermissionList);
        return "measurement_list";
    }
    @RequestMapping("measure/list")
    @ResponseBody
    public Map meassureList(int page,int rows){
        List<FinalMeasureCheck> finalMeasureChecks = checkService.selectFinalMeasureCheck(page, rows);
        Map map=new HashMap();
        map.put("total",rows);
        map.put("rows",finalMeasureChecks);
        return map;
    }

    @RequestMapping("order/get/{oId}")
    @ResponseBody
    public Order orderGteData(@PathVariable("oId") int oId){
        Order order =checkService.selectOrderById(oId);
        return order;
    }

    @RequestMapping("fMeasureCheck/add_judge")
    @ResponseBody
    public String fMeasureCheckAddjudge(){

        return null;
    }
    @RequestMapping("measure/add")

    public String fMeasureCheckAdd(){

        return "measurement_add";
    }

    @RequestMapping("measure/insert")
    @ResponseBody
    public ResponseVo unqualifyInsert(FinalMeasureCheck finalMeasureCheck){
        checkService.finalmeasurecheckInsert(finalMeasureCheck);
        return new ResponseVo(200,"OK",null);
    }


    @RequestMapping("f_count_check/find")
    public String fcountcheck(HttpServletRequest request){
        List sysPermissionList=new ArrayList();
        sysPermissionList.add("fCountCheck:add");
        sysPermissionList.add("fCountCheck:edit");
        sysPermissionList.add("fCountCheck:delete");
        request.getSession().setAttribute("sysPermissionList",sysPermissionList);
        return "f_count_check_list";
    }

    @RequestMapping("f_count_check/list")
    @ResponseBody
    public Map fcountCheckList(int page,int rows){
        List<FinalCountCheck> finalCountChecks = checkService.selectFinalCountCheck(page, rows);
        Map map=new HashMap();
        map.put("total",rows);
        map.put("rows",finalCountChecks);
        return map;
    }

    @RequestMapping("f_count_check/add")
    public String fCountCheckAdd(){

        return "f_count_check_add";
    }

    @RequestMapping("f_count_check/insert")
    @ResponseBody
    public ResponseVo unqualifyInsert(FinalCountCheck finalCountCheck){
        checkService.finalcountcheckInsert(finalCountCheck);
        return new ResponseVo(200,"OK",null);
    }

    @RequestMapping("fCountCheck/edit_judge")
    @ResponseBody
    public String fCountCheck_edit(){

        return null;
    }

    @RequestMapping("f_count_check/edit")
    public String fcountcheckEdit(FinalCountCheck finalCountCheck){

        return "f_count_check_edit";
    }

    @RequestMapping("f_count_check/update_all")
    @ResponseBody
    public ResponseVo fcountcheckupdateall(FinalCountCheck finalCountCheck){
        checkService.fcountcheckupdateall(finalCountCheck);
        return new ResponseVo(200,"OK",null);
    }

    @RequestMapping("fCountCheck/delete_judge")
    @ResponseBody
    public String fCountCheckDelete(){
        return null;
    }

    @RequestMapping("f_count_check/delete_batch")
    @ResponseBody
    public ResponseVo fcountcheckdeleteBatch(int[] ids){
        checkService.fcountcheckdeleteBatch(ids);
        return new ResponseVo(200,"OK",null);
    }








    @RequestMapping("p_measure_check/find")
    public String pmeasurecheck(HttpServletRequest request){
        List sysPermissionList=new ArrayList();
        sysPermissionList.add("pMeasureCheck:add");
        sysPermissionList.add("pMeasureCheck:edit");
        sysPermissionList.add("pMeasureCheck:delete");
        request.getSession().setAttribute("sysPermissionList",sysPermissionList);
        return "p_measure_check_list";
    }

    @RequestMapping("p_measure_check/list")
    @ResponseBody
    public Map pemeasureCheckList(int page,int rows){
        List<ProcessMeasureCheck> processMeasureChecks = checkService.selectpmeasureCheck(page, rows);
        Map map=new HashMap();
        map.put("total",rows);
        map.put("rows",processMeasureChecks);
        return map;
    }

    @RequestMapping("pMeasureCheck/add_judge")
    @ResponseBody
    public String pMeasureCheckAddjudge(){

        return null;
    }

    @RequestMapping("p_measure_check/add")

    public String pMeasureCheckAdd(){

        return "p_measure_check_add";
    }

    @RequestMapping("p_measure_check/insert")
    @ResponseBody
    public ResponseVo pmeasurecheckInsert(ProcessMeasureCheck processMeasureCheck){
        checkService.pmeasurecheckInsert(processMeasureCheck);
        return new ResponseVo(200,"OK",null);
    }

    @RequestMapping("pMeasureCheck/edit_judge")
    @ResponseBody
    public String pmeasureCheck_edit(){

        return null;
    }

    @RequestMapping("p_measure_check/edit")
    public String fcountcheckEdit(ProcessMeasureCheck processMeasureCheck){

        return "p_measure_check_edit";
    }

    @RequestMapping("p_measure_check/update_all")
    @ResponseBody
    public ResponseVo fmeasurecheckupdateall(ProcessMeasureCheck processMeasureCheck){
        checkService.fmeasurecheckupdateall(processMeasureCheck);
        return new ResponseVo(200,"OK",null);
    }

    @RequestMapping("pMeasureCheck/delete_judge")
    @ResponseBody
    public String pmeasureCheckDelete(){
        return null;
    }


    @RequestMapping("p_measure_check/delete_batch")
    @ResponseBody
    public ResponseVo pmeasurecheckdeleteBatch(int[] ids){
        checkService.pmeasurecheckdeleteBatch(ids);
        return new ResponseVo(200,"OK",null);
    }







    @RequestMapping("p_count_check/find")
    public String pcountcheck(HttpServletRequest request){
        List sysPermissionList=new ArrayList();
        sysPermissionList.add("pCountCheck:add");
        sysPermissionList.add("pCountCheck:edit");
        sysPermissionList.add("pCountCheck:delete");
        request.getSession().setAttribute("sysPermissionList",sysPermissionList);
        return "p_count_check_list";
    }

    @RequestMapping("p_count_check/list")
    @ResponseBody
    public Map pcountCheckList(int page,int rows){
        List<ProcessCountCkeck> processMeasureChecks = checkService.selectpcountCheck(page, rows);
        Map map=new HashMap();
        map.put("total",rows);
        map.put("rows",processMeasureChecks);
        return map;



    }

    @RequestMapping("pCountCheck/add_judge")
    @ResponseBody
    public String pCountCheckAddjudge(){

        return null;
    }
    @RequestMapping("p_count_check/add")
    public String pCountCheckAdd(){

        return "p_count_check_add";
    }

    @RequestMapping("p_count_check/insert")
    @ResponseBody
    public ResponseVo pmeasurecheckInsert(ProcessCountCkeck processCountCkeck){
        checkService.pcountcheckInsert(processCountCkeck);
        return new ResponseVo(200,"OK",null);
    }

    @RequestMapping("pCountCheck/edit_judge")
    @ResponseBody
    public String pcountCheck_edit(){

        return null;
    }

    @RequestMapping("p_count_check/edit")
    public String fcountcheckEdit(ProcessCountCkeck processCountCkeck){

        return "p_count_check_edit";
    }

    @RequestMapping("p_count_check/update_all")
    @ResponseBody
    public ResponseVo pcountcheckupdateall(ProcessCountCkeck processCountCkeck){
        checkService.pcountcheckupdateall(processCountCkeck);
        return new ResponseVo(200,"OK",null);
    }


    @RequestMapping("pCountCheck/delete_judge")
    @ResponseBody
    public String pcountCheckDelete(){
        return null;
    }


    @RequestMapping("p_count_check/delete_batch")
    @ResponseBody
    public ResponseVo pcountcheckdeleteBatch(int[] ids){
        checkService.pcountcheckdeleteBatch(ids);
        return new ResponseVo(200,"OK",null);
    }
}
