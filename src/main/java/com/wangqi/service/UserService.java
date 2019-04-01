package com.wangqi.service;

import com.wangqi.entity.User;

public interface UserService extends Services<User>{

    public User login(User e);
}
