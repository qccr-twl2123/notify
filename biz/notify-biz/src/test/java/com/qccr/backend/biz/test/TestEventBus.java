/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.qccr.backend.biz.test;

import com.google.common.eventbus.EventBus;

/**
 * @author xierongli
 * @version : notify-parent, v 0.1 2016/8/3 14:06 user Exp $$
 */
public class TestEventBus {




    public static void main(String[] args) {

        EventBus eventBus = new EventBus("test");
        EventListener listener = new EventListener();

        eventBus.register(listener);

        eventBus.post(new TestEvent(200));
        eventBus.post(new TestEvent(300));
        eventBus.post(new TestEvent(400));


        System.out.println("LastMessage:" + listener.getLastMessage());

    }


}