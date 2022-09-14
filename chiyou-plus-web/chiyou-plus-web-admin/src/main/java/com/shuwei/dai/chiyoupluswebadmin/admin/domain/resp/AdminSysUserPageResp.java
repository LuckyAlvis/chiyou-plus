package com.shuwei.dai.chiyoupluswebadmin.admin.domain.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @description:
 * @author: daiyifan
 * @create: 2022/9/10 18:08
 */
@Data
public class AdminSysUserPageResp {

    @ApiModelProperty("ID")
    private Long id;

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("手机号码")
    private String userPhone;

    @ApiModelProperty("邮箱")
    private String userEmail;

    @ApiModelProperty("状态 1: 正常 2: 冻结")
    private Integer userStatus;

    @ApiModelProperty("用户类型")
    private Integer userType;

    @ApiModelProperty("部门id")
    private Integer userDeptId;

    @ApiModelProperty("部门名称")
    private String userDeptName;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("创建时间")
    private Date gmtCreate;

    @ApiModelProperty("更新时间")
    private Date gmtModified;

    @ApiModelProperty("逻辑删除")
    private Integer isDelete;
}
