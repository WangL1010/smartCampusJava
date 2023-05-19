package com.example.smartcampusjava.common;

import lombok.Data;

import java.io.Serializable;


@Data
public class R<T> implements Serializable {

    private Integer errorCode; //编码：1成功，0和其它数字为失败

    private String message; //错误信息

    private T result; //数据

    private boolean success;

    public static <T> R<T> success(T object) {
        R<T> r = new R<T>();
        r.result = object;
        r.errorCode = 0;
        r.message = "SUCCESS";
        r.success = true;
        return r;
    }

    public static <T> R<T> error(String msg) {
        R r = new R();
        r.message = msg;
        r.errorCode = -1;
        r.success = false;
        return r;
    }

}
