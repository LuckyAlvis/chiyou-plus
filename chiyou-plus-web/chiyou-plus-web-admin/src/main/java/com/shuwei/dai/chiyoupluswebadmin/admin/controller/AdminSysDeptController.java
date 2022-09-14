package com.shuwei.dai.chiyoupluswebadmin.admin.controller;

import com.shuwei.dai.chiyoupluswebadmin.admin.domain.resp.AdminSysDeptTreeResp;
import com.shuwei.dai.chiyoupluswebadmin.admin.service.AdminSysDeptService;
import common.resp.ChiyouResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 后台部门控制类
 * @author: daiyifan
 * @create: 2022/9/10 16:11
 */
@RestController
@Api(value = "dept", tags = "管理后台-部门管理")
public class AdminSysDeptController {

    @Autowired
    private AdminSysDeptService adminSysDeptService;

    @PostMapping("/sys/dept/tree")
    @ApiOperation("部门结构查询")
    public ChiyouResponse<AdminSysDeptTreeResp> getDeptTree() {
        return adminSysDeptService.getDeptTree();
    }
}
