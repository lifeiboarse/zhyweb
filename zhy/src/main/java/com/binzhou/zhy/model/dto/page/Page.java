package com.binzhou.zhy.model.dto.page;

import java.util.List;

public class Page<T> {
    /**
     * 数据内容
     */
    private List<T> content;
    /**
     * 分页号（从1始计）
     */
    private int pageNum;
    /**
     * 页面数目
     */
    private int pageSize;
    /**
     * 数据总数
     */
    private int totalElements;
    /**
     * 总分页数（从1始计）
     */
    private int totalPages;

    public Page(List<T> content, int pageNum, int pageSize, int totalElements) {
        this.content = content;
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.totalElements = totalElements;

        totalPages = 1 + totalElements / pageSize;
        if (totalElements > 0 && totalElements % pageSize == 0) {
            totalPages--;
        }
    }
}
