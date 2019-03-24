package com.wangqi.dao;

import com.wangqi.entity.page.PageModel;
import org.apache.ibatis.exceptions.IbatisException;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;


/*
*
* 基础的DAO
* */
@Repository
public class BaseDao extends SqlSessionDaoSupport {


    private static final boolean selectProvilege = false;

    /*
    * 打开sesstion  使用Mybatis 中的session对数据库进行增删改查
    * @return
    * */
    public SqlSession openSession(){
        try {
            SqlSession session = getSqlSession();
            return session;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /*
    * 插入一条记录  成功时候返回插入的ID 失败抛出异常
    * @Param Str
    * @Param obj
    * @return
    * */
    public int insert(String str,Object obj){
        if(selectProvilege){
            //没有权限时候

        }
        SqlSession session = openSession();
        int row = session.insert(str,obj);
        if(row == 1){
            return  ((PageModel)obj).getId();
        }
        throw  new IbatisException();
    }

    /*
    * 删除
    * @param str
    * @return
    * */
    public int delete(String str){
        if (selectProvilege){
            //没有权限
        }
        SqlSession session = openSession();
        return session.delete(str);
    }

    /*
    * 删除
    * @param Str
    * @param obj
    * return
    * */
    public int delete(String str,Object obj){
        if(selectProvilege){
            //没有权限

        }
        SqlSession session = openSession();
        return session.delete(str,obj);
    }

    /*
    * 更新
    * @Param str
    * @Param obj
    * @return
    *
    * */
    public int update(String str,Object obj){
        if(selectProvilege){

        }
        SqlSession session = openSession();
        int row = session.update(str, obj);
        if (row == 1){
            if(obj  instanceof  PageModel){
                int id = ((PageModel)obj).getId();
                if(id == 0){
                    return 0;
                }
                return id;
            }
        }
        return 1;
    }

    /*
    * 查询总数
    * @Param str
    * @Pararm obj
    * @return
    *
    * */
    public int getCount(String str,Object obj){
        SqlSession session = openSession();
        return (Integer)session.selectOne(str,obj);
    }
    /*
    * 查询集合
    * @Param str
    * @return
    *
    * */
    public List selectList(String str){
        SqlSession session = openSession();
        return session.selectList(str);
    }
    public List selectList(String str,Object obj){
        SqlSession session = openSession();
        return session.selectList(str,obj);
    }

    /*
    * 查询一条记录
    * @param str
    * @return
    *
    *
    * */
    public Object selectOne(String str){
        SqlSession session = openSession();
        return session.selectOne(str);
    }
    public Object selectOne(String str,Object obj){
        SqlSession session = openSession();
        return  session.selectList(str,obj);
    }
    public PageModel selectPageList(String selectList,String selectCount,Object param){
        SqlSession session = openSession();
        List list = session.selectList(selectList,param);
        PageModel pageModel = new PageModel();
        pageModel.setList(list);
        Object object = session.selectOne(selectCount,param);
        if(object!=null){
            pageModel.setTotal(Integer.parseInt(object.toString()));
        }else {
            pageModel.setTotal(0);
        }
        return pageModel;
    }





}
