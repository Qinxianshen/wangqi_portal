package com.wangqi.service.impl;

import com.wangqi.dao.ArticleCategoryDao;
import com.wangqi.dao.ServersManage;
import com.wangqi.entity.ArticleCategory;
import com.wangqi.service.ArticleCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("articleCategoryService")
public class ArticleCategoryServiceImpl extends ServersManage<ArticleCategory, ArticleCategoryDao> implements ArticleCategoryService {
    @Override
    @Resource(name="articleCategoryDao")
    public void setDao(ArticleCategoryDao dao) {
        this.dao = dao;
    }
}
