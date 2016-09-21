package com.core.api.event;


public class ApiResponse<T> {


    private int code;

    private String msg;

    private T _embedded;

    private int statusCode;


    public boolean isError() {
        if (code != 0) {
            return true;
        } else {
            return false;
        }
    }


    public T get_embedded() {
        return _embedded;
    }

    public void set_embedded(T _embedded) {
        this._embedded = _embedded;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}
