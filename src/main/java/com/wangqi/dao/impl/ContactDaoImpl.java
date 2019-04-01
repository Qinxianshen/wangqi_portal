package com.wangqi.dao.impl;

import com.wangqi.dao.BaseDao;
import com.wangqi.dao.ContactDao;
import com.wangqi.entity.Contact;
import com.wangqi.entity.page.PageModel;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository("contactDao")
public class ContactDaoImpl implements ContactDao {
    @Resource
    private BaseDao dao;

    public void setDao(BaseDao dao) {
        this.dao = dao;
    }

    @Override
    public int insert(Contact contact) {
        return dao.insert("contact.insert",contact);
    }

    @Override
    public int delete(Contact contact) {
        return 0;
    }

    @Override
    public int update(Contact contact) {
        return dao.delete("contact.update",contact);
    }

    @Override
    public Contact selectOne(Contact contact) {
        return (Contact) dao.selectOne("contact.selectOne",contact);
    }

    @Override
    public PageModel selectPageList(Contact contact) {
        return dao.selectPageList("contact.selectPageList","contact.selectPageCount",contact);
    }

    @Override
    public List<Contact> selectList(Contact contact) {
        return dao.selectList("contact.selectList",contact);
    }

    @Override
    public int deleteById(int id) {
        return dao.delete("contact.deleteById",id);
    }

    @Override
    public Contact selectById(int id) {
        return (Contact) dao.selectOne("contact.selectById",id);
    }
}

