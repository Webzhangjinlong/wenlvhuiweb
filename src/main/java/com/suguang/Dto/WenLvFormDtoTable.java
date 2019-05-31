package com.suguang.Dto;

import com.github.pagehelper.Page;

/**
 * Created by 11491 on 2019/5/31.
 */
public class WenLvFormDtoTable {
    private int page = 1;

    private int size = 10;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
