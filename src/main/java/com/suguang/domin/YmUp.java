package com.suguang.domin;

import java.util.Date;

/**
 * 点赞表
 */
public class YmUp {
		Integer id; //id
		Integer textType ;//  int(11) DEFAULT NULL COMMENT '文章类别    1：餐厅   2：文旅政策   3：活动等  不够继续增加',
		Integer  textId ;// int(11) DEFAULT NULL COMMENT '文章id',
		Integer   userid ;// int(11) DEFAULT NULL COMMENT '点赞用户id',
		Date   createDate;//  datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public Integer getTextType() {
			return textType;
		}
		public void setTextType(Integer textType) {
			this.textType = textType;
		}
		public Integer getTextId() {
			return textId;
		}
		public void setTextId(Integer textId) {
			this.textId = textId;
		}
		public Integer getUserid() {
			return userid;
		}
		public void setUserid(Integer userid) {
			this.userid = userid;
		}
		public Date getCreateDate() {
			return createDate;
		}
		public void setCreateDate(Date createDate) {
			this.createDate = createDate;
		}

	
	  
}
