package com.wangqi.util;

import com.wangqi.entity.User;

import javax.servlet.http.HttpSession;


/*
*
* 验证用户登陆信息
*
* */
public class LoginUserHolder {
    public static User getLoginUser(){
        HttpSession session = RequestHolder.getSession();
        return session == null?null:(User)session.getAttribute("manage_session_user_info");
    }


}
