package com.wangqi.service;

import com.wangqi.entity.Systemlog;

public interface SystemlogService extends Services<Systemlog>{

    /**
     * 根据账号查询最新的一次登陆记录
     * @return
     */
    Systemlog selectFirstOne(String account);
}
