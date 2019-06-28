package com.cskaoyan.controller.technologycontroller;

import com.cskaoyan.bean.technologybean.Technology;
import com.cskaoyan.service.technologyservice.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "technology")
public class TechnologyController {

    @Autowired
    private TechnologyService technologyService;

    @RequestMapping(value = "find")
    public String find(){
        return "technology_list";
    }


    //新增
    @RequestMapping(value = "insert")
    public String insert(Technology technology){
        technologyService.insert(technology);
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

    //工艺编号
    @RequestMapping(value = "search_technology_by_technologyId")
    public String search_technology_by_technologyId(){
        return "";
    }

    //工艺名称
    @RequestMapping(value = "search_technology_by_technologyName")
    public String search_technology_by_technologyName(){
        return "";
    }

}
