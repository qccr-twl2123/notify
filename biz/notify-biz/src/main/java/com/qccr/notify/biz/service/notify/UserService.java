/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.qccr.notify.biz.service.notify;

import com.qccr.notify.model.notify.UserDO;

import java.util.List;

/**
 * @author user
 * @version : notify-parent, v 0.1 2016/7/29 18:07 user Exp $$
 */
public interface UserService {

    public boolean insertUsers(List<UserDO> users);
}
