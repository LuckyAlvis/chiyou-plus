package com.shuwei.dai.chiyoupluswebadmin.admin.controller;

import com.shuwei.dai.chiyoupluswebadmin.admin.domain.entity.AdminSysRole;
import com.shuwei.dai.chiyoupluswebadmin.admin.domain.req.AdminSysRolePageReq;
import com.shuwei.dai.chiyoupluswebadmin.admin.domain.req.AdminSysRoleSaveReq;
import com.shuwei.dai.chiyoupluswebadmin.admin.domain.req.AdminSysRoleUpdateReq;
import com.shuwei.dai.chiyoupluswebadmin.admin.domain.resp.AdminSysRoleTreeResp;
import com.shuwei.dai.chiyoupluswebadmin.admin.service.AdminSysRoleService;
import common.resp.ChiyouResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 后台角色控制类
 * @author: daiyifan
 * @create: 2022/9/10 16:11
 */
@RestController
@Api(value = "dept", tags = "管理后台-角色管理")
public class AdminSysRoleController {

    @Autowired
    private AdminSysRoleService adminSysRoleService;

    @PostMapping("/role/tree")
    @ApiOperation("角色结构查询")
    public ChiyouResponse<AdminSysRoleTreeResp> getRoleTree(@RequestBody AdminSysRolePageReq req) {
        return ChiyouResponse.success(adminSysRoleService.getRoleTree(req));
    }

    @PostMapping("/role/save")
    @ApiOperation("角色新增")
    public ChiyouResponse<Boolean> save(@RequestBody AdminSysRoleSaveReq req) {
        AdminSysRole adminSysRole = new AdminSysRole();
        BeanUtils.copyProperties(req, adminSysRole);
        return ChiyouResponse.success(adminSysRoleService.save(adminSysRole));
    }

    @PostMapping("/role/update")
    @ApiOperation("角色更新")
    public ChiyouResponse<Boolean> update(@RequestBody AdminSysRoleUpdateReq req) {
        AdminSysRole AdminSysRole = new AdminSysRole();
        BeanUtils.copyProperties(req, AdminSysRole);
        return ChiyouResponse.success(adminSysRoleService.updateById(AdminSysRole));
    }
}
