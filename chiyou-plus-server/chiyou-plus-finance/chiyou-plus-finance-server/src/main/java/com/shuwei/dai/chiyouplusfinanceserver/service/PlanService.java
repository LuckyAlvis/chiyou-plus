package com.shuwei.dai.chiyouplusfinanceserver.service;

import com.shuwei.dai.finance.entity.plan.Plan;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shuwei.dai.finance.req.plan.PlanEditReq;

/**
 * @author ivan
 * @description 针对表【plan】的数据库操作Service
 * @createDate 2022-11-06 06:32:37
 */
public interface PlanService extends IService<Plan> {

    boolean editPlan(PlanEditReq plan);
}
