package com.shuwei.dai.finance.req.plan;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@ApiModel("计划编辑请求参数")
@Data
public class PlanEditReq {

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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date endTime;
}
