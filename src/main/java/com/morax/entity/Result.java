package com.morax.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result implements Serializable {
    private boolean flag; // 执行结果，true为成功，false为失败
    private String message; // 返回结果信息
    private Object data; // 返回数据

    public Result(){}

    public Result(boolean flag, String message) {
        super();
        this.flag = flag;
        this.message = message;
    }

    public Result(boolean flag) {
        this.flag = flag;
    }

    public Result(boolean flag,Object data) {
        this.flag = flag;
        this.data = data;
    }

    public Result(boolean flag, String message, Object data) {
        this.flag = flag;
        this.message = message;
        this.data = data;
    }

}
