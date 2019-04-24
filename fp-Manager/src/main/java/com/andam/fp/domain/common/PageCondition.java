package com.andam.fp.domain.common;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @Classname PageCondition分页实体
 * @Description TODO
 * @Date 2019/4/9 16:57
 * @Created by Andam
 */
public class PageCondition implements Serializable {
    private static final long serialVersionUID = 4553444265058223523L;
    @ApiModelProperty(value="当前页",required=true)
    private int page = 1;
    @ApiModelProperty(value="每页大小",required=true)
    private int size = 10;

    public void setPage(int page) {
        this.page = page;
    }

    public int getPage() {
        return page;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
