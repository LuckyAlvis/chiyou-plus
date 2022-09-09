package com.shuwei.dai.chiyouplusadminserver.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shuwei.dai.admin.entity.User;
import com.shuwei.dai.admin.feign.UserRemoteService;
import com.shuwei.dai.admin.req.UserPageReq;
import com.shuwei.dai.chiyouplusadminserver.service.UserService;
import common.resp.ChiyouPage;
import common.resp.ChiyouResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 用户管理控制类
 * @author: daiyifan
 * @create: 2022/9/8 15:01
 */
@RestController
@AllArgsConstructor
public class UserController implements UserRemoteService {

    private final UserService userService;

    @PostMapping("/user/listPage")
    public ChiyouResponse<ChiyouPage<User>> listPage(@RequestBody UserPageReq req) {
        Page<User> userPage = new Page<>(req.getCurrent(), req.getSize());
        User user = new User();
        BeanUtils.copyProperties(req, user);
        return ChiyouResponse.success(ChiyouPage.get(userService.page(userPage, Wrappers.lambdaQuery(user))));
    }
}
