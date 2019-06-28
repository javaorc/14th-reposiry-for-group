package com.cskaoyan.controller;

import com.cskaoyan.Vo.PlanResponseVo;
import com.cskaoyan.bean.planModelBean.Custom;
import com.cskaoyan.service.planModelService.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PlanAddController {
    @Autowired
    CustomService customService;



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

//        @RequestMapping("custom/insert")
//        public PlanResponseVo insertCustom(Custom custom){
//            int i = customService.insertCustom(custom);
//            PlanResponseVo planResponseVo = new PlanResponseVo(200,"OK",null);
//            return planResponseVo;
//        }

}
