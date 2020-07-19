package com.mall.common.api;

/**
 * Api错误码
 */
public interface IErrorCode {

    /**
     * 获取状态码
     * @return
     */
    long getCode();

    /**
     * 获取状态信息
     * @return
     */
    String getMessage();

}
