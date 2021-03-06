package com.suguang.domin;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class YmSpaceDetail {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private Integer spaceId;
  private String name;
  private String image;
  private Integer population;
  private Integer spaceMeasure;
  private String tel;
  private String facilities;
  private String detail;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getSpaceId() {
    return spaceId;
  }

  public void setSpaceId(Integer spaceId) {
    this.spaceId = spaceId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }


  public Integer getPopulation() {
    return population;
  }

  public void setPopulation(Integer population) {
    this.population = population;
  }


  public Integer getSpaceMeasure() {
    return spaceMeasure;
  }

  public void setSpaceMeasure(Integer spaceMeasure) {
    this.spaceMeasure = spaceMeasure;
  }


  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }


  public String getFacilities() {
    return facilities;
  }

  public void setFacilities(String facilities) {
    this.facilities = facilities;
  }


  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

}
