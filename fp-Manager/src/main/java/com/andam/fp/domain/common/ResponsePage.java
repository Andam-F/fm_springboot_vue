package com.andam.fp.domain.common;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * @Classname ResponsePage 响应分页信息
 * @Description TODO
 * @Date 2019/4/9 16:58
 * @Created by Andam
 */
public class ResponsePage<T> implements Serializable {
    private static final long serialVersionUID = 348192353657369731L;
    @ApiModelProperty("总记录数")
    private long total;
    @ApiModelProperty("当前页")
    private int pageNum;
    @ApiModelProperty("总页数")
    private int pages;
    @ApiModelProperty("数据内容列表")
    private List<T> list;

    public ResponsePage(){

    }

    public ResponsePage(long total, int page, int pageNum, List<T> list){

    }

    public static ResponsePage getInstance() {
        return ResultVoHolder.instance.setList(null);
    }

    private static class ResultVoHolder {
        private static ResponsePage instance = new ResponsePage();
    }

    public long getTotal() {
        return total;
    }

    public ResponsePage setTotal(long total) {
        this.total = total;
        return this;
    }

    public int getPages() {
        return pages;
    }

    public ResponsePage setPages(int pages) {
        this.pages = pages;
        return this;
    }

    public int getPageNum() {
        return pageNum;
    }

    public ResponsePage setPageNum(int pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    public List<T> getList() {
        return list;
    }

    public ResponsePage setList(List<T> list) {
        this.list = list;
        return this;
    }
}
