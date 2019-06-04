package com.suguang.domin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class YmSpacePolicy {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private Integer spaceId;
  private Integer browse;
  private String spacePolicyDetail;
  private String videoUrl;
  private String videoBackimg;
  private Date creat_date;

  public Date getCreat_date() {
    return creat_date;
  }

  public void setCreat_date(Date creat_date) {
    this.creat_date = creat_date;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getSpaceId() {
    return spaceId;
  }

  public void setSpaceId(Integer space_Id) {
    this.spaceId = space_Id;
  }


  public Integer getBrowse() {
    return browse;
  }

  public void setBrowse(Integer browse) {
    this.browse = browse;
  }


  public String getSpacePolicyDetail() {
    return spacePolicyDetail;
  }

  public void setSpacePolicyDetail(String space_Policy_Detail) {
    this.spacePolicyDetail = spacePolicyDetail;
  }


  public String getVideoUrl() {
    return videoUrl;
  }

  public void setVideoUrl(String video_Url) {
    this.videoUrl = video_Url;
  }


  public String getVideoBackimg() {
    return videoBackimg;
  }

  public void setVideoBackimg(String videoBackimg) {
    this.videoBackimg = videoBackimg;
  }

}
