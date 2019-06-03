package com.suguang.domin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 食物表
 */

@Entity
public class YmRestaurant extends YmEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer   id  ;// int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
	String restaurantType    ;//int(11) DEFAULT NULL COMMENT '餐厅分类    1：小吃  2：火锅  （后续如果有继续增加）',
	Integer restaurantTag  ;//  varchar(255) DEFAULT NULL COMMENT '店铺标签   必吃 / 特色',
	String restaurantName  ;//  varchar(255) DEFAULT NULL,
	String province    ;//varchar(255) DEFAULT NULL COMMENT '省',
	String city  ;//  varchar(255) DEFAULT NULL COMMENT '市',
	String area   ;// varchar(255) DEFAULT NULL COMMENT '区',
	String addrDetail ;  //详细地址
	Integer  averageConsumption;//平均消费
	Integer starClass  ;//  int(11) DEFAULT NULL COMMENT '星级  1代表1星  5代表5星',
	String restaurantImg ;  // 店铺图片
	String restaurantDetail   ;// varchar(10240) DEFAULT NULL COMMENT '店铺详情',
	String longitude  ;//  varchar(255) DEFAULT NULL COMMENT '经度',
	String latitude   ;// varchar(255) DEFAULT NULL COMMENT '纬度',
	Date createDate  ;//  datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
	Integer createUser  ;//  int(11) DEFAULT NULL COMMENT '创建人',
//	Integer comment_num;   //评论数
//	Integer up_num;		//点赞数
	String restaurantBackimage;
	//List<YmFood>  foodList = new ArrayList<YmFood>();


	public String getRestaurantBackimage() {
		return restaurantBackimage;
	}

	public void setRestaurantBackimage(String restaurantBackimage) {
		this.restaurantBackimage = restaurantBackimage;
	}

	public Integer getAverageConsumption() {
			return averageConsumption;
		}
		public void setAverageConsumption(Integer averageConsumption) {
			this.averageConsumption = averageConsumption;
		}
//		public List<YmFood> getFoodList() {
//			return foodList;
//		}
//		public void setFoodList(List<YmFood> foodList) {
//			this.foodList = foodList;
//		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getRestaurantType() {
			return restaurantType;
		}
		public void setRestaurantType(String restaurantType) {
			this.restaurantType = restaurantType;
		}
		public Integer getRestaurantTag() {
			return restaurantTag;
		}
		public void setRestaurantTag(Integer restaurantTag) {
			this.restaurantTag = restaurantTag;
		}
		public String getRestaurantName() {
			return restaurantName;
		}
		public void setRestaurantName(String restaurantName) {
			this.restaurantName = restaurantName;
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
		public Integer getStarClass() {
			return starClass;
		}
		public void setStarClass(Integer starClass) {
			this.starClass = starClass;
		}
		public String getRestaurantImg() {
			return restaurantImg;
		}
		public void setRestaurantImg(String restaurantImg) {
			this.restaurantImg = restaurantImg;
		}
		public String getRestaurantDetail() {
			return restaurantDetail;
		}
		public void setRestaurantDetail(String restaurantDetail) {
			this.restaurantDetail = restaurantDetail;
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
//		public Integer getComment_num() {
//			return comment_num;
//		}
//		public void setComment_num(Integer comment_num) {
//			this.comment_num = comment_num;
//		}
//		public Integer getUp_num() {
//			return up_num;
//		}
//		public void setUp_num(Integer up_num) {
//			this.up_num = up_num;
//		}

	    
	    
	  
	    
	    
}
