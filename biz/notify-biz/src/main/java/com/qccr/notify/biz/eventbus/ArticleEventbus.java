/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.qccr.notify.biz.eventbus;

import com.google.common.eventbus.EventBus;
import com.qccr.notify.model.notify.NotifyDO;
import org.springframework.stereotype.Component;

/**
 * @author user
 * @version : notify-parent, v 0.1 2016/8/1 13:37 user Exp $$
 */
@Component
public class ArticleEventbus {

    private final EventBus eventBus = new EventBus();

    public void register(ArticleListener listener){
        eventBus.register(listener);
    }

    public void post(NotifyDO notify){
        eventBus.post(notify);
    }



}