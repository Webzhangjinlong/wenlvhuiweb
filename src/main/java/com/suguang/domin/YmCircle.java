package com.suguang.domin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Mr.zhang on 2019/6/22.
 */

@Entity
public class YmCircle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String circleName;
    private Integer dictionaryId;
    private String circleDetail;
    private Integer browse;
    private String imgUrl;
    private String circleRegulations;
    private Date regulationsDate;
    private Integer circleAdmin;
    private Integer createUser;
    private Date createDate;
    private String backgroundUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCirclename() {
        return circleName;
    }

    public void setCirclename(String circlename) {
        this.circleName = circlename;
    }

    public Integer getDictionaryId() {
        return dictionaryId;
    }

    public void setDictionaryId(Integer dictionaryId) {
        this.dictionaryId = dictionaryId;
    }

    public String getCircleDetail() {
        return circleDetail;
    }

    public void setCircleDetail(String circleDetail) {
        this.circleDetail = circleDetail;
    }

    public Integer getBrowse() {
        return browse;
    }

    public void setBrowse(Integer browse) {
        this.browse = browse;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getCircleRegulations() {
        return circleRegulations;
    }

    public void setCircleRegulations(String circleRegulations) {
        this.circleRegulations = circleRegulations;
    }

    public Date getRegulationsDate() {
        return regulationsDate;
    }

    public void setRegulationsDate(Date regulationsDate) {
        this.regulationsDate = regulationsDate;
    }

    public Integer getCircleAdmin() {
        return circleAdmin;
    }

    public void setCircleAdmin(Integer circleAdmin) {
        this.circleAdmin = circleAdmin;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getBackgroundUrl() {
        return backgroundUrl;
    }

    public void setBackgroundUrl(String backgroundUrl) {
        this.backgroundUrl = backgroundUrl;
    }
}
