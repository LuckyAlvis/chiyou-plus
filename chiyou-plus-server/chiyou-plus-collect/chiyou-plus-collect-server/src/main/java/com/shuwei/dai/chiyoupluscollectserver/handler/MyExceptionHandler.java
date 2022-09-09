package com.shuwei.dai.chiyoupluscollectserver.handler;


import com.shuwei.dai.chiyoupluscollectserver.exception.PermException;
import common.constant.EnumStatus;
import common.resp.ChiyouResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 专门做处理异常的
 */
@RestControllerAdvice
public class MyExceptionHandler {

    /**
     * 处理权限异常
     */
    @ExceptionHandler(PermException.class)
    public ChiyouResponse<Void> handler(PermException e) {
        EnumStatus enumStatus = e.getEnumStatus();
        return ChiyouResponse.error(enumStatus);

    }
}
