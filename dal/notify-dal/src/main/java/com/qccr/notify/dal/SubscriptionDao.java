package com.qccr.notify.dal;

import com.qccr.notify.model.notify.SubscriptionDO;

import java.util.Set;

/**
 * @author xierongli
 * @version $$Id: notify-parent, v 0.1 2016/8/4 17:29 user Exp $$
 */
public interface SubscriptionDao {

    /**
     * 根据target获取订阅者
     * @return
     */
    Set<SubscriptionDO> getSubscriptionByTarget(Integer target);

}
