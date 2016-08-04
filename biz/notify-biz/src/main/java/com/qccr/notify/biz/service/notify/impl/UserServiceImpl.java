/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.qccr.notify.biz.service.notify.impl;

import com.qccr.notify.biz.service.notify.UserService;
import com.qccr.notify.dal.UserDao;
import com.qccr.notify.model.notify.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author user
 * @version : notify-parent, v 0.1 2016/7/29 18:06 user Exp $$
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Resource
    private UserDao userDao;

    @Override
    public boolean insertUsers(List<UserDO> users) {
        int num = userDao.insertUser(users);
        if(num > 0){
            return true;
        }
        return false;
    }
}