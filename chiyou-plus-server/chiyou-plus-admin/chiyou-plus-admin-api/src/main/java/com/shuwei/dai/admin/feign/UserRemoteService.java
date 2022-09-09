package com.shuwei.dai.admin.feign;

import com.shuwei.dai.admin.entity.User;
import com.shuwei.dai.admin.req.UserPageReq;
import common.resp.ChiyouPage;
import common.resp.ChiyouResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @description: 用户远程服务
 * @author: daiyifan
 * @create: 2022/9/9 16:18
 */
@Component
@FeignClient(name = "chiyou-plus-admin-service")
public interface UserRemoteService {
    @PostMapping("/user/listPage")
    ChiyouResponse<ChiyouPage<User>> listPage(@RequestBody UserPageReq req);

}
