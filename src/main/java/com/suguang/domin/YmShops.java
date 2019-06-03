package com.suguang.domin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class YmShops {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
	String experience;

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}
//Integer is_up;
	//Integer product_num;
	//Integer up_num;
//	List<YmProduct> productList = new ArrayList<YmProduct>(); // 商品集合
//
//	List<YmUp> upList = new ArrayList<YmUp>(); // 点赞集合
//
//	List<YmExperience>  experienceList= new ArrayList<YmExperience>(); // 经历集合
//
//	List<YmImage> videoList = new ArrayList<YmImage>(); // 图片或者视频

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

//	public Integer getIs_up() {
//		return is_up;
//	}
//
//	public void setIs_up(Integer is_up) {
//		this.is_up = is_up;
//	}

//	public Integer getProduct_num() {
//		return product_num;
//	}
//
//	public void setProduct_num(Integer product_num) {
//		this.product_num = product_num;
//	}

//	public Integer getUp_num() {
//		return up_num;
//	}
//
//	public void setUp_num(Integer up_num) {
//		this.up_num = up_num;
//	}

//	public List<YmProduct> getProductList() {
//		return productList;
//	}
//
//	public void setProductList(List<YmProduct> productList) {
//		this.productList = productList;
//	}
//
//	public List<YmUp> getUpList() {
//		return upList;
//	}
//
//	public void setUpList(List<YmUp> upList) {
//		this.upList = upList;
//	}
//
//	public List<YmExperience> getExperienceList() {
//		return experienceList;
//	}
//
//	public void setExperienceList(List<YmExperience> experienceList) {
//		this.experienceList = experienceList;
//	}
//
//	public List<YmImage> getVideoList() {
//		return videoList;
//	}
//
//	public void setVideoList(List<YmImage> videoList) {
//		this.videoList = videoList;
//	}


}


 
