package com.wangqi.service.impl;

import com.wangqi.dao.FriendLinksDao;
import com.wangqi.dao.ServersManage;
import com.wangqi.entity.FriendLinks;
import com.wangqi.service.FriendLinksService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("friendLinksService")
public class FriendLinksServiceImpl extends ServersManage<FriendLinks, FriendLinksDao> implements FriendLinksService {

    @Resource(name="friendLinksDao")
    @Override
    public void setDao(FriendLinksDao dao) {
        this.dao = dao;
    }



}

