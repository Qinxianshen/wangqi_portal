package com.wangqi.core.servlet;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartException;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.http.HttpServletRequest;

public class MultipartDispatcherServlet extends DispatcherServlet {
    @Override
    protected HttpServletRequest checkMultipart(HttpServletRequest request) throws MultipartException {

        HttpServletRequest servletRequest = super.checkMultipart(request);
        if(servletRequest instanceof MultipartDispatcherServlet
            && !(RequestContextHolder.currentRequestAttributes() instanceof MultipartDispatcherServlet)
        ){
            RequestContextHolder.setRequestAttributes(new MultipartDispatcherServletAttributes(servletRequest));
        }


        return servletRequest;
    }

    public static class MultipartDispatcherServletAttributes extends ServletRequestAttributes{

        public MultipartDispatcherServletAttributes(HttpServletRequest request) {
            super(request);
        }
    }
}
