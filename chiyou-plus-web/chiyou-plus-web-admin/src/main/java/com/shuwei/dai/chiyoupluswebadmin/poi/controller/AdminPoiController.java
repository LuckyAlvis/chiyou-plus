package com.shuwei.dai.chiyoupluswebadmin.poi.controller;

import com.shuwei.dai.collect.entity.Poi;
import com.shuwei.dai.collect.feign.PoiRemoteService;
import com.shuwei.dai.collect.req.PoiPageReq;
import com.shuwei.dai.collect.req.PoiSaveReq;
import common.resp.ChiyouPage;
import common.resp.ChiyouResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description: 后台POI控制类
 * @author: daiyifan
 * @create: 2022/9/8 16:18
 */
@RestController
@Api(value = "poi", tags = "管理后台-POI管理")
public class AdminPoiController {

    @Resource
    private PoiRemoteService poiRemoteService;

    @PostMapping("/poi/listPage")
    @ApiOperation("POI分页")
    public ChiyouResponse<ChiyouPage<Poi>> listPage(@RequestBody PoiPageReq req) {
        return poiRemoteService.listPage(req);
    }

    @ApiOperation("POI新增")
    @PostMapping("/poi/savePoi")
    ChiyouResponse<Integer> savePoi(@RequestBody PoiSaveReq req) {
        return poiRemoteService.savePoi(req);
    }
}
