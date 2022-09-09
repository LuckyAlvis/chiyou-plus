CREATE TABLE `poi`
(
    `id`               bigint       NOT NULL AUTO_INCREMENT COMMENT 'id',
    `name`             varchar(256) NOT NULL COMMENT '名称',
    `province`         varchar(32)   DEFAULT NULL COMMENT '省份',
    `province_code`    int           DEFAULT NULL COMMENT '省份编码',
    `city`             varchar(32)   DEFAULT NULL COMMENT '城市',
    `city_code`        int           DEFAULT NULL COMMENT '城市编码',
    `region`           varchar(32)   DEFAULT NULL COMMENT '行政区',
    `region_code`      int           DEFAULT NULL COMMENT '行政区编码',
    `mall`             varchar(64)   DEFAULT NULL COMMENT '商圈',
    `mall_code`        varchar(64)   DEFAULT NULL COMMENT '商圈编码',
    `longitude`        double        DEFAULT NULL COMMENT '经度',
    `latitude`         double        DEFAULT NULL COMMENT '纬度',
    `address`          varchar(256)  DEFAULT NULL COMMENT '地址',
    `status`           tinyint(1)   NOT NULL COMMENT '1:未采集 2:进行中 3:审核通过 4:作废',
    `remark`           varchar(256)  DEFAULT NULL COMMENT '备注',
    `gmt_create`       datetime      DEFAULT NULL COMMENT '创建时间',
    `gmt_modified`     datetime      DEFAULT NULL COMMENT '最后更新时间',
    `account`          tinyint(1)    DEFAULT '0' COMMENT '是否结算，1结算',
    `position_and_num` varchar(1024) DEFAULT NULL COMMENT '采集类型和数量',
    `task_type`        int           DEFAULT NULL COMMENT '1:企业采集 2:小区采集 3:商场采集 4:地铁采集',
    `project_code`     varchar(255)  DEFAULT NULL COMMENT '项目code',
    `project_name`     varchar(255)  DEFAULT NULL COMMENT '项目名称',
    `collect_type`     tinyint(1)    DEFAULT NULL COMMENT '1:照片采集 2:视频采集',
    PRIMARY KEY (`id`),
    KEY `idx_poi_id` (`id`),
    KEY `idx_poi_name` (`name`),
    KEY `idx_city_region_mall_name` (`city`, `region`, `mall`),
    KEY `idx_mall_name` (`mall`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci
  ROW_FORMAT = DYNAMIC COMMENT ='POI数据表';
