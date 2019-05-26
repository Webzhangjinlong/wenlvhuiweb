package com.suguang.domin;

/**
 * 数据字典表
 */
public class YmDataDictionaryTbl extends YmEntityTbl {
	
	    Integer id ;//   int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
	    String dataType ;//   varchar(255) DEFAULT NULL COMMENT '数据类型   活动菜单  主页菜单  图书分类等',
	    String dataName ;//   varchar(255) DEFAULT NULL COMMENT '数据名称',
	    String imageUrl  ;//  varchar(255) DEFAULT NULL COMMENT '图片路径',
	    Integer paixu ;//   int(11) DEFAULT NULL COMMENT '排序',
	    String dateil ;//   varchar(255) DEFAULT NULL COMMENT '详情',
	    String backupField1  ;//  varchar(255) DEFAULT NULL COMMENT '备用字段',
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getDataType() {
			return dataType;
		}
		public void setDataType(String dataType) {
			this.dataType = dataType;
		}
		public String getDataName() {
			return dataName;
		}
		public void setDataName(String dataName) {
			this.dataName = dataName;
		}
		public String getImageUrl() {
			return imageUrl;
		}
		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}
		public Integer getPaixu() {
			return paixu;
		}
		public void setPaixu(Integer paixu) {
			this.paixu = paixu;
		}
		public String getDateil() {
			return dateil;
		}
		public void setDateil(String dateil) {
			this.dateil = dateil;
		}
		public String getBackupField1() {
			return backupField1;
		}
		public void setBackupField1(String backupField1) {
			this.backupField1 = backupField1;
		}
		@Override
		public String toString() {
			return "YmDataDictionaryTbl [id=" + id + ", dataType=" + dataType + ", dataName=" + dataName + ", imageUrl="
					+ imageUrl + ", paixu=" + paixu + ", dateil=" + dateil + ", backupField1=" + backupField1 + "]";
		}
		
	    
	    
	    
	    
}
