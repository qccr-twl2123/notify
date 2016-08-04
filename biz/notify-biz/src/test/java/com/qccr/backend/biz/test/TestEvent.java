/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.qccr.backend.biz.test;

/**
 * @author xierongli
 * @version : notify-parent, v 0.1 2016/8/3 14:05 user Exp $$
 */
public class TestEvent {

    private final int message;
    public TestEvent(int message) {
        this.message = message;
        System.out.println("event message:"+message);
    }
    public int getMessage() {
        return message;
    }
}