/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.qccr.backend.biz.test;

import com.google.common.eventbus.Subscribe;

/**
 * @author xierongli
 * @version : notify-parent, v 0.1 2016/8/3 14:05 user Exp $$
 */
public class EventListener {

    public int lastMessage = 0;

    @Subscribe
    public void listen(TestEvent event) {
        lastMessage = event.getMessage();
        System.out.println("Message:"+lastMessage);
    }

    public int getLastMessage() {
        return lastMessage;
    }
}