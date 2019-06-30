package com.cskaoyan.controller;

import com.cskaoyan.bean.planModelBean.*;
import com.cskaoyan.mapper.planModelMapper.ManufactureMapper;
import com.cskaoyan.mapper.planModelMapper.WorkMapper;
import com.cskaoyan.service.planModelService.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by little Stone
 * Date 2019/6/26 Time 10:26
 */
@Controller
@RequestMapping()
public class MainController {

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
	TaskService taskService;
	@Autowired
	DataSource dataSource;

//	@RequestMapping("query/{id}")
//	@ResponseBody
//	public Work queryUserById(@PathVariable("id") int id){
//
//		Work user = userService.queryUserById(id);
//		return user;
//	}

	@RequestMapping("forward")
	//@ResponseBody
	public String forward(){
		return "home";
	}
	@RequestMapping("order/find")
	public String datagrid(HttpServletRequest request,String datagrid){
		List<String> sysPermissionList=new ArrayList<>();
		sysPermissionList.add("order:add");
		sysPermissionList.add("order:edit");
		sysPermissionList.add("order:delete");
		request.getSession().setAttribute("sysPermissionList",sysPermissionList);
		return "order_list";
	}
	@RequestMapping("order/list")
	@ResponseBody
	public List<Order> queryOrder(){
		List<Order> orders = orderService.queryOrder();
		//modelAndView.addObject("orderList",orders);
		return orders;
	}
	@RequestMapping("custom/find")
	public String datagrid2(HttpServletRequest request,String datagrid){
		List<String> sysPermissionList=new ArrayList<>();
		sysPermissionList.add("custom:add");
		sysPermissionList.add("custom:edit");
		sysPermissionList.add("custom:delete");
		request.getSession().setAttribute("sysPermissionList",sysPermissionList);
		return "custom_list";
	}
	@RequestMapping("custom/list")
	@ResponseBody
	public List<Custom> queryCustom(){
		List<Custom> customs = customService.queryCustom();
		return customs;
	}

	@RequestMapping("product/find")
	public String datagrid3(HttpServletRequest request,String datagrid){
		List<String> sysPermissionList=new ArrayList<>();
		sysPermissionList.add("product:add");
		sysPermissionList.add("product:edit");
		sysPermissionList.add("product:delete");
		request.getSession().setAttribute("sysPermissionList",sysPermissionList);
		return "product_list";
	}
	@RequestMapping("product/list")
	@ResponseBody
	public List<Product> queryProduct(){
		List<Product> products = productService.queryProduct();
		return products;
	}

	@RequestMapping("work/find")
	public String datagrid4(HttpServletRequest request,String datagrid){
		List<String> sysPermissionList=new ArrayList<>();
		sysPermissionList.add("work:add");
		sysPermissionList.add("work:edit");
		sysPermissionList.add("work:delete");
		request.getSession().setAttribute("sysPermissionList",sysPermissionList);
		return "work_list";
	}
	@RequestMapping("work/list")
	@ResponseBody
	public List<Work> queryWork(){
		List<Work> works = workService.queryWork();
		System.out.println(works);
		return works;
	}

	@RequestMapping("manufacture/find")
	public String datagrid5(HttpServletRequest request,String datagrid){
		List<String> sysPermissionList=new ArrayList<>();
		sysPermissionList.add("manufacture:add");
		sysPermissionList.add("manufacture:edit");
		sysPermissionList.add("manufacture:delete");
		request.getSession().setAttribute("sysPermissionList",sysPermissionList);
		return "manufacture_list";
	}
	@RequestMapping("manufacture/list")
	@ResponseBody
	public HashMap<String, Object> queryManufacture(){
		List<Manufacture> manufacture = manufactureService.queryManufacture();
		HashMap<String, Object>  manufactures = new HashMap<>();
		manufactures.put("rows",manufacture);
		manufactures.put("total",manufacture.size());
		System.out.println(manufactures);
		return manufactures;
	}

	@RequestMapping("task/find")
	public String datagrid6(HttpServletRequest request,String datagrid){
		List<String> sysPermissionList=new ArrayList<>();
		sysPermissionList.add("task:add");
		sysPermissionList.add("task:edit");
		sysPermissionList.add("task:delete");
		request.getSession().setAttribute("sysPermissionList",sysPermissionList);
		return "task_list";
	}
	@RequestMapping("task/list")
	@ResponseBody
	public HashMap<String, Object> queryTask(){
		List<Task> task = taskService.queryTask();
		HashMap<String, Object>  tasks = new HashMap<>();
		tasks.put("rows",task);
		tasks.put("total",task.size());
		System.out.println(tasks);
		return tasks;
	}

}
