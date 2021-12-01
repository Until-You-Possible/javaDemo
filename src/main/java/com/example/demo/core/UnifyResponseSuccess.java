package com.example.demo.core;


public class UnifyResponseSuccess {

    private String status;
    private Object result;

    public UnifyResponseSuccess(Object result) {
        this.result = result;
        this.status = "success";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
