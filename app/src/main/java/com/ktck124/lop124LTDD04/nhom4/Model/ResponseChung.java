package com.ktck124.lop124LTDD04.nhom4.Model;

public class ResponseChung {
    private int code;
    private String message;

    public ResponseChung(int code, String message) {
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
