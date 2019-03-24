package com.wangqi.cache;

import com.google.common.collect.Maps;

import java.io.Serializable;
import java.util.Map;

public class SimpleCacheProvider implements CacheProvider{


    private static SimpleCacheProvider instance = new SimpleCacheProvider();
    private static Map<String,Serializable> cacheContainer = Maps.newHashMap();

    /*
    * 线程安全的懒汉单例模式
    *
    * */
    public static SimpleCacheProvider getInstance() {
        return instance;
    }

    @Override
    public void put(String key, Serializable cacheObject) {
        cacheContainer.put(key, cacheObject);
    }

    @Override
    public Serializable get(String key) {
        return cacheContainer.get(key);
    }

    @Override
    public void remove(String key) {
        cacheContainer.remove(key);
    }

    @Override
    public void clear() {
        cacheContainer.clear();
    }
}
