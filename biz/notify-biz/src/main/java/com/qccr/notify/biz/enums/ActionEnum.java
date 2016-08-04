/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.qccr.notify.biz.enums;

/**
 * @author user
 * @version : notify-parent, v 0.1 2016/8/1 14:01 user Exp $$
 */
public enum ActionEnum {

    LIKE(1,"喜欢"),
    LATE(2, "踩");

    private int code;
    private String description;

    private ActionEnum(int code, String description){
        this.code = code;
        this.description = description;
    }
}
