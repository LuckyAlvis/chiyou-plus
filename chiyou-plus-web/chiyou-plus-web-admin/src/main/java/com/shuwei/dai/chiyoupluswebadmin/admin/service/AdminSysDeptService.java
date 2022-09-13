package com.shuwei.dai.chiyoupluswebadmin.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shuwei.dai.chiyoupluswebadmin.admin.domain.entity.AdminSysDept;
import com.shuwei.dai.chiyoupluswebadmin.admin.domain.resp.AdminSysDeptTreeResp;
import common.resp.ChiyouResponse;

/**
 * @author daiyifan
 * @description 针对表【admin_sys_dept】的数据库操作Service
 * @createDate 2022-09-10 16:16:47
 */
public interface AdminSysDeptService extends IService<AdminSysDept> {

    ChiyouResponse<AdminSysDeptTreeResp> getDeptTree();
}
