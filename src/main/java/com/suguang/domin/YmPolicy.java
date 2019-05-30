package com.suguang.domin;
/*
 * 活动表
 * */

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class YmPolicy extends YmEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    private String image;

    private String substance;

    private String status;

    private String source;

    private Integer relay;

    private Integer browse;

    private String giveDefault;

    private String cotent;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createDate;

    private Integer textType;

    private String prize;

    private String policyRule;

    private String awardRules;

    private String policyPurpose;

    private Integer peopleNum;

    private Date signDate;
    //@DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date policyDate;

    private String policyAddr;

    private String videourl;

    private String videoBackurl;

    @Override
    public String toString() {
        return "YmPolicy{" +
                "videoBackurl='" + videoBackurl + '\'' +
                '}';
    }

    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl;
    }

    public String getVideoBackurl() {
        return videoBackurl;
    }

    public void setVideoBackurl(String videoBackurl) {
        this.videoBackurl = videoBackurl;
    }

    public String getPolicyPurpose() {
        return policyPurpose;
    }

    public void setPolicyPurpose(String policyPurpose) {
        this.policyPurpose = policyPurpose;
    }

    public String getAwardRules() {
        return awardRules;
    }

    public void setAwardRules(String awardRule) {
        this.awardRules = awardRule;
    }

    public String getPolicyRule() {
        return policyRule;
    }

    public void setPolicyRule(String policyRule) {
        this.policyRule = policyRule;
    }

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }

    public String getPolicyAddr() {
        return policyAddr;
    }

    public void setPolicyAddr(String policyAddr) {
        this.policyAddr = policyAddr;
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    public Date getPolicyDate() {
        return policyDate;
    }

    public void setPolicyDate(Date policyDate) {
        this.policyDate = policyDate;
    }

    public Integer getPeopleNum() {
        return peopleNum;
    }

    public void setPeopleNum(Integer peopleNum) {
        this.peopleNum = peopleNum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getSubstance() {
        return substance;
    }

    public void setSubstance(String substance) {
        this.substance = substance == null ? null : substance.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Integer getRelay() {
        return relay;
    }

    public void setRelay(Integer relay) {
        this.relay = relay;
    }

    public Integer getBrowse() {
        return browse;
    }

    public void setBrowse(Integer browse) {
        this.browse = browse;
    }

    public String getGiveDefault() {
        return giveDefault;
    }

    public void setGiveDefault(String giveDefault) {
        this.giveDefault = giveDefault == null ? null : giveDefault.trim();
    }

    public String getCotent() {
        return cotent;
    }

    public void setCotent(String cotent) {
        this.cotent = cotent == null ? null : cotent.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getTextType() {
        return textType;
    }

    public void setTextType(Integer textType) {
        this.textType = textType;
    }

}

