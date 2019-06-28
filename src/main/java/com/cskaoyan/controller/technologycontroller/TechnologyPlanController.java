package com.cskaoyan.controller.technologycontroller;

import com.cskaoyan.service.technologyservice.TechnologyPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "technologyPlan")
public class TechnologyPlanController {

    @Autowired
    private TechnologyPlanService technologyPlanService;

    @RequestMapping(value = "find")
    public String find(){
        return "technologyPlan_list";
    }

    //新增
    @RequestMapping(value = "insert")
    public String insert(){
        return "";
    }

    //编辑
    @RequestMapping(value = "update_all")
    public String update_all(){
        return "";
    }

    //删除
    @RequestMapping(value = "delete_batch")
    public String delete_batch(){
        return "";
    }

    //工艺计划编号
    @RequestMapping(value = "search_process_by_processId")
    public String search_process_by_processId(){
        return "";
    }

    //工艺计划名称
    @RequestMapping(value = "search_process_by_technologyPlanId")
    public String search_process_by_technologyPlanId() {
        return "";
    }

}
