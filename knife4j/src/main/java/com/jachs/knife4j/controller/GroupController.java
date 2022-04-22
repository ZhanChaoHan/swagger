package com.jachs.knife4j.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jachs.knife4j.domain.SysGroup;
import com.jachs.knife4j.service.SysGroupService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @Description 用户控制层
 **/
@RestController
@Api(tags = "群组模块")
@RequestMapping("/user")
public class GroupController {
	@Autowired
	private SysGroupService sysGroupService;
	
	@ApiOperation("查询群组")
	@GetMapping("/queryGroup")
	public List<SysGroup> queryGroup(){
		return sysGroupService.list();
	}
}
