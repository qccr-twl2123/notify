/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.qccr.notify.biz.enums;

/**
 * 默认订阅的类型
 * @author user
 * @version : notify-parent, v 0.1 2016/8/1 13:58 user Exp $$
 */
public enum TargetTypeEnum {

    ARTICLE(1,"文章"),
    PRODUCT(2,"产品");

    private int code;
    private String description;

    private TargetTypeEnum(int code, String description){
        this.code = code;
        this.description = description;
    }
}
