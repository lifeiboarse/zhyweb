package com.binzhou.zhy.exception;

/**
 * 错误码
 */
public enum ErrorCodeEnum {
    SYSTEM_MAINTENANCE("SYSTEM_MAINTENANCE", "系统维护"),
    SYSTEM_ERROR("SYSTEM_ERROR", "system platform error"),
    UNKNOW_ERROR("UNKNOW_ERROR", "unknow error"),
    PARAM_ERROR("param_ERROR", "param error");


    private final String code;
    private final String msg;


    public String getCode() {
        return code;
    }

    ErrorCodeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public String toString() {
        return "[code]=" + code + ",[msg]=" + msg;
    }

    }
