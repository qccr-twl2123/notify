/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.qccr.notify.model.notify;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;

/**
 * @author user
 * @version : notify-parent, v 0.1 2016/7/29 17:49 user Exp $$
 */
public class UserNotify  implements Serializable{

    private static final long serialVersionUID = 2555026681145699205L;
    private Integer id;
    private Integer userId;
    /**
     * 0,未读 1, 已读
     */
    private  Integer isRead;
    private Integer notifyId;
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getIsRead() {
        return isRead;
    }

    public void setIsRead(Integer isRead) {
        this.isRead = isRead;
    }

    public Integer getNotifyId() {
        return notifyId;
    }

    public void setNotifyId(Integer notifyId) {
        this.notifyId = notifyId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public String toString() {
        return ToStringBuilder.reflectionToString (this, ToStringStyle.JSON_STYLE);
    }
}