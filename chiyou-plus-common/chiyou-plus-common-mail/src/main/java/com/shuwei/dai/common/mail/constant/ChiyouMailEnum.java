package com.shuwei.dai.common.mail.constant;

import com.shuwei.dai.common.enums.utils.IEnum;

/**
 * 邮件枚举类
 */
public enum ChiyouMailEnum implements IEnum {

    BILL(1, "记账", "定时任务"),
    FINANCE(2, "财务", "财务"),
    ;


    private Integer code;
    private String name;
    private String description;

    ChiyouMailEnum(Integer code, String name, String description) {
        this.code = code;
        this.name = name;
        this.description = description;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
