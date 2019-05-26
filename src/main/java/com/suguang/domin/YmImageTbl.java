package com.suguang.domin;

import java.util.Date;

/**
 * 图片表
 */
public class YmImageTbl {

	Integer id;// int(11) NOT NULL,
	Integer imgType;// int(255) DEFAULT NULL COMMENT '图片类型 1:空间 2：活动 3：艺人 4：培训机构',
	Integer imageType;// int(11) DEFAULT NULL COMMENT '1 图片 2 视频',
	String imgName; // 图片名
	Integer pid;// int(11) DEFAULT NULL COMMENT '父id',
	String imgUrl;// varchar(255) DEFAULT NULL COMMENT '图片路径',
	Date upDate;// datetime DEFAULT NULL COMMENT '上传时间',
	String backupField1;// varchar(255) DEFAULT NULL COMMENT '备用字段',
	Integer paixu ; //排序
	String detalis;
	String videoUrl;
	
	
	
	
	
	public String getVideoUrl() {
		return videoUrl;
	}
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}
	public String getDetalis() {
		return detalis;
	}
	public void setDetalis(String detalis) {
		this.detalis = detalis;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getImgType() {
		return imgType;
	}
	public void setImgType(Integer imgType) {
		this.imgType = imgType;
	}
	public Integer getImageType() {
		return imageType;
	}
	public void setImageType(Integer imageType) {
		this.imageType = imageType;
	}
	public String getImgName() {
		return imgName;
	}
	public void setImgName(String imgName) {
		this.imgName = imgName;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public Date getUpDate() {
		return upDate;
	}
	public void setUpDate(Date upDate) {
		this.upDate = upDate;
	}
	public String getBackupField1() {
		return backupField1;
	}
	public void setBackupField1(String backupField1) {
		this.backupField1 = backupField1;
	}
	public Integer getPaixu() {
		return paixu;
	}
	public void setPaixu(Integer paixu) {
		this.paixu = paixu;
	}
	@Override
	public String toString() {
		return "YmImageTbl [id=" + id + ", imgType=" + imgType + ", imageType=" + imageType + ", imgName=" + imgName
				+ ", pid=" + pid + ", imgUrl=" + imgUrl + ", upDate=" + upDate + ", backupField1=" + backupField1
				+ ", paixu=" + paixu + "]";
	}
	
	

}
