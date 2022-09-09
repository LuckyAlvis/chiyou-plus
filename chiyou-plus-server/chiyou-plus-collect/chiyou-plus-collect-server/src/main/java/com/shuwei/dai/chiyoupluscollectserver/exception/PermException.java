package com.shuwei.dai.chiyoupluscollectserver.exception;

import common.constant.EnumStatus;

/**
 * @description: 处理 权限验证 运行时异常
 * @author: daiyifan
 * @create: 2022/9/5 10:12
 */
public class PermException extends RuntimeException {

    private EnumStatus enumStatus;

    public PermException(EnumStatus enumStatus) {
        this.enumStatus = enumStatus;
    }

    public EnumStatus getEnumStatus() {
        return enumStatus;
    }

    public void setEnumStatus(EnumStatus enumStatus) {
        this.enumStatus = enumStatus;
    }
}
