package com.jachs.swagger.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jachs.swagger.entity.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@Api(tags = "查询测试")
@RequestMapping("/query")
public class QueryController {
	
	@ApiOperation("查询一")
	@RequestMapping("/query1")
	public List<User> query1(){
		List<User>uList=new ArrayList<User>();
		uList.add(new User("zhangsan", 10));
		return uList;
	}
}
