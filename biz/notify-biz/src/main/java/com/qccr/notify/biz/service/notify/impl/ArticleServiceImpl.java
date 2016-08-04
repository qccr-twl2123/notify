/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.qccr.notify.biz.service.notify.impl;

import com.qccr.notify.biz.service.notify.ArticleService;
import com.qccr.notify.dal.ArticleDao;
import com.qccr.notify.model.notify.Article;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author user
 * @version : notify-parent, v 0.1 2016/8/1 11:47 user Exp $$
 */
@Service("articleService")
public class ArticleServiceImpl implements ArticleService {

    @Resource
    private ArticleDao articleDao;


    @Override
    public boolean addArticle(Article article) {
        int num = articleDao.insertArticle(article);
        if(num > 0){
            return true;
        }
        return false;
    }

    @Override
    public List<Article> queryArticle() {
        List<Article> list = articleDao.queryArticle();
        if(CollectionUtils.isNotEmpty(list)){
            return list;
        }
        return null;
    }
}