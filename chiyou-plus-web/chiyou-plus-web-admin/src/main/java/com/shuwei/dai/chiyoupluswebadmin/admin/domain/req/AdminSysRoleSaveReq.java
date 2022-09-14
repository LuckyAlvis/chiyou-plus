package com.shuwei.dai.chiyoupluswebadmin.admin.domain.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 新增角色参数
 * @author: daiyifan
 * @create: 2022/9/10 20:10
 */
@Data
public class AdminSysRoleSaveReq {
    @ApiModelProperty("角色code")
    private String roleCode;

    @ApiModelProperty("角色名称")
    private String roleName;

    @ApiModelProperty("角色描述")
    private String roleDesc;
}
