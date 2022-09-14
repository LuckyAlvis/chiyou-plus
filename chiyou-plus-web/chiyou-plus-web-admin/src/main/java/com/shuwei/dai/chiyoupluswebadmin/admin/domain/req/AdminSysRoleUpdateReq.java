package com.shuwei.dai.chiyoupluswebadmin.admin.domain.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 角色修改参数
 * @author: daiyifan
 * @create: 2022/9/10 20:09
 */
@Data
public class AdminSysRoleUpdateReq {

    @ApiModelProperty("角色code")
    private String roleCode;

    @ApiModelProperty("角色名称")
    private String roleName;

    @ApiModelProperty("角色描述")
    private String roleDesc;
}
