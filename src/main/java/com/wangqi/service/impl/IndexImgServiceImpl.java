package com.wangqi.service.impl;

import com.wangqi.dao.IndexImgDao;
import com.wangqi.dao.ServersManage;
import com.wangqi.entity.IndexImg;
import com.wangqi.service.IndexImgService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("indexImgService")
public class IndexImgServiceImpl extends ServersManage<IndexImg, IndexImgDao> implements IndexImgService {
    @Override
    @Resource(name="indexImgDao")
    public void setDao(IndexImgDao dao) {
        this.dao = dao;
    }
}
