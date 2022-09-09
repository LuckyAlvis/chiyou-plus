package com.shuwei.dai.chiyoupluscollectserver.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shuwei.dai.chiyoupluscollectserver.mapper.PoiMapper;
import com.shuwei.dai.chiyoupluscollectserver.service.PoiService;
import com.shuwei.dai.collect.entity.Poi;
import com.shuwei.dai.collect.req.PoiSaveReq;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author daiyifan
 * @description 针对表【poi(POI数据表)】的数据库操作Service实现
 * @createDate 2022-09-08 17:59:49
 */
@Service
@AllArgsConstructor
public class PoiServiceImpl extends ServiceImpl<PoiMapper, Poi>
        implements PoiService {

    private PoiMapper poiMapper;

    @Override
    public Integer savePoi(PoiSaveReq req) {
        Poi poi = new Poi();
        BeanUtils.copyProperties(req, poi);
        poi.setGmtCreate(new Date());
        poi.setGmtModified(new Date());
        return poiMapper.insert(poi);
    }
}




