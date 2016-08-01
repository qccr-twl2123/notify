/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.qccr.notify.dal;

import com.qccr.notify.model.notify.UserDO;

import java.util.List;

/**
 * @author user
 * @version : notify-parent, v 0.1 2016/7/29 17:56 user Exp $$
 */
public interface UserDao {

    public int insertUser(List<UserDO> list);
}
