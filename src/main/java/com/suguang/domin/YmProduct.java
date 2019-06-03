package com.suguang.domin;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
/**
 * Author liruifeng Date 2019-05-05
 */

@Entity
public class YmProduct implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer shopsId;
	private String productName;
	private String skuId;
	private String productPoint;
	private BigDecimal price;
	private String productDatile;
	private BigDecimal priceDq;
	private Integer browse;
	private Integer categoryId;
	private Integer status;
	private Date createDate;
	private Integer createUser;

	//private String dataName;
	
	//存储店的地址
	//private String   province  ;
	//private String   city  ;
	//private String   area  ;
	//private String   addrDetail  ;
	//private String imgUrl;
	//private Integer isUp;
	
	
	
	//List<YmComment> commentList = new ArrayList<YmComment>(); // 商品集合


//	public Integer getIsUp() {
//		return isUp;
//	}
//
//	public void setIsUp(Integer isUp) {
//		this.isUp = isUp;
//	}

//	public String getDataName() {
//		return dataName;
//	}
//
//	public void setDataName(String dataName) {
//		this.dataName = dataName;
//	}

//	public String getProvince() {
//		return province;
//	}
//
//	public void setProvince(String province) {
//		this.province = province;
//	}

//	public String getCity() {
//		return city;
//	}
//
//	public void setCity(String city) {
//		this.city = city;
//	}
//
//	public String getArea() {
//		return area;
//	}
//
//	public void setArea(String area) {
//		this.area = area;
//	}

//	public String getAddrDetail() {
//		return addrDetail;
//	}
//
//	public void setAddrDetail(String addrDetail) {
//		this.addrDetail = addrDetail;
//	}

//	public String getImgUrl() {
//		return imgUrl;
//	}
//
//	public void setImgUrl(String imgUrl) {
//		this.imgUrl = imgUrl;
//	}

//	public List<YmComment> getCommentList() {
//		return commentList;
//	}
//
//	public void setCommentList(List<YmComment> commentList) {
//		this.commentList = commentList;
//	}

	public YmProduct() {
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setShopsId(Integer shopsId) {
		this.shopsId = shopsId;
	}

	public Integer getShopsId() {
		return shopsId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductName() {
		return productName;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getSkuId() {
		return skuId;
	}

	public String getProductPoint() {
		return productPoint;
	}

	public void setProductPoint(String productPoint) {
		this.productPoint = productPoint;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setProductDatile(String productDatile) {
		this.productDatile = productDatile;
	}

	public String getProductDatile() {
		return productDatile;
	}

	public void setPriceDq(BigDecimal priceDq) {
		this.priceDq = priceDq;
	}

	public BigDecimal getPriceDq() {
		return priceDq;
	}

	public Integer getBrowse() {
		return browse;
	}

	public void setBrowse(Integer browse) {
		this.browse = browse;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getStatus() {
		return status;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateUser(Integer createUser) {
		this.createUser = createUser;
	}

	public Integer getCreateUser() {
		return createUser;
	}


	
	

}