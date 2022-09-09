package com.shuwei.dai.admin.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @TableName project
 */
@TableName(value = "project")
@Data
public class Project implements Serializable {
    /**
     * id
     */
    @TableId
    private Integer id;

    /**
     * 项目code
     */
    private String projectCode;

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 项目描述
     */
    private String description;

    /**
     * 项目备注
     */
    private String remark;

    /**
     * 立项时间
     */
    private Date gmtCreate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
