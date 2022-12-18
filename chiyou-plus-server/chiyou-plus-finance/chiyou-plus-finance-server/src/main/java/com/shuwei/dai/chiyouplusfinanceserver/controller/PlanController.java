package com.shuwei.dai.chiyouplusfinanceserver.controller;

import com.alibaba.nacos.common.utils.UuidUtils;
import com.shuwei.dai.chiyouplusfinanceserver.service.PlanService;
import com.shuwei.dai.finance.entity.plan.Plan;
import com.shuwei.dai.finance.req.plan.PlanEditReq;
import com.shuwei.dai.finance.req.plan.PlanSaveReq;
import com.shuwei.dai.finance.resp.plan.PlanDetailResp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Objects;

/**
 * 计划服务控制类
 */
@RestController
@Api(value = "plan", tags = "计划服务")
public class PlanController {

    @Autowired
    private PlanService planService;

    @ApiOperation("新建计划")
    @PostMapping("/plan/add")
    public String addPlan(@RequestBody PlanSaveReq req) {
        Plan plan = new Plan();
        BeanUtils.copyProperties(req, plan);
        plan.setCode(UuidUtils.generateUuid());
        plan.setGmtCreate(new Date());
        if (planService.save(plan)) {
            return plan.getCode();
        } else {
            throw new RuntimeException("新建计划出错");
        }
    }

    @ApiOperation("编辑计划")
    @PutMapping("/edit")
    public Boolean editPlan(@RequestBody PlanEditReq req) {
        return planService.editPlan(req);
    }

    @ApiOperation("计划详情")
    @GetMapping("/plan/{id}")
    public PlanDetailResp getDetailById(@PathVariable(value = "id") Long id) {
        PlanDetailResp resp = new PlanDetailResp();
        Plan planDb = planService.getById(id);
        if (!Objects.isNull(planDb)) {
            BeanUtils.copyProperties(planDb, resp);
        }
        return resp;
    }

}
