package com.suguang.domin;

import java.util.Date;

/**
 * Created by 11491 on 2019/5/25.
 */
public class YmWenBrigade {

    private Integer id;
    private Integer type;
    private Double   adult;
    private Double children;
    private Double setMeal;
    private String  adultDescribe;
    private String childrenDescribe;
    private String mealDescribe;
    private String tripArrange;
    private String  feeNotice;
    private String securityTip;
    private String reservedFields1;
    private String reservedFields2;
    private Date createTime;
    private Integer recommend;
    private Integer browse;
    private String img;

    public Integer getRecommend() {
        return recommend;
    }

    public void setRecommend(Integer recommend) {
        this.recommend = recommend;
    }

    public Integer getBrowse() {
        return browse;
    }

    public void setBrowse(Integer browse) {
        this.browse = browse;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Double getAdult() {
        return adult;
    }

    public void setAdult(Double adult) {
        this.adult = adult;
    }

    public Double getChildren() {
        return children;
    }

    public void setChildren(Double children) {
        this.children = children;
    }

    public Double getSetMeal() {
        return setMeal;
    }

    public void setSetMeal(Double setMeal) {
        this.setMeal = setMeal;
    }

    public String getAdultDescribe() {
        return adultDescribe;
    }

    public void setAdultDescribe(String adultDescribe) {
        this.adultDescribe = adultDescribe;
    }

    public String getChildrenDescribe() {
        return childrenDescribe;
    }

    public void setChildrenDescribe(String childrenDescribe) {
        this.childrenDescribe = childrenDescribe;
    }

    public String getMealDescribe() {
        return mealDescribe;
    }

    public void setMealDescribe(String mealDescribe) {
        this.mealDescribe = mealDescribe;
    }

    public String getTripArrange() {
        return tripArrange;
    }

    public void setTripArrange(String tripArrange) {
        this.tripArrange = tripArrange;
    }

    public String getFeeNotice() {
        return feeNotice;
    }

    public void setFeeNotice(String feeNotice) {
        this.feeNotice = feeNotice;
    }

    public String getSecurityTip() {
        return securityTip;
    }

    public void setSecurityTip(String securityTip) {
        this.securityTip = securityTip;
    }

    public String getReservedFields1() {
        return reservedFields1;
    }

    public void setReservedFields1(String reservedFields1) {
        this.reservedFields1 = reservedFields1;
    }

    public String getReservedFields2() {
        return reservedFields2;
    }

    public void setReservedFields2(String reservedFields2) {
        this.reservedFields2 = reservedFields2;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
