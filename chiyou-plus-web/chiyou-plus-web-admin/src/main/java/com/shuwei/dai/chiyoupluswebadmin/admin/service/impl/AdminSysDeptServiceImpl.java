package com.shuwei.dai.chiyoupluswebadmin.admin.service.impl;

import com.alibaba.nacos.common.utils.CollectionUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shuwei.dai.chiyoupluswebadmin.admin.domain.entity.AdminSysDept;
import com.shuwei.dai.chiyoupluswebadmin.admin.domain.resp.AdminSysDeptTreeResp;
import com.shuwei.dai.chiyoupluswebadmin.admin.mapper.AdminSysDeptMapper;
import com.shuwei.dai.chiyoupluswebadmin.admin.service.AdminSysDeptService;
import common.resp.ChiyouResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author daiyifan
 * @description 针对表【admin_sys_dept】的数据库操作Service实现
 * @createDate 2022-09-10 16:16:47
 */
@Service
public class AdminSysDeptServiceImpl extends ServiceImpl<AdminSysDeptMapper, AdminSysDept>
        implements AdminSysDeptService {

    @Autowired
    private AdminSysDeptMapper adminSysDeptMapper;

    @Override
    public ChiyouResponse<AdminSysDeptTreeResp> getDeptTree() {
        List<AdminSysDeptTreeResp> adminSysDeptTreeNodes = adminSysDeptMapper.listDept();
        if (CollectionUtils.isNotEmpty(adminSysDeptTreeNodes)) {
            AdminSysDeptTreeResp rootNode = adminSysDeptTreeNodes.get(0);
            rootNode.setChildren(getDeptChildren(rootNode, adminSysDeptTreeNodes));
            return ChiyouResponse.success(rootNode);
        } else {
            return ChiyouResponse.success(null);
        }
    }

    private List<AdminSysDeptTreeResp> getDeptChildren(AdminSysDeptTreeResp rootNode, List<AdminSysDeptTreeResp> allNodes) {
        return allNodes.stream()
                .filter(node -> Objects.equals(node.getDeptParentId(), rootNode.getId()))
                .peek(deptNode -> deptNode.setChildren(getDeptChildren(deptNode, allNodes)))
                .collect(Collectors.toList());
    }
}




