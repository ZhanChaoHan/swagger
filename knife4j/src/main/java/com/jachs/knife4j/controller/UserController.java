package com.jachs.knife4j.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jachs.knife4j.domain.SysUser;
import com.jachs.knife4j.service.SysUserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * @Description 用户控制层
 **/
@RestController
@Api(tags = "用户模块")
@RequestMapping("/user")
public class UserController {
	@Autowired
	private SysUserService sysUserService;
	
	@ApiOperation("查询用户")
	@GetMapping("/queryUser")
	public List<SysUser> queryUser(){
		return sysUserService.list();
	}
	@ApiOperation("添加用户")
	@PostMapping("/addUser")
	public boolean addUser(
			@ApiParam("用户id")
			@RequestParam("userid") int userid,
			@RequestParam("username") String username,
			@RequestParam("userage") int userage,
			@RequestParam("userpwd") String userpwd
			){
		
		SysUser sysUser=new SysUser();
		sysUser.setUserage(userage);
		sysUser.setUserid(userid);
		sysUser.setUsername(username);
		sysUser.setUserpwd(userpwd);
		
		return sysUserService.save(sysUser);
	}
}
