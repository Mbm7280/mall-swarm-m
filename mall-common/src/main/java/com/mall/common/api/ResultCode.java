package com.mall.common.api;

/**
 * 枚举 一些常用的API操作码
 * !!! 枚举继承接口
 */
public enum  ResultCode implements IErrorCode {

    SUCCESS(200,"操作成功"),
    FAILED(500,"操作失败"),
    VALIDATE_FAILED(404,"参数校验失败"),
    UNAUTHORIZED(401,"暂未登录或者token已过期"),
    FORBIDDEN(403,"无此权限");

    private long code;
    private String message;

    ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public long getCode() {
        return code;
    }


    @Override
    public String getMessage() {
        return message;
    }
}
