package common.resp;

import common.constant.EnumStatus;

/**
 * @description: chiyou响应体
 * @author: daiyifan
 * @create: 2022/9/8 13:35
 */
public class ChiyouResponse<T> {
    private int status;
    private String message;
    private T data;


    public ChiyouResponse(EnumStatus enumStatus, T data) {
        this.message = enumStatus.getMessage();
        this.status = enumStatus.getStatus();
        this.data = data;
    }

    private static <T> ChiyouResponse<T> getChiyouResponse(EnumStatus enumStatus, T data) {
        return new ChiyouResponse<>(enumStatus, data);
    }

    public static <T> ChiyouResponse<T> error(EnumStatus enumStatus) {
        return getChiyouResponse(enumStatus, null);
    }

    /**
     * 返回成功的方法
     */
    public static <T> ChiyouResponse<T> success() {
        return getChiyouResponse(EnumStatus.OK, null);
    }

    public static <T> ChiyouResponse<T> success(T data) {
        return getChiyouResponse(EnumStatus.OK, data);
    }

    /**
     * 返回失败的方法
     */
    public static <T> ChiyouResponse<T> error(T data) {
        return getChiyouResponse(EnumStatus.ERROR, data);
    }

    public static <T> ChiyouResponse<T> error() {
        return getChiyouResponse(EnumStatus.ERROR, null);
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
