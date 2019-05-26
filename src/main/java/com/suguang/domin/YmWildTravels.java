package com.suguang.domin;

import java.util.Date;

/**
 * Created by 11491 on 2019/5/25.
 */
public class YmWildTravels {

    private Integer id;
    private Integer userid;
    private Integer browse;
    private Integer like;
    private String content;
    private String reservedfields1;
    private String reservedfields2;
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getBrowse() {
        return browse;
    }

    public void setBrowse(Integer browse) {
        this.browse = browse;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReservedfields1() {
        return reservedfields1;
    }

    public void setReservedfields1(String reservedfields1) {
        this.reservedfields1 = reservedfields1;
    }

    public String getReservedfields2() {
        return reservedfields2;
    }

    public void setReservedfields2(String reservedfields2) {
        this.reservedfields2 = reservedfields2;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
