CREATE TABLE `project`
(
    `id`           int(11) NOT NULL COMMENT 'id',
    `project_code` varchar(255) DEFAULT NULL COMMENT '项目code',
    `project_name` varchar(255) DEFAULT NULL COMMENT '项目名称',
    `description`  varchar(255) DEFAULT NULL COMMENT '项目描述',
    `remark`       varchar(255) DEFAULT NULL COMMENT '项目备注',
    `gmt_create`   datetime     DEFAULT NULL COMMENT '立项时间',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  ROW_FORMAT = DYNAMIC;
