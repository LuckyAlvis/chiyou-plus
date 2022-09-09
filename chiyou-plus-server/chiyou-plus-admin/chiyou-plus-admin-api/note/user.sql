CREATE TABLE `user`
(
    `id`           bigint(20)  NOT NULL AUTO_INCREMENT COMMENT '自定义用户ID',
    `user_name`    varchar(32)          DEFAULT NULL COMMENT '用户帐号（登录用）',
    `phone`        varchar(32) NOT NULL COMMENT '手机号码',
    `password`     varchar(64)          DEFAULT NULL COMMENT '用户密码',
    `role_id`      bigint(20)           DEFAULT NULL COMMENT '角色ID',
    `email`        varchar(32)          DEFAULT NULL COMMENT '邮箱',
    `status`       tinyint(1)  NOT NULL DEFAULT '0' COMMENT '状态 1:正常,2:冻结',
    `remark`       varchar(255)         DEFAULT NULL COMMENT '备注',
    `gmt_create`   datetime             DEFAULT NULL COMMENT '创建时间',
    `gmt_modified` datetime             DEFAULT NULL COMMENT '最后更新时间',
    `team_id`      bigint(20)           DEFAULT NULL COMMENT '团队id',
    `team_name`    varchar(64)          DEFAULT NULL COMMENT '团队名称',
    PRIMARY KEY (`id`) USING BTREE,
    UNIQUE KEY `uk_phone` (`phone`(16)) USING BTREE,
    KEY `idx_user_name` (`user_name`) USING BTREE
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  ROW_FORMAT = COMPACT COMMENT ='用户表';
