package com.bj1804.estudy.vo;

import java.io.Serializable;

public class PageRequest implements Serializable {
    private int currpage;
    private int pagesize;

    public int getCurrpage() {
        return currpage;
    }

    public void setCurrpage(int currpage) {
        this.currpage = currpage;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }
}
