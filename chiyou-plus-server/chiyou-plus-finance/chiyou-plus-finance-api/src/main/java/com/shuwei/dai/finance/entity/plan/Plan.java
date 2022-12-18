package com.shuwei.dai.finance.entity.plan;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @TableName plan
 */
@TableName(value = "plan")
@Data
public class Plan implements Serializable {

    @TableId(type = IdType.AUTO)
    @ApiModelProperty("id主键")
    private Long id;

    @ApiModelProperty("计划code")
    private String Code;

    @ApiModelProperty("计划名称")
    private String name;

    @ApiModelProperty("计划描述")
    private String description;

    @ApiModelProperty("开始时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date startTime;

    @ApiModelProperty("结束时间")
    private Date endTime;

    @ApiModelProperty("创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date gmtCreate;

    @ApiModelProperty("修改时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date gmtModified;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}