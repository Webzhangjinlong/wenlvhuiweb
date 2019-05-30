package com.suguang.domin;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class YmWenlv extends YmEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String titleType;

    //private String titleTypeName;

    private String title;

    private String image;

    private String substance;

    private String status;

    private String source;

    private Integer relay;

    private Integer browse;

    private String cotent;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createDate;

    private Integer createUser;

    private String textType;

    private String backupField2;

    //private Integer comment_num;

    //private Integer up_num;

    //private Integer is_up; // 判断当前用户是否点赞   1 ： 点赞   0：未点赞


    public String getTextType() {
        return textType;
    }

    public String getTitleType() {
        return titleType;
    }

    public void setTitleType(String titleType) {
        this.titleType = titleType;
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
        this.status = status;
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

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public String getTextType(int i) {
        return textType;
    }

    public void setTextType(String textType) {
        this.textType = textType;
    }


    public String getBackupField2() {
        return backupField2;
    }

    public void setBackupField2(String backupField2) {
        this.backupField2 = backupField2 == null ? null : backupField2.trim();
    }
}