package com.suguang.util;

import com.suguang.domin.YmSchool;

import java.util.List;

/**
 * Created by 11491 on 2019/5/28.
 */
public class Paging<T> {

    /**
     * 每页大小
     */
    private int size;

    /**
     * 当前页为第几页
     */
    private int number;

    /**
     * 是否为第一页
     */
    private boolean first = false;

    /**
     * 是否为最后一页
     */
    private boolean last = false;

    /**
     * 总共有多少页
     */
    private int totalPages;

    /**
     * 总共有多少条数据
     */
    private int totalElements;

    /**
     * 当前页一共有多少条数据
     */
    private int numberOfElements;

    /**
     * 数据
     */
    private List<YmSchool> content;

    /**
     * 根据传入的当前多少页
     * @param size
     * @param number
     * @param totalElements
     */
    public Paging(int size, int number, int totalElements) {

        this.size = size;

        this.totalElements = totalElements;

        this.number = number < 0 ? 0 : number;

        this.totalPages = totalElements % size == 0 ? totalElements/size : (totalElements/size) + 1;

        this.first = number == 0 ? true : false;

        this.last = number == this.totalPages ? true : false;

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isFirst() {
        return first;
    }

    public void setFirst(boolean first) {
        this.first = first;
    }

    public boolean isLast() {
        return last;
    }

    public void setLast(boolean last) {
        this.last = last;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(int totalElements) {
        this.totalElements = totalElements;
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }

    public void setNumberOfElements(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public List getContent() {
        return content;
    }

    public void setContent(List<YmSchool> content) {
        this.content = content;
    }

}
