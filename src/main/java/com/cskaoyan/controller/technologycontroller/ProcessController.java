package com.cskaoyan.controller.technologycontroller;

import com.cskaoyan.service.technologyservice.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "process")
public class ProcessController {

    @Autowired
    private ProcessService processService;

    @RequestMapping(value = "find")
    public String find(){
        return "process_list";
    }

    @RequestMapping(value = "edit")
    public String edit(){
        return "process_edit";
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

    //工序编号
    @RequestMapping(value = "search_process_by_processId")
    public String search_process_by_processId(){
        return "";
    }

    //工序名称
    @RequestMapping(value = "search_process_by_technologyPlanId")
    public String search_process_by_technologyPlanId(){
        return "";
    }

}
