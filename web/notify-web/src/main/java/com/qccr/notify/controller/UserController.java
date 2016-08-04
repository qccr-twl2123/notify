/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.qccr.notify.controller;

import com.google.common.collect.Lists;
import com.qccr.notify.biz.service.notify.UserService;
import com.qccr.notify.model.notify.UserDO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author user
 * @version : notify-parent, v 0.1 2016/8/1 11:21 user Exp $$
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("add")
    public String insertUser(String userNames){
        String[] userNameArray = userNames.split(",");
        List<UserDO> list = Lists.newArrayList();
        for(int i=0; i<userNameArray.length; i++){
            UserDO userDO = new UserDO();
            userDO.setUserName(userNameArray[i]);
            list.add(userDO);
        }
        userService.insertUsers(list);
        return "/notify/success";
    }

}