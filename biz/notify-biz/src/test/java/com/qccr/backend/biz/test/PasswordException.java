package com.qccr.backend.biz.test;

/**
 * @author xierongli
 * @version $$Id: notify-parent, v 0.1 2016/8/4 13:59 user Exp $$
 */
public class PasswordException  extends Exception{

    private String msg;
    private Exception exception;

    public PasswordException(String msg, Exception exception){
            this.msg = msg;
            this.exception = exception;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }
}
