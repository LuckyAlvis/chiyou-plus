package com.shuwei.dai.chiyoupluswebadmin.admin.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName admin_sys_user_role
 */
@TableName(value = "admin_sys_user_role")
@Data
public class AdminSysUserRole implements Serializable {
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
    /**
     * ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 角色id
     */
    private Integer roleId;
    /**
     * 逻辑删除
     */
    private Integer isDelete;
}
