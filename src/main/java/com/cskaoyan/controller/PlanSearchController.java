package com.cskaoyan.controller;

import com.cskaoyan.bean.planModelBean.*;
import com.cskaoyan.mapper.planModelMapper.TaskMapper;
import com.cskaoyan.service.planModelService.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PlanSearchController {
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

    @RequestMapping("order/search_order_by_orderId")
    @ResponseBody
    public List<Order> searchOrderByOrderId(String searchValue){
        List<Order> orders = orderService.searchOrderById(searchValue);
        for(int i=0;i<orders.size();i++){
            Product product = productService.queryProductById(orders.get(i).getProduct().getProductId());
            Custom custom = customService.queryCustomById(orders.get(i).getCustom().getCustomId());
            orders.get(i).setCustom(custom);
            orders.get(i).setProduct(product);
        }
        return orders;
    }



    @RequestMapping("order/search_order_by_orderCustom")
    @ResponseBody
    public List<Order> searchOrderByCustomName(String searchValue){
        String[] cids = customService.searchCidByCname(searchValue);
        System.out.println(cids);
        List<Order> orders = orderService.searchOrderByCustomName(cids);
        for(int i=0;i<orders.size();i++){
            Product product = productService.queryProductById(orders.get(i).getProduct().getProductId());
            Custom custom = customService.queryCustomById(orders.get(i).getCustom().getCustomId());
            orders.get(i).setCustom(custom);
            orders.get(i).setProduct(product);
        }
        return orders;
    }

    @RequestMapping("order/search_order_by_orderProduct")
    @ResponseBody
    public List<Order> searchOrderByProductName(String searchValue){
        String[] pids = productService.searchPidByPname(searchValue);
        System.out.println(pids);
        List<Order> orders = orderService.searchOrderByProductName(pids);
        for(int i=0;i<orders.size();i++){
            Product product = productService.queryProductById(orders.get(i).getProduct().getProductId());
            Custom custom = customService.queryCustomById(orders.get(i).getCustom().getCustomId());
            orders.get(i).setCustom(custom);
            orders.get(i).setProduct(product);
        }
        return orders;
    }



    @RequestMapping("custom/search_custom_by_customId")
    @ResponseBody
    public List<Custom> searchCustomByCustomId(String searchValue){
        List<Custom> customs = customService.searchCustomByCid(searchValue);
        return customs;
    }

    @RequestMapping("custom/search_custom_by_customName")
    @ResponseBody
    public List<Custom> searchCustomByCustomName(String searchValue){
        String[] cids = customService.searchCidByCname(searchValue);
        List<Custom> customs=new ArrayList<>();
        for(String id:cids){
            Custom custom = customService.queryCustomById(id);
            customs.add(custom);
        }
        return customs;
    }



    @RequestMapping("product/search_product_by_productId")
    @ResponseBody
    public List<Product> searchProductByProductId(String searchValue){
        List<Product> products = productService.searchProductByPid(searchValue);

        return products;
    }



    @RequestMapping("product/search_product_by_productName")
    @ResponseBody
    public List<Product> searchProductByProductName(String searchValue){
        String[] pids = productService.searchPidByPname(searchValue);
        List<Product> products=new ArrayList<>();
        for(String id:pids){
            Product product = productService.queryProductById(id);
            products.add(product);
            ;
        }
        return products;
    }


    @RequestMapping("product/search_product_by_productType")
    @ResponseBody
    public List<Product> searchProductByProductType(String searchValue){

        List<Product> products=productService.searchProductByPtype(searchValue);
        return products;
    }



    @RequestMapping("work/search_work_by_workId")
    @ResponseBody
    public List<Work> searchWorkByWorkId(String searchValue){

        List<Work> works=workService.searchWorkByWorkId(searchValue);
        return works;
    }




    @RequestMapping("work/search_work_by_workProduct")
    @ResponseBody
    public List<Work> searchWorkByProductName(String searchValue){
        String[] pids = productService.searchPidByPname(searchValue);
        //List<Work> works=workService.searchWorkByPid(searchValue);
        List<Work> works=new ArrayList<>();
        for(String id:pids){
            List<Work> works1 = workService.searchWorkByPid(id);
            for(Work work:works1){
                works.add(work);
            }
        }
        return works;
    }

    @RequestMapping("work/search_work_by_workDevice")
    @ResponseBody
    public List<Work> searchWorkByDeviceName(String searchValue){
        List<Work> works = workService.searchWorkByDname(searchValue);
        return works;
    }

    @RequestMapping("work/search_work_by_workProcess")
    @ResponseBody
    public List<Work> searchWorkByProcessId(String searchValue){
        List<Work> works = workService.searchWorkByProId(searchValue);
        return works;
    }

    @RequestMapping("manufacture/search_manufacture_by_manufactureSn")
    @ResponseBody
    public List<Manufacture> searchManufactureBymanufactureSn(String searchValue){

        //List<Work> works=workService.searchWorkByWorkId(searchValue);
        List<Manufacture> manufactures = manufactureService.searchManuByMsn(searchValue);
        return manufactures;
    }

    @RequestMapping("manufacture/search_manufacture_by_manufactureOrderId")
    @ResponseBody
    public List<Manufacture> searchManufactureBymanufactureOid(String searchValue){

        List<Manufacture> manufactures = manufactureService.searchManuByOId(searchValue);
        return manufactures;
    }


    @RequestMapping("manufacture/search_manufacture_by_manufactureTechnologyName")
    @ResponseBody
    public List<Manufacture> searchManufactureBymanufactureTname(String searchValue){

        List<Manufacture> manufactures = manufactureService.searchManuByTname(searchValue);
        return manufactures;
    }



    @RequestMapping("task/search_task_by_taskId")
    @ResponseBody
    public List<Task> searchTaskByTaskId(String searchValue){

        List<Task> tasks = taskMapper.searchTaskById(searchValue);
        return tasks;
    }


    @RequestMapping("task/search_task_by_taskWorkId")
    @ResponseBody
    public List<Task> searchTaskByTaskWorkId(String searchValue){

        List<Task> tasks = taskMapper.searchTaskByTaskWorkId(searchValue);
        return tasks;
    }



    @RequestMapping("task/search_task_by_taskManufactureSn")
    @ResponseBody
    public List<Task> searchTaskByTaskManufactureSn(String searchValue){

        List<Task> tasks = taskMapper.searchTaskByTaskManuId(searchValue);
        return tasks;
    }
}
