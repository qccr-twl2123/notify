/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.qccr.notify.biz.listener;

import com.google.common.eventbus.Subscribe;
import com.qccr.notify.model.notify.NotifyDO;

/**
 * @author user
 * @version : notify-parent, v 0.1 2016/8/1 13:37 user Exp $$
 */
public class ArticleListenter {

    @Subscribe
    public void listener(NotifyDO notifyDO){
        //1, 查询订阅者

        //2, 推送消息给订阅者

    }

}