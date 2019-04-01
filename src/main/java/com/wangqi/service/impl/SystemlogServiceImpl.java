package com.wangqi.service.impl;

import com.wangqi.dao.ServersManage;
import com.wangqi.dao.SystemlogDao;
import com.wangqi.entity.Systemlog;
import com.wangqi.service.SystemlogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("systemlogService")
public class SystemlogServiceImpl extends ServersManage<Systemlog, SystemlogDao> implements SystemlogService {

    @Override
    @Resource(name="systemlogDao")
    public void setDao(SystemlogDao dao) {
        this.dao = dao;
    }

    @Override
    public Systemlog selectFirstOne(String account) {
        return dao.selectFirstOne(account);
    }


}

