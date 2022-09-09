package com.shuwei.dai.chiyoupluswebadmin.user.controller;

import com.shuwei.dai.admin.entity.User;
import com.shuwei.dai.admin.feign.UserRemoteService;
import com.shuwei.dai.admin.req.UserPageReq;
import common.resp.ChiyouPage;
import common.resp.ChiyouResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: daiyifan
 * @create: 2022/9/9 14:36
 */
@RestController
public class AdminUserController {

    @Resource
    private UserRemoteService userRemoteService;

    @PostMapping("/user/listPage")
    public ChiyouResponse<ChiyouPage<User>> listPage(@RequestBody UserPageReq req) {
        return userRemoteService.listPage(req);
    }

}
