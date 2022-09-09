package com.shuwei.dai.collect.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @description: POI数据表
 * @author: daiyifan
 * @create: 2022/9/8 16:14
 * @TableName poi
 */
@TableName(value = "poi")
@Data
public class Poi implements Serializable {
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty("名称")
    private String name;
    @ApiModelProperty("省份")
    private String province;
    @ApiModelProperty("省份编码")
    private Integer provinceCode;
    @ApiModelProperty("城市")
    private String city;
    @ApiModelProperty("城市编码")
    private Integer cityCode;
    @ApiModelProperty("行政区")
    private String region;
    @ApiModelProperty("行政区编码")
    private Integer regionCode;
    @ApiModelProperty("商圈")
    private String mall;
    @ApiModelProperty("商圈编码")
    private String mallCode;
    @ApiModelProperty("经度")
    private Double longitude;
    @ApiModelProperty("纬度")
    private Double latitude;
    @ApiModelProperty("地址")
    private String address;
    @ApiModelProperty("poi状态: 1:未采集 2:进行中 3:审核通过 4:作废")
    private Integer status;
    @ApiModelProperty("备注")
    private String remark;
    @ApiModelProperty("创建时间")
    private Date gmtCreate;
    @ApiModelProperty("最后更新时间")
    private Date gmtModified;
    @ApiModelProperty("是否结算，1结算")
    private Integer account;
    @ApiModelProperty("采集类型和数量")
    private String positionAndNum;
    @ApiModelProperty("任务类型 1:企业采集 2:小区采集 3:商场采集 4:地铁采集")
    private Integer taskType;
    @ApiModelProperty("项目code")
    private String projectCode;
    @ApiModelProperty("项目名称")
    private String projectName;
    @ApiModelProperty("1:照片采集 2:视频采集")
    private Integer collectType;
}
