package com.wangqi.cache;

import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

public class FrontCache implements ServletContextAware {


    private ServletContext servletContext;
    @Override
    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }


    /**
     * 载入全部缓存
     * @throws Exception
     */
    public void loadAllCache() throws Exception{

    }

}
