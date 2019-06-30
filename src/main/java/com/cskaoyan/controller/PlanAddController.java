package com.cskaoyan.controller;

import com.cskaoyan.Vo.PlanResponseVo;
import com.cskaoyan.bean.planModelBean.*;
import com.cskaoyan.bean.planModelBean.Process;
import com.cskaoyan.mapper.planModelMapper.OrderMapper;
import com.cskaoyan.mapper.planModelMapper.TaskMapper;
import com.cskaoyan.mapper.planModelMapper.TechnologyMapper;
import com.cskaoyan.mapper.planModelMapper.WorkMapper;
import com.cskaoyan.service.planModelService.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class PlanAddController {
    @Autowired
    CustomService customService;
    @Autowired
    ProductService productService;
    @Autowired
    OrderService orderService;
    @Autowired
    ProcessService processService;
    @Autowired
    DeviceService deviceService;
    @Autowired
    WorkMapper workMapper;
    @Autowired
    ManufactureService manufactureService;
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    TechnologyMapper technologyMapper;
    @Autowired
    TaskMapper taskMapper;


    @RequestMapping("order/add_judge")
    @ResponseBody
    public String addJudge(){
        return "";
    }
    @RequestMapping("order/add")
    public String addOrder(){
        return "order_add";
    }

    @RequestMapping("custom/add_judge")
    @ResponseBody
    public String addJudge2(){
        return "";
    }
    @RequestMapping("custom/add")
    public String addCustom(){
        return "custom_add";
    }
    @RequestMapping("product/add_judge")
    @ResponseBody
    public String addJudge3(){
        return "";
    }
    @RequestMapping("product/add")
    public String addProduct(){
        return "product_add";
    }

    @RequestMapping("work/add_judge")
    @ResponseBody
    public String addJudge4(){
        return "";
    }
    @RequestMapping("work/add")
    public String addWork(){
        return "work_add";
    }

    @RequestMapping("manufacture/add_judge")
    @ResponseBody
    public String addJudge5(){
        return "";
    }

    @RequestMapping("manufacture/add")
    public String addManufacture(){
        return "manufacture_add";
    }

        @RequestMapping("task/add_judge")
        @ResponseBody
        public String addJudge6(){
            return "";
        }
        @RequestMapping("task/add")
        public String addTask(){
            return "task_add";
        }


        @RequestMapping("custom/get_data")
        @ResponseBody
        public List<Custom> getCustomData(){
            List<Custom> customs = customService.queryCustom();
            return customs;
        }

        @RequestMapping("product/get_data")
        @ResponseBody
        public List<Product> getProductData(){
            List<Product> products = productService.queryProduct();
            return products;
        }

        @RequestMapping("process/get_data")
        @ResponseBody
        public List<com.cskaoyan.bean.planModelBean.Process> getProcessData(){
            List<Process> processes = processService.queryProcess();
            return processes;
        }

        @RequestMapping("deviceList/get_data")
        @ResponseBody
        public List<Device> getDeviceData(){
            List<Device> devices = deviceService.queryDevice();
            return devices;
        }


        @RequestMapping("order/get_data")
        @ResponseBody
        public List<Order> getOrderData(){
            List<Order> orders = orderMapper.queryOrder();
            return orders;
        }
        @RequestMapping("technology/get_data")
        @ResponseBody
        public List<Technology> getTechnologyData(){
            List<Technology> technologies = technologyMapper.queryTechnology();
            return technologies;
        }

    @RequestMapping("work/get_data")
    @ResponseBody
    public List<Work> getWorkData(){
        List<Work> works = workMapper.queryWork();
        return works;
    }
    @RequestMapping("manufacture/get_data")
    @ResponseBody
    public List<Manufacture> getManufactureData(){
        List<Manufacture> manufactures = manufactureService.queryManufacture();
        return manufactures;
    }
    @RequestMapping("order/insert")
        @ResponseBody
        public PlanResponseVo insertOrder(Order order,String customId,String productId) throws IOException {
        int i = orderService.insertOrder(order,customId,productId);
        PlanResponseVo planResponseVo = new PlanResponseVo(200,"OK",null);
        return planResponseVo;
        }
        @RequestMapping("work/insert")
        @ResponseBody
        public PlanResponseVo insertWork(Work work,String productId,String processId,String deviceId){
            int i = workMapper.insertWork(work, productId, processId, deviceId);
            PlanResponseVo planResponseVo = new PlanResponseVo(200,"OK",null);
            return planResponseVo;
        }

        @RequestMapping("custom/insert")
        @ResponseBody
        public PlanResponseVo insertCustom(Custom custom){
            int i = customService.insertCustom(custom);
            PlanResponseVo planResponseVo = new PlanResponseVo(200,"OK",null);
            return planResponseVo;
        }

        @RequestMapping("product/insert")
        @ResponseBody
        public PlanResponseVo insertProduct(Product product){
            int i = productService.insertProduct(product);
            PlanResponseVo planResponseVo = new PlanResponseVo(200,"OK",null);
            return planResponseVo;
        }

        @RequestMapping("manufacture/insert")
        @ResponseBody
        public PlanResponseVo insertManufacture(Manufacture manufacture,String orderId,String technologyId){
            int i = manufactureService.insertManufacture(manufacture, orderId, technologyId);
            PlanResponseVo planResponseVo = new PlanResponseVo(200,"OK",null);
            return planResponseVo;
        }

        @RequestMapping("task/insert")
        @ResponseBody
        public PlanResponseVo insertTask(Task task){
            int i = taskMapper.insertTask(task);
            PlanResponseVo planResponseVo = new PlanResponseVo(200,"OK",null);
            return planResponseVo;
        }


}
