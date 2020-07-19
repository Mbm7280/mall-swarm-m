package com.mall.common.api;

import lombok.*;

/**
 * 统一返回结果
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class CommonResult<T> {

    private long code;
    private String message;
    private T data;

    /**
     * 成功   返回状态信息
     * @return
     */
    public static CommonResult success(){
        return new CommonResult(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMessage(),null);
    }

    /**
     * 成功   自定义返回数据
     * @param data
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> success(T data){
        return new CommonResult<T>(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMessage(),data);
    }

    /**
     * 成功   自定义返回信息和数据
     * @param message
     * @param data
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> success(String message,T data){
        return new CommonResult<T>(ResultCode.SUCCESS.getCode(),message,data);
    }

    /**
     * 失败   自定义返回状态信息
     * @param errorCode
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> failed(IErrorCode errorCode){
        return new CommonResult<T>(errorCode.getCode(),errorCode.getMessage(),null);
    }

    /**
     * 失败   自定义返回信息
     * @param errorCode
     * @param message
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> failed(IErrorCode errorCode,String message){
        return new CommonResult<T>(errorCode.getCode(),message,null);
    }

    /**
     * 失败   自定义返回信息
     * @param message
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> failed(String message){
        return new CommonResult<T>(ResultCode.FAILED.getCode(),message,null);
    }

    /**
     * 失败   返回结果
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> failed(){return failed(ResultCode.FAILED);}

    /**
     * 失败   参数校验失败返回结果
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> validateFailed(){
        return failed(ResultCode.VALIDATE_FAILED);
    }

    /**
     * 失败   参数校验自定义返回结果
     * @param message
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> validateFailed(String message){
        return new CommonResult<T>(ResultCode.VALIDATE_FAILED.getCode(),message,null);
    }

    /**
     * 失败   未登录自定义返回数据
     * @param data
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> unauthorized(T data){
        return new CommonResult<T>(ResultCode.UNAUTHORIZED.getCode(),ResultCode.UNAUTHORIZED.getMessage(),data);
    }

    /**
     * 失败   未授权自定义返回数据
     * @param data
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> forbidden(T data){
        return new CommonResult<T>(ResultCode.FORBIDDEN.getCode(),ResultCode.FORBIDDEN.getMessage(),data);
    }




}
