package com.shuwei.dai.chiyoupluswebadmin.admin.controller;

import com.shuwei.dai.chiyoupluswebadmin.admin.domain.entity.AdminSysUser;
import com.shuwei.dai.chiyoupluswebadmin.admin.domain.req.AdminSysUserPageReq;
import com.shuwei.dai.chiyoupluswebadmin.admin.domain.req.AdminSysUserSaveReq;
import com.shuwei.dai.chiyoupluswebadmin.admin.domain.req.AdminSysUserUpdateReq;
import com.shuwei.dai.chiyoupluswebadmin.admin.domain.resp.AdminSysUserPageResp;
import com.shuwei.dai.chiyoupluswebadmin.admin.service.AdminSysUserService;
import common.resp.ChiyouPage;
import common.resp.ChiyouResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 后台用户控制类
 * @author: daiyifan
 * @create: 2022/9/10 16:10
 */
@RestController
@Api(value = "dept", tags = "管理后台-用户管理")
public class AdminSysUserController {

    @Autowired
    private AdminSysUserService adminSysUserService;

    @PostMapping("/user/page")
    @ApiOperation("用户分页查询")
    public ChiyouResponse<ChiyouPage<AdminSysUserPageResp>> page(@RequestBody AdminSysUserPageReq req) {
        return ChiyouResponse.success(adminSysUserService.pageUser(req));
    }

    @PostMapping("/user/save")
    @ApiOperation("用户新增")
    public ChiyouResponse<Boolean> save(@RequestBody AdminSysUserSaveReq req) {
        AdminSysUser adminSysUser = new AdminSysUser();
        BeanUtils.copyProperties(req, adminSysUser);
        return ChiyouResponse.success(adminSysUserService.save(adminSysUser));
    }

    @PostMapping("/user/update")
    @ApiOperation("用户更新")
    public ChiyouResponse<Boolean> update(@RequestBody AdminSysUserUpdateReq req) {
        AdminSysUser adminSysUser = new AdminSysUser();
        BeanUtils.copyProperties(req, adminSysUser);
        return ChiyouResponse.success(adminSysUserService.updateById(adminSysUser));
    }
}
