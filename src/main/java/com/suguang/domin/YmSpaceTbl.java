package com.suguang.domin;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Author liruifeng
 * Date  2019-05-18
 */
public class YmSpaceTbl implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String spaceName;
    private Integer browse;
    private String spaceTitle;
    private String dateil;
    private String addr;
    private String longitude;
    private String latitude;
    private Timestamp createDate;
    private String backupField1;
    private Integer spaceMeasure;
    private String openDate;
    private String tel;


    public YmSpaceTbl(){
    }

    public void setId (Integer id) {this.id = id;} 
    public Integer getId(){ return id;} 
    public void setSpaceName (String spaceName) {this.spaceName = spaceName;} 
    public String getSpaceName(){ return spaceName;} 
    public void setBrowse (Integer browse) {this.browse = browse;} 
    public Integer getBrowse(){ return browse;} 
    public void setSpaceTitle (String spaceTitle) {this.spaceTitle = spaceTitle;} 
    public String getSpaceTitle(){ return spaceTitle;} 
    public void setDateil (String dateil) {this.dateil = dateil;} 
    public String getDateil(){ return dateil;} 
    public void setAddr (String addr) {this.addr = addr;} 
    public String getAddr(){ return addr;} 
    public void setLongitude (String longitude) {this.longitude = longitude;} 
    public String getLongitude(){ return longitude;} 
    public void setLatitude (String latitude) {this.latitude = latitude;} 
    public String getLatitude(){ return latitude;} 
    public void setCreateDate (Timestamp createDate) {this.createDate = createDate;} 
    public Timestamp getCreateDate(){ return createDate;} 
    public void setBackupField1 (String backupField1) {this.backupField1 = backupField1;} 
    public String getBackupField1(){ return backupField1;} 
    public void setSpaceMeasure (Integer spaceMeasure) {this.spaceMeasure = spaceMeasure;} 
    public Integer getSpaceMeasure(){ return spaceMeasure;} 
    public void setOpenDate (String openDate) {this.openDate = openDate;} 
    public String getOpenDate(){ return openDate;} 
    public void setTel (String tel) {this.tel = tel;} 
    public String getTel(){ return tel;} 

}