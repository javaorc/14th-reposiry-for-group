package com.cskaoyan.controller.technologycontroller;


import com.cskaoyan.service.technologyservice.TechnologyRequirementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "technologyRequirement")
public class TechnologyRequirementController {

    @Autowired
    private TechnologyRequirementService technologyRequirementService;

    @RequestMapping(value = "find")
    public String find(){
        return "technologyRequirement_list";
    }


    //新增
    @RequestMapping(value = "insert" ,method = RequestMethod.POST)
    public String insert(){
        return "list";
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


    //工艺要求编号
    @RequestMapping(value = "search_technologyPlan_by_technologyPlanId")
    public String search_technologyPlan_by_technologyPlanId(){
        return "";
    }

    //工艺要求名称
    @RequestMapping(value = "search_technologyPlan_by_technologyName")
    public String search_technologyPlan_by_technologyName(){
        return "";
    }

}
