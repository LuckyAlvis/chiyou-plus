package com.shuwei.dai.chiyoupluswebadmin.admin.domain.resp;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @description: 后台部门树状查询返回实体
 * @author: daiyifan
 * @create: 2022/9/10 16:31
 */
@Data
public class AdminSysDeptTreeResp {
    @TableId(type = IdType.AUTO)
    @ApiModelProperty("id")
    private Integer id;

    @ApiModelProperty("部门code")
    private String deptCode;

    @ApiModelProperty("部门名称")
    private String deptName;

    @ApiModelProperty("部门描述")
    private String deptDesc;

    @ApiModelProperty("父级部门ID")
    private Integer deptParentId;

    @ApiModelProperty("逻辑删除")
    private Integer isDelete;

    @ApiModelProperty("子部门列表")
    private List<AdminSysDeptTreeResp> children;
}
