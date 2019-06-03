package com.suguang.domin;


public class YmSpacePolicy {

  private Integer id;
  private Integer spaceId;
  private Integer browse;
  private String spacePolicyDetail;
  private String videoUrl;
  private String videoBackimg;


  public long getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public long getSpaceId() {
    return spaceId;
  }

  public void setSpaceId(Integer space_Id) {
    this.spaceId = space_Id;
  }


  public long getBrowse() {
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
