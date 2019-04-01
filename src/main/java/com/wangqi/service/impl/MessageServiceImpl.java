package com.wangqi.service.impl;

import com.wangqi.dao.MessageDao;
import com.wangqi.dao.ServersManage;
import com.wangqi.entity.Messages;
import com.wangqi.service.MessageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("messageService")
public class MessageServiceImpl extends ServersManage<Messages, MessageDao> implements MessageService {

    @Resource(name="messageDao")
    @Override
    public void setDao(MessageDao dao) {
        this.dao = dao;
    }

}
