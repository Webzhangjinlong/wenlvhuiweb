package com.suguang.domin;

import java.util.Date;
import java.util.List;

public class YmSchool {
    private Integer id;

    private Integer schoolType;

    private Integer upNum;

    private String name;

    private String logourl;

    private String phone;

    private String adress;

    private String adetails;

    private Date createDate;
    
    
    private List<YmUp> upList;
    
    
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(Integer schoolType) {
        this.schoolType = schoolType;
    }

    public Integer getUpNum() {
        return upNum;
    }

    public void setUpNum(Integer upNum) {
        this.upNum = upNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLogourl() {
        return logourl;
    }

    public void setLogourl(String logourl) {
        this.logourl = logourl == null ? null : logourl.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
    }

    public String getAdetails() {
        return adetails;
    }

    public void setAdetails(String adetails) {
        this.adetails = adetails == null ? null : adetails.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}