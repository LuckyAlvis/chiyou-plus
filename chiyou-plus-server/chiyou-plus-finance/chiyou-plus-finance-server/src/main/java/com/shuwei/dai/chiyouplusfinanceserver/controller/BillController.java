package com.shuwei.dai.chiyouplusfinanceserver.controller;

import com.shuwei.dai.chiyouplusfinanceserver.service.BillService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "bill", tags = "账单服务")
@RequestMapping("/bill")
public class BillController {

    @Autowired
    private BillService billService;

    @GetMapping("/getBillDetailFormat")
    @ApiOperation("获取账单详情")
    public void getBillDetailFormat() {
        billService.getBillDetailMailContent();
    }
}
