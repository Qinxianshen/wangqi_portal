package com.wangqi.dao.impl;

import com.wangqi.dao.BaseDao;
import com.wangqi.dao.MessageDao;
import com.wangqi.entity.Messages;
import com.wangqi.entity.page.PageModel;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository("messageDao")
public class MessageDaoImpl implements MessageDao {
    @Resource
    private BaseDao dao;


    public void setDao(BaseDao dao) {
        this.dao = dao;
    }

    @Override
    public int insert(Messages e) {
        return dao.insert("message.insert", e);
    }

    @Override
    public int delete(Messages e) {
        return dao.delete("message.delete", e);
    }

    @Override
    public int update(Messages e) {
        return dao.update("message.update", e);
    }

    @Override
    public Messages selectOne(Messages e) {
        return (Messages) dao.selectOne("message.selectOne", e);
    }

    @Override
    public PageModel selectPageList(Messages e) {
        return dao.selectPageList("message.selectPageList", "message.selectPageCount", e);
    }

    @Override
    public List<Messages> selectList(Messages e) {
        return dao.selectList("message.selectList", e);
    }

    @Override
    public int deleteById(int id) {
        return dao.delete("message.deleteById",id);
    }

    @Override
    public Messages selectById(int id) {
        return (Messages) dao.selectOne("message.selectById",id);
    }

}

