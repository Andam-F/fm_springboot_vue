package com.andam.fp.domain.common;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @Classname ReturnInfo
 * @Description TODO
 * @Date 2019/4/9 9:21
 * @Created by Andam
 */
public class ReturnInfo<T> implements Serializable {

    private static final long serialVersionUID = -6150520506430821038L;

    public ReturnInfo(){}

    public ReturnInfo(String code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public ReturnInfo(String code,String msg, T data){
        this(code, msg);
        this.data = data;
    }

    public static ReturnInfo getInstance() {
        return new ReturnInfo();
    }

    @ApiModelProperty("错误码")
    private String code;
    @ApiModelProperty("错误码描述")
    private String msg;
    @ApiModelProperty("响应数据")
    private T data;

    public ReturnInfo setResult(ErrorCodeEnum errorCodeEnum) {
        this.code = errorCodeEnum.getCode();
        this.msg = errorCodeEnum.getDesc();
        return this;
    }

    public String getCode() {
        return code;
    }

    public ReturnInfo setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public ReturnInfo setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return data;
    }

    public ReturnInfo setData(T data) {
        this.data = data;
        return this;
    }
}
