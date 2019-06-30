package com.cskaoyan.controller;

import com.cskaoyan.bean.planModelBean.*;
import com.cskaoyan.bean.planModelBean.Process;
import com.cskaoyan.mapper.planModelMapper.ProcessMapper;
import com.cskaoyan.service.planModelService.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ShowController {
    @Autowired
    ProductService productService;
    @Autowired
    CustomService customService;
    @Autowired
    ProcessService processService;
    @Autowired
    DeviceService deviceService;
    @Autowired
    OrderService orderService;
    @Autowired
    TechnologyService technologyService;
    @Autowired
    WorkService workService;
    @Autowired
    ManufactureService manufactureService;

    @RequestMapping("product/get/{ref}")
    @ResponseBody
    public Product getProduct(@PathVariable("ref") String productId){
        Product product = productService.queryProductById(productId);
        return product;
    }


    @RequestMapping("custom/get/{ref}")
    @ResponseBody
    public Custom getCustom(@PathVariable("ref") String customId){
        Custom custom = customService.queryCustomById(customId);
        System.out.println(custom);
        return custom;
    }

        @RequestMapping("process/get/{ref}")
        @ResponseBody
        public Process getProcess(@PathVariable("ref") String processId){
            Process process = processService.queryProcessById(processId);
            System.out.println(process);
            return process;
        }


    @RequestMapping("deviceList/get/{ref}")
    @ResponseBody
    public Device getDevice(@PathVariable("ref") String deviceId){
        Device device = deviceService.queryDeviceById(deviceId);
        return device;
    }

    @RequestMapping("order/get/{ref}")
    @ResponseBody
    public Order getOrder(@PathVariable("ref") String orderId){
        Order order = orderService.queryOrderById(orderId);
        return order;
    }

    @RequestMapping("Technology/get/{ref}")
    @ResponseBody
    public Technology getTechnology(@PathVariable("ref") String technologyId){
        Technology technology = technologyService.queryTechById(technologyId);
        return technology;
    }

    @RequestMapping("work/get/{ref}")
    @ResponseBody
    public Work getWork(@PathVariable("ref") String workId){
        Work work = workService.queryWorkById(workId);
        return work;
    }

    @RequestMapping("manufacture/get/{ref}")
    @ResponseBody
    public Manufacture getManu(@PathVariable("ref") String manufactureSn){
        Manufacture manufacture = manufactureService.queryManuById(manufactureSn);
        return manufacture;
    }

}