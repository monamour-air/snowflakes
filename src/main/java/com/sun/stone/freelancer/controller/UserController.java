package com.sun.stone.freelancer.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sun.stone.freelancer.bean.UsersEntity;
import com.sun.stone.freelancer.common.utils.Result;
import com.sun.stone.freelancer.service.UsersService;

@RestController
@RequestMapping("/sys")
public class UserController {
	final static Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UsersService usersService;

	@GetMapping("/helloworld")
	public String hello() {
		logger.info("logback-spring.xml整合成功！");
		return "Hello World";
	}

	@GetMapping("/findAllUsers")
	public List<UsersEntity> findAllUsers() {
		logger.info("Mybatis-starter 通过注解方式，整合成功！");
		return usersService.findAllUsers();
	}
	
	@RequestMapping(value = "queryUserById",method = RequestMethod.POST)
	public UsersEntity queryUserById(@RequestBody Map<String, Object> param) {
		logger.info("Mybatis 通过xml方式，整合成功！");
		return usersService.queryUserById((Integer)(param.get("id")));
	}
	
	/**
	 * 结果集封装
	 */
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET,value = "getResult")
	public Result<?> resultCollections(){
		logger.info("结果集封装成功，TODO(扩展性还有)");
		return Result.success();
	}
	
}
