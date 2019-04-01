package com.wangqi.service.impl;

import com.wangqi.dao.RecruitmentDao;
import com.wangqi.dao.ServersManage;
import com.wangqi.entity.Recruitment;
import com.wangqi.service.RecruitmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("recruitmentService")
public class RecruitmentImpl extends ServersManage<Recruitment, RecruitmentDao> implements RecruitmentService {

    @Resource(name="recruitmentDao")
    @Override
    public void setDao(RecruitmentDao dao) {
        this.dao = dao;
    }

}
