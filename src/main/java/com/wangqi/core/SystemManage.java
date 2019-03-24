package com.wangqi.core;

/*
* 系统管理类
* 
* */

import com.wangqi.cache.CacheProvider;
import com.wangqi.cache.EhcacheCacheProvider;
import com.wangqi.cache.SimpleCacheProvider;

public class SystemManage {

    private static SystemManage instance;
    private static CacheProvider cacheProvider = new SimpleCacheProvider();
    public void setCacheProvider(CacheProvider cacheProvider) {
        SystemManage.cacheProvider = cacheProvider;
    }
}
