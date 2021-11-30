package com.example.demo.core;

public class UnifyResponse {

    private final int code;
    private final String message;
    private final String request;


    public int getCode() {
        return code;
    }
    public String getMessage() {
        return message;
    }

    public String getRequest() {
        return request;
    }

    // 统一返回构造函数
    public  UnifyResponse (int code, String message, String request) {
        this.code = code;
        this.request = request;
        this.message = message;
    }
}
