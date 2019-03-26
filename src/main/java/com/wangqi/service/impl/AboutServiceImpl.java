package com.wangqi.service.impl;

import com.wangqi.dao.AboutDao;
import com.wangqi.dao.ServersManage;
import com.wangqi.entity.About;
import com.wangqi.service.AboutService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("aboutService")
public class AboutServiceImpl extends ServersManage<About, AboutDao> implements AboutService {
    @Override
    @Resource(name = "aboutDao")
    public void setDao(AboutDao aboutDao) {
        this.dao = dao;
    }
}
