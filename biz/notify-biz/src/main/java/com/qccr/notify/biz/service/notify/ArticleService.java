/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.qccr.notify.biz.service.notify;

import com.qccr.notify.model.notify.Article;

import java.util.List;

/**
 * @author user
 * @version : notify-parent, v 0.1 2016/8/1 11:47 user Exp $$
 */
public interface ArticleService {

    public boolean addArticle(Article article);
    public List<Article> queryArticle();
}
