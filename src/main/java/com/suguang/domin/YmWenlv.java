package com.suguang.domin;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class YmWenlv  extends YmEntity {
    private Integer id;

    private Integer titleType;
    
    private String titleTypeName;
    
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

    private Integer textType;

    private Integer backupField1;

    private String backupField2;
    
    private Integer comment_num;
    
    private Integer up_num;

    private Integer is_up; // 判断当前用户是否点赞   1 ： 点赞   0：未点赞
    
    
    
	public Integer getTitleType() {
		return titleType;
	}

	public void setTitleType(Integer titleType) {
		this.titleType = titleType;
	}

	public String getTitleTypeName() {
		return titleTypeName;
	}

	public void setTitleTypeName(String titleTypeName) {
		this.titleTypeName = titleTypeName;
	}

	public Integer getIs_up() {
		return is_up;
	}

	public void setIs_up(Integer is_up) {
		this.is_up = is_up;
	}

	public Integer getComment_num() {
		return comment_num;
	}

	public void setComment_num(Integer comment_num) {
		this.comment_num = comment_num;
	}

	public Integer getUp_num() {
		return up_num;
	}

	public void setUp_num(Integer up_num) {
		this.up_num = up_num;
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

    public Integer getTextType() {
        return textType;
    }

    public void setTextType(Integer textType) {
        this.textType = textType;
    }

    public Integer getBackupField1() {
        return backupField1;
    }

    public void setBackupField1(Integer backupField1) {
        this.backupField1 = backupField1;
    }

    public String getBackupField2() {
        return backupField2;
    }

    public void setBackupField2(String backupField2) {
        this.backupField2 = backupField2 == null ? null : backupField2.trim();
    }
}