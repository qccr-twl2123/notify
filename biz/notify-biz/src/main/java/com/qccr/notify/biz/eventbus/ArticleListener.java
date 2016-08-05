package com.qccr.notify.biz.eventbus;

import com.google.common.eventbus.Subscribe;
import com.qccr.notify.dal.SubscriptionDao;
import com.qccr.notify.dal.UserNotifyDao;
import com.qccr.notify.model.notify.NotifyDO;
import com.qccr.notify.model.notify.SubscriptionDO;
import com.qccr.notify.model.notify.UserNotify;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Set;

/**
 * @author xierongli
 * @version $$Id: notify-parent, v 0.1 2016/8/4 15:50 user Exp $$
 */
@Component
public class ArticleListener {

    @Resource
    private SubscriptionDao subscriptionDao;
    @Resource
    private UserNotifyDao userNotifyDao;
    @Subscribe
    public void listener(NotifyDO notify){
        //监听到消息. 发送给各个用户.
        System.out.println("监听消息:" + notify.getAction());
        Set<SubscriptionDO> sets = subscriptionDao.getSubscriptionByTarget(notify.getTarget());
        for(SubscriptionDO subscriptionDO : sets){
            UserNotify userNotifyDO = new UserNotify();
            userNotifyDO.setNotifyId(notify.getId());
            userNotifyDO.setUserId(subscriptionDO.getUserId());
            userNotifyDao.addUserNotify(userNotifyDO);
        }

    }
}
