package com.cskaoyan.controller;

import com.cskaoyan.Vo.PlanResponseVo;
import com.cskaoyan.bean.planModelBean.*;
import com.cskaoyan.bean.planModelBean.Process;
import com.cskaoyan.mapper.planModelMapper.ProcessMapper;
import com.cskaoyan.mapper.planModelMapper.TaskMapper;
import com.cskaoyan.service.planModelService.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PlanEditController {
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
    @Autowired
    ProcessService processService;
    @Autowired
    DeviceService deviceService;
    @Autowired
    TechnologyService technologyService;


    @RequestMapping("order/edit_judge")
    @ResponseBody
    public String editJudge1(){
        return "";
    }

    @RequestMapping("order/edit")
    public String editOrder(){
        return "order_edit";
    }


    @RequestMapping("custom/edit_judge")
    @ResponseBody
    public String editJudge2(){
        return "";
    }

    @RequestMapping("custom/edit")
    public String editCustom(){
        return "custom_edit";
    }


    @RequestMapping("product/edit_judge")
    @ResponseBody
    public String editJudge3(){
        return "";
    }

    @RequestMapping("product/edit")
    public String editProduct(){
        return "product_edit";
    }


    @RequestMapping("process/edit_judge")
    @ResponseBody
    public String editJudge7(){
        return "";
    }

    @RequestMapping("work/edit_judge")
    @ResponseBody
    public String editJudge4(){
        return "";
    }

    @RequestMapping("work/edit")
    public String editWork(){
        return "work_edit";
    }


    @RequestMapping("manufacture/edit_judge")
    @ResponseBody
    public String editJudge5(){
        return "";
    }

    @RequestMapping("manufacture/edit")
    public String editManufacture(){
        return "manufacture_edit";
    }


    @RequestMapping("deviceList/edit_judge")
    @ResponseBody
    public String editJudge8(){
        return "";
    }

    @RequestMapping("task/edit_judge")
    @ResponseBody
    public String editJudge6(){
        return "";
    }


    @RequestMapping("Technology/edit_judge")
    @ResponseBody
    public String editJudge9(){
        return "";
    }

    @RequestMapping("task/edit")
    public String editTask(){
        return "task_edit";
    }

    @RequestMapping("order/update_note")
    @ResponseBody
    public PlanResponseVo UpdateOrderNote(String orderId,String note){
        Order order = orderService.queryOrderById(orderId);
        order.setNote(note);
        int i = orderService.updateOrder(order, orderId);

        PlanResponseVo planResponseVo = new PlanResponseVo(200,"OK",null);
        return planResponseVo;
    }
    @RequestMapping("custom/update_note")
    @ResponseBody
    public PlanResponseVo UpdateCustomNote(String customId,String note){
        Custom custom = customService.queryCustomById(customId);
        custom.setNote(note);
        int i = customService.updateCustom(custom);
        PlanResponseVo planResponseVo = new PlanResponseVo(200,"OK",null);
        return planResponseVo;
    }

    @RequestMapping("product/update_note")
    @ResponseBody
    public PlanResponseVo UpdateProductNote(String productId,String note){
        Product product = productService.queryProductById(productId);
        product.setNote(note);
        int i = productService.updateProduct(product);

        PlanResponseVo planResponseVo = new PlanResponseVo(200,"OK",null);
        return planResponseVo;
    }

    @RequestMapping("order/update_all")
    @ResponseBody
    public PlanResponseVo UpdateOrder(Order order,String orderId,String customId,String productId){
        System.out.println(order);
        Custom custom = customService.queryCustomById(customId);
        Product product = productService.queryProductById(productId);
        order.setCustom(custom);
        order.setProduct(product);
        System.out.println(order);
        int i = orderService.updateOrder(order, orderId);

        PlanResponseVo planResponseVo = new PlanResponseVo(200,"OK",null);
        return planResponseVo;
    }


    @RequestMapping("custom/update_all")
    @ResponseBody
    public PlanResponseVo UpdateCustom(Custom custom){
        System.out.println(custom);
        System.out.println(custom);
        int i = customService.updateCustom(custom);
        //int i = orderService.updateOrder(order, orderId);

        PlanResponseVo planResponseVo = new PlanResponseVo(200,"OK",null);
        return planResponseVo;
    }

    @RequestMapping("product/update_all")
    @ResponseBody
    public PlanResponseVo UpdateProduct(Product product){
        System.out.println(product);
        System.out.println(product);
        int i = productService.updateProduct(product);
        //int i = orderService.updateOrder(order, orderId);

        PlanResponseVo planResponseVo = new PlanResponseVo(200,"OK",null);
        return planResponseVo;
    }

    @RequestMapping("work/update_all")
    @ResponseBody
    public PlanResponseVo UpdateWork(Work work){
        System.out.println(work);
        int i = workService.updateWork(work);
        //int i = orderService.updateOrder(order, orderId);

        PlanResponseVo planResponseVo = new PlanResponseVo(200,"OK",null);
        return planResponseVo;
    }

    @RequestMapping("manufacture/update_all")
    @ResponseBody
    public PlanResponseVo UpdattManufacture(Manufacture manufacture){
        int i = manufactureService.updateManu(manufacture);
        //int i = orderService.updateOrder(order, orderId);

        PlanResponseVo planResponseVo = new PlanResponseVo(200,"OK",null);
        return planResponseVo;
    }

    @RequestMapping("task/update_all")
    @ResponseBody
    public PlanResponseVo UpdatTask(Task task){
        int i = taskMapper.updateTask(task);
        PlanResponseVo planResponseVo = new PlanResponseVo(200,"OK",null);
        return planResponseVo;
    }


    @RequestMapping("process/update_all")
    @ResponseBody
    public PlanResponseVo UpdatProcess(String processId,String technologyPlanId,String sequence,String quota){
        Process process = processService.queryProcessById(processId);
        process.setQuota(Integer.parseInt(quota));
        process.setSequence(Integer.parseInt(sequence));
        process.setTechnologyPlanId(technologyPlanId);
        int i = processService.updateProcess(process);
        PlanResponseVo planResponseVo = new PlanResponseVo(200,"OK",null);
        return planResponseVo;
    }



    @RequestMapping("deviceList/update")
    @ResponseBody
    public PlanResponseVo UpdatDevice(Device device){
        int i = deviceService.updateDeviceByDid(device);
        PlanResponseVo planResponseVo = new PlanResponseVo(200,"OK",null);
        return planResponseVo;
    }
    @RequestMapping("Technology/update_all")
    @ResponseBody
    public PlanResponseVo updateTechnology(Technology technology){
        int i = technologyService.updateTechByTid(technology);
        PlanResponseVo planResponseVo = new PlanResponseVo(200,"OK",null);
        return planResponseVo;
    }



}
