package com.shuwei.dai.chiyoupluswebadmin.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shuwei.dai.chiyoupluswebadmin.admin.domain.entity.AdminSysDept;
import com.shuwei.dai.chiyoupluswebadmin.admin.domain.resp.AdminSysDeptTreeResp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author daiyifan
 * @description 针对表【admin_sys_dept】的数据库操作Mapper
 * @createDate 2022-09-10 16:16:47
 * @Entity com.shuwei.dai.chiyoupluswebadmin.admin.domain.entity.AdminSysDept
 */
@Mapper
public interface AdminSysDeptMapper extends BaseMapper<AdminSysDept> {

    List<AdminSysDeptTreeResp> listDept();
}




