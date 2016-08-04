/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.qccr.notify.controller;

import com.qccr.notify.biz.service.notify.ArticleService;
import com.qccr.notify.model.notify.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author user
 * @version : notify-parent, v 0.1 2016/8/1 11:53 user Exp $$
 */
@Controller
@RequestMapping("/article")
public class ArticleController {

    @Resource
    private ArticleService articleService;

    @RequestMapping("add")
    public String addArticle(String title, String content){
        Article article = new Article();
        article.setTitle(title);
        article.setContent(content);

        articleService.addArticle(article);

        return  "/notify/success";
    }
    @RequestMapping("like")
    public String likeArticle(){

        return "/notify/success";
    }

}