package com.suguang.domin;

import java.util.ArrayList;
import java.util.List;

public class YmArtist  extends YmEntityTbl {
    private Integer id;

    private Integer artistType;

    private String artistName;

    private String backgroundUrl;
    
    private String artistLogourl;

    private String artistPhone;

    private String artistDetails;

    private Integer artistStatus;

    private String typeName;


    private List<YmArtist> commentList= new ArrayList<YmArtist>();
    private List<YmImageTbl> videoList = new ArrayList<YmImageTbl>();
    private List<YmExperienceTbl> experienceList = new ArrayList<YmExperienceTbl>();
    private List<YmImageTbl> imgList = new ArrayList<YmImageTbl>();
    
    
    
    
    
    
    public List<YmImageTbl> getImgList() {
		return imgList;
	}

	public void setImgList(List<YmImageTbl> imgList) {
		this.imgList = imgList;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getBackgroundUrl() {
		return backgroundUrl;
	}

	public void setBackgroundUrl(String backgroundUrl) {
		this.backgroundUrl = backgroundUrl;
	}

	public List<YmArtist> getCommentList() {
		return commentList;
	}

	public List<YmImageTbl> getVideoList() {
		return videoList;
	}

	public List<YmExperienceTbl> getExperienceList() {
		return experienceList;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArtistType() {
        return artistType;
    }

    public void setArtistType(Integer artistType) {
        this.artistType = artistType;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName == null ? null : artistName.trim();
    }

    public String getArtistLogourl() {
        return artistLogourl;
    }

    public void setArtistLogourl(String artistLogourl) {
        this.artistLogourl = artistLogourl == null ? null : artistLogourl.trim();
    }

    public String getArtistPhone() {
        return artistPhone;
    }

    public void setArtistPhone(String artistPhone) {
        this.artistPhone = artistPhone == null ? null : artistPhone.trim();
    }

    public String getArtistDetails() {
        return artistDetails;
    }

    public void setArtistDetails(String artistDetails) {
        this.artistDetails = artistDetails == null ? null : artistDetails.trim();
    }

    public Integer getArtistStatus() {
        return artistStatus;
    }

    public void setArtistStatus(Integer artistStatus) {
        this.artistStatus = artistStatus;
    }

    public void setCommentList(List<YmArtist> commentList) {
        this.commentList = commentList;
    }

    public void setVideoList(List<YmImageTbl> videoList) {
        this.videoList = videoList;
    }


    public void setExperienceList(List<YmExperienceTbl> experienceList) {
        this.experienceList = experienceList;
    }
}