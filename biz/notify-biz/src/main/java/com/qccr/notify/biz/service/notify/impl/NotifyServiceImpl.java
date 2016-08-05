/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.qccr.notify.biz.service.notify.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qccr.notify.biz.service.notify.NotifyService;
import com.qccr.notify.dal.NotifyDao;
import com.qccr.notify.model.notify.NotifyDO;



/**
 * 
 * @author xierongli
 * @version $Id: NotifyServiceImpl.java, v 0.1 2016年6月30日 下午2:44:37 xierongli Exp $
 */
@Service("notifyService")
public class NotifyServiceImpl implements NotifyService{

    @Resource
    public NotifyDao notifyDao;

    @Override
    public void insertNotify(NotifyDO notify) {
        notifyDao.insertNotify(notify);
    }

}
