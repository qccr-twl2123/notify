package com.qccr.notify.model.notify;

import java.io.Serializable;
import java.util.Date;

/**
 * @author xierongli
 * @version $$Id: notify-parent, v 0.1 2016/8/4 17:30 user Exp $$
 */
public class SubscriptionDO  implements Serializable{

    private static final long serialVersionUID = 2585680970379175118L;
    private Integer id;

    private Integer target;
    private Integer targetType;
    private Integer userId;
    private String action;
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTarget() {
        return target;
    }

    public void setTarget(Integer target) {
        this.target = target;
    }

    public Integer getTargetType() {
        return targetType;
    }

    public void setTargetType(Integer targetType) {
        this.targetType = targetType;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
