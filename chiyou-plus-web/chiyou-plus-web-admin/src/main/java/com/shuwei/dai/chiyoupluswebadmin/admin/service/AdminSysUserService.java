package com.shuwei.dai.chiyoupluswebadmin.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shuwei.dai.chiyoupluswebadmin.admin.domain.entity.AdminSysUser;
import com.shuwei.dai.chiyoupluswebadmin.admin.domain.req.AdminSysUserPageReq;
import com.shuwei.dai.chiyoupluswebadmin.admin.domain.resp.AdminSysUserPageResp;
import common.resp.ChiyouPage;

/**
 * @author daiyifan
 * @description 针对表【admin_sys_user(用户表)】的数据库操作Service
 * @createDate 2022-09-10 16:16:47
 */
public interface AdminSysUserService extends IService<AdminSysUser> {

    ChiyouPage<AdminSysUserPageResp> pageUser(AdminSysUserPageReq req);
}
