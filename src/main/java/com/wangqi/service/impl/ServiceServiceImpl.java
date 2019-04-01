package com.wangqi.service.impl;

import com.wangqi.dao.ServersManage;
import com.wangqi.dao.ServiceDao;
import com.wangqi.service.ServiceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("serviceService")
public class ServiceServiceImpl extends ServersManage<com.wangqi.entity.Service, ServiceDao> implements ServiceService {

    @Override
    @Resource(name="serviceDao")
    public void setDao(ServiceDao dao) {
        this.dao = dao;
    }
}
