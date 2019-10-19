package com.user.com.user.pojo;

public class ResultMsg {
    private  String flag;
    private  String msg;
    private Object obj;

    public ResultMsg() {
    }

    public ResultMsg(String flag, String msg, Object obj) {
        this.flag = flag;
        this.msg = msg;
        this.obj = obj;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
