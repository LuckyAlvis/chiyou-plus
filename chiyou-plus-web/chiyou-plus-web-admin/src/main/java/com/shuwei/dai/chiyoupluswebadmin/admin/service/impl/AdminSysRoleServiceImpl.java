package com.shuwei.dai.chiyoupluswebadmin.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shuwei.dai.chiyoupluswebadmin.admin.domain.entity.AdminSysRole;
import com.shuwei.dai.chiyoupluswebadmin.admin.domain.req.AdminSysRolePageReq;
import com.shuwei.dai.chiyoupluswebadmin.admin.domain.resp.AdminSysRoleTreeResp;
import com.shuwei.dai.chiyoupluswebadmin.admin.mapper.AdminSysRoleMapper;
import com.shuwei.dai.chiyoupluswebadmin.admin.service.AdminSysRoleService;
import org.springframework.stereotype.Service;

/**
 * @author daiyifan
 * @description 针对表【admin_sys_role】的数据库操作Service实现
 * @createDate 2022-09-10 16:16:47
 */
@Service
public class AdminSysRoleServiceImpl extends ServiceImpl<AdminSysRoleMapper, AdminSysRole>
        implements AdminSysRoleService {

    @Override
    public AdminSysRoleTreeResp getRoleTree(AdminSysRolePageReq req) {
        return null;
    }
}




