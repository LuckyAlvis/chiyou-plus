package com.shuwei.dai.chiyoupluswebadmin.admin.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 *
 * @TableName admin_sys_user
 */
@TableName(value = "admin_sys_user")
@Data
public class AdminSysUser implements Serializable {
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
    /**
     * ID
     */
    @TableId(type = IdType.AUTO)
    private Long id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 手机号码
     */
    private String userPhone;
    /**
     * 用户密码
     */
    private String userPwd;
    /**
     * 邮箱
     */
    private String userEmail;
    /**
     * 状态 1: 正常 2: 冻结
     */
    private Integer userStatus;
    /**
     * 用户类型
     */
    private Integer userType;
    /**
     * 部门id
     */
    private Integer userDeptId;
    /**
     * 部门名称
     */
    private String userDeptName;
    /**
     * 备注
     */
    private String remark;
    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     * 更新时间
     */
    private Date gmtModified;
    /**
     * 逻辑删除
     */
    private Integer isDelete;
}
