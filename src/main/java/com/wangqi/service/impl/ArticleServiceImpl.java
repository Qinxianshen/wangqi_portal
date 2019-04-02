package com.wangqi.service.impl;


import com.wangqi.dao.AboutDao;
import com.wangqi.dao.ArticleDao;
import com.wangqi.dao.ServersManage;
import com.wangqi.entity.About;
import com.wangqi.entity.Article;
import com.wangqi.service.AboutService;
import com.wangqi.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("articleService")
public class ArticleServiceImpl extends ServersManage<Article,ArticleDao> implements ArticleService {

    @Override
    @Resource(name="articleDao")
    public void setDao(ArticleDao dao) {
        this.dao = dao;
    }

    @Override
    public Article selectPrevious(int id) {
        return dao.selectPrevious(id);
    }

    @Override
    public Article selectNext(int id) {
        return dao.selectNext(id);
    }
}
