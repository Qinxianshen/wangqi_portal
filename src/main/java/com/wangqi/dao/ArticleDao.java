package com.wangqi.dao;

import com.wangqi.entity.Article;

public interface ArticleDao extends DaoManage<Article>{
    /*
    * 文章可以选择上一页和下一页
    *
    * */
    Article selectPrevious(int id);
    Article selectNext(int id);

}
