package com.wangqi.service;

import com.wangqi.entity.SystemSetting;

public interface SystemSettingService extends Services<SystemSetting>{

    String selectVersion();
}
