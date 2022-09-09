package com.shuwei.dai.collect.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @description: 新增POI参数
 * @author: daiyifan
 * @create: 2022/9/9 11:14
 * @TableName poi
 */
@Data
public class PoiSaveReq implements Serializable {

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

    @ApiModelProperty("任务类型 1:企业采集 2:小区采集 3:商场采集 4:地铁采集")
    private Integer taskType;

    @ApiModelProperty("项目code")
    private String projectCode;

    @ApiModelProperty("项目名称")
    private String projectName;

    @ApiModelProperty("1:照片采集 2:视频采集")
    private Integer collectType;
}
