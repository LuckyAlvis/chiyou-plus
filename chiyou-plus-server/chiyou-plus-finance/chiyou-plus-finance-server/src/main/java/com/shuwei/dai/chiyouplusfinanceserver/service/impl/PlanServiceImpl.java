package com.shuwei.dai.chiyouplusfinanceserver.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shuwei.dai.chiyouplusfinanceserver.mapper.PlanMapper;
import com.shuwei.dai.chiyouplusfinanceserver.service.PlanService;
import com.shuwei.dai.finance.entity.plan.Plan;
import com.shuwei.dai.finance.req.plan.PlanEditReq;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Objects;

/**
 * @author ivan
 * @description 针对表【plan】的数据库操作Service实现
 * @createDate 2022-11-06 06:32:37
 */
@Service
public class PlanServiceImpl extends ServiceImpl<PlanMapper, Plan>
        implements PlanService {

    /**
     * 编辑计划
     *
     * @param req 编辑计划入参
     * @return 是否编辑成功
     */
    @Override
    public boolean editPlan(PlanEditReq req) {
        Plan planDb = getOne(Wrappers.<Plan>lambdaQuery().eq(Plan::getCode, req.getCode()));
        if (Objects.isNull(planDb)) {
            throw new RuntimeException("计划不存在");
        }
        planDb.setStartTime(req.getStartTime());
        planDb.setEndTime(req.getEndTime());
        planDb.setName(req.getName());
        planDb.setGmtCreate(new Date());
        return updateById(planDb);
    }
}




