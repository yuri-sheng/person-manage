package com.orichalcoss.model;

public class ApiResponse {
    private int code;
    private String message;

    public static ApiResponse newInstance(){
        return new ApiResponse(200,"success");
    }

    public static ApiResponse newInstance(int code,String message){
        return new ApiResponse(code,message);
    }

    public ApiResponse() {
    }

    public ApiResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
