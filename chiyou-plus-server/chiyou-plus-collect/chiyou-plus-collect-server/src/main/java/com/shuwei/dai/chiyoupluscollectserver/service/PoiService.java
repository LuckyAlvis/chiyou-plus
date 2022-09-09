package com.shuwei.dai.chiyoupluscollectserver.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shuwei.dai.collect.entity.Poi;
import com.shuwei.dai.collect.req.PoiSaveReq;

/**
 * @author daiyifan
 * @description 针对表【poi(POI数据表)】的数据库操作Service
 * @createDate 2022-09-08 17:59:49
 */
public interface PoiService extends IService<Poi> {

    /**
     * 新增POI
     *
     * @param req poi保存参数
     * @return 保存poi的数量
     */
    Integer savePoi(PoiSaveReq req);
}
