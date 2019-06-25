package com.cskaoyan.controller;

import com.cskaoyan.bean.User;
import com.cskaoyan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by little Stone
 * Date 2019/6/24 Time 15:53
 */
@Controller
public class HelloController {

	@Autowired
	UserService userService;
	@RequestMapping("hello")
	@ResponseBody
	public String hello(){
		return "hello";
	}

	@RequestMapping("query")
	@ResponseBody
	public User queryUserById(int id){
		User user = userService.queryUserById(id);
		return user;
	}

	@RequestMapping("/hello/register")
	@ResponseBody
	public String register(Date content){
		System.out.println(content);
		return "ok";
	}

	@RequestMapping("toRegister")
	public String hello1(){
		return "register.jsp";
	}
}
