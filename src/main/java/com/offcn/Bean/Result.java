package com.offcn.Bean;

import java.sql.ResultSet;

public class Result {
    private int code;
    private String msg;

    public Result() {
    }

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }

    public static Result Success(String msg){
        return new Result(200,msg);
    }
    public static Result Fail(String msg){
        return new Result(500,msg);
    }
}
