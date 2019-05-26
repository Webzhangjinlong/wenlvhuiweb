package com.suguang.domin;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class YmUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;            // `id` bigint(20) NOT NULL AUTO_INCREMENT,
    @Column(name = "username")
    private String username;       // `username` varchar(50) NOT NULL COMMENT '用户名',
    private String password;       // `password` varchar(32) NOT NULL COMMENT '密码，加密存储',
    private String phone;          //`phone` varchar(20) DEFAULT NULL COMMENT '注册手机号',
    private String headPic;        //`head_pic` varchar(150) DEFAULT NULL COMMENT '头像地址',
    private String status;         // `status` varchar(1) DEFAULT NULL COMMENT '使用状态（Y正常 N非正常）',
    private String isMobileCheck;       // `is_mobile_check` varchar(1) DEFAULT '0' COMMENT '手机是否验证 （0否  1是）',
    private Date created;              // `created` datetime NOT NULL COMMENT '创建时间',
    private Date updated;                // `updated` datetime NOT NULL,
    private String sourceType;       // `source_type` varchar(1) DEFAULT NULL COMMENT '会员来源：1:PC，2：H5，3：Android，4：IOS，5：WeChat',
    private String nickName;            // `nick_name` varchar(50) DEFAULT NULL COMMENT '昵称',
    private String name;             // `name` varchar(50) DEFAULT NULL COMMENT '真实姓名',
    private String sex;               // `sex` varchar(1) DEFAULT '0' COMMENT '性别，1男，2女',
    private String userLevel;         //`user_level` int(11) DEFAULT NULL COMMENT '会员等级',


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;            //`birthday` datetime DEFAULT NULL COMMENT '生日',
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date lastLoginTime;       //`last_login_time` datetime DEFAULT NULL COMMENT '最后登录时间',

    private Integer userType;
    private Integer typeId;


    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIsMobileCheck() {
        return isMobileCheck;
    }

    public void setIsMobileCheck(String isMobileCheck) {
        this.isMobileCheck = isMobileCheck;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

}
