package com.wangqi.entity.page;


import java.util.ArrayList;
import java.util.List;

/*
*
* 分页的模型 实体类继承该类
* */
public class PageModel implements CleanBean {
    private  int id;
    private  int total;
    private List list = new ArrayList();
    private int pageSize = 20;//每页的数据
    private int offset;//页数
    private int pagerSize; //总页数
    protected String PageUrl; //分页的URL
    private int recordsTotal;//记录总数
    private int recordsFiltered;//记录过滤


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getPagerSize() {
        return pagerSize;
    }

    public void setPagerSize(int pagerSize) {
        this.pagerSize = pagerSize;
    }

    public String getPageUrl() {
        return PageUrl;
    }

    public void setPageUrl(String pageUrl) {
        PageUrl = pageUrl;
    }

    public int getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(int recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public int getRecordsFiltered() {
        return recordsFiltered;
    }

    public void setRecordsFiltered(int recordsFiltered) {
        this.recordsFiltered = recordsFiltered;
    }

    @Override
    public void clean() {
        total = 0;
        list = null;
        offset = 0;
        recordsTotal = 0;
        id = 0;
    }
}
