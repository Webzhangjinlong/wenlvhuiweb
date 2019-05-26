package com.suguang.domin;

import java.util.Date;

/**
 * 食物表
 */
public class YmComment extends YmEntity {
	
	   Integer id ;// int(11) NOT NULL,
	   Integer pid ;// int(11) DEFAULT NULL COMMENT '评论的文章id',
	   Integer pidType;//  int(11) DEFAULT NULL COMMENT '评论的什么类型的文章   1：菜品   2：文旅政策   3：活动  等 不够继续增加  定位用',
	   Integer userid ;// int(11) DEFAULT NULL COMMENT '评论用户id',
	   Date createTime;//  datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
	   String comment ;// varchar(10240) DEFAULT NULL COMMENT '评论详情'
	   Integer isReply;  // 是否是回复
	   Integer replyUserId; //回复谁的ID
	   
	   String userName;
	   String replyUserName ;
	   
	   
	   
	   
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getReplyUserName() {
		return replyUserName;
	}
	public void setReplyUserName(String replyUserName) {
		this.replyUserName = replyUserName;
	}
	public Integer getIsReply() {
		return isReply;
	}
	public void setIsReply(Integer isReply) {
		this.isReply = isReply;
	}
	public Integer getReplyUserId() {
		return replyUserId;
	}
	public void setReplyUserId(Integer replyUserId) {
		this.replyUserId = replyUserId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Integer getPidType() {
		return pidType;
	}
	public void setPidType(Integer pidType) {
		this.pidType = pidType;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	
	   
	   
	  
	  
	  
}
