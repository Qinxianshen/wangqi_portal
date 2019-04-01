package com.wangqi.service.impl;

import com.wangqi.dao.ServersManage;
import com.wangqi.dao.SystemSettingDao;
import com.wangqi.entity.SystemSetting;
import com.wangqi.service.SystemSettingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("systemSettingService")
public class SystemSettingServiceImpl extends ServersManage<SystemSetting, SystemSettingDao> implements SystemSettingService {

    @Override
    @Resource(name="systemSettingDao")
    public void setDao(SystemSettingDao dao) {
        this.dao = dao;
    }


    @Override
    public String selectVersion() {
        return dao.selectVersion();
    }
}
