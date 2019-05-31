package com.suguang.domin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class YmArtist  extends YmEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer artistType;

    private String artistName;

    private String backgroundUrl;
    
    private String artistLogourl;

    private String artistPhone;

    private String artistDetails;

    private Integer artistStatus;

	public String getBackgroundUrl() {
		return backgroundUrl;
	}

	public void setBackgroundUrl(String backgroundUrl) {
		this.backgroundUrl = backgroundUrl;
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
}