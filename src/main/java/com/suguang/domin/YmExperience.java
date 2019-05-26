package com.suguang.domin;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Author liruifeng
 * Date  2019-05-06
 */
public class YmExperience implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private int experienceType;
    private int pid;
    private Timestamp experienceDate;
    private String experience;


    public YmExperience(){
    }

    public void setId (int id) {this.id = id;} 
    public int getId(){ return id;} 
    public void setExperienceType (int experienceType) {this.experienceType = experienceType;} 
    public int getExperienceType(){ return experienceType;} 
    public void setPid (int pid) {this.pid = pid;} 
    public int getPid(){ return pid;} 
    public void setExperienceDate (Timestamp experienceDate) {this.experienceDate = experienceDate;} 
    public Timestamp getExperienceDate(){ return experienceDate;} 
    public void setExperience (String experience) {this.experience = experience;} 
    public String getExperience(){ return experience;} 

}