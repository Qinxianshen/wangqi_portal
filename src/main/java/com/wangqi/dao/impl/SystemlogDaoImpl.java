package com.wangqi.dao.impl;

import com.wangqi.dao.BaseDao;
import com.wangqi.dao.SystemlogDao;
import com.wangqi.entity.Systemlog;
import com.wangqi.entity.page.PageModel;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository("systemlogDao")
public class SystemlogDaoImpl implements SystemlogDao {
    @Resource
    private BaseDao dao;


    public void setDao(BaseDao dao) {
        this.dao = dao;
    }

    @Override
    public int insert(Systemlog e) {
        return dao.insert("systemlog.insert", e);
    }

    @Override
    public int delete(Systemlog e) {
        return dao.delete("systemlog.delete",e);
    }

    @Override
    public int update(Systemlog e) {
        return dao.update("systemlog.update", e);
    }

    @Override
    public Systemlog selectOne(Systemlog e) {
        return (Systemlog) dao.selectOne("systemlog.selectOne", e);
    }

    @Override
    public PageModel selectPageList(Systemlog e) {
        return dao.selectPageList("systemlog.selectPageList", "systemlog.selectPageCount", e);
    }

    @Override
    public List<Systemlog> selectList(Systemlog e) {
        return dao.selectList("systemlog.selectList", e);
    }

    @Override
    public int deleteById(int id) {
        return dao.delete("systemlog.deleteById", id);
    }

    @Override
    public Systemlog selectById(int id) {
        return (Systemlog) dao.selectOne("systemlog.selectById", id);
    }

    @Override
    public Systemlog selectFirstOne(String account) {
        return (Systemlog) dao.selectOne("systemlog.selectFirstOne", account);
    }

}
