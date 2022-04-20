package com.jachs.springfox.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhanchaohan
 * @since 2022-04-20
 */
@ApiModel(value="用户对象", description="user_table")
public class SysUser extends Model<SysUser> {

    private static final long serialVersionUID = 1L;

    @TableField("userName")
    @ApiModelProperty(value = "用户名")
    private String username;

    @TableField("userAge")
    @ApiModelProperty(value = "年龄")
    private Integer userage;

    @TableField("userPwd")
    @ApiModelProperty(value = "密码")
    private String userpwd;

    @TableId(value = "userId", type = IdType.AUTO)
    @ApiModelProperty(value = "主键")
    private Integer userid;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUserage() {
        return userage;
    }

    public void setUserage(Integer userage) {
        this.userage = userage;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Override
	public Serializable pkVal() {
        return this.userid;
    }

    @Override
    public String toString() {
        return "SysUser{" +
        "username=" + username +
        ", userage=" + userage +
        ", userpwd=" + userpwd +
        ", userid=" + userid +
        "}";
    }
}
