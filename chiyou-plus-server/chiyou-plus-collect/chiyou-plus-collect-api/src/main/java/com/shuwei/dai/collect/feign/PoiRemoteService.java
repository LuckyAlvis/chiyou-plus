package com.shuwei.dai.collect.feign;

import com.shuwei.dai.collect.entity.Poi;
import com.shuwei.dai.collect.req.PoiPageReq;
import com.shuwei.dai.collect.req.PoiSaveReq;
import common.resp.ChiyouPage;
import common.resp.ChiyouResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @description: POI远程服务
 * @author: daiyifan
 * @create: 2022/9/9 18:17
 */
@Component
@FeignClient("chiyou-plus-collect-service")
public interface PoiRemoteService {
    @PostMapping("/poi/listPage")
    ChiyouResponse<ChiyouPage<Poi>> listPage(@RequestBody PoiPageReq req);

    @PostMapping("/poi/savePoi")
    ChiyouResponse<Integer> savePoi(@RequestBody PoiSaveReq req);
}
