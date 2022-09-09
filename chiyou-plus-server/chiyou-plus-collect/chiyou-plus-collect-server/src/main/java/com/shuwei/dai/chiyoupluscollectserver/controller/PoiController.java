package com.shuwei.dai.chiyoupluscollectserver.controller;


import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shuwei.dai.chiyoupluscollectserver.service.PoiService;
import com.shuwei.dai.collect.entity.Poi;
import com.shuwei.dai.collect.req.PoiPageReq;
import com.shuwei.dai.collect.req.PoiSaveReq;
import common.resp.ChiyouPage;
import common.resp.ChiyouResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: poi控制类
 * @author: daiyifan
 * @create: 2022/9/8 14:52
 */
@RestController
@AllArgsConstructor
@RequestMapping("/poi")
public class PoiController {

    private final PoiService poiService;

    @PostMapping("/listPage")
    public ChiyouResponse<ChiyouPage<Poi>> listPage(@RequestBody PoiPageReq req) {
        Page<Poi> poiPage = new Page<>(req.getCurrent(), req.getSize());
        Poi poi = new Poi();
        BeanUtils.copyProperties(req, poi);
        return ChiyouResponse.success(ChiyouPage.get(poiService.page(poiPage, Wrappers.lambdaQuery(poi))));
    }

    @PostMapping("/savePoi")
    public ChiyouResponse<Integer> savePoi(@RequestBody PoiSaveReq req) {
        return ChiyouResponse.success(poiService.savePoi(req));
    }
}
