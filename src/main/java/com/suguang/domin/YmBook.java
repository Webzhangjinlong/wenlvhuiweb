package com.suguang.domin;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 图书表
 */
@Entity
public class YmBook extends YmEntity {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	    Integer id  ;// int(11) NOT NULL COMMENT '主键',
	    String bookName  ;//  varchar(255) DEFAULT NULL COMMENT '书名',
	    String bookAuther  ;//  varchar(255) DEFAULT NULL COMMENT '作者',
	    String publishDate  ;//  date DEFAULT NULL COMMENT '出版时间',
	    String bookDetail  ;//  varchar(255) DEFAULT NULL COMMENT '图书详情',
	    String imgUrl  ;//  varchar(255) DEFAULT NULL COMMENT '图片路径',
	    Integer sex   ;// int(11) DEFAULT NULL COMMENT '性别爱好  1：男  2：女 3：通用',
	    Integer  bookTag  ;//  int(11) DEFAULT NULL COMMENT '大众爱好  1：最新  2：最热  3：国外',
	    BigDecimal bookPrice ;//   decimal(10,2) DEFAULT NULL COMMENT '图书价格',
	    Integer recommendUser  ;//  int(255) DEFAULT NULL COMMENT '推荐人id',
	    Integer recommendedNumber  ;//  int(11) DEFAULT NULL COMMENT '推荐数量',
		@DateTimeFormat(pattern = "yyyy-MM-dd")
	    Date createDate  ;//  datetime DEFAULT NULL COMMENT '创建时间',
	    Integer indexShow;  // 图书展示在主页  1 展示  2 不展示    同一时间只有一本图书可展示
	    Integer recommendClass; //推荐星级
	    
	    

	    
	    
	    
	    
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getBookName() {
			return bookName;
		}
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		public String getBookAuther() {
			return bookAuther;
		}
		public void setBookAuther(String bookAuther) {
			this.bookAuther = bookAuther;
		}
		public String getPublishDate() {
			return publishDate;
		}
		public void setPublishDate(String publishDate) {
			this.publishDate = publishDate;
		}
		public String getBookDetail() {
			return bookDetail;
		}
		public void setBookDetail(String bookDetail) {
			this.bookDetail = bookDetail;
		}
		public String getImgUrl() {
			return imgUrl;
		}
		public void setImgUrl(String imgUrl) {
			this.imgUrl = imgUrl;
		}
		public Integer getSex() {
			return sex;
		}
		public void setSex(Integer sex) {
			this.sex = sex;
		}
		public Integer getBookTag() {
			return bookTag;
		}
		public void setBookTag(Integer bookTag) {
			this.bookTag = bookTag;
		}
		public BigDecimal getBookPrice() {
			return bookPrice;
		}
		public void setBookPrice(BigDecimal bookPrice) {
			this.bookPrice = bookPrice;
		}
		public Integer getRecommendUser() {
			return recommendUser;
		}
		public void setRecommendUser(Integer recommendUser) {
			this.recommendUser = recommendUser;
		}
		public Integer getRecommendedNumber() {
			return recommendedNumber;
		}
		public void setRecommendedNumber(Integer recommendedNumber) {
			this.recommendedNumber = recommendedNumber;
		}
		public Date getCreateDate() {
			return createDate;
		}
		public void setCreateDate(Date createDate) {
			this.createDate = createDate;
		}
		public Integer getIndexShow() {
			return indexShow;
		}
		public void setIndexShow(Integer indexShow) {
			this.indexShow = indexShow;
		}
		public Integer getRecommendClass() {
			return recommendClass;
		}
		public void setRecommendClass(Integer recommendClass) {
			this.recommendClass = recommendClass;
		}

	    
	    
	    
	    
	    
	    
}
