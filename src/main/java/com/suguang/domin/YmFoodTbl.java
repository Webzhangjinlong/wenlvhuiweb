package com.suguang.domin;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 食物表
 */
public class YmFoodTbl {
	
	  Integer id ; // '主键id',
	  Integer restaurantId ;// int(11) DEFAULT NULL COMMENT '店铺id',
	  Integer foodType;//  int(255) DEFAULT NULL COMMENT '食物类别    不得不吃/不容错过',
	  String  foodName ;// varchar(255) DEFAULT NULL COMMENT '食物名称',
	  Integer imgOrVideo ; //图片还是视频
	  String imgUrl ; // varchar(255) DEFAULT NULL COMMENT  食物图片路径，
	  String videoUrl;  //视频路径
	  String foodDetail ;// varchar(1024) DEFAULT NULL COMMENT '介绍详情',
	  BigDecimal  foodPrice ;// decimal(10,2) DEFAULT NULL COMMENT '菜品价格',
	  Integer upNum  ;//int(11) DEFAULT NULL COMMENT '推荐数',
	  
	  List<YmCommentTbl> commentList = new ArrayList<YmCommentTbl>();

	  
	  
	  
	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}

	public Integer getFoodType() {
		return foodType;
	}

	public void setFoodType(Integer foodType) {
		this.foodType = foodType;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public Integer getImgOrVideo() {
		return imgOrVideo;
	}

	public void setImgOrVideo(Integer imgOrVideo) {
		this.imgOrVideo = imgOrVideo;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getFoodDetail() {
		return foodDetail;
	}

	public void setFoodDetail(String foodDetail) {
		this.foodDetail = foodDetail;
	}

	public BigDecimal getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(BigDecimal foodPrice) {
		this.foodPrice = foodPrice;
	}

	public Integer getUpNum() {
		return upNum;
	}

	public void setUpNum(Integer upNum) {
		this.upNum = upNum;
	}

	public List<YmCommentTbl> getCommentList() {
		return commentList;
	}

	public void setCommentList(List<YmCommentTbl> commentList) {
		this.commentList = commentList;
	}

	@Override
	public String toString() {
		return "YmFoodTbl [id=" + id + ", restaurantId=" + restaurantId + ", foodType=" + foodType + ", foodName="
				+ foodName + ", imgOrVideo=" + imgOrVideo + ", imgUrl=" + imgUrl + ", foodDetail=" + foodDetail
				+ ", foodPrice=" + foodPrice + ", upNum=" + upNum + ", commentList=" + commentList + "]";
	} 

	  
	  
	  
	  
	  
	  
}
