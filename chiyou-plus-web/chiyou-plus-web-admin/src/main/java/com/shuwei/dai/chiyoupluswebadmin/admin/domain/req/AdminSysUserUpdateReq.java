package com.shuwei.dai.chiyoupluswebadmin.admin.domain.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 用户修改参数
 * @author: daiyifan
 * @create: 2022/9/10 18:07
 */
@Data
public class AdminSysUserUpdateReq {

    @ApiModelProperty("ID")
    private Long id;

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("手机号码")
    private String userPhone;

    @ApiModelProperty("用户密码")
    private String userPwd;

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

    @ApiModelProperty("逻辑删除")
    private Integer isDelete;
}
