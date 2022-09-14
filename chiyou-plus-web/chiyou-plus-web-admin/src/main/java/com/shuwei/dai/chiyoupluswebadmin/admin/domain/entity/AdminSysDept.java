package com.shuwei.dai.chiyoupluswebadmin.admin.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName admin_sys_dept
 */
@TableName(value = "admin_sys_dept")
@Data
public class AdminSysDept implements Serializable {
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
    /**
     * ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 部门code
     */
    private String deptCode;
    /**
     * 部门名称
     */
    private String deptName;
    /**
     * 部门描述
     */
    private String deptDesc;
    /**
     * 父级部门ID
     */
    private Integer deptParentId;
    /**
     * 逻辑删除
     */
    private Integer isDelete;
}
