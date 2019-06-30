package com.cskaoyan.controller;

import com.cskaoyan.Vo.PlanResponseVo;
import com.cskaoyan.bean.planModelBean.Product;
import com.cskaoyan.mapper.planModelMapper.TaskMapper;
import com.cskaoyan.service.planModelService.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class PlanDeleteController {
    @Autowired
    OrderService orderService;
    @Autowired
    CustomService customService;
    @Autowired
    ProductService productService;
    @Autowired
    WorkService workService;
    @Autowired
    ManufactureService manufactureService;
    @Autowired
    TaskMapper taskMapper;
    @RequestMapping("order/delete_judge")
    @ResponseBody
    public String deleteJudge1(){

        return "";
    }
    @RequestMapping("order/delete_batch")
    @ResponseBody
    public PlanResponseVo deleteOrder(String[] ids){
        System.out.println(ids);
        System.out.println(ids);
        int i = orderService.deleteOrder(ids);
        PlanResponseVo planResponseVo = new PlanResponseVo(200,"OK",null);
        return planResponseVo;
    }

    @RequestMapping("custom/delete_judge")
    @ResponseBody
    public String deleteJudge2(){

        return "";
    }
    @RequestMapping("custom/delete_batch")
    @ResponseBody
    public PlanResponseVo deleteCustom(String[] ids){
        System.out.println(ids);
        System.out.println(ids);
        int i = customService.deleteCustom(ids);
        PlanResponseVo planResponseVo = new PlanResponseVo(200,"OK",null);
        return planResponseVo;
    }

    @RequestMapping("product/delete_judge")
    @ResponseBody
    public String deleteJudge3(){

        return "";
    }
    @RequestMapping("product/delete_batch")
    @ResponseBody
    public PlanResponseVo deleteProduct(String[] ids){
        System.out.println(ids);
        System.out.println(ids);
        int i = productService.deleteProduct(ids);
        PlanResponseVo planResponseVo = new PlanResponseVo(200,"OK",null);
        return planResponseVo;
    }

    @RequestMapping("work/delete_judge")
    @ResponseBody
    public String deleteJudge4(){

        return "";
    }
    @RequestMapping("work/delete_batch")
    @ResponseBody
    public PlanResponseVo deleteWork(String[] ids){
        System.out.println(ids);
        System.out.println(ids);
        int i = workService.deleteWork(ids);
        PlanResponseVo planResponseVo = new PlanResponseVo(200,"OK",null);
        return planResponseVo;
    }

    @RequestMapping("manufacture/delete_judge")
    @ResponseBody
    public String deleteJudge5(){

        return "";
    }
    @RequestMapping("manufacture/delete_batch")
    @ResponseBody
    public PlanResponseVo deleteManufacture(String[] ids){
        System.out.println(ids);
        System.out.println(ids);
        int i = manufactureService.deleteManu(ids);
        PlanResponseVo planResponseVo = new PlanResponseVo(200,"OK",null);
        return planResponseVo;
    }

    @RequestMapping("task/delete_judge")
    @ResponseBody
    public String deleteJudge6(){

        return "";
    }
    @RequestMapping("task/delete_batch")
    @ResponseBody
    public PlanResponseVo deleteTask(String[] ids){
        System.out.println(ids);
        System.out.println(ids);
        int i = taskMapper.deleteTask(ids);
        PlanResponseVo planResponseVo = new PlanResponseVo(200,"OK",null);
        return planResponseVo;
    }
}
