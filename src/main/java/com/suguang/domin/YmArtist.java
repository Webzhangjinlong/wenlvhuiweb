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

    private String artistType;

    private String artistName;

    private String backgroundUrl;

    private String artistLogourl;

    private String artistPhone;

   private String artistDetails;

   private String artistExperience;

    private Integer artistStatus;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArtistType() {
        return artistType;
    }

    public void setArtistType(String artistType) {
        this.artistType = artistType;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getBackgroundUrl() {
        return backgroundUrl;
    }

    public void setBackgroundUrl(String backgroundUrl) {
        this.backgroundUrl = backgroundUrl;
    }

    public String getArtistLogourl() {
        return artistLogourl;
    }

    public void setArtistLogourl(String artistLogourl) {
        this.artistLogourl = artistLogourl;
    }

    public String getArtistPhone() {
        return artistPhone;
    }

    public void setArtistPhone(String artistPhone) {
        this.artistPhone = artistPhone;
    }

    public String getArtistDetails() {
        return artistDetails;
    }

    public void setArtistDetails(String artistDetails) {
        this.artistDetails = artistDetails;
    }

    public String getArtistExperience() {
        return artistExperience;
    }

    public void setArtistExperience(String artistExperience) {
        this.artistExperience = artistExperience;
    }

    public Integer getArtistStatus() {
        return artistStatus;
    }

    public void setArtistStatus(Integer artistStatus) {
        this.artistStatus = artistStatus;
    }
}