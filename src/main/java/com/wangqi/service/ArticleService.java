package com.wangqi.service;

import com.wangqi.entity.Article;

public interface ArticleService extends Services<Article> {
    Article selectPrevious(int id);
    Article selectNext(int id);
}
