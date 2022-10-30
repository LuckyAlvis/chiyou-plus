package com.shuwei.dai.chiyouplusfinanceserver.service.impl;

import com.shuwei.dai.chiyouplusfinanceserver.service.BillService;
import org.springframework.stereotype.Service;

@Service
public class BillServiceImpl implements BillService {

    @Override
    public String getBillDetailMailContent() {
        return "当前第一周，共剩余时间263周";
    }

}
