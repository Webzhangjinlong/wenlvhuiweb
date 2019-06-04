package com.suguang.domin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by 11491 on 2019/5/25.
 */
@Entity
public class YmWenbrigade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer type;
    private double adult;
    private double children;
    private double setMeal;
    private String adultDescribe;
    private String childrenDescribe;
    private String mealDescribe;
    private String tripArrange;
    private String feeNotice;
    private String securityTip;
    private String name;
    private String address;
    private Date createTime;
    private Integer recommend;
    private Integer browse;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

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

    private String img;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public long getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }


    public double getAdult() {
        return adult;
    }

    public void setAdult(double adult) {
        this.adult = adult;
    }


    public double getChildren() {
        return children;
    }

    public void setChildren(double children) {
        this.children = children;
    }


    public double getSetMeal() {
        return setMeal;
    }

    public void setSetMeal(double setMeal) {
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
}
