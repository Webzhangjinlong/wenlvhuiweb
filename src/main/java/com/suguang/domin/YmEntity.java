package com.suguang.domin;

//实体类集成  SQL用
public class YmEntity {
	Integer isOrder;//  是否 排序   1：是  2：否
	String orderBy;  //  排序条件
	Integer asc ;   //  降序/升序    1：降序  desc   2：升序  asc
	Integer limit ; //是否分页  1：是   2：否
	Integer startNum ; // 分页起始数
	Integer endNum ;  // 分页结束数


	Integer size;
	int page;
	
	
	public Integer getIsOrder() {
		return isOrder;
	}
	public void setIsOrder(Integer isOrder) {
		this.isOrder = isOrder;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public Integer getAsc() {
		return asc;
	}
	public void setAsc(Integer asc) {
		this.asc = asc;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	public Integer getStartNum() {
		return startNum;
	}
	public void setStartNum(Integer startNum) {
		this.startNum = startNum;
	}
	public Integer getEndNum() {
		return endNum;
	}
	public void setEndNum(Integer endNum) {
		this.endNum = endNum;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}
}
