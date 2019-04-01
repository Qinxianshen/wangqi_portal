package com.wangqi.dao;

import com.wangqi.entity.SystemSetting;

public interface SystemSettingDao extends DaoManage<SystemSetting>{
    String selectVersion();

}

