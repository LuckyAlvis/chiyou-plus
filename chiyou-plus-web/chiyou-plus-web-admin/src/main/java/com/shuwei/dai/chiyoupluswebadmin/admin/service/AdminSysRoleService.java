package com.shuwei.dai.chiyoupluswebadmin.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shuwei.dai.chiyoupluswebadmin.admin.domain.entity.AdminSysRole;
import com.shuwei.dai.chiyoupluswebadmin.admin.domain.req.AdminSysRolePageReq;
import com.shuwei.dai.chiyoupluswebadmin.admin.domain.resp.AdminSysRoleTreeResp;

/**
 * @author daiyifan
 * @description 针对表【admin_sys_role】的数据库操作Service
 * @createDate 2022-09-10 16:16:47
 */
public interface AdminSysRoleService extends IService<AdminSysRole> {

    AdminSysRoleTreeResp getRoleTree(AdminSysRolePageReq req);
}
