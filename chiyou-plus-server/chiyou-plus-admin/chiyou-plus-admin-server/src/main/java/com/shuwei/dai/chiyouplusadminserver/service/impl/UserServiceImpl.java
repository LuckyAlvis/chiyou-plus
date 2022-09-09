package com.shuwei.dai.chiyouplusadminserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shuwei.dai.admin.entity.User;
import com.shuwei.dai.chiyouplusadminserver.mapper.UserMapper;
import com.shuwei.dai.chiyouplusadminserver.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author daiyifan
 * @description 针对表【user(用户表)】的数据库操作Service实现
 * @createDate 2022-09-09 14:23:07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {

}




