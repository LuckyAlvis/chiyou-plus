package com.shuwei.dai.admin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @description: 用户表
 * @TableName user
 * @author: daiyifan
 * @create: 2022/9/8 15:00
 */
@TableName(value = "user")
@Data
public class User implements Serializable {
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
    /**
     * 自定义用户ID
     */
    @TableId(type = IdType.AUTO)
    private Long id;
    /**
     * 用户帐号（登录用）
     */
    private String userName;
    /**
     * 手机号码
     */
    private String phone;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 角色ID
     */
    private Long roleId;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 状态 1:正常,2:冻结
     */
    private Integer status;
    /**
     * 备注
     */
    private String remark;
    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     * 最后更新时间
     */
    private Date gmtModified;
    /**
     * 团队id
     */
    private Long teamId;
    /**
     * 团队名称
     */
    private String teamName;
}
