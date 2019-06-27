package com.cskaoyan.controller;

import com.cskaoyan.bean.planModelBean.Custom;
import com.cskaoyan.bean.planModelBean.Order;
import com.cskaoyan.bean.planModelBean.Product;
import com.cskaoyan.service.planModelService.CustomService;
import com.cskaoyan.service.planModelService.OrderService;
import com.cskaoyan.service.planModelService.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by little Stone
 * Date 2019/6/26 Time 10:26
 */
@Controller
@RequestMapping()
public class HelloController {

	@Autowired
	OrderService orderService;
	@Autowired
	CustomService customService;
	@Autowired
	ProductService productService;
	@Autowired
	DataSource dataSource;

//	@RequestMapping("query/{id}")
//	@ResponseBody
//	public User queryUserById(@PathVariable("id") int id){
//
//		User user = userService.queryUserById(id);
//		return user;
//	}

	@RequestMapping("forward")
	//@ResponseBody
	public String forward(){
		return "home";
	}
	@RequestMapping("order/find")
	public String datagrid(HttpServletRequest request,String datagrid){
		List<String> orderList=new ArrayList<>();
		orderList.add(datagrid);
		request.getSession().setAttribute("orderList",orderList);
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
		List<String> customList=new ArrayList<>();
		customList.add(datagrid);
		request.getSession().setAttribute("customList",customList);
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
		List<String> productList=new ArrayList<>();
		productList.add(datagrid);
		request.getSession().setAttribute("productList",productList);
		return "product_list";
	}
	@RequestMapping("product/list")
	@ResponseBody
	public List<Product> queryProduct(){
		List<Product> products = productService.queryProduct();
		return products;
	}
}
