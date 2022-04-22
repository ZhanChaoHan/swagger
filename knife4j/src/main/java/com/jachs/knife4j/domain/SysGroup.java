package com.jachs.knife4j.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhanchaohan
 * @since 2022-04-22
 */
public class SysGroup extends Model<SysGroup> {

    private static final long serialVersionUID = 1L;

    @TableField("groupName")
    private String groupname;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableId(value = "groupId", type = IdType.AUTO)
    private Integer groupid;


    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    @Override
	public Serializable pkVal() {
        return this.groupid;
    }

    @Override
    public String toString() {
        return "SysGroup{" +
        "groupname=" + groupname +
        ", createTime=" + createTime +
        ", groupid=" + groupid +
        "}";
    }
}
