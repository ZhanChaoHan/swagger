package com.jachs.swagger.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/***
 * 
 * @author zhanchaohan
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value="group对象",description="群组对象user")
public class Group {
	@ApiModelProperty(value="用户名",name="username",example="xingguo")
	private String name;
	@ApiModelProperty(value="密码",name="pwd",example="123456")
	private String pwd;
	
}
