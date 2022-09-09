package com.shuwei.dai.collect.req;

import common.req.ChiyouPageReq;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description: Poi分页查询条件
 * @author: daiyifan
 * @create: 2022/9/9 10:16
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PoiPageReq extends ChiyouPageReq {
    private String name;
}
