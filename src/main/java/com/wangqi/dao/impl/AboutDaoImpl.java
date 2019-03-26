package com.wangqi.dao.impl;


import com.wangqi.dao.AboutDao;
import com.wangqi.dao.BaseDao;
import com.wangqi.entity.About;
import com.wangqi.entity.page.PageModel;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository("aboutDao")
public class AboutDaoImpl implements AboutDao {

    @Resource
    private BaseDao dao;

    public void setDao(BaseDao dao) {
        this.dao = dao;
    }

    @Override
    public int insert(About about) {
        return dao.insert("about.insert",about);
    }

    @Override
    public int delete(About about) {
        return dao.delete("about.delete",about);
    }

    @Override
    public int update(About about) {
        return dao.update("about.update",about);
    }

    @Override
    public About selectOne(About about) {
        return (About) dao.selectOne("about.selectOne",about);
    }

    @Override
    public PageModel selectPageList(About about) {
        return dao.selectPageList("about.selectPageList","about.selctCount",about);
    }

    @Override
    public List<About> selectList(About about) {
        return dao.selectList("about.selectList",about);
    }

    @Override
    public int deleteById(int id) {
        return id;
    }

    @Override
    public About selectById(int id) {
         return (About) dao.selectOne("about.selectById",id);
    }
}
