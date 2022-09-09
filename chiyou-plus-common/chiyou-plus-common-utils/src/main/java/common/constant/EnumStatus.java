package common.constant;

/**
 * @description:
 * @author: daiyifan
 * @create: 2022/9/5 10:13
 */
public enum EnumStatus {
    OK(20000, "操作成功"),
    ERROR(40000, "操作失败"),
    NO_LOGIN(40005, "未登录"),
    ACCOUNT_ERROR(40006, "用户名错误"),
    CODE_ERROR(40007, "验证码错误"),
    PWD_ERROR(40007, "密码错误"),
    CODE_LOSE(40008, "验证码失效"),
    NO_ACTIVE(40009, "用户邮箱未激活"),
    NO_PREM(40010, "无权限");

    private int status;
    private String message;

    EnumStatus(int status, String message) {
        this.status = status;
        this.message = message;
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
}
