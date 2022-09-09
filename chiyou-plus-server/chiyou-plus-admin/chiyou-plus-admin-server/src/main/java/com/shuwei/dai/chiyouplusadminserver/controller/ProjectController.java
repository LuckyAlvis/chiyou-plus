package com.shuwei.dai.chiyouplusadminserver.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shuwei.dai.admin.entity.Project;
import com.shuwei.dai.admin.req.ProjectPageReq;
import com.shuwei.dai.chiyouplusadminserver.service.ProjectService;
import common.resp.ChiyouPage;
import common.resp.ChiyouResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 项目管理模块
 * @author: daiyifan
 * @create: 2022/9/9 13:43
 */
@RestController
@AllArgsConstructor
@RequestMapping("/project")
public class ProjectController {

    private final ProjectService projectService;

    @PostMapping("/listPage")
    public ChiyouResponse<ChiyouPage<Project>> listPage(@RequestBody ProjectPageReq req) {
        Page<Project> projectPage = new Page<>(req.getCurrent(), req.getSize());
        Project project = new Project();
        BeanUtils.copyProperties(req, project);
        return ChiyouResponse.success(ChiyouPage.get(projectService.page(projectPage, Wrappers.lambdaQuery(project))));
    }
}
