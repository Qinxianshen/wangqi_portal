package com.wangqi.service.impl;

import com.wangqi.dao.ContactDao;
import com.wangqi.dao.ServersManage;
import com.wangqi.entity.Contact;
import com.wangqi.service.ContactService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("contactService")
public class ContactServiceImpl extends ServersManage<Contact, ContactDao> implements ContactService {
    @Override
    @Resource(name="contactDao")
    public void setDao(ContactDao dao) {
        this.dao=dao;
    }
}
