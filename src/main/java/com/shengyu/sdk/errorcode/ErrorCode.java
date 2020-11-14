package com.shengyu.sdk.errorcode;

public class ErrorCode {
    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ErrorCode(){

    }

    public ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
