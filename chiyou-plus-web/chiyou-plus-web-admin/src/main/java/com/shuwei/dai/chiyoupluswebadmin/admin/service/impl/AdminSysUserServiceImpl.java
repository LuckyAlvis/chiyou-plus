package com.shuwei.dai.chiyoupluswebadmin.admin.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shuwei.dai.chiyoupluswebadmin.admin.domain.entity.AdminSysUser;
import com.shuwei.dai.chiyoupluswebadmin.admin.domain.req.AdminSysUserPageReq;
import com.shuwei.dai.chiyoupluswebadmin.admin.domain.resp.AdminSysUserPageResp;
import com.shuwei.dai.chiyoupluswebadmin.admin.mapper.AdminSysUserMapper;
import com.shuwei.dai.chiyoupluswebadmin.admin.service.AdminSysUserService;
import common.resp.ChiyouPage;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author daiyifan
 * @description 针对表【admin_sys_user(用户表)】的数据库操作Service实现
 * @createDate 2022-09-10 16:16:47
 */
@Service
public class AdminSysUserServiceImpl extends ServiceImpl<AdminSysUserMapper, AdminSysUser>
        implements AdminSysUserService {

    @Autowired
    private AdminSysUserMapper adminSysUserMapper;

    @Override
    public ChiyouPage<AdminSysUserPageResp> pageUser(AdminSysUserPageReq req) {
        Page<AdminSysUser> adminSysUserPage = new Page<>(req.getCurrent(), req.getSize());
        AdminSysUser adminSysUser = new AdminSysUser();
        BeanUtils.copyProperties(req, adminSysUser);
        ChiyouPage<AdminSysUser> adminSysUserChiyouPage = ChiyouPage.get(
                adminSysUserMapper.selectPage(adminSysUserPage, Wrappers.lambdaQuery(adminSysUser))
        );

        List<AdminSysUserPageResp> adminSysUserPageRespList = new ArrayList<>();
        adminSysUserChiyouPage.getData().forEach(item -> {
            AdminSysUserPageResp resp = new AdminSysUserPageResp();
            BeanUtils.copyProperties(item, resp);
            adminSysUserPageRespList.add(resp);
        });

        ChiyouPage<AdminSysUserPageResp> resp = new ChiyouPage<>();
        resp.setData(adminSysUserPageRespList);
        BeanUtils.copyProperties(adminSysUserChiyouPage, resp);
        return resp;
    }
}




