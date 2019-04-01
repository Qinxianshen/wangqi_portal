package com.wangqi.dao;

import com.wangqi.entity.Systemlog;

public interface SystemlogDao extends DaoManage<Systemlog>{

    Systemlog selectFirstOne(String account);

}
