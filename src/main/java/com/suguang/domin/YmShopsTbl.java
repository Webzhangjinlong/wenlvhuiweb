package com.suguang.domin;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YmShopsTbl {

	Integer  id  ;
	String   shopsName  ;
	String   shopsSlogan  ;
	String   shopsDetail  ;
	String   imgUrl  ;
	String   province  ;
	String   city  ;
	String   area  ;
	String   addrDetail  ;
	String   longitude  ;
	String  latitude  ;
	Date  createDate  ;
	
	Integer  createUser ;
	
	Integer is_up;
	
	Integer product_num;
	Integer up_num;

	List<YmProductTbl> productList = new ArrayList<YmProductTbl>(); // 商品集合

	List<YmUpTbl> upList = new ArrayList<YmUpTbl>(); // 点赞集合

	List<YmExperienceTbl>  experienceList= new ArrayList<YmExperienceTbl>(); // 经历集合
	
	List<YmImageTbl> videoList = new ArrayList<YmImageTbl>(); // 图片或者视频

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getShopsName() {
		return shopsName;
	}

	public void setShopsName(String shopsName) {
		this.shopsName = shopsName;
	}

	public String getShopsSlogan() {
		return shopsSlogan;
	}

	public void setShopsSlogan(String shopsSlogan) {
		this.shopsSlogan = shopsSlogan;
	}

	public String getShopsDetail() {
		return shopsDetail;
	}

	public void setShopsDetail(String shopsDetail) {
		this.shopsDetail = shopsDetail;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getAddrDetail() {
		return addrDetail;
	}

	public void setAddrDetail(String addrDetail) {
		this.addrDetail = addrDetail;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Integer getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Integer createUser) {
		this.createUser = createUser;
	}

	public Integer getIs_up() {
		return is_up;
	}

	public void setIs_up(Integer is_up) {
		this.is_up = is_up;
	}

	public Integer getProduct_num() {
		return product_num;
	}

	public void setProduct_num(Integer product_num) {
		this.product_num = product_num;
	}

	public Integer getUp_num() {
		return up_num;
	}

	public void setUp_num(Integer up_num) {
		this.up_num = up_num;
	}

	public List<YmProductTbl> getProductList() {
		return productList;
	}

	public void setProductList(List<YmProductTbl> productList) {
		this.productList = productList;
	}

	public List<YmUpTbl> getUpList() {
		return upList;
	}

	public void setUpList(List<YmUpTbl> upList) {
		this.upList = upList;
	}

	public List<YmExperienceTbl> getExperienceList() {
		return experienceList;
	}

	public void setExperienceList(List<YmExperienceTbl> experienceList) {
		this.experienceList = experienceList;
	}

	public List<YmImageTbl> getVideoList() {
		return videoList;
	}

	public void setVideoList(List<YmImageTbl> videoList) {
		this.videoList = videoList;
	}

	@Override
	public String toString() {
		return "YmShopsTbl [id=" + id + ", shopsName=" + shopsName + ", shopsSlogan=" + shopsSlogan + ", shopsDetail="
				+ shopsDetail + ", imgUrl=" + imgUrl + ", province=" + province + ", city=" + city + ", area=" + area
				+ ", addrDetail=" + addrDetail + ", longitude=" + longitude + ", latitude=" + latitude + ", createDate="
				+ createDate + ", createUser=" + createUser + ", is_up=" + is_up + ", product_num=" + product_num
				+ ", up_num=" + up_num + ", productList=" + productList + ", upList=" + upList + ", experienceList="
				+ experienceList + ", videoList=" + videoList + "]";
	}
	
}
	

 
