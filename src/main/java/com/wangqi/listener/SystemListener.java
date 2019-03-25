package com.wangqi.listener;


import com.wangqi.cache.FrontCache;
import com.wangqi.core.SystemManage;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/*
* 系统配置加载监听器
*
* */
public class SystemListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        SystemManage.getInstance();
        WebApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContextEvent.getServletContext());
        FrontCache frontCache = (FrontCache) applicationContext.getBean("frontCache");
        try {
            //监听器加载所有缓存
            frontCache.loadAllCache();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                throw new Exception("系统初始化失败");
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {



    }
}
