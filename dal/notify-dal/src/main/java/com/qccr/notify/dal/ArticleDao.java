/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.qccr.notify.dal;

import com.qccr.notify.model.notify.Article;

import java.util.List;

/**
 * @author user
 * @version : notify-parent, v 0.1 2016/7/29 18:00 user Exp $$
 */
public interface ArticleDao {

    public int insertArticle(Article article);
    public List<Article> queryArticle();
}
